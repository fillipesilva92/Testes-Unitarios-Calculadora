package calc;

import java.util.Scanner;

import metodos.Metodos;

public class Calculadora {

	public static void main(String[] args) {

		Metodos metodos = new Metodos();

		Scanner scanner = new Scanner(System.in);
		

		System.out.println("Qual operação deseja realizar?");
		String opcao;
		System.out.println("1 - Somar\n2 - Subtrair\n3 - Dividir\n4 - Multiplicar\n0 - Sair");
		opcao = scanner.nextLine();

		while(opcao.equals("1")) {
			System.out.println("Digite n1");
			int numero1 = scanner.nextInt();
			System.out.println("Digite n2");
			int numero2 = scanner.nextInt();
			System.out.println(metodos.somar(numero1, numero2));
			System.out.println("Qual operação deseja realizar?");
			System.out.println("1 - Somar\n2 - Subtrair\n3 - Dividir\n4 - Multiplicar\n0 - Sair");
			opcao = scanner.nextLine();
		}
		while (opcao.equals("2")) {
			System.out.println("Digite n1");
			int numero1 = scanner.nextInt();
			System.out.println("Digite n2");
			int numero2 = scanner.nextInt();
			System.out.println(metodos.subtrair(numero1, numero2));
			System.out.println("Qual operação deseja realizar?");
			System.out.println("1 - Somar\n2 - Subtrair\n3 - Dividir\n4 - Multiplicar\n0 - Sair");
			opcao = scanner.nextLine();
		} 
		while (opcao.equals("3")) {
			System.out.println("Digite n1");
			int numero1 = scanner.nextInt();
			System.out.println("Digite n2");
			int numero2 = scanner.nextInt();
			System.out.println(metodos.dividir(numero1, numero2));
			System.out.println("Qual operação deseja realizar?");
			System.out.println("1 - Somar\n2 - Subtrair\n3 - Dividir\n4 - Multiplicar\n0 - Sair");
			opcao = scanner.nextLine();
		} 
		while (opcao.equals("4")) {
			System.out.println("Digite n1");
			int numero1 = scanner.nextInt();
			System.out.println("Digite n2");
			int numero2 = scanner.nextInt();
			System.out.println(metodos.somar(numero1, numero2));
			System.out.println("Qual operação deseja realizar?");
			System.out.println("1 - Somar\n2 - Subtrair\n3 - Dividir\n4 - Multiplicar\n0 - Sair");
			opcao = scanner.nextLine();
		}
		while (opcao.equals("0")) {
			System.exit(0);
		}
	}

}
