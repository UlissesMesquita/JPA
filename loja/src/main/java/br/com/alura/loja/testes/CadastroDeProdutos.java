package br.com.alura.loja.testes;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.modelo.Produto;

public class CadastroDeProdutos {
	
	public static void main(String[] args) {
		Produto celular = new Produto();
		celular.setNome("Samsungo S23 Plus");
		celular.setDescricao("Melhor que Iphono");
		celular.setPreco(new BigDecimal(1000));
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("loja");
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(celular);
		em.getTransaction().commit();
		em.close();
		
	}


	
	
	
}
