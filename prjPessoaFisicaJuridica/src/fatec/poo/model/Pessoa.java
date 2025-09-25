package fatec.poo.model;

/**
 *
 * @author Alan
 */
abstract public class Pessoa {
    private String nome;
    private int anoInscricao;
    private double totalCompras;
    
    public Pessoa(String n, int ai){
        nome= n;
        anoInscricao = ai;
    }
    
    abstract public double calcBonus(int ano);
    
    public void addCompras(int compra){
        totalCompras += compra;
    }
    
    public String getNome(){
        return(nome);
    }
    
    public int getAnoInscricao(){
        return(anoInscricao);
    }
    
    public double getTotalCompras(){
        return(totalCompras);
    }
}

