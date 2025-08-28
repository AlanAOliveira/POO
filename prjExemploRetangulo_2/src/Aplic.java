
import java.util.Scanner;

/**
 *
 * @author Alan
 */
public class Aplic {

    public static void main(String[] args) {
        double medAlt, medBase;
        int opcao;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a medida da altura do retangulo: ");
        medAlt = entrada.nextDouble();
        System.out.print("Digite a medida da base do retangulo: ");
        medBase = entrada.nextDouble();

        Retangulo objRet = new Retangulo();
        objRet.setAltura(medAlt);
        objRet.setBase(medBase);

        do {
            System.out.println("\n\n1 - Consultar Medida da area");
            System.out.println("2 - Consultar Medida do preimetro");
            System.out.println("3 - Consultar Medida da diagonal");
            System.out.println("4 - Encerrar");
            System.out.println("\n\tDigite a opcao");
            opcao = entrada.nextInt();

            if (opcao == 1) {
                System.out.println("Medida da area: " + objRet.calcArea());
            } else if (opcao == 2) {
                System.out.println("Medida da perimetro: " + objRet.calcPerimetro());
            } else if (opcao == 3) {
                System.out.println("Medida da diagonal: " + objRet.calcDiagonal());
            }

        } while (opcao < 4);
    }

}
