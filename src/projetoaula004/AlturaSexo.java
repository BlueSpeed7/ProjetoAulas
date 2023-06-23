// @author RA21600867
package projetoaula004;
import java.util.Scanner;
public class AlturaSexo {
    public static void main(String[] args) {
        int ct = 0, ctMasc = 0, ctFem = 0;
        float altura, maior = 0, menor = 2147483647, soma = 0, somaMasc = 0, somaFem = 0, media, mediaMasc, mediaFem, pcMasc, pcFem;
        char sexo, maiorSexo = '0', menorSexo = '0';
        Scanner leia = new Scanner(System.in);
        do {
            System.out.print("Digite \"0\" para sair da repetição.\n");
            System.out.print("Digite \"M\" ou \"m\" para masculino.\nDigite \"F\" ou \"f\" para feminino.\nSexo: ");
            sexo = leia.next().charAt(0);
            System.out.print("Digite a altura: ");
            altura = leia.nextFloat();
            if (altura != 0 && (sexo == 'M' || sexo == 'm' || sexo == 'F' || sexo == 'f')) {
                ct ++;
                soma += altura;
                if (altura < menor) {
                    menor = altura;
                    menorSexo = sexo;
                }
                if (altura > maior) {
                    maior = altura;
                    maiorSexo = sexo;
                }
                switch (sexo) {
                    case 'M':
                        ctMasc ++;
                        somaMasc += altura;
                        break;
                    case 'm':
                        ctMasc ++;
                        somaMasc += altura;
                        break;
                    case 'F':
                        ctFem ++;
                        somaFem += altura;
                        break;
                    case 'f':
                        ctFem ++;
                        somaFem += altura;
                        break;
                }
            }
        }
        while (altura != 0 && (sexo == 'M' || sexo == 'm' || sexo == 'F' || sexo == 'f'));
        media = (float) soma / ct;
        mediaMasc = (float) somaMasc / ctMasc;
        mediaFem = (float) somaFem / ctFem;
        pcMasc = (float) ctMasc / ct * 100;
        pcFem = (float) ctFem / ct * 100;
        System.out.println("\n\nMaior altura do grupo: " + maior);
        System.out.println("Menor altura do grupo: " + menor);
        System.out.println("Quantidade de homens: " + ctMasc);
        System.out.println("Quantidade de mulheres: " + ctFem);
        System.out.println("Quantidade de pessoas analisadas: " + ct);
        System.out.println("Soma das alturas das pessoas: " + soma);
        System.out.println("Média das alturas das pessoas: " + media);
        System.out.println("Média das alturas dos homens: " + mediaMasc);
        System.out.println("Média das alturas das mulheres: " + mediaFem);
        System.out.println("Porcentagem de homens: " + pcMasc);
        System.out.println("Porcentagem de mulheres: " + pcFem);
        switch (maiorSexo) {
            case 'M':
                System.out.println("A pessoa mais alta é um homem.");
                break;
            case 'm':
                System.out.println("A pessoa mais alta é um homem.");
                break;
            case 'F':
                System.out.println("A pessoa mais alta é uma mulher.");
                break;
            case 'f':
                System.out.println("A pessoa mais alta é uma mulher.");
                break;
        }
        switch (menorSexo) {
            case 'M':
                System.out.println("A pessoa mais baixa é um homem.");
                break;
            case 'm':
                System.out.println("A pessoa mais baixa é um homem.");
                break;
            case 'F':
                System.out.println("A pessoa mais baixa é uma mulher.");
                break;
            case 'f':
                System.out.println("A pessoa mais baixa é uma mulher.");
                break;
        }
    }
}