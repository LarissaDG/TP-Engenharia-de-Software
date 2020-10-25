package aplicacao;

import java.util.Scanner;

import interfa.Menu;

public class Programa {
	public static void main(String[] args) {
		int opcao = 0;
		Menu menus = new Menu();
		Scanner sc = new Scanner (System.in);
		do {
		//Chama o menu principal
		menus.menuPrincipal();
		do {
		opcao = sc.nextInt();
		}while(opcao < 0 || opcao > 2);
		if(opcao == 0) {
			System.exit(0);
		}
		if(opcao == 1) {
			menus.menuLogin();
			System.out.println(opcao);
		}
		if(opcao == 2){
			menus.menuCadastroUsuario();
			System.out.println(opcao);
		}
		}while(true);
		//Se a pessoa digitar 1 vai pro menu de login
		
		//Uma vez logada a pessoa pode:
			//1. Cadastrar um jogo
			//2. Procurar um usuário (lista/arquivo)
			//3. Procurar um jogo 
				//3.1 Pegar um jogo emprestado
					//Listar os jogos(resultado da busca?)
					//Escolher o jogo pelo indice da lista
					//Mudar o status do jogo.
		
		//Se a pessoa digitar 2 vai pro menu de Cadastro de Usuário
	}
}
