/*Escrever um algoritmo que lê 5 valores para a, um de cada vez, 
 * e conta quantos destes valores são negativos, escrevendo esta informação.
*/

package questao01;
import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		int a = 0;
		Scanner ler = new Scanner(System.in);
		int numNegativo = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite um número: ");
			 a = ler.nextInt();
			 
			 if (a < 0){
				 numNegativo = numNegativo + 1;
				 System.out.println("O número " +a+ " é negativo.");
			 }
		}
		
		System.out.println("Tem " +numNegativo+ " número(s) negativo(s).");	
		
	}

}
