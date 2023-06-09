package Plantilla.example.Plantilla;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

@SpringBootTest
class PlantillaApplicationTests
{
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
		DataHanding data = new DataHanding();
		ArrayList<Criptomoneda> listaAux= new ArrayList<Criptomoneda>();
		Criptomoneda pr1 = new Criptomoneda(0,"SuperCoin",129,78.36,"Terciaria","Media");
		listaAux = data.EliminarObjeto(pr1.getId(),"Criptomonedas.json");

		if(data.ComprobarObjeto(pr1,"Criptomonedas.json",listaAux) == 0)
		{
			assertTrue(true);
		}
		else
		{
			fail("No se ha eliminado correctamente");
		}
	}
	//test funcionales
	@Test
	public void ComprobarObjeto()
	{
		Criptomoneda pr1 = new Criptomoneda(0,"SuperCoin",129,78.36,"Terciaria","Media");
		assertEquals(pr1.getNombre(),"SuperCoin");
		assertEquals(pr1.getValor(),129, 0.001);
		assertEquals(pr1.getFluctuacion(),78.36, 0.001);
		assertEquals(pr1.getCategoria(),"Terciaria");
		assertEquals(pr1.getPopularidad(),"Media");
	}
	@Test
	void contextLoads()
	{
	}

}
