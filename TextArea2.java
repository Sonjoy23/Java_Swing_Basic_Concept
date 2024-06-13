package swingPac;
import javax.swing.*;
import java.awt.Container;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;

public class TextArea2 extends JFrame {
    TextArea2(){
        initcomponents();
    }
    public void initcomponents(){
        Container c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);
        //user1 block
        Font f=new Font("Nikosh",Font.ITALIC,16);
        JLabel user1=new JLabel();
        c.add(user1);
        user1.setText("Enter Something: ");
        user1.setFont(f);
        user1.setBounds(4,3,200,50);
        //create text field
        JTextField tx1=new JTextField();
        tx1.setFont(f);
        tx1.setBackground(Color.magenta);
        tx1.setOpaque(true);
        tx1.setForeground(Color.BLUE);
        tx1.setBounds(4,50,300,50);
        tx1.setHorizontalAlignment(JTextField.LEFT);
        c.add(tx1);
        //second Text Field
        JTextField tx2=new JTextField();
        tx2.setBounds(4,100,300,50);
        tx2.setBackground(Color.GREEN);
        tx2.setOpaque(true);
        tx2.setForeground(Color.BLUE);
        tx2.setFont(f);
        c.add(tx2);


    }
    public static void main(String[] args) {
        TextArea2 frame=new TextArea2();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(5,4,400,400);
        frame.setTitle("ABCapp");

    }
}
