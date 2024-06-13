package swingPac;
import javax.swing.JFrame;
import java.awt.*;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class JCheckBoxClass extends JFrame{
    private Container c;
    private JCheckBox box1,box2,box3;
    private JLabel label1;

    private Font f;
    JCheckBoxClass(){
        Init();
    }
    void Init(){
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);
        //this  is font block
        f=new Font ("Aril",Font.BOLD,16);

        //this is JCheckBox
        box1= new JCheckBox();
        box1.setText("Box1");
        box1.setBounds(30,3,70,50);
        box1.setBackground(Color.PINK);
        c.add(box1);
        box2=new JCheckBox("Box2");
        box2.setBounds(150,3,70,50);
        box2.setBackground(Color.PINK);
        box2.setSelected(true);
        c.add(box2);


        box3=new JCheckBox("Box3");
        box3.setBounds(250,3,70,50);
        box3.setBackground(Color.PINK);
        c.add(box3);

        ButtonGroup grp=new ButtonGroup();
        grp.add(box1);
        grp.add(box2);
        grp.add(box3);

        //this is Label Block
        JLabel label1=new JLabel("You have not selected anything");
        label1.setBounds(4,60,300,50);
        label1.setFont(f);
        c.add(label1);
        Handler handler =new Handler();
        box1.addActionListener(handler);
        box2.addActionListener(handler);
        box3.addActionListener(handler);




    }
    class Handler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
        }
    }
    public static void main(String[] args) {
        JCheckBoxClass frame=new JCheckBoxClass();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setBounds(4,4,400,300);
        frame.setTitle("JCheckBox");
    }
}
