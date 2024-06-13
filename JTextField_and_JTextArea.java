package swingPac;
import javax.swing.*;
import java.awt.Font;
import java.awt.Container;
import java.awt.Color;

public class JTextField_and_JTextArea extends JFrame {
    JTextField_and_JTextArea(){
        initcontains2();
    }
    void initcontains2(){
        //this is font block
        Font f=new Font("Arial",Font.BOLD,14);

        //this is container block
        Container c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.YELLOW);
        //this is imageIcon Block
        ImageIcon icon=new ImageIcon(getClass().getResource("love.png"));
        this.setIconImage(icon.getImage());
        //this is Label Block
        JLabel label1=new JLabel();
        label1.setText("Write Some Text");
        label1.setBounds(4,3,200,100);
        label1.setFont(f);
        c.add(label1);
        //This is JTextArea block
        //this is scrollpane block
        JScrollBar scrollBar1=new JScrollBar();
        JTextArea area=new JTextArea();
        area.setFont(f);
        area.setOpaque(true);
        area.setLineWrap(true);
        area.setWrapStyleWord(true);
        area.add(scrollBar1);
        area.setForeground(Color.RED);
        area.setBounds(4,100,200,50);
        c.add(area);
        //this is JTextField Block
        JTextField field =new JTextField();
        field.setOpaque(true);
        field.setForeground(Color.BLUE);
        field.setBounds(4,190,200,50);
        field.setFont(f);
        c.add(field);
    }
    public static void main(String[] args) {
        JTextField_and_JTextArea frame=new JTextField_and_JTextArea();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(400,3,400,300);
        frame.setTitle("LoginApp");
    }
}

