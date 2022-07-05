import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Random rand = new Random();
        Scanner scanner = new Scanner(System.in); //Scanner Klasse um die Benutzer Eingabe möglich zu machen.

        int zufallsZahl = rand.nextInt(100) + 1; //Hier wird die Zufallszahl generiert. 100 + 1, da dadurch eine Zahl zwischen 1-100 generiert wird.
        //System.out.println("Die Zufallszahl ist " + zufallsZahl); //Cheat für Debugging
        System.out.println("Willkommen zum Zahlenraten Spiel!");


            int Versuche = 0;
            while (true) {
                System.out.println("Rate eine Zahl zwischen (1-100):");

                int spielerEingabe = scanner.nextInt(); //Spieler Eingabe.
                Versuche++;
                if (spielerEingabe == zufallsZahl) {
                    System.out.println("Die Antwort ist Richtig! Du hast gewonnen!");
                    System.out.println("Du hast " + Versuche + " Versuche gebraucht.");
                    System.out.println("Würdest du gerne noch einmal Spielen J/N?");
                    break; //Durch den break an dieser Stelle, endet das Programm, sobald man die Richtige Antwort erraten hat.
                } else if (zufallsZahl > spielerEingabe) {
                    System.out.println("Leider Falsch! Die Zahl ist größer. Versuche es noch einmal.");
                } else {
                    System.out.println("Leider Falsch! Die Zahl ist kleiner. Versuche es noch einmal.");
                }


            }
        }
    }

