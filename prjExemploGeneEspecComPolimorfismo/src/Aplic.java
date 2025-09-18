
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;
import java.text.DecimalFormat;
import java.util.HashSet;


/**
 *
 * @author Alan
 */
public class Aplic {

    public static void main(String[] args) {
        FuncionarioHorista funcHor = new FuncionarioHorista(1010,"Pedro Silveira","15/03/1978",15.8);
        FuncionarioMensalista funcMen = new FuncionarioMensalista(2020, "Barbara Mendonça", "11/02/2001", 1518.0);
        DecimalFormat df = new DecimalFormat("#,##0.00");
        
        funcHor.setQtdHora(90);
        funcMen.setNumSalMin(2);
        funcHor.setCargo("Pamonheiro");
        funcMen.setCargo("pipoqueiro");      
        

        System.out.println("Nome:"+ funcHor.getNome());
        System.out.println("Registro:"+ funcHor.getRegistro());
        System.out.println("Data Adminissão:"+ funcHor.getDtAdmissao());
        //não havia requisito de metodo que atribuisse valor ao atributo cargo
        System.out.println("Cargo:"+ funcHor.getCargo());
        System.out.println("Salario bruto:"+ df.format(funcHor.calcSalBruto()));
        System.out.println("Gratificação:" + df.format(funcHor.calcGratificacao()));
        System.out.println("Desconto:" + df.format(funcHor.calcDesconto()));
        System.out.println("Salario Liquido:" + df.format(funcHor.calcSalLiquido()));

        System.out.println("\n----------------------------------\n");
        
        System.out.println("Nome:"+ funcMen.getNome());
        System.out.println("Registro:"+ funcMen.getRegistro());
        System.out.println("Data Adminissão:"+ funcMen.getDtAdmissao());
        //não havia requisito de metodo que atribuisse valor ao atributo cargo
        System.out.println("Cargo:"+ funcMen.getCargo());
        System.out.println("Salario bruto:"+ df.format(funcMen.calcSalBruto()));
        System.out.println("Desconto:" + df.format(funcMen.calcDesconto()));
        System.out.println("Salario Liquido:" + df.format(funcMen.calcSalLiquido()));
    }

}
