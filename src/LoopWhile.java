import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        double mediaavaliacao = 0;
        double notaDoFilme = 0;
        int totalDeNotas = 0;

        while (notaDoFilme != -1) {
            System.out.println("Qual a sua avaliação oara o filme ou -1 para encerrar?");
            notaDoFilme = leitura.nextDouble();

            if (totalDeNotas > 0) {
                System.out.println("Media de Avaliações " + mediaavaliacao / totalDeNotas);
            } else {
                System.out.println("Nenhuma avaliação foi registrada.");
            }
        }
    }
}
