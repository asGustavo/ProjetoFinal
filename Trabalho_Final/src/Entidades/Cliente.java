package Entidades;

//Declara��o da classe Cliente. 
public class Cliente {
	
	//Atributos da classe Cliente.
	String nome;
	int cpf;
	int telefone;
	
	//Construtor da classe Cliente, por meio de par�metros.
	public Cliente(String nome, int cpf, int telefone) {
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
	}
	
	//M�todos Get e Set padr�o para os atributos da classe Cliente.
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
