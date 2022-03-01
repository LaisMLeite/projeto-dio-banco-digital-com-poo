package bancodigitalcompoo;

public class Main {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Laís", 12031991);

        ContaDigBank contaCorrente1 = new ContaCorrente(cliente1);
        ContaDigBank contaPoupanca1 = new ContaPoupanca(cliente1);

        contaCorrente1.deposito(100d);
        contaPoupanca1.transferencia(100d, contaCorrente1);
        contaCorrente1.pagarMensalidade();

        contaCorrente1.extrato();
        contaPoupanca1.extrato();
    }

}

