package app.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import app.model.Conta;
import app.util.JPAUtil;

public class ContaTeste {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta();
		
		conta.setTitular("Elvis");
		conta.setBanco("Itau");
		conta.setAgencia("1234");
		conta.setNumero("3212");
		
		
		EntityManager em = new JPAUtil().getEntityManger();
		
		em.getTransaction().begin();
		
		conta = em.find(Conta.class,5);
		
		em.remove(conta);
		
		em.getTransaction().commit();
		
		em.close();
	}

}
