package business;

import java.util.ArrayList;

public class Usuario {
	
		private String nome;
		private String email;
		private String estado;
		private String cidade;
		private int idDocumento;
		private String senha;
		private ArrayList<Jogo> jogosParaEmprestimo = new ArrayList<Jogo>();
		private ArrayList<Jogo> jogosPegoEmprestado = new ArrayList<Jogo>();
		
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

		public addJogo(String nome,int idade,int qntMinJogadores, int qntMaxJogadores,int tempoEmprestimoDias, String autor, String genero) {
			Jogo jogoPraAdd = new Jogo(String nome,int idade,int qntMinJogadores, int qntMaxJogadores,int tempoEmprestimoDias, String autor, String genero);
			this.jogosParaEmprestimo.add(jogoPraAdd);
		}

		public pegarEmprestado(Jogo jogoEmprestado) {
			this.jogosPegoEmprestado.add(jogoEmprestado);
		}
}
