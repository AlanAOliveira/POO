
import java.util.Scanner;

/**
 *
 * @author Alan
 */
public class Aplic {

    public static void main(String[] args) {

        int numConta, opcao;
        double saldoInicial;
        

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o numero da conta");
        numConta = entrada.nextInt();
        System.out.print("Digite o saldo inicial da conta");
        saldoInicial = entrada.nextDouble();

        ContaCorrente objConta = new ContaCorrente(numConta, saldoInicial);

        do {
            System.out.println("\n\n1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consultar Saldo");
            System.out.println("4 - Sair");
            System.out.print("\n\t\tDigite a opção: ");
            opcao = entrada.nextInt(); //scanf("%d", &opcao);
            System.out.println("\nNumero da conta" + objConta.getNumero());
            switch (opcao) {
                case 1:
                    System.out.println("Digite o Valor para saque: ");
                    if()
                    break;
                case 2:
                    System.out.println("Medida do perímetro: " + objRet.calcPerimetro() + objRet.getUnidadeMedida());
                    break;
                case 3:
                    System.out.println("Medida da diagonal: " + objRet.calcDiagonal() + objRet.getUnidadeMedida());
                    break;
                default:
                    break;
            }
        } while (opcao < 4);

    }

}
