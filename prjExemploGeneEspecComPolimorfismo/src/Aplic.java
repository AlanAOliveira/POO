
import fatec.poo.model.FuncionarioHorista;


/**
 *
 * @author Alan
 */
public class Aplic {

    public static void main(String[] args) {
        FuncionarioHorista funcHor = new FuncionarioHorista(1010,"Pedro Silveira","15/03/1978",15.8);
        
        funcHor.setQtdHora(90);
        System.out.println("Salario bruto  :"+ funcHor.calcSalBruto());
        System.out.println("Desconto       :" + funcHor.calcDesconto());
        System.out.println("Salario Liquido:" + funcHor.calcSalLiquido());
    }

}
