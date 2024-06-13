package swingPac;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.Box;
import java.awt.Container;
import java.awt.Color;

public class Box_Layout extends JFrame {
    private Container c;
    private BoxLayout bLayout;
    private JButton button1,button2,button3,button4,button5;
    Box_Layout(){
        intoContainers();
    }
    void intoContainers(){
        c=this.getContentPane();
        c.setBackground(Color.PINK);
        //this is BoxLayout block
        //->bLayout{variable}=new BoxLayout{Class name} (c(Container name),BoxLayout.Y_AXIS{direction})
        bLayout=new BoxLayout(c,BoxLayout.Y_AXIS);
        c.setLayout(bLayout);
        //this is Button Block
        button1=new JButton("B1");
        button2=new JButton("B2");
        button3=new JButton("B3");
        button4=new JButton("B4");
        button5=new JButton("B5");
        //add button group
        c.add(button1);
        c.add(button2);
        c.add(button3);
        c.add(button4);
        c.add(Box.createVerticalStrut(10));
        c.add(button5);


    }
    public static void main(String[] args) {
        Box_Layout frame=new Box_Layout();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(4,4,400,400);
        frame.setTitle("BoxLayout");
    }
}
