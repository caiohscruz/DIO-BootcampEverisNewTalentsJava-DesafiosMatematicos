
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AreaDireita {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double soma = 0;
        try {
            char O = leitor.next().toUpperCase().charAt(0);
            double[][] M = new double[12][12];
            for (int i = 0; i<12; i++) {
                for (int j = 0; j<12; j++) {
                    M[i][j] = leitor.nextDouble();
                }
            }
            for (int i = 0; i<12; i++) {
                for (int j = 0; j<12; j++) {
                    if ((j>i)&&(j>11-i)) soma += M[i][j];
                }
            }
            if (O=='M') soma /= 30;
            System.out.println(String.format("%.1f", soma));
        }
        catch (InputMismatchException e) {
            System.out.println("Entrada inesperada - Esperado 145 entradas, sendo a primeira 'S' ou 'M' seguido de 144 doubles");
        }
    }

}
