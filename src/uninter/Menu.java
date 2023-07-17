package uninter;

import java.util.Scanner;

public class Menu {

	private Scanner sc;
	private Cofrinho cofrinho;
	
	public Menu() {
		sc = new Scanner(System.in);
		cofrinho = new Cofrinho();
	}	
	
	public void exibirMenuPrincipal( ) {
		System.out.println("---------------------------------------");
		System.out.println("COFRINHO");
		System.out.println("---------------------------------------");
		System.out.println("1-Adicionar Moedas");
		System.out.println("2-Remover Moedas");
		System.out.println("3-Listar Moedas");
		System.out.println("4-Calcular Valor Total em Reais");
		System.out.println("0-Encerrar");
		System.out.println("---------------------------------------");
		
		String opcaoSelect = sc.next();
		
		switch (opcaoSelect) {
		case "0":
			System.out.println("Encerrando Programa.....");
			System.out.println("Sistema Finalizado!");
			break; 
		case "1":
			SubMenuAddMoedas();
			exibirMenuPrincipal();
			break;
		case "2":
			SubMenuRemoverMoedas();
			exibirMenuPrincipal();
			break;
			
		case "3":
			System.out.println("----------Lista das Moedas no Cofrinho----------");
			cofrinho.listarMoedas();
			exibirMenuPrincipal();
			break;
			
		case "4":
			double valorConvertido = cofrinho.totalConvertido();
			String valorConvertidoTxt = String.format("%.2f", valorConvertido);
			valorConvertidoTxt = valorConvertidoTxt.replace(".", ",");
			System.out.println("O valor Total convertido para real: " + valorConvertidoTxt);
			exibirMenuPrincipal();
			break;
			
		default:
			System.out.println("Opção inválida!");
			exibirMenuPrincipal();
			break;
						
			
		}
		
		
	}
	
	//Método Que Exibe o SubMenu e Adiciona Moedas
	private void SubMenuAddMoedas() {
		System.out.println("--------------------------");
		System.out.println("Escolha uma das Moedas:");
		System.out.println("--------------------------");
		System.out.println("1 - Real");
		System.out.println("2 - Dolar");
		System.out.println("3 - Euro");
		System.out.println("--------------------------");

		int opcaoMoedas = sc.nextInt();
		
		
		System.out.println("Digite o Valor da Moeda:");
		String valorTxtMoeda = sc.next();
		
		
		//Alterando para Virgula
		valorTxtMoeda = valorTxtMoeda.replace(",",".");
		double valorMoeda = Double.parseDouble(valorTxtMoeda);
		
		Moeda moeda = null;
		//Instruções das Moedas
		
		if (opcaoMoedas == 1) {
			moeda = new Real(valorMoeda);
		} else if (opcaoMoedas == 2) {
			moeda = new Dolar(valorMoeda);
		} else if (opcaoMoedas == 3) {
			moeda = new Euro(valorMoeda);
		} else {
			System.out.println("Moeda Inexistente!");
			exibirMenuPrincipal();
		}
		
		cofrinho.adicionar(moeda);
		System.out.println("Moeda Adicionada com Sucesso!");
		
	}
	
	
	
	//Método Que Exibe o SubMenu e Remove as Moedas
	private void SubMenuRemoverMoedas() {
		System.out.println("--------------------------");
		System.out.println("Escolha uma das Moedas:");
		System.out.println("--------------------------");
		System.out.println("1 - Real");
		System.out.println("2 - Dolar");
		System.out.println("3 - Euro");
		System.out.println("--------------------------");
		
		int opcaoMoedas = sc.nextInt();
		
		
		System.out.println("Digite o Valor da Moeda:");
		String valorTxtMoeda = sc.next();
		
		
		//Alterando para Virgula
		valorTxtMoeda = valorTxtMoeda.replace(",",".");
		double valorMoeda = Double.parseDouble(valorTxtMoeda);
		
		Moeda moeda = null;
		//Instruções das Moedas
		
		if (opcaoMoedas == 1) {
			moeda = new Real(valorMoeda);
		} else if (opcaoMoedas == 2) {
			moeda = new Dolar(valorMoeda);
		} else if (opcaoMoedas == 3) {
			moeda = new Euro(valorMoeda);
		} else {
			System.out.println("Moeda Inexistente!");
			exibirMenuPrincipal();
		}
		
		if(cofrinho.remover(moeda)) {
			System.out.println("Moeda Removida com Sucesso!");
		} else {
			System.out.println("Não Foi encontrada nehuma moeda com esse valor!");
		}
	}
}
