package Aula3.Banco;

public class Main {

    public static void main(String[] args) {
        Conta conta = new Conta();
        ContaCorrente corrente = new ContaCorrente();
        corrente.deposito(100);
        System.out.println(corrente.saldo);



    }
}
