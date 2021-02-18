package br.com.fiap.teste;

import javax.persistence.Persistence;

public class BancoTeste {

	public static void main(String[] args) {
		Persistence.createEntityManagerFactory("estabelecimento").createEntityManager();

	}

}
