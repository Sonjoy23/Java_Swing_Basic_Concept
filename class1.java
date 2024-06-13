package swingPac;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Container;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;

public class class1 extends JFrame {
    class1(){
        initcomponents();
    }
    public void initcomponents(){
        //This is container and  Background color block
        Container c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);
        //this is iconImage
        ImageIcon icon = new ImageIcon(getClass().getResource("pc.jpg"));
        this.setIconImage(icon.getImage());
        //this is content text block
        JLabel user1=new JLabel();
        user1.setText("My desktop application");
        c.add(user1);
        user1.setForeground(Color.BLUE);
        user1.setBounds(4,3,200,50);
        //font Block
        Font f=new Font("Arial",Font.ITALIC,14);
        //containt block2
        JLabel user2=new JLabel();
        user2.setFont(f);
        user2.setOpaque(true);
        user2.setBackground(Color.CYAN);
        user2.setBounds(4,36,200,50);
        c.add(user2);


    }

    public static void main(String[] args) {
        class1 frame=new class1();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Swing");
        frame.setBounds(5,4,400,300);
    }

}
