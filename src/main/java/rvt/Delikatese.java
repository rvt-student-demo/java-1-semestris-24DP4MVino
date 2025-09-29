package rvt;

import java.util.Scanner;

public class Delikatese {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ievadi preci: ");
        String prece = scanner.nextLine();
        
        System.out.print("Ievadi cenu: ");
        double cena = Double.valueOf(scanner.nextLine());

        System.out.print("Ekspress piegade (0==ne, 1==ja): ");
        int ekspress = Integer.valueOf(scanner.nextLine());

        double piegade = 0;
        if (cena < 10) {
            piegade = 2.00;
        } else {
            piegade = 0.00;
        }
        
        if (ekspress == 1) {
            piegade = piegade + 3.00;
        }
        
        double kopa = cena + piegade;
        
        System.out.println("\nRekins:");

        System.out.println("    " + prece + "    " + cena);
        
        System.out.println("    " + "piegade" + "    " + piegade);
        
        System.out.println("    " + "kopa" + "    " + kopa);
    }
}