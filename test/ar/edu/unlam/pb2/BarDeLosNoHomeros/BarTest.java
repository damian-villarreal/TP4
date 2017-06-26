package ar.edu.unlam.pb2.BarDeLosNoHomeros;

import org.junit.Assert;
import org.junit.Test;

public class BarTest {
	@Test
	public void queNoPuedaHaberDosClientesConElmismoNombre() throws Exception {

		Bar bar = new Bar();
		Cliente cliente1 = new Cliente("Snake", 38);
		Cliente cliente2 = new Cliente("Homero", 35);
		Cliente cliente3 = new Cliente("Barney", 45);
		Cliente cliente4 = new Cliente("Homero", 30);

		bar.entrar(cliente1);
		bar.entrar(cliente2);
		bar.entrar(cliente3);
		bar.entrar(cliente4);

		Integer cantidadEsperada = 3;
		Assert.assertTrue(bar.getClientes().size() == cantidadEsperada);
	}

	@Test
	public void queDosClientesPuedanCompararseEstandoFueraDelBar() {
		Cliente cliente1 = new Cliente("Homero", 35);
		Cliente cliente2 = new Cliente("Homero", 40);

		Assert.assertTrue(cliente1.getNombre() == cliente2.getNombre());
	}

	@Test
	public void queElBarPuedaAbrirseSinClientes() {
		Bar bar = new Bar();
		Assert.assertTrue(bar.isAbierto() == true);
		Assert.assertTrue(bar.getClientes().size() == 0);
	}

	@Test
	public void queLosClientesEstenOrdenadosAlfabeticamente() throws Exception {
		Bar bar = new Bar();
		Cliente cliente1 = new Cliente("Snake", 42);
		Cliente cliente2 = new Cliente("Homero", 35);
		Cliente cliente3 = new Cliente("Skinner", 65);

		bar.entrar(cliente1);
		bar.entrar(cliente2);
		bar.entrar(cliente3);

		Assert.assertTrue(bar.getClientes().first().getNombre() == "Homero");
		Assert.assertTrue(bar.getClientes().last().getNombre() == "Snake");
	}

	@Test
	public void queLosClientesSePuedanOrdenarPorEdad() throws Exception {

		Bar bar = new Bar();

		Cliente cliente1 = new Cliente("Nelson", 18);
		Cliente cliente2 = new Cliente("Homero", 35);
		Cliente cliente3 = new Cliente("Skinner", 65);
		Cliente cliente4 = new Cliente("Homero", 67);
		Cliente cliente5 = new Cliente("Apu", 45);

		bar.entrar(cliente1);
		bar.entrar(cliente2);
		bar.entrar(cliente3);
		bar.entrar(cliente4);
		bar.entrar(cliente5);

		bar.ordenarPorEdad();

		Assert.assertTrue(bar.getClientesOrdenadosPorEdad().first().getNombre() == "Nelson");
		Assert.assertTrue(bar.getClientesOrdenadosPorEdad().last().getNombre() == "Skinner");
	}

	@Test
	public void queNoSePuedaEntrarSiendoMenor() throws Exception {
		Bar bar = new Bar();

		Cliente cliente1 = new Cliente("Bart", 10);
		bar.entrar(cliente1);
	}
}
