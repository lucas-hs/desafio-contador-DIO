package dsfcontador;
import java.util.Scanner;

public class Contador {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dois valores: ");
		int parametroUm = Integer.parseInt(sc.nextLine());
		int parametroDois = Integer.parseInt(sc.nextLine());
		try {
			contagem(parametroUm, parametroDois);
		} catch(Exception ParametroUmMaiorException) {
			System.out.println("O parametro um não pode ser maior que o parametro dois");
		}
		sc.close();

	}
	static void contagem (int parametroUm, int parametroDois) throws Exception { 
		if (parametroUm > parametroDois) {
			throw new Exception(); 
		}
		int subtracao = parametroDois - parametroUm;
		int contador = 0;
		for(int cont = 0; contador < subtracao ; cont++) {
			contador += 1;
			System.out.println("Contagem de números: " + contador);
		}
	}
}
