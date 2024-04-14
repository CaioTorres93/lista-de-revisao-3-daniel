import java.util.Scanner;

public class atv9 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Pede ao usuário para digitar um número inteiro
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        
        // Imprime a tabuada do número de 1 a 10
        System.out.println("Tabuada de " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
        
        // Fecha o Scanner
        scanner.close();
    }
}