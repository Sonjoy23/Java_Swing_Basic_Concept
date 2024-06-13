package swingPac;
import javax.swing.JFrame;
import java.awt.Container;
import java.awt.Color;
import java.awt.CardLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Card_Layout  extends JFrame implements ActionListener{
    private Container c;
    private JButton button1,button2,button3;
    private CardLayout cardLayout;

    Card_Layout(){
        initContainers();
    }
    void initContainers(){
        c=this.getContentPane();
        c.setBackground(Color.PINK);
        cardLayout=new CardLayout(10,10);
        c.setLayout(cardLayout);

        button1=new JButton("Button1");
        button2=new JButton("Button2");
        button3=new JButton("Button3");

        c.add(button1,"First");
        c.add(button2,"Second");
        c.add(button3,"Third");

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        cardLayout.previous(c);

    }

    public static void main(String[] args) {
        Card_Layout frame=new Card_Layout();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(4,4,400,400);
        frame.setTitle("CardLayout");

    }
}
