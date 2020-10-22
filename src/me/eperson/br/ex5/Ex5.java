package me.eperson.br.ex5;

import java.util.Scanner;

import me.eperson.br.ex5.classes.Agenda;
import me.eperson.br.ex5.classes.PessoaFisica;
import me.eperson.br.ex5.classes.PessoaJuridica;

public class Ex5 {
	
	Class<?>[] classes = {};
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Agenda agenda = new Agenda();
		
		for (int i = 0; i < 30; i++) {
			if (Math.random() > .5f)
				agenda.addContato(new PessoaFisica("Nome " + i, "cpf" + i, null, null));
			else
				agenda.addContato(new PessoaJuridica("RazaoSocial" + i, "CNPJ" + i, null, 0));
		}
		
		int option = 0;
		do {
			
			if (option == 1 || option == 2) {
				System.out.println("Digite o valor:");
				String cpfOuCnpj = scan.nextLine();
				
				System.out.println("---------------------");
				agenda.getPessoas((p) -> {
					if (p.getIdentificacao().equalsIgnoreCase(cpfOuCnpj))
						System.out.println(p.getNome() + " -> " + p.getIdentificacao());
				});
				System.out.println("---------------------");
				
			} else if (option == 3) {
				for (int i = 0; i < 3; i++)
					System.out.println("---------------------");
				agenda.getPessoas((p) -> System.out.println(p.getNome() + " - " + p.getIdentificacao()));
				for (int i = 0; i < 3; i++)
					System.out.println("---------------------");
			}
			
			
			System.out.println("O que deseja fazer?");
			System.out.println("1 - Procurar um CPF");
			System.out.println("2 - Procurar um CNPJ");
			System.out.println("3 - Listar todos");
		} while((option = Integer.parseInt(scan.nextLine())) > 0);
		
		scan.close();
	}
	
}
