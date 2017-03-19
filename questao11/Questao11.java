/*
 * Escreva um algoritmo que leia um número n (número de termos de uma progressão aritmética), 
 * a1 ( o primeiro termo da progressão) e r (a razão da progressão) 
 * e escreva os n termos desta progressão, bem como a soma dos elementos.
 */
package questao11;
import java.util.Scanner;

public class Questao11 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n = 0;
		int a1 = 0;
		int r = 0;
		int soma = 0;
		int an = 0;
		
		System.out.println("Digite um número para n: ");
			n = ler.nextInt();
		System.out.println("Digite um número para r: ");
			r = ler.nextInt();
		System.out.println("Digite um número para a1: ");
			a1 = ler.nextInt();
			
		an = a1 + (n - 1)*r;
		soma = ((a1 + an)*n)/2;
		System.out.println("A1: "+a1);
		for (int i = 2; i <= n; i++) {
			an = a1 + (i - 1)*r;
			System.out.println("A"+i+": " +an);
		}
		System.out.println("A soma é: "+soma);

	}

}
