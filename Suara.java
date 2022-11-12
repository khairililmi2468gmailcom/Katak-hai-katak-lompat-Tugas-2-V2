import java.io.File;
import java.io.IOException;


import javax.sound.sampled.*;

public class Suara implements InterfaceSuara {
    public void playKoin()throws UnsupportedAudioFileException, IOException, LineUnavailableException{
        File file = new File("suaraKoin.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        clip.setMicrosecondPosition(1300000);
        
       

        for(long i = 0; i<7100000; i++){
            clip.start();
        }
        clip.stop();
        clip.close();
        return;
    }
    public void playMonster() throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        File file = new File("suaraMonster.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        clip.setMicrosecondPosition(0);
        
        int i = 0;
        do{

            clip.start();
            i++;
        }while(i <= clip.getMicrosecondLength());
        clip.stop();
        clip.close();
        return;
    }

    public void playPaus() throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        File file = new File("suaraPaus.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        clip.setMicrosecondPosition(100000);
        int i = 0;
        do{

            clip.start();
            i++;
        }while(i <= clip.getMicrosecondLength());
        clip.stop();
        clip.close();
        return;
    }
    /**
     * @apiNote
     * Exception untuk musik
     */
    public void backMusic() throws Exception, UnsupportedAudioFileException, IOException, LineUnavailableException {
        try {
            
            File file = new File("musikBack.wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            
          System.out.println("Semangat Kawan Kita akan bermain");
           for(int i = 0; i <= clip.getMicrosecondLength()*2;i++){
               clip.start();  
            }
            
         clip.stop();
         clip.close();
        } catch (Exception e) {
            System.out.println("File tidak ditemukan");
        }
        return;
    }

    public static void main(String[] args) throws Exception, UnsupportedAudioFileException, IOException, LineUnavailableException{
        Suara suara = new Suara();
        suara.backMusic();
    }
}