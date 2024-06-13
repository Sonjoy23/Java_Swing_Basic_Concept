package swingPac;
import javax.swing.JFrame;
import java.awt.Container;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
public class ListenerDemo3 extends JFrame implements ActionListener{
    private Container c;
    private JButton button1,button2,button3,button4;
    ListenerDemo3(){
       init();
    }
    void init(){
        //this is container block
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);
        // this is button block
        button1=new JButton("Light");
        button1.setBounds(4,20,100,50);
        c.add(button1);

        button2=new JButton("Night");
        button2.setBounds(4,80,100,50);
        c.add(button2);

        button3=new JButton("Red");
        button3.setBounds(4,150,100,50);
        c.add(button3);

        button4=new JButton("Reset");
        button4.setBounds(4,220,100,50);
        c.add(button4);

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);


    }

    public static void main(String[] args) {
        ListenerDemo3 frame=new ListenerDemo3();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(4,4,400,400);
        frame.setTitle("ListenerDemo3");
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button1){
            c.setBackground(Color.white);
        } else if (e.getSource()==button2) {
                c.setBackground(Color.BLACK);
        }
        else if (e.getSource()==button3) {
            c.setBackground(Color.red);
        }
        else {
            c.setBackground(Color.PINK);
        }

    }

}
