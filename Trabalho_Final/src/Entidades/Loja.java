package Entidades;
import java.util.*;

//Declaração da classe Loja
public class Loja {
	
	//Atributos da classe Loja
	private String nome;
	private String endereco;
	private int cnpj;
	private int telefone;
	
	//Bloco abaixo está instanciando a classe produto em um objeto, para ele ser usado mais para frente no código
	int idp, quantidadep;
	double precop;
	String nomep;
	Produto produto = new Produto(idp, nomep, quantidadep, precop);
	
	//Bloco abaixo está instanciando a classe funcionário em um objeto, para ele ser usado mais para frente no código
	double salariofu;
	String cpffu;
	String nomefu;
	Funcionario funcionario = new Funcionario(nomefu, cpffu, salariofu);
	
	
	//Bloco abaixo está instanciando a classe fornecedor em um objeto, para ele ser usado mais para frente no código
	String enderecofo, cnpjfo, telefonefo;
	Fornecedor fornecedor = new Fornecedor(cnpjfo, enderecofo, telefonefo);
	
	Scanner sc = new Scanner(System.in);
	
	//Construtor da classe Loja, passando seujs valores por parâmetro
	public Loja(String nome, String endereco, int cnpj, int telefone){
		this.nome = nome;
		this.endereco = endereco;
		this.cnpj = cnpj;
		this.telefone = telefone;	
	}
	
	//Métodos Get e Set para cada atributo da classe Loja
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
	
	
	//Método abaixo responsável por cadastrar os produtos referentes a loja
	ArrayList<Produto> estoque = new ArrayList<Produto>(); //Vetor que irá armazenar os produtos

	public void cadastrarProduto(){
		
		//Abaixo está sendo pedido as informações do produto, o código está lendo, e modificando pelo seu método Set
		System.out.println("Informe o ID do produto:");
		idp = sc.nextInt();
		produto.setId(idp);
		
		System.out.println("Informe o nome do produto:");
		nomep = sc.next();
		produto.setNome(nomep);
		
		System.out.println("Informe a quantidade do produto:");
		quantidadep = sc.nextInt();
		produto.setQuantidade(quantidadep);
		
		System.out.println("Informe o preço do produto:");
		precop = sc.nextDouble();
		produto.setPreco(precop);
		
		Produto produto = new Produto(idp, nomep, quantidadep, precop); //Instancia o objeto que vai receber os valores pedidos acima
		estoque.add(produto); //Adiciona no vetor de produtos
		
		System.out.println("Produto cadastrado e adicionado no estoque com sucesso!");		
	}
	
	//Método para conferir os produtos que foram cadastrados e estão no estoque
	public void conferirEstoque(){
		for (Produto produto: estoque) {
			System.out.println("Id do produto: " + produto.getId() + ". Nome do produto: " + produto.getNome() +
					". Quantidade do produto: " + produto.getQuantidade() + ". Preço do produto: " + produto.getPreco());
		}
	}
	
	
	
	//Método abaixo responsável por cadastrar os funcionários contratados pela loja
	ArrayList<Funcionario> contratados = new ArrayList<Funcionario>(); //Vetor que vai armazenar os funcionários
	public void cadastrarFuncionario(){
		
		//Abaixo está sendo pedido as informações do funcionário, o código está lendo, e modificando pelo seu método Set
		System.out.println("Informe o nome do funcionário:");
		nomefu = sc.next();
		funcionario.setNome(nomefu);
		
		System.out.println("Informe o CPF do funcionário:");
		cpffu = sc.next();
		funcionario.setCpf(cpffu);
		
		System.out.println("Informe o salario do funcionário:");
		salariofu = sc.nextDouble();
		funcionario.setSalario(salariofu);
		
		Funcionario funcionario = new Funcionario(nome, cpffu, salariofu); //Instancia o objeto que vai receber os valores pedidos acima
		contratados.add(funcionario); //Adiciona no vetor de funcionários
		
		System.out.println("Funcionário contratado foi cadastrado com sucesso!");
	}
	//Método para conferir os funcionários cadastrados pela loja
	public void conferirFuncionarios(){
		for (Funcionario funcionario: contratados) {
			System.out.println("Nome do funcionário: " + funcionario.getNomeF() + ". CPF do funcionario: " + funcionario.getCpf() +
					". Salário do funcionário: " + funcionario.getSalario());
		}
	}
	
	
	
	//Método abaixo responsável por cadastrar os fornecedores parceiros da loja
	ArrayList<Fornecedor> fornecedores = new ArrayList<Fornecedor>(); //Vetor que vai armazenar os fornecedores
	public void cadastrarFornecedor(){
		
		//Abaixo está sendo pedido as informações do fornecedor, o código está lendo, e modificando pelo seu método Set
		System.out.println("Informe o CNPJ do fornecedor:");
		cnpjfo = sc.next();
		fornecedor.setCnpj(cnpjfo);
		
		System.out.println("Informe o endereço do fornecedor:");
		enderecofo = sc.next();
		fornecedor.setEndereço(enderecofo);
		
		System.out.println("Informe o telefone do fornecedor:");
		telefonefo = sc.next();
		fornecedor.setTelefone(telefonefo);
		
		Fornecedor fornecedor = new Fornecedor(cnpjfo, enderecofo, telefonefo); //Instancia o objeto que vai receber os valores pedidos acima
		fornecedores.add(fornecedor); //Adiciona no vetor de fornecedores
		
		System.out.println("Fornecedor registrado com sucesso!");
	}
	//Método para conferir os fornecedores parceiros que foram cadastrados
	public void conferirFornecedores(){
		for (Fornecedor fornecedor: fornecedores) {
			System.out.println("CNPJ do fornecedor: " + fornecedor.getCnpj() + ". Endereço do fornecedor: " + fornecedor.getEndereço() +
					". Telefone do fornecedor: " + fornecedor.getTelefone());
		}
	}	

}
