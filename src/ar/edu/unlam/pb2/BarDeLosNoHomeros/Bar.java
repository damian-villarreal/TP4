package ar.edu.unlam.pb2.BarDeLosNoHomeros;

import java.util.TreeSet;

public class Bar {
	private boolean abierto;
	private TreeSet<Cliente> clientes;
	private TreeSet<Cliente> clientesOrdenadosPorEdad;

	public Bar() {
		this.abierto = true;
		this.clientes = new TreeSet<Cliente>();
	}

	public boolean isAbierto() {
		return abierto;
	}

	public void entrar(Cliente cliente) throws Exception {
		if (cliente.getEdad() >= 18)
			clientes.add(cliente);
		else {
			throw new Exception("Debes ser mayor de 18 para entrar");
		}
	}

	public TreeSet<Cliente> getClientes() {
		return clientes;
	}

	public TreeSet<Cliente> getClientesOrdenadosPorEdad() {
		return clientesOrdenadosPorEdad;
	}

	public void ordenarPorEdad() {
		this.clientesOrdenadosPorEdad = new TreeSet<Cliente>(
				new ComparadorEdad());
		this.clientesOrdenadosPorEdad.addAll(clientes);
	}
}
