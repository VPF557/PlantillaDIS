package org.vaadin.example;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;

import java.util.ArrayList;

public class VistaAlta extends VerticalLayout {
    ArrayList<Criptomoneda> listaPacientes = new ArrayList<>();
    public VistaAlta()
    {

    }

    public void mostrar()
    {
        removeAll();
        HorizontalLayout horizontal= new HorizontalLayout();

        Label etiqueta1 = new Label("Nombre");
        TextField texto1 = new TextField();
        Label etiqueta2 = new Label("Valor:");
        TextField texto2 = new TextField();
        Label etiqueta3 = new Label("Fluctuacion:");
        TextField texto3 = new TextField();
        Label etiqueta4 = new Label("Categoria:");
        TextField texto4 = new TextField();
        Label etiqueta5 = new Label("Popularidad:");
        TextField texto5 = new TextField();

        Button boton = new Button("Añadir");
//Corregido y hecho
        boton.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
            @Override
            public void onComponentEvent(ClickEvent<Button> event) {
                ArrayList<Criptomoneda> listaAux = new ArrayList<>();

                Criptomoneda objeto = new Criptomoneda(0, texto1.getValue(),Double.parseDouble(texto2.getValue()),Double.parseDouble(texto3.getValue()),texto4.getValue(),texto5.getValue());
                listaAux = DataService.aniadirDatosLista(objeto, listaAux);


                texto1.setValue("");
                texto2.setValue("");
                texto3.setValue("");
                texto4.setValue("");
                texto5.setValue("");
            }
        });

        horizontal.add(etiqueta1, texto1, etiqueta2, texto2, etiqueta3, texto3,etiqueta4, texto4,etiqueta5, texto5);
        this.add(horizontal,boton);
    }
}
