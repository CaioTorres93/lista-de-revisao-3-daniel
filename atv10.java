public class atv10 {
    public static void main(String[] args) {
        // Variável para armazenar a soma dos números pares
        int soma = 0;
        
        // Estrutura de repetição para percorrer os números de 1 a 100
        System.out.println("Números pares de 1 a 100:");
        for (int i = 1; i <= 100; i++) {
            // Verifica se o número é par
            if (i % 2 == 0) {
                // Se o número for par, imprime o número
                System.out.println(i);
                // E acumula o número na variável soma
                soma += i;
            }
        }
        
        // Imprime a soma dos números pares
        System.out.println("Soma dos números pares de 1 a 100: " + soma);
    }
}