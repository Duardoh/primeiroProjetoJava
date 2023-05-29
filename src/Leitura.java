import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {       // main e psvm são atalhos para essa estrutura
        Scanner leitura = new Scanner(System.in);
        // agora pode ler o que for digitar
        System.out.println("Digite seu filme favorito:");
        String filme = leitura.nextLine();    // vai ler o que digitou e armazenar na variavel filme

        System.out.println("Qual o ano de lançamento?");
        int anoDeLancamento = leitura.nextInt();

        System.out.println("Diga a sua avaliação para o filme:");
        double avaliacao = leitura.nextDouble();

        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(avaliacao);
    }
}
