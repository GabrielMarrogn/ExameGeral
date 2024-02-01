import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {

            int a = sc.nextInt();
            int b = sc.nextInt();

            Integer[] notas = new Integer[a]; // Integer e não int para conseguir usar o Colletion
            Integer[] consulta = new Integer[b];

            for (int i = 0; i < a; i++) {
                notas[i] = sc.nextInt();
            }

            Arrays.sort(notas, Collections.reverseOrder());

            for (int i = 0; i < b; i++) {
                int c = sc.nextInt();
                consulta[i] = notas[c - 1];
            }

            for (Integer p : consulta) {
                System.out.println(p);
            }

        }
        sc.close();
    }

}
