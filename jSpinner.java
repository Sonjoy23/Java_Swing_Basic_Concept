package swingPac;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JLabel;

public class jSpinner extends JFrame{
    Container c;
    JSpinner spinner1;

    jSpinner(){
        Jinto();

    }
    void Jinto(){
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);

        //this is Spinner block
        SpinnerNumberModel value =new SpinnerNumberModel(0,0,50,2);
        spinner1=new JSpinner(value);
        spinner1.setBounds(40,40,50,50);
        c.add(spinner1);


    }
    public static void main(String[] args) {
        jSpinner frame=new jSpinner();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setBounds(3,3,300,300);

    }
}
