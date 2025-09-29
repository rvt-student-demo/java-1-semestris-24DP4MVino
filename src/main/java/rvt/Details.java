package rvt;

import java.util.Scanner;

public class Details {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int cenaSkruve = 5;
        final int cenaUzgrieznis = 3;
        final int cenaPaplaksne = 1;
        
        System.out.print("Skruvju skaits: ");
        int skruve = Integer.valueOf(scanner.nextLine());
        
        System.out.print("Uzgrieznu skaits: ");
        int uzgrieznis  = Integer.valueOf(scanner.nextLine());

        System.out.print("Paplaksnu skaits: ");
        int paplaksne = Integer.valueOf(scanner.nextLine());

        if (uzgrieznis != skruve && paplaksne < skruve * 2) {
            System.out.println("\nParbaudi pasutijumu: par maz uzgrieznu");
            System.out.println("Parbaudi pasutijumu: par maz paplaksnu");
        } else if (paplaksne < skruve * 2) {
            System.out.println("\nParbaudi pasutijumu: par maz paplaksnu");
        } else if (uzgrieznis != skruve) {
            System.out.println("\nParbaudi pasutijumu: par maz uzgrieznu");
        } else {
            System.out.println("\nParbaudi pasutijumu: Pasutijums ir kartiba.");
        }
        
        int kopejaCena = cenaSkruve * skruve + cenaUzgrieznis * uzgrieznis + cenaPaplaksne * paplaksne;
        
        System.out.println("\nKopeja cena: " + kopejaCena);
    }
}