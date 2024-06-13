package swingPac;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JToggleButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
public class ToggleButton extends JFrame {
    private ImageIcon ONNicon,OFFicon;
    private Container c;
    private JToggleButton toggle1;
    private JLabel label1;

    ToggleButton(){
        initComponents();
    }
    void initComponents(){
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);
        //this is ImageIcon block
        ONNicon=new ImageIcon("src/swingPac/icon_Pic/icon2.jpg");
        OFFicon=new ImageIcon("src/swingPac/icon_Pic/icon3.png");

        // this is ToggleButton Block
        toggle1=new JToggleButton(OFFicon);
        toggle1.setBounds(40,40,200,200);
        c.add(toggle1);

        //this is JLabel Block
        label1=new JLabel();
        label1.setBounds(40,300,250,50);
        c.add(label1);

        toggle1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(toggle1.isSelected()){
                   toggle1.setIcon(ONNicon);
                   label1.setText("Hello sonjoy, toggleButton is Selected");
                }
                else {
                    toggle1.setIcon(OFFicon);
                    label1.setText("");
                }
            }
        });

    }
    public static void main(String[] args) {
        ToggleButton frame=new ToggleButton();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setBounds(4,4,400,400);
        frame.setTitle("ToggleButton");

    }
}
