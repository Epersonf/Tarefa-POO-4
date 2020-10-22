package me.eperson.br.ex5.classes;

import java.util.ArrayList;

public class Agenda {
	
	private ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
	
	public void addContato(Pessoa p) {
		pessoas.add(p);
	}
	
	@FunctionalInterface
    public interface ExecuteMode {
        void evaluate(Pessoa p);
    }
	
	public void getPessoas(ExecuteMode eval) {
		for (Pessoa p : pessoas) {
			eval.evaluate(p);
		}
	}
}
