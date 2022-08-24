package Entidades;

//Declaração da classe funcionário.
public class Funcionario {
	
	//Atributos da classe.
	String nome;
	String cpf;
	double salario;
	
	//Construtor da classe por meio de parâmetros.
	public Funcionario(String nome, String cpf, double salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}
	
	
	//Abaixo, métodos get e set de cada atributo de funcionário.
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
	
