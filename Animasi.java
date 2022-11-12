import java.awt.Color;
import java.awt.Font;
import static java.awt.Font.BOLD;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;


/**
 *
 * @author khairil
 * animasi tampiilan awal
 */
public class Animasi extends JPanel{  
    int a=40;
    int b=0;
    int c=400;
    int d=300;
    
    int e=160;
    
    int f=50;
    int g=400;
    int h=350;
    
    int i=55;
    int j=100;
    int k=415;
    int l=400;
    
    int m=55;
    int n=150;
    int o=415;
    int p=450;
   
    public void paint(Graphics gp)
    {
        super.paint(gp);
        
      
        
        Graphics2D g2d= (Graphics2D) gp;
        g2d.setColor(Color.RED);
        g2d.setFont(new Font("BOLD", BOLD, 35));
             
        g2d.drawString("K", a, 150);
        g2d.drawString("A", 220, b);
        g2d.drawString("T", c, 150);
        g2d.drawString("A", 280, d);
        g2d.drawString("K", e, 150);
        
        g2d.drawString("H", 220, f);
        g2d.drawString("A", g, 200);
        g2d.drawString("I", 280, h);
        
        g2d.drawString("F", i, 250);
        g2d.drawString("R", 235, j);
        g2d.drawString("O", k, 250);
        g2d.drawString("G", 295, l);
        
        g2d.drawString("2", m, 300);
        g2d.drawString("0", 235, n);
        g2d.drawString("2", o, 300);
        g2d.drawString("2", 295, p);
        
        

        try {
            
            Thread.sleep(100);
            
            if(a<190 && c>250 && e<310 && b<150 &&d>150 && f<200 && g>250 && h>200 && i<205 && j<250 && k>265 && l>250 )
            {
            a+=5;
            b+=5;           
            c-=5;
            d-=5;
            e+=5;
            f+=5;
            g-=5;
            h-=5;
            i+=5;
            j+=5;
            k-=5;
            l-=5;
            m+=5;
            n+=5;
            o-=5;
            p-=5;
            }
            else
            {
            a=190;
            b=150;
            c=250;
            d=150;
            e=310; 
            f=200;
            g=250;
            h=200;
            i=205;
            j=250;
            k=265;
            l=250;
            m=205;
            n=300;
            o=265;
            p=300;
            
            }
            
            
        } catch (Exception e) {
        }
            
        repaint();
    
       
        
    }
    
    
    public void display()throws ArrayIndexOutOfBoundsException{
        JFrame jf = new JFrame();
        jf.setSize(500, 500);
        jf.add(new Animasi());
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);
        
    }
   
    
     
    
}