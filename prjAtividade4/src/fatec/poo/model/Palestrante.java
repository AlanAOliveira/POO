package fatec.poo.model;

/**
 *
 * @author alan
 */
public class Palestrante extends Pessoa{
    private String empresa;
    private double taxaCobranca;

    public Palestrante(String empresa, String cpf, String nome) {
        super(cpf, nome);
        this.empresa = empresa;
    }

    public String getEmpresa() {
        return empresa;
    }

    public double getTaxaCobranca() {
        return taxaCobranca;
    }

    public void setTaxaCobranca(double taxaCobranca) {
        this.taxaCobranca = taxaCobranca;
    }
    
    
    
    
}
