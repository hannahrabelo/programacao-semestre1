/*
 * Escreva um algoritmo que calcule a média dos números digitados pelo usuário, 
 * se eles forem pares. Termine a leitura se o usuário digitar zero (0).
 */
package questao08;
import java.util.Scanner;

public class Questao08 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int media = 0;
		int num = 0;
		int soma = 0;
		int cont = 0;
		boolean continua = true;
		
		while(continua){
			System.out.println("Digite um número: ");
				num = ler.nextInt();
				
			if(num == 0){
				continua = false;
			}else{
				if (num % 2 == 0){
					soma = soma + num;
					cont ++;
				}
			}
		}
		
		if(cont == 0){
			System.out.println("Programa encerrado");
		}else{
			media = soma/cont;
			
			System.out.println("A media é: " +media);
		}
	}

}
