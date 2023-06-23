// @author RA21600867
package projetoaula028;
public class InterfaceTest {
    public static void main(String[] args) {
        Invoice fatura1 = new Invoice("01", "cadeira", 3, 230.00), fatura2 = new Invoice("02", "mesa", 5, 195.00), fatura3 = new Invoice("03", "estante", 1, 435.00);
        Payable[] invoices = {fatura1, fatura2, fatura3};
        System.out.print("Invoices:");
        for (Payable obj: invoices) {
            System.out.printf("\n%sValor da fatura: R$ %,.2f\n", obj, obj.getPaymentAmount());
        }
        mostraVetor(invoices);
        mostraVetor2(invoices);
        fatura1.setQuantity(4);
        System.out.printf("\n%sValor da fatura: R$ %,.2f\n", fatura1, fatura1.getPaymentAmount());
    }
    public static void mostraVetor(Payable[] vetor) {
        System.out.print("\nInvoices:");
        for (Payable obj: vetor) {
            System.out.printf("\n%sValor da fatura: R$ %,.2f\n", obj, obj.getPaymentAmount());
        }
    }
    public static void mostraVetor2(Payable[] vetor) {
        System.out.print("\nInvoices:");
        for (int i = 0; i < vetor.length; i ++) {
            System.out.printf("\n%sValor da fatura: R$ %,.2f\n", vetor[i], vetor[i].getPaymentAmount());
        }
    }
}