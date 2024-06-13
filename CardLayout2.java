package swingPac;
import javax.swing.JFrame;
import java.awt.Container;
import java.awt.Color;
import java.awt.CardLayout;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardLayout2 extends JFrame implements ActionListener{
    private Container c;
    private CardLayout cardLayout;
    private JButton b1,b2,b3,b4,b5;
    CardLayout2(){
        initComponents();
    }
    void initComponents(){
        c=this.getContentPane();
        cardLayout=new CardLayout();
        c.setLayout(cardLayout);
        c.setBackground(Color.PINK);

        b1=new JButton("1");
        b2=new JButton("2");
        b3=new JButton("3");
        b4=new JButton("4");
        b5=new JButton("5");

        c.add(b1,"first");
        c.add(b2,"Second");
        c.add(b3,"third");
        c.add(b4,"fourth");
        c.add(b5,"five");

        cardLayout.show(c,"third");
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);

    }
    @Override
    public void actionPerformed(ActionEvent e){
        cardLayout.next(c);

    }
    public static void main(String[] args) {
        CardLayout2 frame =new CardLayout2();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(4,4,400,400);
        frame.setTitle("CardLayout2");
    }
}
