
import java.util.Scanner;

/**
 *
 * @author Alan
 */
public class Aplic {

    public static void main(String[] args) {

        int opcao;
        Scanner entrada = new Scanner(System.in);
        Aluno objAluno = new Aluno();

        System.out.print("Digine o RA do aluno:");
        objAluno.setRA(entrada.nextInt());
        System.out.print("Digine a nota da primeira prova: ");
        objAluno.setNtPrv1(entrada.nextDouble());
        System.out.print("Digine a nota da segunda prova: ");
        objAluno.setNtPrv2(entrada.nextDouble());
        System.out.print("Digine a nota do primeiro trabalho: ");
        objAluno.setNtTrab1(entrada.nextDouble());
        System.out.print("Digine a nota do segundo trabalho: ");
        objAluno.setNtTrab2(entrada.nextDouble());

        do {
            System.out.println("\n1 - Exibir Nota das Provas/Trabalhos");
            System.out.println("2 - Exibir Média das Trabalhos/Provas");
            System.out.println("3 - Exibir Média Final");
            System.out.println("4 - Sair");
            System.out.println("\n\tDigite a opcao");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("RA do aluno: " + objAluno.getRA());
                    System.out.println("Nota da primeira prova: " + objAluno.getNtPrv1());
                    System.out.println("Nota da segunda prova: " + objAluno.getNtPrv2());
                    System.out.println("Nota do primeiro trabalho: " + objAluno.getNtTrab1());
                    System.out.println("Nota do segundo trabalho: " + objAluno.getNtTrab2());
                    break;
                case 2:
                    System.out.println("RA do aluno: " + objAluno.getRA());
                    System.out.println("Media trabalhos: " + objAluno.calcMediaTrab());
                    System.out.println("Media provas: " + objAluno.calcMediaProva());
                    break;
                case 3:
                    System.out.println("RA do aluno: " + objAluno.getRA());
                    System.out.println("Media final: " + objAluno.calcMediaFinal());
                    break;
                default:
                    break;
            }

        } while (opcao < 4);

    }

}
