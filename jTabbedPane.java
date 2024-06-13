
import javax.swing.JFrame;
import java.awt.Container;
import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
public class jTabbedPane extends JFrame {
    private ImageIcon icon11, icon12;
    private Container c;
    private JTabbedPane tabbed1,tabbed2,tabbed3;
    private JPanel panel1,panel2,panel3;
    jTabbedPane(){
        initTabbedPane();
    }
    void initTabbedPane(){
        c=this.getContentPane();
        c.setLayout(null);

        tabbed1=new JTabbedPane();
        tabbed1.setBounds(40,40,300,300);
        c.add(tabbed1);

        icon11=new ImageIcon("scr/icon_pic/icon2.png");
        icon12=new ImageIcon("scr/icon_pic/icon3.png");

        panel1=new JPanel();
        panel1.setBackground(Color.RED);
        tabbed1.addTab("Red",icon11,panel1,"this is red");
        panel2=new JPanel();
        panel2.setBackground(Color.green);
        tabbed1.addTab("Green",icon12,panel2,"this is  green");
        panel3=new JPanel();
        panel3.setBackground(Color.BLUE);
        tabbed1.add("Blue",panel3);



    }
    public static void main(String[] args) {
        jTabbedPane frame=new jTabbedPane();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setBounds(1,1,400,400);
        frame.setTitle("JTabbedPane");
    }
}
