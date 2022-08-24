package Entidades;
import java.util.*;

//Declara��o da classe Caixa, que � herdeira de Funcion�rio.
public class Caixa extends Funcionario {
	
	//Construtor da classe Caixa, que passa apenas os par�metros ja existentes na classe Funcion�rio
	public Caixa(String nome, String cpf, double salario){
		super(nome, cpf, salario);
	}
	
	Scanner sc = new Scanner(System.in);
	int id;
	ArrayList<Produto> estoque = new ArrayList<Produto>();
	
	//M�todo para vender o produto, em que o programa vai mostrar um produto que foi vendido apartir da escolha do c�digo dele
	public void venderProduto(){
		System.out.println("Informe o id do produto vendido:");
		id = sc.nextInt();
		
		for (Produto produto: estoque) {
			if(id == produto.getId()) {
				System.out.println("PRODUTO VENDIDO:");
				System.out.println("Id do produto: " + produto.getId() + ". Nome do produto: " + produto.getNome() +
						". Quantidade do produto: " + produto.getQuantidade() + ". Pre�o do produto: " + produto.getPreco());
			}
		}
		
		
	}

}
