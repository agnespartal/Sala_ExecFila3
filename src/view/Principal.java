package view;

import br.edu.fateczl.filaobj.Fila;
import controller.ParqueController;
import model.Pessoa;

public class Principal {

	public static void main(String[] args) throws Exception{
		Fila fila = new Fila();
		
		for (int i = 1; i < 31; i++) {
			Pessoa p1 = new Pessoa();
			p1.nome = "Pessoa"+ i;
			p1.idade = (int)((Math.random()*31)+10);
			p1.altura = (float)((Math.random()*0.66)+1.35);
			fila.insert(p1);
		}
		ParqueController p = new ParqueController();
		p.brinquedo(fila);
	}

}
