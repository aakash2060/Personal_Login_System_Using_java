import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class LoginPage implements ActionListener {

        JFrame frame = new JFrame();// for the frame
        JButton loginButton = new JButton("Login"); // for the login button
        JButton resetButton = new JButton("Reset");// for the reset button
        JTextField UserNameField = new JFormattedTextField(); // for the username text box
        JTextField PasswordField = new JPasswordField(); // for anonymous password box
        JLabel UserNameLabel = new JLabel("User Name : "); // for adding "UserName:" and its modifications
        JLabel PasswordLabel = new JLabel("Password : "); // for adding "Password:" and its modifications
        JLabel MessageLabel = new JLabel();
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment(); // Available fonts that are available in JLabel
        String[] FontNames = ge.getAvailableFontFamilyNames();// keeping all the available font names inside an array
        HashMap<String,String> loginInfo = new HashMap<String,String>();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); // Toolkit helps to get the screen size of our device >> needed for setting the frame in the middle of the screen.
        int X= (int)screenSize.getWidth()/2;
        int Y=(int)screenSize.getHeight()/2;

       LoginPage(HashMap<String,String> LoginInfoPassed) {
                loginInfo = LoginInfoPassed;

                loginButton.setBounds(15,230,150,50);
                loginButton.addActionListener(this);
                loginButton.setFocusable(false);
                resetButton.setBounds(215,230,150,50);
                resetButton.addActionListener(this);
                resetButton.setFocusable(false);
                UserNameLabel.setBounds(45,100,100,35);
                PasswordLabel.setBounds(50,150,100,35);
                MessageLabel.setBounds(100,285,250,35);
                MessageLabel.setFont((new Font(FontNames[6], Font.CENTER_BASELINE,20)));

                UserNameField.setBounds(125,100,200,25);
                PasswordField.setBounds(125,150,200,25);

                ImageIcon logo= new ImageIcon("JarvisLogo.png");


           frame.add(resetButton);
           frame.add(loginButton);
           frame.add(UserNameLabel);
           frame.add(PasswordLabel);
           frame.add(MessageLabel);
           frame.add(UserNameField);
           frame.add(PasswordField);
           frame.setIconImage(logo.getImage());
           frame.setTitle("Jarvis Login System");
           frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
           frame.setLocation(X-200,Y-200); //leads the frame to the middle of the screen
           frame.setLayout(null);
           frame.setResizable(false);
           frame.setSize(400,400);//683
           frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
           if(e.getSource()==resetButton){ // if resetButton is pressed everything is cleared
               UserNameField.setText("");
               PasswordField.setText("");
           }
           if(e.getSource()==loginButton){// if loginButton is pressed
               String UserName= UserNameField.getText(); // the text in the username field will be set equal to userName String so that we can play around with it
               String Password =  PasswordField.getText();// the text in the Password field will be set equal to Password String so that we can play around with it

               if(loginInfo.containsKey(UserName)){ // if loginInfo contains UserName
                   if(loginInfo.get(UserName).equals(Password)){
                       MessageLabel.setText("Please wait Processing...");
                       frame.dispose(); // disposes the previous frame after logging in inside the system
                       InsidetheSystem insidetheSystem = new InsidetheSystem(UserName);
                   }
               else{
                   MessageLabel.setText("Invalid Password ");
                   }
               }
               else{
                   MessageLabel.setText("Invalid UserName");
               }

           }

    }
}
