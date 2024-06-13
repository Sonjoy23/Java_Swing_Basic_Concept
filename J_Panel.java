package swingPac;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
public class J_Panel extends JFrame{
    private Container c;
    private JButton button1,button2;
    private JLabel label1,label2;
    private JPanel panel1,panel2;
    J_Panel(){
        initComponents();
    }
    void initComponents(){
        //this is Container Block
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);
        // this is Button Block
        button1=new JButton("Button1");
        button2=new JButton("Button2");
        //this is JLabel Block
        label1=new JLabel("This is JLabel 1");
        label2=new JLabel("This is JLabel 2");


        //this is JPanel block
        panel1=new JPanel();
        panel1.setBounds(3,3,200,200);
        panel1.setBackground(Color.ORANGE);
        c.add(panel1);
        panel1.setLayout(null);
        button1.setBackground(Color.RED);
        button1.setBounds(40,4,100,30);
        panel1.add(button1);
        label1.setBounds(25,25,100,50);
        panel1.add(label1);

        panel2=new JPanel();
        panel2.setBounds(250,3,200,200);
        panel2.setBackground(Color.GREEN);
        c.add(panel2);
        panel2.add(button2);
        panel2.add(label2);

    }
    public static void main(String[] args) {
        J_Panel frame=new J_Panel();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(4,4,500,400);
        frame.setTitle("JPanel");
    }
}
