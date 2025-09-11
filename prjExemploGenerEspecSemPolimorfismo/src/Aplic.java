
import fatec.poo.model.Aluno;
import fatec.poo.model.Professor;

/**
 *
 * @author Alan
 */
public class Aplic {

    public static void main(String[] args) {
        Aluno objAluno = new Aluno(1010, "carlos silveira", "15/03/78");
        objAluno.setMensalidade(1500);
        Professor objProfessor = new Professor(2020, "silva Carleira", "15/03/78");
        objAluno.setMensalidade(200);

        System.out.println("registro escolar:" + objAluno.getRegEscolar());
        System.out.println("nome:" + objAluno.getNome());
        System.out.println("data nascimento:" + objAluno.getdataNascimento());
        System.out.println("mensalidade:" + objAluno.getMensalidade());

        System.out.println("registro funcional:" + objProfessor.getRegFuncional());
        System.out.println("nome:" + objProfessor.getNome());
        System.out.println("data nascimento:" + objProfessor.getdataNascimento());
        System.out.println("mensalidade:" + objProfessor.getSalario());

    }

}
