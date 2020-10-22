package me.eperson.br.ex6;

import me.eperson.br.ex6.classes.Pais;

public class Ex6 {
	public static void main(String[] args) {
		Pais p1 = new Pais("Brasil", "Brasilia", 30f);
		Pais p2 = new Pais("Brasil2", "Brasilia2", 50f);
		Pais p3 = new Pais("Front1", "Front1", 50f);
		Pais p4 = new Pais("Front2", "Front2", 50f);
		p2.addPaisQueFazFronteira(p3);
		p1.addPaisQueFazFronteira(p3);
		p2.addPaisQueFazFronteira(p4);
		p1.addPaisQueFazFronteira(p4);
		
		for (Pais p : p1.vizinhosEmComumCom(p2))
			System.out.println(p.getNome());
	}
}
