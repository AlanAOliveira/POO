
package fatec.poo.model;

/**
 *
 * @author Alan
 */
public class Pessoa {
    private String Nome;
    private String dataNascimento;
    
    public Pessoa(String n, String dn){
        Nome = n;
        dataNascimento = dn;
    }
    
    public String getNome(){
        return(Nome);
    }
    
    public String getdataNascimento(){
        return(dataNascimento);
    }
}
