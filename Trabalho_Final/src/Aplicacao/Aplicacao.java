package Aplicacao;
import java.util.*;
import Entidades.*;

//Classe Main do programa
public class Aplicacao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Loja loja = new Loja("MrProducts", "Rua tal, Bairro tal, 125", 123548, 37999999); //Instanciando uma loja fict�cia
		
		//Programa pergunta em qual perfil ir� entrar, para ajustar as funcionalidades de acordo com a escolha
		System.out.println("Vai entrar em qual perfil?");
		System.out.println("1 - Loja");
		System.out.println("2 - Funcion�rio");
		int resp = sc.nextInt();
		
		String controle2;
		if(resp == 1){ //Se o usu�rio digitar 1, o programa vai para o perfil da loja, mostrando as op��es dispon�veis
			do{
				System.out.println("--------------- PERFIL DA LOJA ---------------");
				System.out.println();
				System.out.println("Deseja executar qual fun��o?");
				System.out.println("1 - Cadastrar produto");
				System.out.println("2 - Cadastrar funcion�rio");
				System.out.println("3 - Cadastrar fornecedor");
				System.out.println("4 - Verificar estoque");
				System.out.println("5 - Verificar lista de funcion�rios");
				System.out.println("6 - Verificar lista de fornecedores");
				int resp2 = sc.nextInt(); //A partir disso, ele faz outra pergunta, para saber o que o usu�rio quer fazer dentro do perfil da loja
			
				if(resp2 == 1) { //Se o usu�rio digitar 1...
					String controle = "s";
					do {
						loja.cadastrarProduto(); //O programa chama o m�todo que cadastra produtos
						System.out.println("Deseja cadastrar mais algum produto?");
						controle = sc.next(); //E, ap�s o cadastro de um produto, o programa pergunta se o usu�rio quer cadastrar outro produto
					}while(controle.equals("s"));//O loop de cadastrar e perguntar se deseja cadastrar outro s� finaliza quando o usu�rio digita uma palavra diferente de "s" na pergunta
				}
			
				else if(resp2 == 2) { //Se o usu�rio digitar 2...
					String controle = "s";
					do {
						loja.cadastrarFuncionario(); //O programa chama o m�todo que cadastra funcion�rios
						System.out.println("Deseja cadastrar mais algum funcionario?");
						controle = sc.next(); //E, ap�s o cadastro de um funcion�rio, o programa pergunta se o usu�rio quer cadastrar outro funcion�rio
					}while(controle.equals("s")); //O loop de cadastrar e perguntar se deseja cadastrar outro s� finaliza quando o usu�rio digita uma palavra diferente de "s" na pergunta
				}
			
				else if(resp2 == 3) { //Se o usu�rio digitar 3...
					String controle = "s";
					do {
						loja.cadastrarFornecedor(); //O programa chama o m�todo que cadastra fornecedores
						System.out.println("Deseja cadastrar mais algum fornecedor?");
						controle = sc.next(); //E, ap�s o cadastro de um fornecedor, o programa pergunta se o usu�rio quer cadastrar outro fornecedor
					}while(controle.equals("s")); //O loop de cadastrar e perguntar se deseja cadastrar outro s� finaliza quando o usu�rio digita uma palavra diferente de "s" na pergunta
				}
			
				else if(resp2 == 4) { //Se o usu�rio digitar 4...
					loja.conferirEstoque(); //O programa chama o m�todo que mostra todos os produtos cadastrados
				}
			
				else if(resp2 == 5) { //Se o usu�rio digitar 5...
					loja.conferirFuncionarios(); //O programa chama o m�todo que mostra todos os funcion�rios cadastrados
				}
			
				else if(resp2 == 6) { //Se o usu�rio digitar 6...
					loja.conferirFornecedores(); //O programa chama o m�todo que mostra todos os fornecedores cadastrados
				}
				
				System.out.println("Deseja executar mais alguma fun��o?(s/n)");
				controle2 = sc.next();//Ap�s essas fun��es, o programa pergunta se o usu�rio deseja executar alguma outra fun��o.
				//Se o usu�rio responder "s", ele � direcionado a tela de perfil da loja novamente, para escolher uma outra fun��o do menu
			}while(controle2.equals("s")); //Loop se rpete at� usu�rio digitar uma palavra diferente de "s"
		}
		
		//Voltando a primeira tela, se o usu�rio digitar 2, ele ser� direcionado ao perfil de funcion�rio
		else if(resp == 2){
				System.out.println("--------------- PERFIL DO FUNCION�RIO ---------------");
				System.out.println();
				System.out.println("Voc� � respons�vel pelo caixa ou pelo estoque?");
				System.out.println("1 - Caixa");
				System.out.println("2 - Estoque");
				int resp2 = sc.nextInt();//Onde � perguntado a ele se ele � do caixa ou do estoque.
			
				if(resp2 == 1){ //Se ele digitar 1, e escolher caixa...
					
					String controle3;
					do{ //Ser� aberto um loop que chamar� o m�todo para efetuar a venda do produto
						System.out.println("Aperte 1 para iniciar uma venda de produto:");
						int resp3 = sc.nextInt();//Usu�rio aperta 1 �ra iniciar a venda
					
						if(resp3 == 1){
						//Chama o m�todo de venda	
						}
						
						System.out.println("Deseja efetuar outra venda?");
						controle3 = sc.next();//Pergunta se quer vender mais algum produto
						
					}while(controle3.equals("s"));//Loop se repete at� usu�rio digitar um valor diferente de "s"
				}
			
				else if(resp2 == 2){//Se ele digitar 2, e escolher estoque...

					//Abre uma tela com algumas fun��es para ele escolher
					do {
						System.out.println("Gerente de estoque, deseja efetuar qual fun��o?");
						System.out.println("1 - Conferir estoque");
						System.out.println("2 - Adicionar produto");
						System.out.println("3 - Excluir produto");
						int resp3 = sc.nextInt();
					
						if(resp3 == 1){ //Digitando 1, chama o m�todo que mostra os produtos cadastrados
							loja.conferirEstoque();
						}
					
						if(resp3 == 2){ //Digitando 2...
							//Chamar m�todo de adicionar produto do gerente de estoque
						}
					
						if(resp3 == 3){//Digitando 3...
							//Chamar m�todo de excluir produto do gerente de estoque
						}
					
						System.out.println("Deseja executar mais alguma fun��o?(s/n)");
						controle2 = sc.next();	//Pergunta se quer fazer outra fun��o
					}while(controle2.equals("s")); //Loop se repete at� usu�rio digitar um valor diferente de "s"
				}
		
		}
		
		System.out.println("Programa encerrado"); //Programa se encerra
			
	}
}
