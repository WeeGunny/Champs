package Champs;
import java.awt.*;
import java.net.URL;
import java.util.Scanner;
import javax.swing.*;
public class PanIcons extends JPanel {
    private Image Icon=null;
    
   public void paint(Graphics g) {
//       String sName= getChamp();
       String sName="Annie";
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
  
//   public String getChamp(){
//       Scanner sin = new Scanner(System.in);
//       System.out.println("Enter a Champion Name");
//       String sName= sin.next();
//       return sName;
//   } 
}
