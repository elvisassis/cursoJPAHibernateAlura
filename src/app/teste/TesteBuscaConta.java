package app.teste;

import javax.persistence.EntityManager;

import app.model.Conta;
import app.util.JPAUtil;

public class TesteBuscaConta {

	public static void main(String[] args) {
		
		EntityManager em = new JPAUtil().getEntityManger();
		
		em.getTransaction().begin();
		
		Conta conta = em.find(Conta.class, 5);
		
		em.remove(conta);
		
		em.getTransaction().commit();
		
		System.out.println("Agencia: " + conta.getAgencia());
		System.out.println("Banco: " + conta.getBanco());
		System.out.println("Titular da Conta: " + conta.getTitular());
		System.out.println("Numero da Conta: " + conta.getNumero());
	}
}
