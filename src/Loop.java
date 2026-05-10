import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        double mediaavaliacao = 0;
        double notaDoFilme = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Qual a sua avaliação oara o filme?");
            notaDoFilme = leitura.nextDouble();
            mediaavaliacao += notaDoFilme;
        }

        System.out.println("Media de Avaliações " + mediaavaliacao/3);

    }
}
