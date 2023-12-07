import java.util.Scanner;

import static java.lang.Thread.*;

public class Main {
    public static void main(String[] args) {

        while (true) {
            arxikoMenu();

            Scanner scanner1 = new Scanner(System.in);
            int numberChoice = scanner1.nextInt();


            while (numberChoice != 1 && numberChoice != 2 && numberChoice != 3 && numberChoice != 4) {
                System.out.println("το ψηφιο που δωσατε δεν συμπεριλαμβανεται στις επιλογες σας , προσπαθηστε ξανα");
                numberChoice = scanner1.nextInt();
            }

            if (numberChoice == 2) {
                System.out.println(" εαν βρεθειτε αντιμετωποι με καποιο προβλημα , καλεστε τον αριθμο 6995371100 (παρακαλω να ειστε ευγενικοι:-)\n");

                try {
                    Thread.sleep(5000);
                } catch (Exception e) {
                    System.out.println(e);
                }
                arxikoMenu();
                numberChoice = scanner1.nextInt();
            }

            if (numberChoice == 3) {
                System.out.println("Plhrofories genikes tha mpoun edw");
                numberChoice = scanner1.nextInt();
            }
            if (numberChoice == 1) {

                menuDiarkeiasEishthriwn();
                numberChoice = scanner1.nextInt();
                while (numberChoice > 7 || numberChoice < 1) {
                    System.out.println("το ψηφιο που δωσατε δεν συμπεριλαμβανεται στις επιλογες σας , προσπαθηστε ξανα");
                    numberChoice = scanner1.nextInt();
                }


                int[] timesEishthriwn = new int[7];
                timesEishthriwn[0] = 2;
                timesEishthriwn[1] = 4;
                timesEishthriwn[2] = 10;
                timesEishthriwn[3] = 14;
                timesEishthriwn[4] = 30;
                timesEishthriwn[5] = 150;
                timesEishthriwn[6] = 250;

                int timhEisithriou = timesEishthriwn[numberChoice - 1];

                if (numberChoice >= 1 && numberChoice <= 7) {
                    menuEkptwsewn();

                    numberChoice = scanner1.nextInt();

                }
                int[] ekptwsh = new int[5];
                ekptwsh[0] = 100;
                ekptwsh[1] = 50;
                ekptwsh[2] = 50;
                ekptwsh[3] = 60;
                ekptwsh[4] = 60;

                int ekptwshEisithriou = ekptwsh[numberChoice - 1];
                telikhTimh(timhEisithriou, ekptwshEisithriou);
            }

            try {

                System.out.println("\n");
                Thread.sleep(3000);
            } catch (Exception e) {
                System.out.println(e);
            }


        }

    }


    public static void arxikoMenu() {
        System.out.println(" Καλωσηρθατε στο συστημα εισιτηριων  ");
        System.out.println(" [1] αγορα εισιτηριου");
        System.out.println(" [2] εξυπηρετηση πελατων");
        System.out.println(" [3] πληροφοριες");
        System.out.println(" [4] εξοδος");

    }

    public static void menuDiarkeiasEishthriwn() {
        System.out.println(" δωστε τον αριθμο του εισιτηριου ");
        System.out.println(" [1] ενιαιο ");
        System.out.println(" [2] ημερησιο ");
        System.out.println(" [3] τριημερο");
        System.out.println(" [4] εβδομαδιαιο ");
        System.out.println(" [5] μηνιαιο ");
        System.out.println(" [6] εξαμηνιαιο ");
        System.out.println(" [7] ετησιο ");
    }

    public static void menuEkptwsewn() {
        System.out.println("Εχεις καποια συγκεκριμενη εκπτωση?");
        System.out.println(" [1] Κανονικο = κανονικη τιμη");
        System.out.println(" [2] Φοιτητικο = 50%");
        System.out.println(" [3] Μαθητικο(μεχρι 18 ετων) = 50%");
        System.out.println(" [4] Αναπηρικο-Ανεργων = 40% ");
        System.out.println(" [5] Ηλικιωμενων = 40% ");
    }

    public static double telikhTimh(double timhEisithriou, double ekptwshEisithriou) {
        System.out.println(timhEisithriou * ekptwshEisithriou / 100 + " eurw einai to eisithrio");
        return timhEisithriou * ekptwshEisithriou / 100;
    }


}











