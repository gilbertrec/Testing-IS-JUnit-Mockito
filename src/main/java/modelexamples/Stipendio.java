package modelexamples;

public class Stipendio {

    double saldo;

    public Stipendio(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double stipendio) {
        this.saldo = stipendio;
    }
    
    public double aggiuntaSaldo(double aggiunta){
        setSaldo(getSaldo() + aggiunta);
        return getSaldo();
    }


    public double rimuoviSaldo(double aggiunta){

        if (getSaldo() - aggiunta <= 0) {
            throw new ArithmeticException("saldo insufficiente");
        }
        setSaldo(getSaldo()-aggiunta);
        return getSaldo();
    }
}
