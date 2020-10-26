package aplicacao;

import java.util.Scanner;

import business.Usuario;
import interfa.Menu;

public class Programa {
	public static void main(String[] args) {
		int opcao = 0;
		boolean logado = false;
		Usuario usuarioLogado;
		Menu menus = new Menu();
		Scanner sc = new Scanner (System.in);
		do {
		if(!logado) {
			//Chama o menu principal
			menus.menuPrincipal();
		} else {
			// Chama o segundo menu
			menus.menuPrincipal2();
		}
		do {
		opcao = sc.nextInt();
		}while(opcao < 0 || opcao > 2);
		switch(opcao) {
		case 0:
			System.exit(0);
			break;
		case 1:
			if(!logado) {
				menus.menuLogin();
			} else {
				Jogo novoJogo = menus.menuCadastroJogo();
				usuarioLogado.addJogo(novoJogo);
			}
			System.out.println(opcao);				
			break;
		case 2:
			if(!logado) {
				usuarioLogado = menus.menuCadastroUsuario();
				menus.menuPrincipal2();
				opcao = sc.nextInt();
			} else {
				// Procurar Usuario
			}
			System.out.println(opcao);				
			break;
		case 3:
			if(logado) {
				// Abre SGBD com lista dos jogos com indices. Escolhe e manda indice para mudar disponibilidade
				// Do jogo no app e add o jogo em jogos emprestados do usuario
			} else {
				continue;
			}
		default:
			System.out.println("Erro: parametro inválido");
			break;
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
