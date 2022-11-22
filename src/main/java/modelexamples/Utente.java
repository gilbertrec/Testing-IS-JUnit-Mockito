package modelexamples;

public class Utente {
    String nome;
    String cognome;
    private Stipendio stipendio;
    private MetodoDiPagamento paymentData;

    public Utente(String nome, String cognome,Stipendio stipendio, MetodoDiPagamento paymentData) {
        this.nome = nome;
        this.cognome = cognome;
        this.stipendio = stipendio;
        this.paymentData = paymentData;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public Stipendio getstipendio() {
        return stipendio;
    }

    public void setstipendio(Stipendio stipendio) {
        this.stipendio = stipendio;
    }

    public MetodoDiPagamento getPaymentData() {
        return paymentData;
    }

    public void setPaymentData(MetodoDiPagamento paymentData) {
        this.paymentData = paymentData;
    }


    public double getSaldo(){
        return stipendio.getSaldo();
    }



    public double calcolaBonusUtente(int percentuale) {
        double bonus = stipendio.getSaldo()*percentuale/100;
        return bonus;
    }

}
