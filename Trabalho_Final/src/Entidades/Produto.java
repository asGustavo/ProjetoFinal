package Entidades;

//Declaração da classe Produto.
public class Produto {
	
	//Atributos da classe Produto.
	private int id;
	private String nome;
	private int quantidade;
	private double preco;
	
	
	//Construtor da classe Produto, por meio de parâmetros.
	public Produto(int id, String nome, int quantidade, double preco) {
		this.id = id;
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}
	
	
	//Métodos Get e Set padrão para os atributos da classe Produto.
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	

}
