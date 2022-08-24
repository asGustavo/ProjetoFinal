package Entidades;
import java.util.*;

//Declaração da classe Caixa, que é herdeira de Funcionário.
public class Caixa extends Funcionario {
	
	//Construtor da classe Caixa, que passa apenas os parâmetros ja existentes na classe Funcionário
	public Caixa(String nome, String cpf, double salario){
		super(nome, cpf, salario);
	}
	
	Scanner sc = new Scanner(System.in);
	int id;
	ArrayList<Produto> estoque = new ArrayList<Produto>();
	
	//Método para vender o produto, em que o programa vai mostrar um produto que foi vendido apartir da escolha do código dele
	public void venderProduto(){
		System.out.println("Informe o id do produto vendido:");
		id = sc.nextInt();
		
		for (Produto produto: estoque) {
			if(id == produto.getId()) {
				System.out.println("PRODUTO VENDIDO:");
				System.out.println("Id do produto: " + produto.getId() + ". Nome do produto: " + produto.getNome() +
						". Quantidade do produto: " + produto.getQuantidade() + ". Preço do produto: " + produto.getPreco());
			}
		}
		
		
	}

}
