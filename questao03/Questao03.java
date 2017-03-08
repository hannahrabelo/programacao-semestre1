/*A prefeitura de uma cidade fez uma pesquisa entre seus habitantes, coletando dados sobre o salário e número de filhos. 
 * A prefeitura deseja saber:  
 * a) média do salário da população;
 * b) média do número de filhos;
 * c) maior salário;
 * d) percentual de pessoas com salário até R$100,00.
 * O final da leitura de dados se dará com a entrada de um salário negativo. (Use o comando ENQUANTO-FAÇA) 
*/
package questao03;
import java.util.Scanner;

public class Questao03 {
	
	static double mediaSalario(double[] sal){
		double media = 0;
		double soma = 0;
		for (int i = 0; i < sal.length; i++) {
			soma = soma + sal[i];
		}
		media = soma/sal.length;
		return media;
	}
	
	static double mediaFilhos(int[] filhos){
		double media = 0;
		double soma = 0;
		for (int i = 0; i < filhos.length; i++) {
			soma = soma + filhos[i];
		}
		media = soma/filhos.length;		
		return media;
	}
	
	static double maiorsalario(double[] sal){
		double maior = 0;
		for (int i = 0; i < sal.length; i++) {
			if(sal[i] > maior){
				maior = sal[i];
			}
		}
		return maior;
	}
	
	static double percentPessoas(double sal[]){
		double percent = 0;
		int numero = 0;
		for (int i = 0; i < sal.length; i++) {
			if (sal[i] < 100.0){
				numero = numero + 1;
			}
		percent = (double)numero/100.0;
		}
		return percent;
	}

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		double salario[]; //= new double[1000];
		int numeroFilhos[]; // = new int[1000];
		int i = 0;
		int populacao = 0;
		boolean dados = true;		
		
		System.out.println("Informe o tamanho da população: ");
			populacao = ler.nextInt();
		salario = new double[populacao];
		numeroFilhos = new int[populacao];
		
		while(dados){			
			System.out.println("Informar o salario: ");
				salario[i] = ler.nextDouble();
			System.out.println("Informar o numero de filhos: ");
				numeroFilhos[i] = ler.nextInt();
			
			if(salario[i] > 0.0){
				dados = false;
			}
			i++;
		}
		
		System.out.println("A média do salário da população é: " + mediaSalario(salario));
		System.out.println("A média do número de filhos é " +mediaFilhos(numeroFilhos));
		System.out.println("O maior salário é: " +maiorsalario(salario));
		System.out.println("O percentual de pessoas com salário até R$100,00: " +percentPessoas(salario));
		
	}

}
