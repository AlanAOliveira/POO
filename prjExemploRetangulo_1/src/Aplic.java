/**
 *
 * @author Alan
 */
public class Aplic {

    public static void main(String[] args) {
        Retangulo objRet;
        
        objRet = new Retangulo();
        
        objRet.setAltura(5.0);
        objRet.setBase(8.0);
        
        System.out.println("Medida da altura: " + objRet.getAltura());
        System.out.println("Medida da base: " + objRet.getBase());        
        System.out.println("Medida da área: " + objRet.calcArea());
        System.out.println("Medida do perimetro: " + objRet.calcPerimetro());
    }
    
}
