package swingPac;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.Color;
import java.awt.FlowLayout;
public class Flow_Layout extends JFrame {
    private Container c;
    private JButton buttons[];
    private FlowLayout flowLayout;
    Flow_Layout(){
       initContainers();
    }
    void initContainers(){
        //this is Container Block
        c=this.getContentPane();
        flowLayout=new FlowLayout(FlowLayout.LEFT);
        flowLayout.setHgap(10);
        flowLayout.setVgap(20);
        c.setBackground(Color.PINK);
        c.setLayout(flowLayout);

        // this is button block
        buttons=new JButton[9];
        for(int i=0; i<=8; i++){
            buttons[i]=new JButton(""+(i+1));
            c.add(buttons[i]);
            buttons[i].setBackground(Color.ORANGE);
        }




    }
    public static void main(String[] args) {
        Flow_Layout frame=new Flow_Layout();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("FlowLayout");
        frame.setBounds(4,4,400,400);

    }

}
