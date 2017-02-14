package Questao04;

import java.lang.String;
import java.util.Scanner;

public class Media {
	
	//função para calcular média do aluno
	static float alunoMedia(float n1, float n2){
		float media = 0;		
		media = ((n1 *2) + (n2 * 3))/5;
		return media;
	}
	
	//função que informa situação do aluno
	static String situacaoAluno (float media){
		if (media < 3){
			return "Reprovado!";
		}
		else if(media >= 3 && media <7){
			return "Final!";
		}
		else if (media >= 7){
			return "Aprovado!";
		}
		else
			return "Media Inválida!";
	}
	
	//função que informa situação da final
	static String situacaoFinal (float media, float notaFinal){
		float mediaFinal = 0;
		
		mediaFinal = (media + notaFinal)/2;
		
		if (mediaFinal >= 5){
			return "Aprovado com Final!";
		}
		else if (media < 5){
			return "Reprovado!";
		}
		else
			return "Media Inválida!";
	}
	
	//Programa principal
	public static void main(String[] args) {
		int qtdAlunos = 0;
		float nota1 = 0;
		float nota2 = 0;
		float alunoMedia = 0;
		float notaFinal = 0;
		String situacaoFinal;
		String situacaoAluno;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de alunos da turma: ");
			qtdAlunos = scanner.nextInt();
		
		for (int i = 1; i <= qtdAlunos; i++){
			System.out.println("Aluno " + i);
			System.out.println("Digite a nota 1: ");
				nota1 = scanner.nextFloat();
			System.out.println("Digite a nota 2: ");
				nota2 = scanner.nextFloat();
			alunoMedia = alunoMedia(nota1, nota2);
			situacaoAluno = situacaoAluno(alunoMedia);
			
			System.out.println("A situação do aluno é: " + situacaoAluno);
			
			if (situacaoAluno.equals("Final!")){
				System.out.println("Informe a nota final: ");
					notaFinal = scanner.nextFloat();				
				situacaoFinal = situacaoFinal(alunoMedia, notaFinal);
				
				System.out.println("A situação do aluno é: " + situacaoFinal);
			}
			
			
		}
		

	}

}
