/*
 * Escreva um algoritmo que calcule a média aritmética das 3 notas dos alunos de uma classe. 
 * O algoritmo deverá ler, além das notas, o código do aluno e deverá ser encerrado quando o 
 * código for igual a zero.
 */
package questao07;
import java.util.Scanner;

public class Questao07 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int codigo;
		boolean continua = true;
		double n1 = 0;
		double n2 = 0;
		double n3 = 0;
		double media = 0;
		
		while (continua){
			System.out.println("Digite o codigo do aluno: ");
				codigo = ler.nextInt();
			
			if(codigo == 0){
				System.out.println("Programa encerrado!");
				continua = false;
			}else{
				System.out.println("Digite a nota 1: ");
				n1 = ler.nextDouble();
				System.out.println("Digite a nota 2: ");
					n2 = ler.nextDouble();
				System.out.println("Digite a nota 3: ");
					n3 = ler.nextDouble();
				
				media = (n1+n2+n3)/3;
				
				System.out.println( "A media das notas do aluno " +codigo+ " é: " +media);
			}
		}
	}

}
