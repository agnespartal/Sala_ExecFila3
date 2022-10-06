package controller;

import br.edu.fateczl.filaobj.Fila;
import model.Pessoa;

public class ParqueController {

	public ParqueController() {
		super();
	}

	public void brinquedo(Fila fila) throws Exception {
		
		while (!fila.isEmpty()) {
			Pessoa p = (Pessoa)fila.remove();
			if (p.altura >= 1.60 && p.idade >= 16) {
				System.out.println("Nome: "+p.nome+ " ==> Entrada liberada");
			} else if (p.altura < 1.60 && p.idade >= 16) {
				System.out.println("Nome: "+p.nome+ " ==> Entrada bloqueada ( Motivo: Altura abaixo que 1,60m )");
			} else if (p.altura >= 1.60 && p.idade < 16) {
				System.out.println("Nome: "+p.nome+ " ==> Entrada bloqueada ( Motivo: Idade abaixo que 16 anos )");
			} else {
				System.out.println("Nome: "+p.nome+ " ==> Entrada bloqueada ( Motivo: Idade abaixo que 16 anos e Altura abaixo que 1,60m )");
			}
		}
	}

}
