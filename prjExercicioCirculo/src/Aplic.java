
import java.util.Scanner;

/**
 *
 * @author Alan
 */
public class Aplic {

    public static void main(String[] args) {
        //commit
        Scanner entrada = new Scanner(System.in);

        Circulo objCirc = new Circulo();

        System.out.print("Digite a medida do raio do circulo: ");
        objCirc.setRaio(entrada.nextDouble());

        System.out.println("Area do curculo: " + objCirc.calcArea());
        System.out.println("Perimetro do curculo: " + objCirc.calcPerimetro());
        System.out.println("Diametro do curculo: " + objCirc.calcDiametro());
    }

}
