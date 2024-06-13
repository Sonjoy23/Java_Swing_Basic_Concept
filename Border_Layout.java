package swingPac;
import javax.swing.JFrame;
import java.awt.Color ;
import java.awt.Container;
import javax.swing.JButton;
import java.awt.BorderLayout;
public class Border_Layout extends JFrame{
    private Container c;
    private JButton button1,button2,button3,button4,button5;
    private BorderLayout borderLayout;
    Border_Layout(){
        initComponents();
    }
    void initComponents(){
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(4,4,400,400);
        this.setTitle("BorderLayout");
        //this is Container block
        c=this.getContentPane();
        //c.setLayout(borderLayout);
        //c.setBackground(Color.PINK);
        //this is button block
        button1=new JButton("1");
        button2=new JButton("2");
        button3=new JButton("3");
        button4=new JButton("4");
        button5=new JButton("5");
        //this is BorderLayout Block
        c.add(button1,BorderLayout.NORTH);
        c.add(button2,BorderLayout.WEST);
        c.add(button3,BorderLayout.CENTER);
        c.add(button4,BorderLayout.EAST);
        c.add(button5,BorderLayout.SOUTH);
    }
    public static void main(String[] args) {
        new Border_Layout();

    }
}
