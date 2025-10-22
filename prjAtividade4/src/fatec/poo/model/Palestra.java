package fatec.poo.model;

/**
 *
 * @author alan
 */
public class Palestra {
    private String data;
    private String tema;
    private double valor;
    private Participante[] participantes;

    
    public Palestra(String tema, double valor) {
        this.tema = tema;
        this.valor = valor;
        participantes = new Participante[5];
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public String getTema() {
        return tema;
    }

    public double getValor() {
        return valor;
    }
    
    public double calcTotalFaturado(){
        return valor;
    }
}