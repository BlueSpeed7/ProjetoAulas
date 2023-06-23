// @author RA21600867
package projetoaula009;
import java.util.Scanner;
public class AccountTest {
    public static void main(String[] args) {
        Account conta1 = new Account(50.00, "Fernando");
        Account conta2 = new Account(-7.53, "Maria");
        Account conta3 = new Account(77.53, "Paulo", "3");
        double valorDeposito, valorDebito;
        String s1;
        Scanner leia = new Scanner(System.in);
        System.out.printf("Conta 1, correntista: %s, valor do saldo: %.2f\n", conta1.getNomeCorrentista(), conta1.getSaldo());
        System.out.printf("Conta 2, correntista: %s, valor do saldo: %.2f\n", conta2.getNomeCorrentista(), conta2.getSaldo());
        conta3.mostraDados();
        System.out.print("Digite o nome do correntista da conta 1: ");
        s1 = leia.next();
        conta1.setNomeCorrentista(s1);
        System.out.print("Digite o nome do correntista da conta 2: ");
        s1 = leia.next();
        conta2.setNomeCorrentista(s1);
        System.out.print("Digite o nome do correntista da conta 3: ");
        s1 = leia.next();
        conta3.setNomeCorrentista(s1);
        System.out.print("Digite o valor do depósito na conta 1: ");
        valorDeposito = leia.nextDouble();
        conta1.deposito(valorDeposito);
        System.out.printf("Foi depositado R$ %.2f na conta 1.\n", conta1.getDeposito());
        System.out.print("Digite o valor do depósito na conta 2: ");
        valorDeposito = leia.nextDouble();
        conta2.deposito(valorDeposito);
        System.out.printf("Foi depositado R$ %.2f na conta 2.\n", conta2.getDeposito());
        System.out.printf("Conta 1, correntista: %s, valor do saldo: %.2f\n", conta1.getNomeCorrentista(), conta1.getSaldo());
        System.out.printf("Conta 2, correntista: %s, valor do saldo: %.2f\n", conta2.getNomeCorrentista(), conta2.getSaldo());
        conta3.mostraDados();
        System.out.print("Digite o valor do débito na conta 1: ");
        valorDebito = leia.nextDouble();
        conta1.debito(valorDebito);
        System.out.printf("Foi debitado R$ %.2f na conta 1.\n", conta1.getDebito());
        System.out.print("Digite o valor do débito na conta 2: ");
        valorDebito = leia.nextDouble();
        conta2.debito(valorDebito);
        System.out.printf("Foi debitado R$ %.2f na conta 2.\n", conta2.getDebito());
        System.out.printf("Conta 1, correntista: %s, valor do saldo: %.2f\n", conta1.getNomeCorrentista(), conta1.getSaldo());
        System.out.printf("Conta 2, correntista: %s, valor do saldo: %.2f\n", conta2.getNomeCorrentista(), conta2.getSaldo());
        conta3.setChequeEspecial(1000);
        conta3.mostraDados();
        System.out.print("Selecione uma ação:\n1- Consulta\n2- Débito\n3- Depósito\n4- Sair\n");
        int escolha = leia.nextInt();
        switch (escolha) {
            case 1:
                conta3.mostraDados();
                break;
            case 2:
                System.out.print("Digite o valor do débito na conta 3: ");
                valorDebito = leia.nextDouble();
                conta3.debito(valorDebito);
                System.out.printf("Foi debitado R$ %.2f na conta 3.\n", conta3.getDebito());
                break;
            case 3:
                System.out.print("Digite o valor do depósito na conta 3: ");
                valorDeposito = leia.nextDouble();
                conta3.deposito(valorDeposito);
                System.out.printf("Foi depositado R$ %.2f na conta 3.\n", conta3.getDeposito());
                break;
        }
    }
}