public class Condicional {
    public static void main(String[] args) {
        int anoDeLanamento = 2022;
        boolean incluidoNoPlano = true;
        double pontuacao = 8.1;
        String tipoPlano = "plus";

        if (anoDeLanamento >= 2022) {
            System.out.println("Lançamentos que os espectadores estão curtindo!");
        } else {
            System.out.println("Filmes à moda antiga!");
        }

        if (incluidoNoPlano || tipoPlano.equals("plus")) {  // mesma coisa que colocar incluidoNoPlano == True  OU ||
            System.out.println("Filme liberado");           // Se os dois forem falsos executa o else           E $$
        } else {
            System.out.println("Deve pagar a alocação");
        }


    }
}
