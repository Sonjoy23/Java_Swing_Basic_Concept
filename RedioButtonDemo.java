package swingPac;
import javax.swing.JFrame;
import java.awt.Container;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextArea;
import javax.swing.JOptionPane;

public class RedioButtonDemo extends JFrame{
    private Container c;
    private JRadioButton radioB1;
    private JRadioButton radioB2;
    private ButtonGroup group;
    private JRadioButton radioB3;
    private Font f;
    private JTextArea area1;
    RedioButtonDemo(){
      initcontains();
    }
    void initcontains(){

        f=new Font ("Aril",Font.BOLD,16);
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);
        // this is Radio button block1
        radioB1=new JRadioButton("Male");
        radioB1.setBounds(40,3,100,50);
        radioB1.setBackground(Color.PINK);
        c.add(radioB1);

        radioB2=new JRadioButton("Female");
        radioB2.setBounds(200,3,100,50);
        radioB2.setBackground(Color.PINK);
        c.add(radioB2);
        group=new ButtonGroup();
        group.add(radioB1);
        group.add(radioB2);
        radioB3=new JRadioButton("Third Gender");
        radioB3.setFont(f);
        radioB1.setFont(f);
        radioB2.setFont(f);
        radioB3.setBounds(40,70,150,50);
        radioB3.setBackground(Color.PINK);
        c.add(radioB3);
        //male button has already Selected
        radioB1.setSelected(true);
        // third gender button has Enabled
        radioB3.setEnabled(false);
        //this is text area
        area1=new JTextArea();
        area1.setBounds(40,150,200,100);
        area1.setBackground(Color.cyan);
        area1.setFont(f);
        c.add(area1);

        group.add(radioB3);
        Handler handler=new Handler();
        radioB1.addActionListener(handler);
        radioB2.addActionListener(handler);

    }
    class Handler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ac){
            if(ac.getSource()==radioB1){
                    area1.append("You are selected Male\n");

                }

            else{
                area1.append("You are selected Female\n");
            }
        }
    }
    public static void main(String[] args) {
        RedioButtonDemo frame =new RedioButtonDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setBounds(4,3,400,300);
        frame.setTitle("Radio");

    }
}
