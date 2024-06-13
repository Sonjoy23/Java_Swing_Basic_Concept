package swingPac;
import javax.swing.JFrame;
import java.awt.Container;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.CardLayout;
public class SlidesShow extends JFrame{
    private Container c;
    private JPanel panel;
    private JButton button1,button2;
    private ImageIcon icon;
    private JLabel label1;
    private CardLayout card_layout;
    SlidesShow(){
        InitComponents();
        showImage();
    }
    void showImage(){
        String[] image={"pic1.jpg","pic2.jpg","pic3.jpg","pic4.jpg","pic6.jpg"};
        for(String n:image){
            icon=new ImageIcon("src/swingPac/Natural_Pic/pic"+n);
            label1=new JLabel(icon);
            panel.add(label1);

        }
    }
    void InitComponents(){
        c=this.getContentPane();
        c.setBackground(Color.PINK);
        c.setLayout(null);
        // this is  CardLayout block
        card_layout=new CardLayout();

        // this is panel block
        panel=new JPanel(card_layout);
        panel.setBounds(40,4,300,300);
        c.add(panel);
        //this is Button block
        button1 =new JButton("previous");
        button1.setBounds(40,330,100,50);
        c.add(button1);
        button2 =new JButton("Next");
        button2.setBounds(238,330,100,50);
        c.add(button2);


    }
    public static void main(String[] args) {
        SlidesShow frame=new SlidesShow();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setBounds(4,4,400,450);
        frame.setTitle("Slideshow");
    }
}
