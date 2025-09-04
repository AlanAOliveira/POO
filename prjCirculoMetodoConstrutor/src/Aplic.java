
import java.util.Scanner;

/**
 *
 * @author Alan
 */
public class Aplic {

    public static void main(String[] args) {
        //commit
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a unidade de medida do circulo: ");
        Circulo objCirc = new Circulo(entrada.next());

        System.out.print("Digite a medida do raio do circulo: ");
        objCirc.setRaio(entrada.nextDouble());

        System.out.println("Area do curculo: " + objCirc.calcArea() + objCirc.getUnidadeMedida() + "²");
        System.out.println("Perimetro do curculo: " + objCirc.calcPerimetro() + objCirc.getUnidadeMedida());
        System.out.println("Diametro do curculo: " + objCirc.calcDiametro() + objCirc.getUnidadeMedida());
    }

}
