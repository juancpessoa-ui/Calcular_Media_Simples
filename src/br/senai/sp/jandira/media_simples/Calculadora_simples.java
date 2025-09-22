package br.senai.sp.jandira.media_simples;

import java.util.Scanner;

public class Calculadora_simples {
    double media;
    double nota1;
    double nota2;
    double nota3;
    double nota4;
    String nome_aluno, resultado;

    public void obter_dados() {
        System.out.println("*** CÁLCULAR DE MÉDIA ESCOLAR *** ");
        System.out.println(" ---------------------------------------------------------------- ");

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");// imprime mesagem na tela.
        nome_aluno = leitor.nextLine();

        System.out.print("Digite a primeira nota: ");// imprime mesagem na tela.
        nota1 = leitor.nextDouble();

        System.out.print("Digite a segunda nota: ");// imprime mesagem na tela.
        nota2 = leitor.nextDouble();

        System.out.print("Digite a terceira nota: ");// imprime mesagem na tela.
        nota3 = leitor.nextDouble();

        System.out.print("Digite a quarta nota: ");// imprime mesagem na tela.
        nota4 = leitor.nextDouble();
        realiza_Calculo();
        exibir_Resulatdo();

    }
    public void  realiza_Calculo(){

     media = (nota1 + nota2 + nota3 + nota4)/ 4;
        if (media >= 5.0) {
            resultado = "Aprovado(a)";
        } else if (media < 4) {
            resultado = "Reprovado(a)";
        } else{
            resultado = "Recuperação(a)";
        }

    }

    public void exibir_Resulatdo(){
        System.out.println(" ---------------------------------------------------------------- ");
        System.out.println(" Media do aluno: " + media);
        System.out.println(" Resultado: O(a) aluno(a) " + nome_aluno + " está " + resultado);

    }
}



