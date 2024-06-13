package swingPac;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class jMouseListener extends JFrame {
    private Container c;
    private JTextField field;
    private Font f;
    private JScrollPane scroll;
    private JTextArea area;
    jMouseListener(){
        init();
    }
    void init(){
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);
        // this is font block
        f=new Font("Arial",Font.BOLD,15);
        //this is JTextField block
        field=new JTextField();
        field.setBounds(40,4,300,50);
        field.setOpaque(true);
        field.setBackground(Color.ORANGE);
        field.setFont(f);
        c.add(field);

        //this is JTextArea Block
        area=new JTextArea();
        area.setLineWrap(true);
        area.setWrapStyleWord(true);
        area.setFont(f);
        area.setBackground(Color.LIGHT_GRAY);
        scroll=new JScrollPane(area);
        scroll.setBounds(40,100,300,250);
        c.add(scroll);

        field.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                area.append("sonjoy mouseClicked \n");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                area.append("sonjoy mousePressed \n");


            }

            @Override
            public void mouseReleased(MouseEvent e) {
                area.append("sonjoy mouseReleased \n");


            }

            @Override
            public void mouseEntered(MouseEvent e) {
                area.append("sonjoy mouseEntered \n");


            }

            @Override
            public void mouseExited(MouseEvent e) {
                area.append("sonjoy mouseExited \n");


            }
        });




    }
    public static void main(String[] args) {
        jMouseListener frame=new jMouseListener();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setBounds(3,3,400,400);
        frame.setTitle("JMouseListener");

    }
}
