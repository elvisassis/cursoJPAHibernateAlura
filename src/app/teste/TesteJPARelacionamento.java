package app.teste;

import java.math.BigDecimal;
import java.util.Calendar;

import javax.persistence.EntityManager;

import app.model.Conta;
import app.model.Movimentacao;
import app.model.TipoMovimentacao;
import app.util.JPAUtil;

public class TesteJPARelacionamento {
	
	public static void main(String[] args) {
		
		Movimentacao movimentacao = new Movimentacao();
		
		movimentacao.setData(Calendar.getInstance());
		
		movimentacao.setDescricao("Padaria");
		
		movimentacao.setTipo(TipoMovimentacao.SAIDA);
		
		movimentacao.setValor(new BigDecimal("150.0"));
		
		Conta conta = new Conta().findById(1);
		
		
		
		movimentacao.setConta(conta);
		
		movimentacao.save();
		
		System.out.println("Titular da conta: " + conta.getTitular());
		
		
	}

}
