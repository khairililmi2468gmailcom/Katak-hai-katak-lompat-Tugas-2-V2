import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public interface InterfaceSuara {
    
    public void playMonster()throws UnsupportedAudioFileException, IOException,LineUnavailableException;
    public void playKoin()throws UnsupportedAudioFileException,IOException,LineUnavailableException;
    public void playPaus()throws UnsupportedAudioFileException,IOException,LineUnavailableException;
    public void backMusic()throws Exception,UnsupportedAudioFileException,IOException,LineUnavailableException;
}
