package rvt;

import java.util.Scanner;

class SkaitluAnalize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int skSkaits = 0;
        int skSumma = 0;
        double vidVert = 0;
        int skLielakais = 0;
        int skMazakais = 0;

        while (true) {
            System.out.print("Ievadi pozitivu veselu skaitli (0 vai negativs partrauc ievadi): ");
            int sk = Integer.valueOf(scanner.nextLine());

            if (sk <= 0) {
                break;
            }
            
            skSkaits += 1;
            skSumma += sk;

            if (skMazakais == 0 && skLielakais == 0) {
                skMazakais = sk;
                skLielakais = sk;
            }

            if (sk > skLielakais) {
                skLielakais = sk;
            } else if (sk < skMazakais) {
                skMazakais = sk;
            }
        }

        vidVert = Double.valueOf(skSumma) / Double.valueOf(skSkaits);
        
        System.out.println("\nIevadito skaitlu skaits: " + skSkaits);
        System.out.println("Skaitlu summa: " + skSumma);
        System.out.println("Videja vertiba: " + vidVert);
        System.out.println("Lielakais skaitlis: " + skLielakais);
        System.out.println("Mazakais skaitlis: " + skMazakais);
    }
}