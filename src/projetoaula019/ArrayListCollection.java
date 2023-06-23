// @author RA21600867
package projetoaula019;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListCollection {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<String>(), teste = new ArrayList<String>();
        Scanner leia = new Scanner(System.in);
        String s;
        items.add("red");
        items.add(0, "yellow");
        System.out.println("Mostra o conteúdo da lista com o for controlado por contador:");
        for (int i = 0; i < items.size(); i ++) {
            System.out.printf(" %s", items.get(i));
        }
        exibe(items, "\nMostra o conteúdo da lista com o enhanced for:");
        items.add("green");
        items.add("yellow");
        exibe(items, "Lista com dois novos elementos:");
        items.remove("yellow");
        exibe(items, "Remove a primeira instância do yellow:");
        items.remove(1);
        exibe(items, "Remove o segundo elemento da lista (green):");
        if (items.contains("red") == true) {
            s = "";
        }
        else {
            s = " não";
        }
        System.out.printf("\"red\"%s está na lista.\n", s);
        System.out.printf("Tamanho da lista: %d\n", items.size());
        System.out.printf("\"blue\"%s está na lista.\n", (items.contains("blue")? "": " não"));
        items.add("black");
        items.add(1, "white");
        System.out.println("Mostra o conteúdo da lista com o for controlado por contador:");
        for (int i = 0; i < items.size(); i ++) {
            System.out.printf(" %s", items.get(i));
        }
        System.out.printf("\nTamanho da lista: %d\n", items.size());
        System.out.printf("Elemento na posição 1: %s\n", items.get(1));
        System.out.print("Digite a posição a ser consultada: ");
        int pesquisa = leia.nextInt();
        System.out.printf("Elemento %s está na posição %d.\n", items.get(pesquisa), pesquisa);
        System.out.printf("Elemento red está na posição %d.\n", items.indexOf("red"));
        items.remove("red");
        exibe(items, "Remove o elemento \"red\" da lista:");
        System.out.printf("Tamanho da lista: %d\n", items.size());
        if (items.contains("red") == false) {
            System.out.println("\"red\" não está na lista.");
        }
        items.remove(1);
        exibe(items, "Remove o segundo elemento da lista (yellow):");
        System.out.printf("Tamanho da lista: %d\n", items.size());
        teste.add("Um");
        teste.add("Dois");
        exibe(teste, "Mostra o conteúdo da lista com o enhanced for:");
    }
    public static void exibe(ArrayList<String> colecao, String titulo) {
        System.out.println(titulo);
        for (String elemento: colecao) {
            System.out.printf(" %s", elemento);
        }
        System.out.println();
    }
}