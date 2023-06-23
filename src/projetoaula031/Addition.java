// @author RA21600867
package projetoaula031;
import javax.swing.JOptionPane;
public class Addition {
    public static void main(String[] args) {
        boolean failure;
        do {
            try {
                String firstNumber = JOptionPane.showInputDialog("Entre com o primeiro inteiro.");
                if (firstNumber == null) {
                    break;
                }
                int numero1 = Integer.parseInt(firstNumber);
                String secondNumber = JOptionPane.showInputDialog("Entre com o segundo inteiro.");
                if (secondNumber == null) {
                    break;
                }
                int numero2 = Integer.parseInt(secondNumber);
                JOptionPane.showMessageDialog(null, "Soma = " + (numero1 + numero2), "Soma Inteiros", JOptionPane.QUESTION_MESSAGE);
                failure = false;
            }
            catch (NumberFormatException excecao) {
                JOptionPane.showMessageDialog(null, "Ocorreu esta exceção: " + excecao + "\nDigite números inteiros.", "Soma Inteiros", JOptionPane.ERROR_MESSAGE);
                failure = true;
            }
        }
        while (failure == true);
        do {
            try {
                String firstNumber = JOptionPane.showInputDialog("Entre com o primeiro double.");
                if (firstNumber == null) {
                    System.exit(0);
                }
                double numero1 = Double.parseDouble(firstNumber);
                String secondNumber = JOptionPane.showInputDialog("Entre com o segundo double.");
                if (secondNumber == null) {
                    Runtime.getRuntime().exit(0);
                }
                double numero2 = Double.parseDouble(secondNumber);
                JOptionPane.showMessageDialog(null, "Soma = " + (numero1 + numero2), "Soma Double", JOptionPane.QUESTION_MESSAGE);
                failure = false;
            }
            catch (NumberFormatException excecao) {
                JOptionPane.showMessageDialog(null, "Ocorreu esta exceção: " + excecao + "\nDigite números double.", "Soma Double", JOptionPane.WARNING_MESSAGE);
                failure = true;
            }
        }
        while (failure == true);
        do {
            try {
                JOptionPane.showMessageDialog(null, "Média = " + ((leiaNota("Primeira Nota") + leiaNota("Segunda Nota")) / 2), "Boletim", JOptionPane.PLAIN_MESSAGE);
                failure = false;
            }
            catch (NumberFormatException excecao) {
                JOptionPane.showMessageDialog(null, "Ocorreu esta exceção: " + excecao + "\nDigite números double.", "Boletim", JOptionPane.WARNING_MESSAGE);
                failure = true;
            }
        }
        while (failure == true);
    }
    public static double leiaNota(String mensagem) throws NumberFormatException {
        boolean sair;
        double nota;
        do {
            sair = true;
            String valor = JOptionPane.showInputDialog(mensagem);
            if (valor == null) {
                System.exit(0);
            }
            nota = Double.parseDouble(valor);
            if (nota < 0 || nota > 10) {
                JOptionPane.showMessageDialog(null, "Nota inválida.\nDigite novamente.", "Nota", JOptionPane.INFORMATION_MESSAGE);
                sair = false;
            }
        }
        while (sair == false);
        return nota;
    }
}