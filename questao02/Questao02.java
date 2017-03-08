/*Escrever um algoritmo que lê um valor N inteiro e positivo 
 * e que calcula e escreve o valor de E.  
 * 
 * E = 1 + 1 / 1! + 1 / 2! + 1 / 3! + 1 / N!
*/

package questao02;
import java.util.Scanner;

public class Questao02 {
	
	public static int fatorial(int numero){
		int resultado = 1;
		
		for (int i = 1; i <= numero; i++) {
			resultado = resultado * i;
		}
		
		return resultado;
	}

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n = 0;
		double e = 1;
		
		System.out.println("Digite um valor para n: ");
			n  = ler.nextInt();
		
		for (int i = 1; i <= n; i++) {
			//int fatorial = fatorial(i);
			//double r = 1.0/(double)fatorial;
			//e =  e + r;
			
			e = e + (1.0/fatorial(i));
		}
		
		System.out.printf("O resultado é: " +e);
	}

}
