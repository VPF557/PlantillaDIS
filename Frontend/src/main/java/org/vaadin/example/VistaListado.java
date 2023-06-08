package org.vaadin.example;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.grid.contextmenu.GridContextMenu;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import java.net.URISyntaxException;
import java.util.ArrayList;

public class VistaListado extends VerticalLayout {
    ArrayList<Criptomoneda> listaPacientes = new ArrayList<>();
    public VistaListado()
    {

    }
    public void mostrar()
    {
        removeAll();
        HorizontalLayout horizontal= new HorizontalLayout();
        ArrayList<Criptomoneda> listaTweets = new ArrayList<>();
        ArrayList<Criptomoneda> listaAux = new ArrayList<>();

        Grid<Criptomoneda> grid = new Grid<>(Criptomoneda.class, false);
        grid.addColumn(Criptomoneda::getNombre).setHeader("Nombre");
        grid.addColumn(Criptomoneda::getValor).setHeader("Valor");
        grid.addColumn(Criptomoneda::getFluctuacion).setHeader("Fluctuacion");
        grid.addColumn(Criptomoneda::getCategoria).setHeader("Categoria");
        grid.addColumn(Criptomoneda::getPopularidad).setHeader("Popularidad");

        GridContextMenu<Criptomoneda> menu = grid.addContextMenu();
        menu.setOpenOnClick(true);
        menu.addItem("Delete", event ->
        {
            DataService.eliminarTweet(event.getItem().get(),listaAux);
        });
        grid.setAllRowsVisible(true);
        this.add(grid);
        add(horizontal);

       try {
            listaTweets = DataService.getProductos(listaTweets);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
        grid.setItems(listaTweets);

        this.add(horizontal,grid);
    }

}