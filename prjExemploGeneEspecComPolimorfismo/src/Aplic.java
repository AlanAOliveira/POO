
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;


/**
 *
 * @author Alan
 */
public class Aplic {

    public static void main(String[] args) {
        FuncionarioHorista funcHor = new FuncionarioHorista(1010,"Pedro Silveira","15/03/1978",15.8);
        FuncionarioMensalista funcMen = new FuncionarioMensalista(2020, "Barbara Mendonça", "11/02/2001", 1518.0);

        funcHor.setQtdHora(90);
        funcMen.setNumSalMin(2);

        System.out.println("Nome:"+ funcHor.getNome());
        System.out.println("Registro:"+ funcHor.getRegistro());
        System.out.println("Data Adminissão:"+ funcHor.getDtAdmissao());
        //não havia requisito de metodo que atribuisse valor ao atributo cargo
        System.out.println("Cargo:"+ funcHor.getCargo());
        System.out.println("Salario bruto:"+ funcHor.calcSalBruto());
        System.out.println("Gratificação:" + funcHor.calcGratificacao());
        System.out.println("Desconto:" + funcHor.calcDesconto());
        System.out.println("Salario Liquido:" + funcHor.calcSalLiquido());

        System.out.println("\n----------------------------------\n");
        
        System.out.println("Nome:"+ funcMen.getNome());
        System.out.println("Registro:"+ funcMen.getRegistro());
        System.out.println("Data Adminissão:"+ funcMen.getDtAdmissao());
        //não havia requisito de metodo que atribuisse valor ao atributo cargo
        System.out.println("Cargo:"+ funcMen.getCargo());
        System.out.println("Salario bruto:"+ funcMen.calcSalBruto());
        System.out.println("Desconto:" + funcMen.calcDesconto());
        System.out.println("Salario Liquido:" + funcMen.calcSalLiquido());
    }

}
