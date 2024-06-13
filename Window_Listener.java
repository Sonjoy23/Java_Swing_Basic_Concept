package swingPac;
import javax.swing.JFrame;
import java.awt.Container;
import java.awt.Color;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;

public class Window_Listener extends JFrame {
    private Container c;

    Window_Listener(){
        initComponents();
    }
    void initComponents(){
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);

        this.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
                System.out.println("windowOpened");

            }

            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("windowClosing");

            }

            @Override
            public void windowClosed(WindowEvent e) {
                System.out.println("windowClosed");

            }

            @Override
            public void windowIconified(WindowEvent e) {
                System.out.println("windowIconified");

            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                System.out.println("windowDeiconified");

            }

            @Override
            public void windowActivated(WindowEvent e) {
                System.out.println("windowActivated");

            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                System.out.println("windowDeactivated");

            }
        });
    }
    public static void main(String[] args) {
        Window_Listener frame=new Window_Listener();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(4,4,400,400);
        frame.setTitle("WindowListener");

    }

}
