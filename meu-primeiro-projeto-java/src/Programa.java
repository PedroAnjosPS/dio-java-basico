import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        // Constantes
        final int mediaPadrao = 6, pesoProvas = 3;
        final double pesoTrabalhos = 1.5;
        // Variaveis
        double prova1, prova2, trabalho1, trabalho2, mediaFinal;
        String nomeAluno, status;
        
        Scanner leitor = new Scanner(System.in);

        System.out.println("============================");
        System.out.println(" Calculando Média do Aluno ");
        System.out.println("============================");

        // Entrada de dados
        System.out.println("Digite o nome do Aluno: ");
        nomeAluno = leitor.next();

        do {
            System.out.println("Digite a nota da 1ª prova realizada pelo aluno " + nomeAluno + ": ");
            prova1 = leitor.nextDouble();

        } while(prova1 < 0 || prova1 > 10);

        do {
            System.out.println("Digite a nota do 1º trabalho realizado pelo aluno " + nomeAluno + ": ");
            trabalho1 = leitor.nextDouble();    
        } while (trabalho1 < 0 || trabalho1 > 10);
        
        do {
            System.out.println("Digite a nota da 2ª prova realizada pelo aluno " + nomeAluno + ": ");
            prova2 = leitor.nextDouble();    
        } while (prova2 < 0 || prova2 > 10);
        
        do {
            System.out.println("Digite a nota do 2º trabalho realizado pelo aluno " + nomeAluno + ": ");
            trabalho2 = leitor.nextDouble();    
        } while (trabalho2 < 0 || trabalho2 > 10);
        

        // Processamento
        mediaFinal = (prova1 * pesoProvas + prova2 * pesoProvas + trabalho1 * pesoTrabalhos + trabalho2 * pesoTrabalhos) / (pesoProvas * 2 + pesoTrabalhos * 2);

        // Saída de dados (com condicional)
        if (mediaFinal >= mediaPadrao) {
            status = "Aprovado";

            System.out.printf("%n%nAluno: %s.%n" + 
            "Media Final: %.2f.%n" +
            "Status: %s.%n" +  
            "Recado: Parabéns, você passou de ano!!!%n", 
            nomeAluno, mediaFinal, status);
        } else {
            status = "Reprovado";

            System.out.printf("%n%nAluno: %s.%n" + 
            "Media Final: %.2f.%n" +
            "Status: %s.%n" + 
            "Recado: Vish... só lamento!! Pelo menos vai fazer companhia para nós por mais um ano kkkkkkkkk%n",
            nomeAluno, mediaFinal, status);
        }
    }
}
