import java.util.Scanner;
import java.util.Random;

public class atv11 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Cria um objeto Random para gerar um número aleatório
        Random random = new Random();
        
        // Define o intervalo de números para adivinhar (por exemplo, de 1 a 100)
        int limiteInferior = 1;
        int limiteSuperior = 100;
        
        // Gera um número aleatório dentro do intervalo definido
        int numeroSecreto = random.nextInt(limiteSuperior - limiteInferior + 1) + limiteInferior;
        
        // Variável para armazenar a adivinhação do usuário
        int adivinhacao;
        
        // Variável para controlar o número de tentativas
        int tentativas = 0;
        
        // Loop para o jogo de adivinhação
        while (true) {
            // Pede ao usuário para fazer uma adivinhação
            System.out.print("Adivinhe o número entre " + limiteInferior + " e " + limiteSuperior + ": ");
            adivinhacao = scanner.nextInt();
            
            // Incrementa o número de tentativas
            tentativas++;
            
            // Verifica se a adivinhação está correta
            if (adivinhacao == numeroSecreto) {
                System.out.println("Parabéns! Você adivinhou o número secreto em " + tentativas + " tentativas.");
                break;
            } else if (adivinhacao < numeroSecreto) {
                System.out.println("Sua adivinhação foi muito baixa. Tente novamente.");
            } else {
                System.out.println("Sua adivinhação foi muito alta. Tente novamente.");
            }
        }
        
        // Fecha o Scanner
        scanner.close();
    }
}