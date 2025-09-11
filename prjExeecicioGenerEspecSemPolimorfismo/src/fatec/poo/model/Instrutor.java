
package fatec.poo.model;

/**
 *
 * @author Alan
 */
public class Instrutor extends Pessoa {
    private int Identificacao;
    private String areaAtuacao;
    
    public Instrutor(int i, String n, String t){
        super(n, t);
        Identificacao = i;
    }
    
    public void setAreaAtuacao(String aa){
        areaAtuacao = aa;
    }
    
    public int getIdentificacao(){
        return(Identificacao);
    }
    
    public String getAreaAtuacao(){
        return(areaAtuacao);
    }
}

