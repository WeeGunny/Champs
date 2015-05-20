package Champs;
import java.awt.*;
import java.applet.*;
import java.net.URL;
import javax.swing.*;
public class PanIcons extends JPanel {
    private Image Icon=null;
    
   public void paint(Graphics g) {
       String sName= "Annie";
       Icon=getImage(sName+"Square.png");   
       Graphics2D g2 = (Graphics2D)g;
       g2.drawImage(Icon, 0, 0, 120, 120, this);
       
       
   }
   public Image getImage(String Path){
       Image Temp= null;
       URL imageURL;
       imageURL = PanIcons.class.getResource(Path);
       Temp=Toolkit.getDefaultToolkit().getImage(imageURL);
       return Temp;
   }
}
