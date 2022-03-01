
package bancodigitalcompoo;

public class ContaCorrente extends ContaDigBank {

private static int SEQUENCIAL = 1;

    public ContaCorrente(Cliente cliente){
     super.agencia = ContaDigBank.AGENCIA_PADRAO;
     super.numero = SEQUENCIAL++;
     this.cliente = cliente;
    }

    @Override
    public void extrato() {
        System.out.println(" ==== Extrato de Conta Corrente === ");
        System.out.printf("Titular: " + this.cliente.getNome()
                + "\nConta: " + this.numero
                + "\nAgência: " + this.agencia
                + "\nSaldo: " + this.saldo);
        System.out.println();
    }

    @Override
    public double pagarMensalidade(){
        double valor = 6;
        return this.saldo = this.getSaldo() - 6;

    }
}
