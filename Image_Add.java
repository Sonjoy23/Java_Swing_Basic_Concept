package swingPac;
import javax.swing.JFrame;
import java.awt.Container;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
public class Image_Add extends JFrame {
    private Container c;
    private ImageIcon icon;
    private JLabel label;
    Image_Add(){
        initComponents();
    }
    void initComponents(){
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);
        //this is image block
        icon=new ImageIcon(getClass().getResource("Love.png"));
        label=new JLabel("Love Picture",icon,JLabel.LEFT);
        label.setBounds(4,40,200,50);
        c.add(label);

    }
    public static void main(String[] args) {
        Image_Add frame=new Image_Add();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setBounds(3,3,400,400);
        frame.setTitle("Image");
    }
}
