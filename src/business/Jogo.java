package business;

import java.util.Scanner;

public class Jogo {
	private String nome;
	private int idade; 
	private int qtdMinJogadores;
	private int qtdMaxJogadores;
	private boolean disponibilidade;
	private int tempoEmprestimoDias;
	private String autor;
	private String genero;

	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public int getQtdMinJogadores() {
		return qtdMinJogadores;
	}
	
	public int getQtdMaxJogadores() {
		return qtdMaxJogadores;
	}
	
	public boolean isDisponibilidade() {
		return disponibilidade;
	}
	
	public int getTempoEmprestimoDias() {
		return tempoEmprestimoDias;
	}

	public String getAutor() {
		return autor;
	}
	public String getGenero() {
		return genero;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void setQtdMinJogadores(int qtdMinJogadores) {
		this.qtdMinJogadores = qtdMinJogadores;
	}

	public void setQtdMaxJogadores(int qtdMaxJogadores) {
		this.qtdMaxJogadores = qtdMaxJogadores;
	}
	
	public void setDisponibilidade(boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}
	
	
	public void setTempoEmprestimoDias(int tempoEmprestimoDias) {
		this.tempoEmprestimoDias = tempoEmprestimoDias;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public Jogo(String nome,int idade,int qntMinJogadores, int qntMaxJogadores,int tempoEmprestimoDias, String autor, String genero) {
		setNome(nome);
		setIdade(idade);
		setQtdMinJogadores(qntMinJogadores);
		setQtdMaxJogadores(qntMaxJogadores);
		setDisponibilidade(true);//Todo jogo instanciado já pode ser emprestado
		setTempoEmprestimoDias(tempoEmprestimoDias);
		setAutor(autor);
		setGenero(genero);
	}
	
}

