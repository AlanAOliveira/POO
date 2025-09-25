package fatec.poo.model;

/**
 *
 * @author Alan
 */
public class PessoaFisica extends Pessoa {
    private String cpf;
    private double base;
    
    public PessoaFisica(String c, String n, int ai){
        super(n, ai);
        cpf = c;
    }
    
    public double calcBonus(int ano){
        if (super.getTotalCompras() > 12000)
            return ((ano - getAnoInscricao()) * base);
        return(0);
    }
    
    public String getCpf(){
        return(cpf);
    }
    
    public void setBase(double b){
        base = b;
    }
    
    public double getBase(){
        return(base);
    }
    
    
}
