
/**
 * Write a description of class Katak here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Katak
{
private int posisi; 
private int skor;

public Katak(){
    skor = 100;
    posisi = 0;
}
public int getPosisi(){
    return this.posisi;
}
public int getSkor(){
    return this.skor;
}
public void setSkor(int skorBaru){
    this.skor = skorBaru;
}
public int loncatDekat(){
    return posisi += 1;
}
public int loncatJauh(){
    return posisi += 2;
}
public int belakangDekat(){
    return posisi -= 1;
}
public int belakangJauh(){
    return posisi -= 2;
}
}
