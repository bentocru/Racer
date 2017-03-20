 import javax.swing.*;
 
 public class Arcade 
 {
 public static void main(String [] arguments) 
 {
 int SCREEN_HEIGHT = 700;
 int SCREEN_WIDTH = 700; 
 
 JFrame window = new JFrame(); 
 Racer r = new Racer();
 window.setTitle("Arcade");
 window.setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
  window.setContentPane(r.getPanel());
  window.setVisible(true);
  
   r.start();
while(r.isPlaying())
      r.update();
 }
 }