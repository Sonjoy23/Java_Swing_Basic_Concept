package swingPac;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.*;

public class class2 extends JFrame {
    private ImageIcon img;
    class2(){
        initlilation();
    }
    void initlilation(){
        Container c= this.getContentPane();
        c.setLayout(null);

        //Container background collor block
        c.setBackground(Color.CYAN);
        //this is Icon block
        ImageIcon icon=new ImageIcon(getClass().getResource("love.png"));
        this.setIconImage(icon.getImage());
        // text block
        JLabel user1=new JLabel();
        c.add(user1);
        user1.setText("hello world");
        user1.setForeground(Color.MAGENTA);
        user1.setBounds(5,4,200,50);
        user1.setToolTipText("sonjoy is app developer");
        //Text block2
        JLabel user2=new JLabel();
        c.add(user2);
        user2.setBounds(5,4,200,100);
        user2.setText("This is my fast app");

        //this is ImageIcon block in Container
        img =new ImageIcon(getClass().getResource("pc.jpg"));
        JLabel imageLabel =new JLabel(img);
        imageLabel.setBounds(5,80,img.getIconWidth(),img.getIconHeight());
        c.add(imageLabel);
    }
    public static void main(String[] args) {
        class2 frame=new class2();
        frame.setVisible(true);
        frame.setTitle("Swing");
        frame.setBounds(5,4,400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
