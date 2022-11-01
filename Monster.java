
/**
 * Write a description of class Monster here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Monster {
    private int nilai;
    private String nama;

    public Monster() {
        nama = "Snake";
        nilai = -8;

        nama = "Eagle";
        nilai = -14;
    }
    public Monster(int nilai, String nama) {
        this.nilai = nilai;
        this.nama = nama;
    }
    public String getNama(){
        return this.nama;
    }
    public int getNilai() {
        return nilai;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
