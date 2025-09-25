import fatec.poo.model.PessoaFisica;
import fatec.poo.model.PessoaJuridica;
import java.text.DecimalFormat;

/**
 *
 * @author Alan
 */
public class Aplic {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        PessoaFisica objPessFis = new PessoaFisica("123.456.789-10", "Afonso", 1999);
        objPessFis.addCompras(6000);
        objPessFis.addCompras(6001);
        objPessFis.setBase(1);
        
        System.out.println("Cliente PF:");
        System.out.println("Nome:"+objPessFis.getNome());
        System.out.println("Ano Inscricao:"+objPessFis.getAnoInscricao());
        System.out.println("CPF:"+objPessFis.getCpf());
        System.out.println("Total Compras:R$"+ df.format(objPessFis.getTotalCompras()));
        System.out.println("Bonus:R$"+df.format(objPessFis.calcBonus(2025)));
        
        PessoaJuridica objPessJur = new PessoaJuridica("123.456/0001-10", "Fatecanos", 2000);
        objPessJur.addCompras(15000);
        objPessJur.setTaxaIncentivo(20.0);
        
        System.out.println("Cliente PJ:");
        System.out.println("Nome:"+objPessJur.getNome());
        System.out.println("Ano Inscricao:"+objPessJur.getAnoInscricao());
        System.out.println("CPF:"+objPessJur.getCgc());
        System.out.println("Total Compras:R$"+ df.format(objPessJur.getTotalCompras()));
        System.out.println("Bonus:R$"+df.format(objPessJur.calcBonus(2025)));
        
    }
    
}
