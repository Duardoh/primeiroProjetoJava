import java.util.Random;
import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        int sorteio = new Random().nextInt(100);
        Scanner leitura =  new Scanner(System.in);
        int tentativa = 0;
        int usuario = 0;
        System.out.println("Coloque um número entre 0 e 100 \n");

        while (usuario != sorteio) {
            usuario = leitura.nextInt();
            if (usuario != sorteio){
                System.out.println("Errou, tente novamente");
            }
            if (usuario > sorteio){
                System.out.printf("O número é menor que %d \n",usuario);
            } else {
                System.out.printf("O número é maior que %d \n", usuario );

            }
            tentativa++;
        }
        System.out.printf("""
Parabéns, você acertou na sua %dº tentativava!
O número escolhido era %d!
""", tentativa, sorteio);


    }
}
