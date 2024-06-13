package swingPac;
import javax.swing.JFrame;
import java.awt.Container;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Cursor;
public class ActionLessoner extends JFrame {
    ActionLessoner(){
        initComponents();
    }
    void initComponents(){
        //this Container Block
        Container c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);
        // this is Font Block
        Font f=new Font("Aril",Font.BOLD,16);
        //this is Cursor Block;
        Cursor cHand=new Cursor(Cursor.HAND_CURSOR);
        Cursor cMove=new Cursor(Cursor.MOVE_CURSOR);
        Cursor CW=new Cursor(Cursor.WAIT_CURSOR);
        //this is text JLabel block
        JLabel user1=new JLabel();
        user1.setBounds(4,3,200,50);
        user1.setText("Enter Password: ");
        user1.setFont(f);
        c.add(user1);
        //this is password block
        JPasswordField pass1=new JPasswordField();
        pass1.setBounds(4,50,200,50);
        pass1.setBackground(Color.YELLOW);
        pass1.setOpaque(true);
        pass1.setForeground(Color.RED);
        pass1.setFont(f);
        c.add(pass1);
        //This is JButton Block
        JButton b1=new JButton();
        b1.setBounds(4,110,50,50);
        b1.setBackground(Color.magenta);
        b1.setText("9");
        b1.setCursor(cHand);
        b1.setFont(f);
        b1.setToolTipText("Nine");
        c.add(b1);
        JButton b2=new JButton("8");
        b2.setBounds(60,110,50,50);
        b2.setToolTipText("Eight");
        b2.setBackground(Color.ORANGE);
        b2.setCursor(CW);
        b2.setFont(f);
        c.add(b2);

    }

    public static void main(String[] args) {
        ActionLessoner frame=new ActionLessoner();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(5,4,400,300);
        frame.setTitle("Lessoner");

    }
}
