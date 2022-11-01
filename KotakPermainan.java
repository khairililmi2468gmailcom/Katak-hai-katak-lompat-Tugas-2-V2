import java.util.ArrayList;
import java.util.Collections;

/**
 * Write a description of class KotakPermainan here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class KotakPermainan {
    private Kotak boardGame[];
    private int jumKotak;
    private int jumlahKoin;
    private int jumlahMonster;
    private int acakKoin[];
    private int acakMonster[];
    private int i;

    public KotakPermainan(int j, int jk, int jm) {
        this.jumKotak = j;
        this.jumlahKoin = jk;
        this.jumlahMonster = jm;

        generateAcak();
        inisialisasiKotak();
    }

    private void generateAcak() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        acakKoin = new int[jumlahKoin];
        acakMonster = new int[jumlahKoin];

        // nilai acak sesuai jumlahkotak
        for (i = 0; i < jumKotak; i++) {
            list.add(i);
        }
        Collections.shuffle(list);
        // generate nilai acak untuk koin
        for (i = 0; i < jumlahKoin; i++) {
            acakKoin[i] = list.get(i);// koin
        }
        // mengenerate posisi monster pada kotak
        // posisi tidak boleh sama dengan koin
        for (i = jumlahKoin; i < jumlahMonster + jumlahKoin; i++) {
            acakMonster[i - jumlahKoin] = list.get(i);
        }
    }

    private void inisialisasiKotak() {
        boardGame = new Kotak[jumKotak];
        Koin koin_1 = new Koin(10);
        
        Monster monster_1 = new Monster(-8, "Snake");
        Monster monster_2 = new Monster(-14, "Elang");

        for (i = 0; i < jumKotak; i++) {
            boardGame[i] = new Kotak();
            // System.out.println(acakKoin[i] + "\t");
        }

        for (i = 0; i < jumlahKoin; i++) {
            boardGame[acakKoin[i]].addKoin(koin_1);
            // System.out.println(acakKoin[i] + "\t");
        }
        for (i = 0; i < jumlahMonster; i++) {
            boardGame[acakMonster[i]].addMonster(monster_1);
            boardGame[acakMonster[i]].addMonster(monster_2);
            // System.out.println(acakMonster[i] + "\t");
        }
    }

    public int contain(int posisi) {
        if (boardGame[posisi].isThereKoin()) {
            return boardGame[posisi].getKoin().getNilai();
        } else if (boardGame[posisi].isThereMonster()) {
            return boardGame[posisi].getMonster().getNilai();
        } else {
            return 0;
        }
    }
}