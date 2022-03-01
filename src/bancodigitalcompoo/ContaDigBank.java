
package bancodigitalcompoo;

public abstract class ContaDigBank implements IDigiBank{

 protected static final int AGENCIA_PADRAO = 0001;

 protected int numero;
 protected int agencia;
 protected double saldo;
 protected Cliente cliente;


    public int getNumero() {
        return numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    private double setSaldo(double saldo) {return this.saldo = saldo;}


    @Override
     public void deposito(double valor){
         double novoSaldo = this.getSaldo() + valor;
         this.setSaldo(novoSaldo);
     }

    @Override
     public void saque(double valor){
     double novoSaldo = this.getSaldo() - valor;
         this.setSaldo(novoSaldo);

     }

    @Override
    public void transferencia(double valor, ContaDigBank contaDestino){
     this.saque(saldo);
     contaDestino.deposito(valor);
         }

}
