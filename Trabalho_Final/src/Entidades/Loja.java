package Entidades;
import java.util.*;

//Declara��o da classe Loja
public class Loja {
	
	//Atributos da classe Loja
	private String nome;
	private String endereco;
	private int cnpj;
	private int telefone;
	
	//Bloco abaixo est� instanciando a classe produto em um objeto, para ele ser usado mais para frente no c�digo
	int idp, quantidadep;
	double precop;
	String nomep;
	Produto produto = new Produto(idp, nomep, quantidadep, precop);
	
	//Bloco abaixo est� instanciando a classe funcion�rio em um objeto, para ele ser usado mais para frente no c�digo
	double salariofu;
	String cpffu;
	String nomefu;
	Funcionario funcionario = new Funcionario(nomefu, cpffu, salariofu);
	
	
	//Bloco abaixo est� instanciando a classe fornecedor em um objeto, para ele ser usado mais para frente no c�digo
	String enderecofo, cnpjfo, telefonefo;
	Fornecedor fornecedor = new Fornecedor(cnpjfo, enderecofo, telefonefo);
	
	Scanner sc = new Scanner(System.in);
	
	//Construtor da classe Loja, passando seujs valores por par�metro
	public Loja(String nome, String endereco, int cnpj, int telefone){
		this.nome = nome;
		this.endereco = endereco;
		this.cnpj = cnpj;
		this.telefone = telefone;	
	}
	
	//M�todos Get e Set para cada atributo da classe Loja
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	
	public Fornecedor getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
	public int getCnpj() {
		return cnpj;
	}
	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}
	
	
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	
	//M�todo abaixo respons�vel por cadastrar os produtos referentes a loja
	ArrayList<Produto> estoque = new ArrayList<Produto>(); //Vetor que ir� armazenar os produtos

	public void cadastrarProduto(){
		
		//Abaixo est� sendo pedido as informa��es do produto, o c�digo est� lendo, e modificando pelo seu m�todo Set
		System.out.println("Informe o ID do produto:");
		idp = sc.nextInt();
		produto.setId(idp);
		
		System.out.println("Informe o nome do produto:");
		nomep = sc.next();
		produto.setNome(nomep);
		
		System.out.println("Informe a quantidade do produto:");
		quantidadep = sc.nextInt();
		produto.setQuantidade(quantidadep);
		
		System.out.println("Informe o pre�o do produto:");
		precop = sc.nextDouble();
		produto.setPreco(precop);
		
		Produto produto = new Produto(idp, nomep, quantidadep, precop); //Instancia o objeto que vai receber os valores pedidos acima
		estoque.add(produto); //Adiciona no vetor de produtos
		
		System.out.println("Produto cadastrado e adicionado no estoque com sucesso!");		
	}
	
	//M�todo para conferir os produtos que foram cadastrados e est�o no estoque
	public void conferirEstoque(){
		for (Produto produto: estoque) {
			System.out.println("Id do produto: " + produto.getId() + ". Nome do produto: " + produto.getNome() +
					". Quantidade do produto: " + produto.getQuantidade() + ". Pre�o do produto: " + produto.getPreco());
		}
	}
	
	
	
	//M�todo abaixo respons�vel por cadastrar os funcion�rios contratados pela loja
	ArrayList<Funcionario> contratados = new ArrayList<Funcionario>(); //Vetor que vai armazenar os funcion�rios
	public void cadastrarFuncionario(){
		
		//Abaixo est� sendo pedido as informa��es do funcion�rio, o c�digo est� lendo, e modificando pelo seu m�todo Set
		System.out.println("Informe o nome do funcion�rio:");
		nomefu = sc.next();
		funcionario.setNome(nomefu);
		
		System.out.println("Informe o CPF do funcion�rio:");
		cpffu = sc.next();
		funcionario.setCpf(cpffu);
		
		System.out.println("Informe o salario do funcion�rio:");
		salariofu = sc.nextDouble();
		funcionario.setSalario(salariofu);
		
		Funcionario funcionario = new Funcionario(nome, cpffu, salariofu); //Instancia o objeto que vai receber os valores pedidos acima
		contratados.add(funcionario); //Adiciona no vetor de funcion�rios
		
		System.out.println("Funcion�rio contratado foi cadastrado com sucesso!");
	}
	//M�todo para conferir os funcion�rios cadastrados pela loja
	public void conferirFuncionarios(){
		for (Funcionario funcionario: contratados) {
			System.out.println("Nome do funcion�rio: " + funcionario.getNomeF() + ". CPF do funcionario: " + funcionario.getCpf() +
					". Sal�rio do funcion�rio: " + funcionario.getSalario());
		}
	}
	
	
	
	//M�todo abaixo respons�vel por cadastrar os fornecedores parceiros da loja
	ArrayList<Fornecedor> fornecedores = new ArrayList<Fornecedor>(); //Vetor que vai armazenar os fornecedores
	public void cadastrarFornecedor(){
		
		//Abaixo est� sendo pedido as informa��es do fornecedor, o c�digo est� lendo, e modificando pelo seu m�todo Set
		System.out.println("Informe o CNPJ do fornecedor:");
		cnpjfo = sc.next();
		fornecedor.setCnpj(cnpjfo);
		
		System.out.println("Informe o endere�o do fornecedor:");
		enderecofo = sc.next();
		fornecedor.setEndere�o(enderecofo);
		
		System.out.println("Informe o telefone do fornecedor:");
		telefonefo = sc.next();
		fornecedor.setTelefone(telefonefo);
		
		Fornecedor fornecedor = new Fornecedor(cnpjfo, enderecofo, telefonefo); //Instancia o objeto que vai receber os valores pedidos acima
		fornecedores.add(fornecedor); //Adiciona no vetor de fornecedores
		
		System.out.println("Fornecedor registrado com sucesso!");
	}
	//M�todo para conferir os fornecedores parceiros que foram cadastrados
	public void conferirFornecedores(){
		for (Fornecedor fornecedor: fornecedores) {
			System.out.println("CNPJ do fornecedor: " + fornecedor.getCnpj() + ". Endere�o do fornecedor: " + fornecedor.getEndere�o() +
					". Telefone do fornecedor: " + fornecedor.getTelefone());
		}
	}	

}
