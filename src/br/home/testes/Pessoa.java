package br.home.testes;

import java.util.Date;


public class Pessoa implements Comparable<Pessoa>{

	private String nome;
	private int cpf;
	private Date dataNascimento;
	
	public Pessoa(String nome, int cpf, Date dataNascimento) {
		this.setNome(nome);
		this.setCpf(cpf);
		this.setDataNascimento(dataNascimento);
	}
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", dataNascimento=" + dataNascimento + "]";
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}


	@Override
	public int compareTo(Pessoa p) {
		int comparacao = this.getDataNascimento().compareTo(p.getDataNascimento());
		if(comparacao >= 1) { return 1; }
		if(comparacao <= 1) { return -1; }
		
		return 0;
	}
}
