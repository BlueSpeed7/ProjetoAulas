// @author RA21600867
package projetoaula029;
public class InterfaceTest {
    public static void main(String[] args) {
        Payable[] array = {new Invoice("01", "computador", 200, 4000.00), new Invoice("02", "cadeira", 400, 150.00), new SalariedEmp("John", "Constantine", "338-90-5210", 1), new SalariedEmp("Fernando", "Marinho", "000-00-0000", 0)};
        System.out.print("Interface:");
        for (Payable obj: array) {
            System.out.printf("\n%s\n", obj);
        }
        for (Payable obj: array) {
            if (obj instanceof SalariedEmp) {
                System.out.printf("\n%s: %s\n%s: R$ %,.2f\n", "Empregado assalariado", obj, "Salário semanal", obj.getPaymentAmount());
            }
            else {
                System.out.printf("\n%s\n%s: R$ %,.2f\n", obj, "Valor da fatura", obj.getPaymentAmount());
            }
        }
        mostraDados(array);
        mostraNomes(array);
        ((Invoice) array[0]).setPartNumber("03");
        ((Invoice) array[0]).setPartDescription("caderno");
        ((Invoice) array[0]).setQuantity(100);
        ((Invoice) array[0]).setPricePerItem(42.50);
        ((Invoice) array[1]).setPartNumber("04");
        ((Invoice) array[1]).setPartDescription("mochila");
        ((Invoice) array[1]).setQuantity(4);
        ((Invoice) array[1]).setPricePerItem(75.25);
        ((SalariedEmp) array[2]).setWeeklySalary(500);
        ((SalariedEmp) array[3]).setWeeklySalary(25000);
        ((SalariedEmp) array[3]).setSocialSecurityNumber("470-127-2136");
        ((Invoice) array[0]).setQuantity(8);
        System.out.printf("\n\nQuantidade: %d\n", ((Invoice) array[0]).getQuantity());
        mostraDados(array);
        mostraNomes(array);
        Invoice fatura1 = ((Invoice) array[0]), fatura2 = ((Invoice) array[1]);
        SalariedEmp funcSal1 = ((SalariedEmp) array[2]), funcSal2 = ((SalariedEmp) array[3]);
        System.out.printf("\n\nDados:");
        System.out.printf("\n%s\n%s: R$ %,.2f\n", fatura1, "Valor da fatura", fatura1.getPaymentAmount());
        System.out.printf("\n%s\n%s: R$ %,.2f\n", fatura2, "Valor da fatura", fatura2.getPaymentAmount());
        System.out.printf("\n%s: %s\n%s: R$ %,.2f\n", "Empregado assalariado", funcSal1, "Salário semanal", funcSal1.getPaymentAmount());
        System.out.printf("\n%s: %s\n%s: R$ %,.2f\n", "Empregado assalariado", funcSal2, "Salário semanal", funcSal2.getPaymentAmount());
    }
    public static void mostraDados(Payable[] vetor) {
        System.out.print("\nDados:");
        for (int i = 0; i < vetor.length; i ++) {
            if (vetor[i] instanceof SalariedEmp) {
                System.out.printf("\n%s: %s\n%s: R$ %,.2f\n", "Empregado assalariado", vetor[i], "Salário semanal", vetor[i].getPaymentAmount());
            }
            else {
                System.out.printf("\n%s\n%s: R$ %,.2f\n", vetor[i], "Valor da fatura", vetor[i].getPaymentAmount());
            }
        }
    }
    public static void mostraNomes(Payable[] vetor) {
        System.out.print("\nNomes:");
        for (int i = 0; i < vetor.length; i ++) {
            if (vetor[i] instanceof SalariedEmp) {
                System.out.printf("\n%s: %s", "Nome do funcionário", ((SalariedEmp) vetor[i]).getFirstName());
            }
            else {
                System.out.printf("\n%s: %s", "Descrição da peça", ((Invoice) vetor[i]).getPartDescription());
            }
        }
    }
}