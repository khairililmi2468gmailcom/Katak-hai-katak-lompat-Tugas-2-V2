import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

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
     *          void main kan
     */
    public void mainkan() throws Exception, UnsupportedAudioFileException, IOException, LineUnavailableException {
        Suara suara = new Suara();
        KotakPermainan theGames;
        Katak frog = new Katak();
        int decision;
        String namaPlayer;
        Pemain player;
        
      
        suara.backMusic();

        System.out.print("Masukkan nama : ");
        namaPlayer = sc.nextLine();
        player = new Pemain(namaPlayer);
        System.out.println("Player : " + namaPlayer);

        String difficulty_mode = "";
        System.out.println("Pilih Level: ");
        System.out.println("1. Easy");
        System.out.println("2. Medium");
        System.out.println("3. Hard");

        difficulty = sc.nextInt();

        while (difficulty > 3 || difficulty < 1) {
            System.out.println("Level : ");
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
        System.out.printf("Pilihan level : %s \n", difficulty_mode);

        theGames = new KotakPermainan(j, jk, jm);
        // for (i = 0; i < 100; i++) {
        // System.out.println(theGames.contain(i));
        // }
        System.out.println();
        while (frog.getPosisi() < 499 && frog.getSkor() > 0) {

            System.out.println("Posisi Katak: " + frog.getPosisi());
            System.out.println("Skor: " + frog.getSkor());
            if (frog.getPosisi() == 499) {
                System.out.println("Loncat bro.");
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
                moving = frog.getPosisi();
            }
            if (decision == 'a' || decision == 'A') {
                frog.belakangDekat();
                frog.getPosisi();
            } else if (decision == 'd' || decision == 'D') {
                frog.loncatJauh();

            }

            if (frog.getPosisi() < 0) {
                System.out.println("Geme over");
                

                System.exit(0);

            }

            frog.setSkor(frog.getSkor() + theGames.contain(frog.getPosisi()));

            if (theGames.contain(frog.getPosisi()) == 10) {
                // get point and + 10 score
                suara.playKoin();
                System.out.println("Anda mendapatkan poin!");
            } else if (theGames.contain(frog.getPosisi()) == -8) {
                suara.playMonster();
                System.out.println("Ada  Buaya!! :) ditendang");
            } else if (theGames.contain(frog.getPosisi()) == -14) {
                suara.playPaus();
                System.out.println("Ada Paus !! :) ditendang");
            }
        }
        System.out.println("Enter!");
        player.setNilai(frog.getSkor());
        System.out.println("player : " + player.getNama());
        System.out.println("skor : " + player.getNilai());

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
     * 
     * @param args
     */
    public static void main(String[] args)
            throws Exception, UnsupportedAudioFileException, IOException, LineUnavailableException {
        MainLompatKatak play = new MainLompatKatak();
        char confirm = 'y';
        Animasi animasiTeks = new Animasi();
        animasiTeks.display();
        System.out.print("Hai katak, melompatlah!... \n");
        System.out.println("Tekan Enter!!!");
        play.sc.nextLine();
        while (confirm == 'y') {
            play.mainkan();

            System.out.print("Ingin bermain lagi ? (yes/no)   : ");
            confirm = play.sc.next().charAt(0);
        }
        
        System.out.println("Terima Kasih!");
        
        play.sc.close();

    }
}
