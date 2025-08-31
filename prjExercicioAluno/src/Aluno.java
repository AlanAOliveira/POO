
/**
 *
 * @author Alan
 */
public class Aluno {

    private int RA;
    private double NtPrv1;
    private double NtPrv2;
    private double NtTrab1;
    private double NtTrab2;

    public void setRA(int ra) {
        RA = ra;
    }
    
    public void setNtPrv1(double nota){
        NtPrv1 = nota;
    }

    public void setNtPrv2(double nota){
        NtPrv2 = nota;
    }
    
    public void setNtTrab1(double nota){
        NtTrab1 = nota;
    }
    
    public void setNtTrab2(double nota){
        NtTrab2 = nota;
    }    
    
    public int getRA(){
        return(RA);
    }
    
    public double getNtPrv1(){
        return(NtPrv1);
    }
    
    public double getNtPrv2(){
        return(NtPrv2);
    }
    
    public double getNtTrab1(){
        return(NtTrab1);
    }
    
    public double getNtTrab2(){
        return(NtTrab2);
    }
    
    public double calcMediaProva(){
        return(0.25 * (NtPrv1 + 2 * NtPrv2));
    }
    
    public double calcMediaTrab(){
        return(0.125 * (NtTrab1 + NtTrab2));
    }
    
    public double calcMediaFinal(){
        return (calcMediaProva() + calcMediaTrab());
    }
}
