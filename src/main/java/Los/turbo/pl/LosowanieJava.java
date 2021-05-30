package Los.turbo.pl;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class LosowanieJava {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("cześć!");

        System.out.println("Wybierz jakie losownie wybrać 1 lotto.");
        System.out.println("Wybierz jakie losownie wybrać 2 eurojackpot.");
        String wybor = scan.nextLine();


        int ocenaLiczba = Integer.parseInt(wybor);
        switch (ocenaLiczba) {
            case 1:
                //System.out.println("Liczby na lotto losowane");
                final int NUMERY = 6;
                int[] numery = new int[NUMERY];
                LinkedList m = new LinkedList();
                Random generator = new Random();

                for (int i = 0; i < NUMERY; i++) {
                    m.add(generator.nextInt(48)+1);
                }
                System.out.println("liczby na lotto to: " +m);
                break;
            case 2:
                System.out.println("Losowanie na Eurojackpot");
                // Jackpot
                final int NUMERYJACKPOT = 5;
                int[] numerydwa = new int[NUMERYJACKPOT];
                LinkedList mjack = new LinkedList();
                Random generator2 = new Random();

                for (int i =0;i<NUMERYJACKPOT;i++){
                    mjack.add(generator2.nextInt(47)+1);
                }

                final int NUMERYJACKPOTdwa = 2;
                int[] numeryjackpotdwa = new int[NUMERYJACKPOTdwa];
                LinkedList mjack2 = new LinkedList();
                Random generatorjackpotdwa = new Random();

                for (int i =0;i<NUMERYJACKPOTdwa;i++){
                    mjack2.add(generatorjackpotdwa.nextInt(9)+1);
                }
                System.out.println("pięć liczb eurojackpot "+ mjack +" dwie ostatnie liczby " + mjack2);


                //jackpot end
                break;

            default:
                System.out.println("???");
                break;

        }
    }
}