public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLanamento = 2022;    //camelCase no Java sempre inicia minusculo NUNCA usando underline
        System.out.println("Ano de lançamento: " + anoDeLanamento);
        boolean incluidoNoPlano = true;
        System.out.println("Incluso no plano: " + incluidoNoPlano);
        double pontuacao = 8.1;
        System.out.println("Pontuação do filme: " + pontuacao);
        pontuacao += 1;      //abreviação soma o valor contido na variavel + o novo valor
        System.out.println("Nova pontuação: " + pontuacao);

        /* Esse é um outro tipo de comentário
        em várias linhas  */

        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                Filme Top Gun
                Filme de aventura com galã dos anos 80
                Muito bom!
                Ano de lançamento
                """ + anoDeLanamento;
        System.out.println(sinopse);

        String nome = "Eduardo";
        int idade = 24;
        double altura = 1.75;
        System.out.printf("Meu nome é %s, eu tenho %d anos e minha altura é de %.2f.%n", nome, idade, altura);

        String apelido = "Edu";
        int aulas = 4;

        String mensagem = """
                  Olá, %s!
                  Boas vindas ao curso de Java.
                  Teremos %d aulas para te mostrar o que é preciso para você dar o seu primeiro mergulho na linguagem!
                  """.formatted(apelido, aulas);
        System.out.println(mensagem);

        int classificacao;
        classificacao = (int) (media / 2);   // converta o resultado em int
        System.out.println(classificacao);

        double celscius = 32;
        double fahrenheit;
        fahrenheit = (celscius * 1.8) + 32;
        String texto = String.format("O valor em Fahrenheit é de : %.2f%n", fahrenheit);
        System.out.printf(texto);
        }


    }

