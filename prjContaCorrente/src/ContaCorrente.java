/**
 *
 * @author Alan
 */
public class ContaCorrente {
    
    private int numero;
    private double saldo;
    
    public ContaCorrente(int numConta, double vlrSaldo){
        numero = numConta;
        saldo = vlrSaldo;
    }
    
    public int getNumero(){
        return(numero);
    }
    
    public double getSaldo(){
        return(saldo);
    }
    
    public void sacar(double saque){
        saldo -= saque;
    }
    
    public void depositar(double deposito){
        saldo += deposito;
    }
}
