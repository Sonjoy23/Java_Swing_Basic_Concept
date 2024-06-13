package swingPac;
import javax.swing.JFrame;
import java.awt.Container;
import java.awt.Color;


public class SlideShow extends JFrame {
    private Container c;
    SlideShow(){
        initComponents();
    }
    void initComponents(){
        c=this.getContentPane();
        c.setBackground(Color.PINK);

    }
    public static void main(String[] args) {
       SlideShow frame=new SlideShow();
       frame.setVisible(true);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setBounds(4,4,400,400);
       frame.setTitle("SlideShow");
    }
}
