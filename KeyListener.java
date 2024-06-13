package swingPac;
import javax.swing.JFrame;
import java.awt.Container;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
class keyListener extends JFrame {
    private Container c;
    private JTextArea area1;
    private JTextField field1;

    keyListener(){
        init();
    }
    void init(){
       c=this.getContentPane();
       c.setLayout(null);
       c.setBackground(Color.PINK);

       field1=new JTextField();
       field1.setBounds(4,4,200,50);
       field1.setBackground(Color.ORANGE);
       c.add(field1);

       area1=new JTextArea();
       area1.setBounds(4,100,200,200);
       area1.setBackground(Color.YELLOW);
       c.add(area1);

       field1.addKeyListener(new KeyListener() {
           @Override
           public void keyTyped(KeyEvent e) {
               area1.append("keyTyped "+e.getKeyChar()+"\n");
           }

           @Override
           public void keyPressed(KeyEvent e) {
               area1.append("keyPressed "+e.getKeyChar()+"\n");


           }

           @Override
           public void keyReleased(KeyEvent e) {
               area1.append("keyReleased "+e.getKeyChar()+"\n");


           }
       });

    }
    public static void main(String[] args) {
        keyListener frame=new keyListener();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(4,4,400,400);
        frame.setTitle("KeyListener");

    }
}
