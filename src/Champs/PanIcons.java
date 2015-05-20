package Champs;
import java.awt.*;
import java.net.URL;
import java.util.Scanner;
import javax.swing.*;
public class PanIcons extends JPanel {
    private Image Icon=null;
    
   public void paint(Graphics g, String sName) {
       Icon=getImage(sName+"Square.png");   
       Graphics2D g2 = (Graphics2D)g;
       g2.drawImage(Icon, 0, 0, 120, 120, this);    
   }
   public Image getImage(String Path){
       Image Temp= null;
       URL imageURL;
       imageURL = 
       
       return Temp;
   }
  
   public static String getChamp(String sName){
       Main getName=new Main();
       return sName;
   } 
}
