
/**
 * Write a description of class Koin here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Koin
{
 private int nilai;
 
 public Koin() {
 //Inisialisasi nilai awal pemain sebesar 10. 
     nilai = 10;
 }
 public Koin(int nilai){
     this.nilai = nilai;
}
 public int getNilai(){
     return nilai;
 }
 public void setNilai(int nilaibaru){
     this.nilai = nilaibaru;
 }
}
