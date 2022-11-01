import java.util.Scanner;

/**
 * Write a description of class MainLompatKatak here.
 *
 * @author (Khairil Ilmi)
 * @version (PBO 2 )
 */

public class MainLompatKatak {
    public Scanner sc = new Scanner(System.in);
    int difficulty;
    int i;
    int jk, jm, j = 500;

    /**
     * @apiNote
     *          MainLOmpatKatak
     *          Membuat constructor MainLompatKatak untuk digunakan
     *          membuat variabel objek di class main
     */
    public MainLompatKatak() {
    }

    /**
     * @apiNote
     * void main kan
     */
    public void mainkan() {
        int decision;
        String namaPlayer;
        Pemain player;
        KotakPermainan theGames;
        Katak cangguk = new Katak();


        System.out.print("Insert the player...");
        namaPlayer = sc.nextLine();
        player = new Pemain(namaPlayer);
        System.out.println("Player : " + namaPlayer);

        String difficulty_mode = "";
        System.out.println("Choose your level..");
        System.out.println("1. Easy");
        System.out.println("2. Medium");
        System.out.println("3. Hard");

        difficulty = sc.nextInt();

        while (difficulty > 3 || difficulty < 1) {
            System.out.printf("Only insert level 1 - 3! \n");
            System.out.println("Your level: ");
            difficulty = sc.nextInt();
        }
        switch (difficulty) {
            case 1:
                difficulty_mode = "Easy";
                jk = 150;
                jm = 100;
                break;

            case 2:
                difficulty_mode = "Medium";
                jk = 200;
                jm = 150;
                break;

            case 3:
                difficulty_mode = "Hard";
                jk = 250;
                jm = 200;
                break;
        }
        System.out.printf("Pilihan level yang kamu pilih adalah: %s \n", difficulty_mode);

        theGames = new KotakPermainan(j, jk, jm);
        for (i = 0; i < 100; i++) {
            System.out.println(theGames.contain(i));
        }
        System.out.println();
        while (cangguk.getPosisi() < 499 && cangguk.getSkor() > 0) {

            System.out.println("Position of cangguk: " + cangguk.getPosisi());
            System.out.println("Score: " + cangguk.getSkor());
            if (cangguk.getPosisi() == 499) {
                System.out.println("One more jump.");
            }
            System.out.println("Apakah anda ingin maju atau mundur? (a/d)");
            decision = sc.next().charAt(0);
            try {
                if (decision != 'a' && decision != 'd' && decision != 'A' && decision != 'D') {
                    System.out.println("Masukkan sesuai instruksi.");
                    continue;
                }

            } catch (Exception e) {
                System.out.println("Masukkan a atau d saja");
            }
            // input langkah yang ingin maju atau mundur
            System.out.println("Berapa Langkah?");
            System.out.println("1. Satu Langkah");
            System.out.println("2. Dua Langkah");
            System.out.print("Masukkan pilihan   : ");

            int moving = sc.nextInt();

            while (moving > 2 || moving < 1) {

                System.out.println("Maaf, tidak ada pilihan");
                System.out.print("Masukkan pilihan   : ");

                moving = sc.nextInt();
                moving = cangguk.getPosisi();
            }
            if (decision == 'a' || decision == 'A') {
                cangguk.belakangDekat();
                cangguk.getPosisi();
            } else if (decision == 'd' || decision == 'D') {
                cangguk.loncatJauh();

            }
            if (cangguk.getPosisi() < 0) {
                System.out.println("Geme over");
                System.exit(0);
            }
            cangguk.setSkor(cangguk.getSkor() + theGames.contain(cangguk.getPosisi()));

            if (theGames.contain(cangguk.getPosisi()) == 10) {
                // get point and + 10 score
                System.out.println("Anda mendapatkan poin!");
            } else if (theGames.contain(cangguk.getPosisi()) == -8) {
                System.out.println("Ada Monster Snake!! :) poin dikurangi");
            } else if (theGames.contain(cangguk.getPosisi()) == -14) {
                System.out.println("Ada Monster Eagle!! :) poin dikurangi");
            }
        }
        System.out.println("Done!");
        player.setNilai(cangguk.getSkor());
        System.out.println("player : " + player.getNama());
        System.out.println("Score : " + player.getNilai());

        if (player.getNilai() < 0) {
            System.out.println("Maaf poin anda sudah habis, Game Over!");
        } else if (player.getNilai() < 500) {
            System.out.println("Bad!");
        } else if (player.getNilai() < 1500) {
            System.out.println("Good!");
        } else {
            System.out.println("Excellent!");
        }
    }

    /**
     * main untuk semua permainan 
     * @param args
     */
    public static void main(String[] args) {
        MainLompatKatak hayuk = new MainLompatKatak();
        char confirm = 'y';
        System.out.print("Hai katak, melompatlah!... \n");
        System.out.println("Press any key to begin..");
        hayuk.sc.nextLine();
        while (confirm == 'y') {
            hayuk.mainkan();

            System.out.print("Ingin bermain lagi ? (yes/no)   : ");
            confirm = hayuk.sc.next().charAt(0);
        }
        System.out.println("Terima Kasih!");
        hayuk.sc.close();

    }
}
