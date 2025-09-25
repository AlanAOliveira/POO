package fatec.poo.model;

/**
 *
 * @author Alan
 */
public class PessoaJuridica extends Pessoa {
    private String cgc;
    private double taxaIncentivo;
    
    public PessoaJuridica(String c, String n, int ai){
        super(n, ai);
        cgc = c;        
    }
    
    public double calcBonus(int ano){
        return(taxaIncentivo * getTotalCompras() * (ano - getAnoInscricao()));
    }
    
    public void setTaxaIncentivo(double ti){
        taxaIncentivo = ti/100;
    }
    
    public String getCgc(){
        return(cgc);
    }
    
    public double getTacaIncentivo(){
        return(taxaIncentivo);
    }  
    
}
