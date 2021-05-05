import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        List<Lancha> lanchas = new ArrayList<Lancha>();
        List<Jetski> jetsks = new ArrayList<Jetski>();
        List<Iate> iates = new ArrayList<Iate>();

        Scanner s = new Scanner(System.in);
        int x;
        char isLoop = 's';

        do {
            Iate iate = new Iate();
            Lancha lancha = new Lancha();
            Jetski jetski = new Jetski();

            System.out.println("=======================================");
            System.out.println("cadastra Lancha");
            System.out.println("=======================================");
            lancha.cadastrar();
            lanchas.add(lancha);

            System.out.println("");

            System.out.println("=======================================");
            System.out.println("cadastra Iate");
            System.out.println("=======================================");
            iate.cadastrar();
            iates.add(iate);

            System.out.println("");

            System.out.println("=======================================");
            System.out.println("cadastra Jetski");
            System.out.println("=======================================");
            jetski.cadastrar();
            jetsks.add(jetski);

            System.out.println("");

            System.out.println("Deseja continuar a cadastrar? S/N");
            isLoop = s.next().charAt(0);

        } while(isLoop == 's');



        x = 1;
        for (Iate i: iates) {
            System.out.println("=======================================");
            System.out.println("Iate impressa " + x);
            System.out.println("=======================================");
            i.imprimir();
            x++;
        }

        x = 1;
        for (Lancha i: lanchas) {
            System.out.println("=======================================");
            System.out.println("Lancha impressa "+ x);
            System.out.println("=======================================");
            i.imprimir();
            x++;
        }

        x = 1;
        for (Jetski i: jetsks) {
            System.out.println("=======================================");
            System.out.println("Jetski impressa "+ x);
            System.out.println("=======================================");
            i.imprimir();
            x++;
        }

    }
}