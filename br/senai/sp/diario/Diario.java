package br.senai.sp.diario;

import java.util.Scanner;

public class Diario {
    public static void main(String[] args) {
        /** Declarar as Variaveis*/
        String professor;
        String disciplina;
        String nomeAluno;
        int frequencia;
        int nota1;
        int nota2;
        float media;
        String situacao;
        /** Estanciar o Scanner*/
        Scanner teclado = new Scanner(System.in);
        System.out.println(" ----------Bem vindo!--------- ");
        System.out.println("------------------------------");

        /**Coletar dados*/
        System.out.print("Digite o Nome: ");
        professor = teclado.nextLine();
        System.out.print("Informe a Disciplina: ");
        disciplina = teclado.nextLine();
        System.out.print("Nome do aluno: ");
        nomeAluno = teclado.nextLine();
        System.out.print("Informe a frequencia: ");
        frequencia = teclado.nextInt();
        System.out.print("Informe a nota 1: ");
        nota1 = teclado.nextInt();
        System.out.print(" Informe a nota 2: ");
        nota2 = teclado.nextInt();



        /**Calcula média*/
        media = (nota1 + nota2)/2;
        boolean avaliaProfessor = professor.equalsIgnoreCase("vitor");

        /** Define condição do Aluno*/

        if(media >= 7 && frequencia >= 75 && !avaliaProfessor || media >=6 && frequencia >=90 && !avaliaProfessor){
            situacao = "Aprovado";

        }else
            situacao = "Reprovado";

        System.out.println("\n*******************************");
        System.out.println("----------Relatório--------------");
        System.out.println("Professor: " + professor);
        System.out.println("Diciplina: " + disciplina);
        System.out.println("Aluno: " + nomeAluno);
        System.out.println("A frequencia do Aluno: "+ frequencia);
        System.out.println("A nota 1 : "+ nota1 );
        System.out.println("Nota 2: " + nota2);
        System.out.println("A media do Aluno: "+ media);
        System.out.println("O Aluno " + nomeAluno  + " Foi " + situacao);

        System.out.println("\n*************************************");

    }
}
