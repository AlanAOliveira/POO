/**
 *
 * @author alan
 */
public class Exemplo5 {
    public static void main(String[] args) {
        
        int cont = 1, num;
        
        num = (int)(Math.random() * 10);
        System.out.println("\t\t\tTabuada do "+ num +"\n");
        
        do{
            System.out.println(num + " x " + cont + " = " + cont * num);
            cont++;
        }
        while(cont < 11);
    }
    
}
