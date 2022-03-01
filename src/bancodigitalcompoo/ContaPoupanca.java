
package bancodigitalcompoo;

public class ContaPoupanca extends ContaDigBank {

private static int SEQUENCIAL = 1;
    
public ContaPoupanca(Cliente cliente){
     super.agencia = ContaDigBank.AGENCIA_PADRAO;
     super.numero = SEQUENCIAL++;
    this.cliente = cliente;
    }

    @Override
    public void extrato() {
        System.out.println(" ==== Extrato de Conta Poupança === ");
        System.out.printf("Titular: " + this.cliente.getNome()
                + "\nConta: " + this.numero
                + "\nAgência: " + this.agencia
                + "\nSaldo: " + this.saldo);
        System.out.println();
    }

    @Override
    public double pagarMensalidade(){
        double valor = 2;
        return this.saldo = this.getSaldo() - 2;
    }


}
