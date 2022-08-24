package Entidades;

//Declaração da classe Fornecedor.
public class Fornecedor {
	
	//Atributos da classe fornecedor.
	private String cnpj;
	private String endereço;
	private String telefone;
	
	//Construtor da classe Fornecedor, por meio de parâmetros.
	public Fornecedor(String cnpj, String endereço, String telefone) {
		this.cnpj = cnpj;
		this.endereço = endereço;
		this.telefone = telefone;
	}
	
	//Métodos Get e Set padrão para os atributos da classe Fornecedor.
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
}
