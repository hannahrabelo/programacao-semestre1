/*
 * Escreva um algoritmo que leia o código de um aluno e suas três notas. 
 * Calcule a média ponderada do aluno, considerando que o peso para a maior nota seja 4 e
 * para as duas restantes, 3. Mostre o código do aluno, suas três notas, 
 * a média calculada e uma mensagem "APROVADO" se a média for maior ou igual 
 * a 5 e "REPROVADO" se a média for menor que 5. 
 * Repita a operação até que o código lido seja negativo.
 */
package questao10;
import java.util.Scanner;

public class Questao10 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		boolean continua = true;
		double n1 = 0;
		double n2 = 0;
		double n3 = 0;
		double media = 0;
		int codigo = 0;
		
		
		while(continua){
			System.out.println("Digite o código do aluno: ");
				codigo = ler.nextInt();
			if(codigo < 0){
				System.out.println("Fim do programa!");
				continua = false;
			}else{
				System.out.println("Digite a nota 1: ");
					n1 = ler.nextDouble();
				System.out.println("Digite a nota 2: ");
					n2 = ler.nextDouble();
				System.out.println("Digite a nota 3: ");
					n3 = ler.nextDouble();
				
				if(n1 >= n2 && n1 >= n3){
					media = ((n1*4.0)+(n2*3.0)+(n3*3.0))/10;
				}
				else if(n2 >= n1 && n2 >= n3){
					media = ((n1*3.0)+(n2*4.0)+(n3*3.0))/10;
				}
				else if(n3 >= n1 && n3 >= n2){
					media = ((n1*3.0)+(n2*3.0)+(n3*4.0))/10;
				}
				
				System.out.println("O codigo do aluno é: " +codigo);
				System.out.println("Nota 1: " +n1);
				System.out.println("Nota 2: " +n2);
				System.out.println("Nota 3: " +n3);
				System.out.println("Média: " +media);
				
				if(media >= 5){
					System.out.println("APROVADO!");
				}
				else{
					System.out.println("REPROVADO!");
				}
			}
		}

	}

}
