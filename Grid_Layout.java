package swingPac;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.Container;
import java.awt.Color;
public class Grid_Layout extends JFrame{
    private JButton b1,b2,b3,b4,b5,b6;
    private Container c;
    private GridLayout gLayout;
    Grid_Layout(){
        intoContainers();
    }
    void intoContainers(){
        c=this.getContentPane();
        c.setBackground(Color.PINK);
        gLayout=new GridLayout(2, 3,5,5);
        c.setLayout(gLayout);

        //this is Button block
        b1=new JButton("B1");
        b2=new JButton("B2");
        b3=new JButton("B3");
        b4=new JButton("B4");
        b5=new JButton("B5");
        b6=new JButton("B6");
        c.add(b1);
        c.add(b2);
        c.add(b3);
        c.add(b4);
        c.add(b5);
        c.add(b6);


    }
    public static void main(String[] args) {
        Grid_Layout frame=new Grid_Layout();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(4,4,400,400);
        frame.setTitle("GridLayout");
    }
}
