
package fatec.poo.model;

/**
 *
 * @author Alan
 */
public class Pessoa {
    private String Nome;
    private String Telefone;
    
    public Pessoa(String n, String t){
        Nome = n;
        Telefone = t;
    }
    
    public String getNome(){
        return(Nome);
    }
    
    public String getTelefone(){
        return(Telefone);
    }
}
