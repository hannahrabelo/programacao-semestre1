/*
 * Escreva um algoritmo que leia 50 valores e encontre o maior e o menor deles. Mostre o resultado.
 */
package questao09;
import java.util.Scanner;

public class Questao09 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num = 0;
		int maior = 0;
		int menor = 0;
		
		System.out.println("Digite um numero: ");
			num =ler.nextInt();
		maior = num;
		menor = num;
		
		for (int i = 1; i < 50; i++) {
			System.out.println("Digite um numero: ");
				num =ler.nextInt();
			if(num < menor){
				menor = num;
			}
			if(num > maior){
				maior = num;
			}
		}
		
		System.out.println("O maior número é: " +maior);
		System.out.println("O menor número é: " +menor);

	}

}
