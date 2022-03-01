package bancodigitalcompoo;

public interface IDigiBank {

    public void extrato();
    public void deposito(double valor);
    public void saque(double valor);
    public void transferencia(double valor, ContaDigBank contaDestino);
    public double pagarMensalidade();
}
