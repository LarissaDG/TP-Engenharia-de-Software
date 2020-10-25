package business;

import java.util.ArrayList;

import java.util.Scanner;

public class Usuario {
	
		private String nome;
		private String email;
		private String estado;
		private String cidade;
		private int idDocumento;
		private String senha;
		private  ArrayList<Jogo> jogosParaEmprestimo = new ArrayList<Jogo>();
		
		public String getNome() {
			return nome;
		}
		
		public String getEmail() {
			return email;
		}
		
		public String getEstado() {
			return estado;
		}
		
		public String getCidade() {
			return cidade;
		}
		
		public int getIdDocumento() {
			return idDocumento;
		}
		
		public String getSenha() {
			return senha;
		}
		
		public ArrayList<Jogo> getJogosParaEmprestimo() {
			return jogosParaEmprestimo;
		}
		
		public void setNome(String nome) {
			this.nome = nome;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public void setEstado(String estado) {
			this.estado = estado;
		}
		
		public void setCidade(String cidade) {
			this.cidade = cidade;
		}
		
		public void setIdDocumento(int idDocumento) {
			this.idDocumento = idDocumento;
		}
		
		public void setSenha(String senha) {
			this.senha = senha;
		}
		
		public void setJogosParaEmprestimo(ArrayList<Jogo> jogosParaEmprestimo) {
			this.jogosParaEmprestimo = jogosParaEmprestimo;
		}
		
		public Usuario(String nome, String email, String estado, String cidade, int idDocumento, String senha) {
			setNome(nome);
			setEmail(email);
			setEstado(estado);
			setCidade(cidade);
			setIdDocumento(idDocumento);
			setSenha(senha);
		}
		
		public  void cadastroUsuario() {
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
			
		}
		
}
