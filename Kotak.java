
/**
 * Write a description of class Kotak here.
 *
 * @author (Khairil Ilmi)
 * @version (a version PBO 2)
 */
public class Kotak
{
 private Koin coin;
 private Monster monsta;
 
 public Kotak(){
     
 }
 public void addKoin(Koin c){
     this.coin = c;
 }
 public void addMonster(Monster m){
     this.monsta = m;
 }
 public Koin getKoin(){
     return coin;
 }
 public Monster getMonster(){
     return monsta;
 }
 public boolean isThereKoin(){
     return coin != null;
 }
 public boolean isThereMonster(){
     return monsta != null;
 }
}
