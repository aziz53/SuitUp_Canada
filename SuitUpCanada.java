import javax.swing.JFrame;
import javax.swing.JPanel;

public class SuitUpCanada extends JFrame {
  
  public static SuitUpCanada frame;
  
  public static void setContent(JPanel panel){
    frame.setContentPane(panel);
    frame.revalidate();
  }
  
  public SuitUpCanada(){
    setTitle("Suit Up Canada");
    setVisible(true);
    setSize(1920, 1080);
    setResizable(false);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
  
  public static void main(String[] args) { 
    System.out.println("> Starting Suit Up Canada...");
    frame = new SuitUpCanada();
    setContent(new UserSignIn());
  }
}
