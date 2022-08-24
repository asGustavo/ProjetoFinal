package Entidades;

//Declara��o da classe funcion�rio.
public class Funcionario {
	
	//Atributos da classe.
	String nome;
	String cpf;
	double salario;
	
	//Construtor da classe por meio de par�metros.
	public Funcionario(String nome, String cpf, double salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}
	
	
	//Abaixo, m�todos get e set de cada atributo de funcion�rio.
	public String getNomeF() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}

}
	
