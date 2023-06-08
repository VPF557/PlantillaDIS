package Plantilla.example.Plantilla;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class DataHandingTest {

    @Test
    public void anadirObjeto1()
    {
        DataHanding data = new DataHanding();
        ArrayList<Criptomoneda> listaAux= new ArrayList<Criptomoneda>();
        Criptomoneda pr1 = new Criptomoneda(0,"SuperCoin",129,78.36,"Terciaria","Media");
        listaAux = data.AnadirObjeto1(pr1,"Criptomonedas.json");

        if(data.ComprobarObjeto(pr1,"Criptomonedas.json",listaAux) == 1)
        {
            assertTrue(true);
        }
        else
        {
            fail("No se ha añadido correctamente");
        }
    }

    @Test
    public void eliminarObjeto()
    {
    }
}