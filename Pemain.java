
/**
 * Write a description of class Pemain here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pemain
{
  private String nama;
  private int nilai;
  
  public Pemain(String nama){
      this.nama = nama;
      nilai = 0;
  }
  public String getNama(){
      return this.nama;
  }
  public void setNama(String nama){
      this.nama = nama;
  }
  public int getNilai(){
      return this.nilai;
  }
  public void setNilai(int nilai){
      this.nilai = nilai;
  }
}
