public class ContaBancaria {
    private int cod_CB;
    private float saldo;

    public ContaBancaria(){
        this.cod_CB = cod_CB;
        this.saldo = saldo;
    }

    // Construtor
    public ContaBancaria(double saldoInicial) {
        this.saldo = saldo;
    }

    // Getters
    public int getCod_CB() {
        return cod_CB;
    }
    public float getSaldo() {
        return saldo;
    }

    // Setters
    public void setCod_CB(int cod_CB) {
        this.cod_CB = cod_CB;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void depositar(float valor){
        saldo += valor;
    }

    public void sacar(float valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }





}
