// @author RA21600867
package projetoaula009;
import java.util.Scanner;
public class Account {
    private double saldo, deposito, debito, chequeEspecial, resto;
    private String nomeCorrentista, numeroConta;
    Scanner leia = new Scanner(System.in);
    public Account(double saldoInicial, String s1) {
        nomeCorrentista = s1;
        if (saldoInicial > 0) {
            saldo = saldoInicial;
        }
    }
    public Account(double saldoInicial, String s1, String conta) {
        nomeCorrentista = s1;
        if (saldoInicial > 0) {
            saldo = saldoInicial;
        }
        numeroConta = conta;
    }
    public void setNumeroConta(String conta) {
        numeroConta = conta;
    }
    public String getNumeroConta() {
        return numeroConta;
    }
    public void mostraDados() {
        System.out.printf("Conta %s, correntista: %s, valor do saldo: %.2f, valor do cheque especial: %.2f\n", getNumeroConta(), getNomeCorrentista(), getSaldo(), getChequeEspecial());
    }
    public void setChequeEspecial(double valor) {
        chequeEspecial = valor;
    }
    public double getChequeEspecial() {
        return chequeEspecial;
    }
    public void deposito(double valorDeposito) {
        saldo += valorDeposito;
        deposito = valorDeposito;
    }
    public void debito(double valorDebito) {
        if (valorDebito < saldo) {
            saldo -= valorDebito;
            debito = valorDebito;
        }
        else {
            if (valorDebito < saldo + chequeEspecial) {
                resto = valorDebito - saldo;
                saldo = 0;
                chequeEspecial -= resto;
            }
            else {
                System.out.println("Quantia de débito excedeu o saldo da conta.");
            }
        }
    }
    public double getSaldo() {
        return saldo;
    }
    public double getDeposito() {
        return deposito;
    }
    public double getDebito() {
        return debito;
    }
    public void setNomeCorrentista(String s1) {
        nomeCorrentista = s1;
    }
    public String getNomeCorrentista() {
        return nomeCorrentista;
    }
}