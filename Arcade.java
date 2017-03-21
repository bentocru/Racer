 import javax.swing.*;
 
 public class Arcade                           //making a class called Arcade 
 {
 public static void main(String [] arguments)  //main operator with no return value
 {
 int SCREEN_HEIGHT = 500;                      //set the height of the screen
 int SCREEN_WIDTH = 800;                       //set the width of the screen
 
  JFrame window = new JFrame();                //make a new frame
  Racer r = new Racer();                        
  window.setTitle("Arcade");                   //set the title of the game
  window.setSize(SCREEN_WIDTH, SCREEN_HEIGHT); //sets window size
  window.setContentPane(r.getPanel());         //sets game as panel 
  
  window.setVisible(true);                     //makes panel visible
  
   r.start();                                  //makes game start
while(r.isPlaying())                           //making a while statement to start the game again
      r.update();                              
 }
 }