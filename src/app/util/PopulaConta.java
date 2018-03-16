package app.util;

import javax.persistence.EntityManager;

import org.hibernate.service.spi.Manageable;

import app.model.Conta;

public class PopulaConta {

	public static void main(String[] args) {
		
		EntityManager manager = new JPAUtil().getEntityManger();
		
		manager.getTransaction().begin();
		
		Conta conta1 = new Conta();
		Conta conta2 = new Conta();
		Conta conta3 = new Conta();
		Conta conta4 = new Conta();
		Conta conta5 = new Conta();
		Conta conta6 = new Conta();
		
		conta1.setAgencia("1234");
		conta1.setBanco("Itau");
		conta1.setNumero("456");
		conta1.setTitular("Carlos");
		
		conta2.setAgencia("1234");
		conta2.setBanco("Caixa");
		conta2.setNumero("432");
		conta2.setTitular("Diva");
		
		conta3.setAgencia("1234");
		conta3.setBanco("Itau");
		conta3.setNumero("456");
		conta3.setTitular("Vanessa");
		
		conta4.setAgencia("1234");
		conta4.setBanco("Itau");
		conta4.setNumero("456");
		conta4.setTitular("Netinho");
		
		conta5.setAgencia("1234");
		conta5.setBanco("Itau");
		conta5.setNumero("456");
		conta5.setTitular("Ana Paula");
		
		conta6.setAgencia("1234");
		conta6.setBanco("Itau");
		conta6.setNumero("456");
		conta6.setTitular("Maria Rafaela");
		
		manager.persist(conta1);
		manager.persist(conta2);
		manager.persist(conta3);
		manager.persist(conta4);
		manager.persist(conta5);
		manager.persist(conta6);
		
		manager.getTransaction().commit();
		
		manager.close(); 
		
		
		
	}
}
