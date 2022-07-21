package senac.entra21.java.oop.lista04;

import java.util.Scanner;

public class CalculadoraTeste {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int opcao = 1;
	
		while (opcao != 0) {
			System.out.println("\n <<<< Use o menu para selecionar o que deseja fazer >>>>\n");
			System.out.println("1 para somar");
			System.out.println("2 para subtrair");
			System.out.println("3 para multiplicar");
			System.out.println("4 para dividir");
			System.out.println("5 para elevar");
			System.out.println("0 para sair");
			opcao = leia.nextInt();
		
			if (opcao == 1) {
				System.out.println("\nInforme os dois valores a somar:");
				System.out.println("= " + Calculadora.somar(leia.nextInt(),leia.nextInt()));
			} else if (opcao == 2) {
				System.out.println("\nInforme os dois valores a subtrair:");
				System.out.println("= " + Calculadora.subtrair(leia.nextInt(), leia.nextInt()));
			} else if (opcao == 3) {
				System.out.println("\nInforme os dois valores a multiplicar:");
				System.out.println("= " + Calculadora.multiplicar(leia.nextInt(),leia.nextInt()));
			} else if (opcao == 4) {
				System.out.println("\nInforme os dois valores a dividir:");
				System.out.println("= " + Calculadora.dividir(leia.nextInt(),leia.nextInt()));
			} else if (opcao == 5) {
				System.out.println("\nInforme os dois valores, número e expoente:");
				System.out.println("= " + Calculadora.elevar(leia.nextInt(),leia.nextInt()));
			} else {
				System.out.println("\n<<<< Obrigado >>>>");
			}
			
		}

		leia.close();

	
	}
}
