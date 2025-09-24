package fatec.poo.model;

/**
 *
 * @author Alan
 */
public class FuncionarioComissionado extends Funcionario {

    private double salBase;
    private double taxaComissao;
    private double totalVendas;

    public FuncionarioComissionado(int r, String n, String dtAdm, double tc) {
        super(r, n, dtAdm);
        taxaComissao = tc;
    }

    public void setSalBase(double sb) {
        salBase = sb;
    }

    public double getSalBase() {
        return (salBase);
    }

    public double getTotalVendas() {
        return (totalVendas);
    }

    public double getTaxaComissão() {
        return (taxaComissao);
    }

    public void addVendas(double v) {
        totalVendas += v;
    }

    public double calcSalBruto() {
        return (salBase + taxaComissao / 100 * totalVendas);
    }

    public double calcGratificacao() {
        if (totalVendas <= 5000) {
            return 0;
        } else if (totalVendas <= 10000) {
            return (calcSalBruto() * 0.03);
        } else {
            return (calcSalBruto() * 0.05);
        }
    }

    public double calcSalLiquido() {
        return (super.calcSalLiquido() + calcGratificacao());
    }

}
