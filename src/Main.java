import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Random rand = new Random();
        Scanner scanner = new Scanner(System.in); //Scanner Klasse um die Benutzer Eingabe möglich zu machen.

        int zufallsZahl; //Hier wird die Zufallszahl generiert. 100 + 1, da dadurch eine Zahl zwischen 1-100 generiert wird.
        //System.out.println("Die Zufallszahl ist " + zufallsZahl); //Cheat für Debugging
        System.out.println("Willkommen zum Zahlenraten Spiel!");

        boolean nochmalSpielen = true;
        int Versuche = 0;
        while (nochmalSpielen) {
            nochmalSpielen = false;
            zufallsZahl = rand.nextInt(100) + 1;
            while (Versuche < 5) {
                System.out.println("Rate eine Zahl zwischen (1-100):");

                int spielerEingabe = scanner.nextInt(); //Spieler Eingabe.
                Versuche++;
                if (spielerEingabe == zufallsZahl) {
                    System.out.println("Die Antwort ist Richtig! Du hast gewonnen!");
                    System.out.println("Du hast " + Versuche + " Versuche gebraucht.");
                    Versuche = 5;
                    //break; //Durch den break an dieser Stelle, endet das Programm, sobald man die Richtige Antwort erraten hat.
                } else if (zufallsZahl > spielerEingabe) {
                    System.out.println("Leider Falsch! Die Zahl ist größer. Versuche es noch einmal.");
                } else if (zufallsZahl < spielerEingabe) {
                    System.out.println("Leider Falsch! Die Zahl ist kleiner. Versuche es noch einmal.");
                }
            }
                System.out.println("Willst du noch eine Runde spielen? (J/N)");
                String erneutSpielen = scanner.nextLine();
                if (erneutSpielen.equals("J")) {
                    nochmalSpielen = true;
                }


            }

        }

    }





