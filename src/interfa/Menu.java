package interfa;

import java.util.Scanner;

import business.Usuario;

import business.Jogo;

public class Menu {

	private int opcao;
	
	public int getOpcao() {
		return this.opcao;
	}
	
	public void setOpcao(int opcao) {
		this.opcao = opcao;
	}
	
	public void menuPrincipal() {
		System.out.println("Menu\n");
		System.out.println("1 - Fazer login\n");
		System.out.println("2 - Fazer cadastro\n");
	}
	
	public void menuLogin() {
		String email;
		String senha;
		
		//Repetir enquanto a senha ou e-mail estiverem incorretos
		Scanner sc = new Scanner (System.in);
		System.out.println("Login\n");
		System.out.println("Digite seu e-mail\n");
		email = sc.next();
		System.out.println("Digite sua senha\n");
		senha = sc.next();
	}
	
	public void menuPrincipal2() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Menu\n");
		System.out.println("1 - Cadastrar um jogo\n");
		System.out.println("2 - Procurar um usuário\n");
		System.out.println("3 - Procurar um jogo\n");
		setOpcao(sc.nextInt());
	}
	
	public Usuario menuCadastroUsuario() {
		Scanner sc = new Scanner (System.in);
		String nome;
		String email;
		String estado;
		String cidade;
		int idDocumento;
		String senha1;
		String senha2;
		
		System.out.println("Cadastro Novo Usuario\n");
		System.out.println("Digite o nome\n");
		nome = sc.next();
		System.out.println("Digite um e-mail\n");
		email = sc.next();
		System.out.println("Digite um estado\n");
		estado = sc.next();
		System.out.println("Digite uma cidade\n");
		cidade = sc.next();
		System.out.println("Digite o CPF ou CNPJ\n");
		idDocumento = sc.nextInt();
		do {
			System.out.println("Digite uma senha\n");
			senha1 = sc.next();
			System.out.println("Confirme a senha\n");
			senha2 = sc.next();
		}while(senha1 != senha2);
		
		Usuario user = new Usuario(nome,email,estado,cidade,idDocumento,senha1);
		return user;
	}
	
	public Jogo menuCadastroJogo() {
		Scanner sc = new Scanner (System.in);
		String nome;
		int idade;
		int qntMinJogadores;
		int qntMaxJogadores;
		int tempoEmprestimoDias;
		String autor;
		String genero;
		
		System.out.println("Cadastro Novo Jogo\n");
		System.out.println("Digite o nome\n");
		nome = sc.next();
		System.out.println("Digite a idade recomendada\n");
		idade = sc.nextInt();
		System.out.println("Digite a quantidade minima de jogadores\n");
		qntMinJogadores = sc.nextInt();
		System.out.println("Digite a quantidade maxima de jogadores\\n");
		qntMaxJogadores = sc.nextInt();
		System.out.println("Tempo de empréstimo\n");
		tempoEmprestimoDias = sc.nextInt();
		System.out.println("Digite o nome do autor do jogo\n");
		autor = sc.next();
		System.out.println("Digite o genero do jogo\n");
		genero = sc.next();
		
		Jogo game = new Jogo(nome,idade,qntMinJogadores,qntMaxJogadores,tempoEmprestimoDias,autor,genero);
		return game;
	}
	
}
