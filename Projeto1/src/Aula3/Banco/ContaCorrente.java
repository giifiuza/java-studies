package Aula3.Banco;

public class ContaCorrente extends Conta{
    @Override
    void deposito(double valor){
        this.saldo=this.saldo+valor+1;
    }
}
