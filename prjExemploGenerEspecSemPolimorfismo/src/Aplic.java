
import fatec.poo.model.Aluno;

/**
 *
 * @author Alan
 */
public class Aplic {
    public static void main(String[] args) {
       Aluno objAluno = new Aluno(1010, "carlos silveira", "15/03/78");
       objAluno.setMensalidade(1500);
       
        System.out.println("registro escolar:"+objAluno.getRegEscolar());
        System.out.println("nome:"+objAluno.getNome());
        System.out.println("data nascimento:"+objAluno.getdataNascimento());
        System.out.println("mensalidade:"+objAluno.getMensalidade());
    }
    
}
