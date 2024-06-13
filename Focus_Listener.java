package swingPac;
import javax.swing.JFrame;
import java.awt.Container;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
public class Focus_Listener extends JFrame{
    private Container c;
    private JButton button;
    private JTextArea area;
    Focus_Listener(){
        initComponents();
    }
    void initComponents(){
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);
        //this is button block
        button=new JButton("Click");
        button.setBounds(4,10,100,50);
        c.add(button);

        //this is JTextArea Block
        area=new JTextArea();
        area.setBounds(150,10,200,200);
        c.add(area);

        button.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {

                area.setText("FocusListener");
            }

            @Override
            public void focusLost(FocusEvent e) {
                area.setText("FocusEvent");

            }
        });
    }
    public static void main(String[] args) {

        Focus_Listener frame=new Focus_Listener();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(3,3,400,400);
        frame.setTitle("FocusListener");
    }
}
