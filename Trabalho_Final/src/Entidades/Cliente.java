package Entidades;

//Declaração da classe Cliente. 
public class Cliente {
	
	//Atributos da classe Cliente.
	String nome;
	int cpf;
	int telefone;
	
	//Construtor da classe Cliente, por meio de parâmetros.
	public Cliente(String nome, int cpf, int telefone) {
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
	}
	
	//Métodos Get e Set padrão para os atributos da classe Cliente.
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
	
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	

}
