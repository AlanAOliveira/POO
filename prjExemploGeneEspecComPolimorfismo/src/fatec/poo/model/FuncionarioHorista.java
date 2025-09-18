
package fatec.poo.model;

/**
 *
 * @author Alan
 */
public class FuncionarioHorista extends Funcionario{
    private double valHorTrab;
    private int qtdHorTrab;
    
    public FuncionarioHorista(int r, String n, String dtAdm, double vht){
        super(r, n, dtAdm);     
        valHorTrab = vht;
    }
    
    public void setQtdHora(int qht){
        qtdHorTrab = qht;
    }
    
    public double calcSalBruto(){
        return(valHorTrab * qtdHorTrab);
    }

    public double calcGratificacao(){
        return(calcSalBruto()*0.075);
    }

    public double calcSalLiquido(){
        return(super.calcSalLiquido() + calcGratificacao());
    }
    
}
