
import fatec.poo.model.Aluno;

/**
 *
 * @author Alan
 */
public class Aplic {
    public static void main(String[] args) {
       Instrutor objInstrutor = new Instrutor(123, "valter", "40028922");
       objInstrutor.setAreaAtuacao("culinaria");

       Cliente objCliente = new Cliente("123.456.789-10", "maria", "10101010");
       objCliente.setPeso(60);
       objCliente.setAltura(160);


       
        System.out.println("instrutor:"+objInstrutor.getIdentificacao());
        System.out.println("nome:"+objInstrutor.getNome());
        System.out.println("telefone:"+objInstrutor.getTelefone());
        System.out.println("Area atuaççao:"+objInstrutor.getAreaAtuacao());

        
        System.out.println("cpf cliente:"+objCliente.getCpf());
        System.out.println("nome:"+objCliente.getNome());
        System.out.println("telefone:"+objCliente.getTelefone());
        System.out.println("peso:"+objCliente.getPeso());
        System.out.println("Altura:"+objCliente.getAltura());
    }
    
}
