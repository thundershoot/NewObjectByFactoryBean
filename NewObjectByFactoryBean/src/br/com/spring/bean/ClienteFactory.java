package br.com.spring.bean;

public class ClienteFactory {

	public Cliente getInstance() {
		System.out.println("getInstanceFactory");
		return new Cliente();
	}
}
