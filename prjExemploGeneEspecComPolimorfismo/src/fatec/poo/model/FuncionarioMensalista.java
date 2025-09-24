package fatec.poo.model;

/**
 *
 * @author Alan
 */
public class FuncionarioMensalista extends Funcionario {

    private double valSalMin;
    private double numSalMin;

    public FuncionarioMensalista(int r, String n, String dtAdm, double vsm) {
        super(r, n, dtAdm);
        valSalMin = vsm;
    }

    public void setNumSalMin(double nsm) {
        numSalMin = nsm;
    }

    public double calcSalBruto() {
        return (valSalMin * numSalMin);
    }

}
