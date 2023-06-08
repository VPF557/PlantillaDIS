package Plantilla.example.Plantilla;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class Controller {

    @GetMapping("/Cripto")
    public ArrayList<Criptomoneda> listaObjeto1()
    {
        LeerJson reader = new LeerJson();
        //Leemos el reason e introducimos los elementos en un arraylist
        ArrayList<Criptomoneda> lista = reader.LeerFicheroJson1("Criptomonedas.json");
        //Mostramos los elementos leidos
        return lista;
    }

    @PostMapping("/CriptoA")
    public ArrayList<Criptomoneda> create(@RequestBody Criptomoneda objeto1)
    {
        DataHanding dataHanding = new DataHanding();
        ArrayList<Criptomoneda> lista;
        lista = dataHanding.AnadirObjeto1(objeto1,"Tweets.json");
        EscribirJson escribirJSON = new EscribirJson();
        escribirJSON.escribirObjeto1(lista);
        return lista;
    }
/*
    @DeleteMapping("/CriptoB{id}")
    public ArrayList<Criptomoneda> Borrar(@RequestParam int id)
    {
        DataHanding dataHanding = new DataHanding();
        ArrayList<Criptomoneda> lista;
        lista = dataHanding.EliminarObjeto(id,"Tweets.json");
        EscribirJson escribirJSON = new EscribirJson();
        escribirJSON.escribirObjeto1(lista);
        return lista;
    } */

}
