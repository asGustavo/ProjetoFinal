package Entidades;

//Declara��o da classe Fornecedor.
public class Fornecedor {
	
	//Atributos da classe fornecedor.
	private String cnpj;
	private String endere�o;
	private String telefone;
	
	//Construtor da classe Fornecedor, por meio de par�metros.
	public Fornecedor(String cnpj, String endere�o, String telefone) {
		this.cnpj = cnpj;
		this.endere�o = endere�o;
		this.telefone = telefone;
	}
	
	//M�todos Get e Set padr�o para os atributos da classe Fornecedor.
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getEndere�o() {
		return endere�o;
	}
	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}

	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
}
