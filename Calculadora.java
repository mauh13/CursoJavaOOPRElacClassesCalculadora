package senac.entra21.java.oop.lista04;

public class Calculadora {
	
	public static int somar(int num1, int num2) {
		return num1 + num2;
	}

	public static int subtrair(int num1, int num2) {
		return num1 - num2;
	}
	
	public static int multiplicar(int num1, int num2) {
		return num1 * num2;
	}

	public static double dividir(int num1, int num2) {
		return num1 / num2;
	}
	
	public static int elevar(int num1, int expoente) {
		int total = 1;
		for (int i=0; i<expoente; i++) {
			total *= num1;
		}
		return total;
	}
	
}
