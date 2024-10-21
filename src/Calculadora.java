import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = leitura.nextInt();
        numero = numero * 2;
        System.out.println("O dobro desse número é: " + numero);
    }
}
