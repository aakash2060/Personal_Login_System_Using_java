import javax.swing.*;
import java.awt.*;
import static javax.swing.WindowConstants.*;

public class InsidetheSystem {
    JFrame frame= new JFrame();
    JLabel insiderLabel= new JLabel(); // helps us add text, icon images to our frame
    GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment(); // to get the fonts that are available in JLabel
    String[] FontName = ge.getAvailableFontFamilyNames();// keeping all the available font names inside an array

    InsidetheSystem(String UserName){
        insiderLabel.setText("Hello " + UserName + ", I am Jarvis your personal assistant.");
        insiderLabel.setBounds(0,0,500,35);
        insiderLabel.setFont(Font.getFont(FontName[6]));
        frame.add(insiderLabel);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setTitle("Welcome to Jarvis");
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
