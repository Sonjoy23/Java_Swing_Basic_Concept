package swingPac;
import javax.swing.JFrame;
import java.awt.Container;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class VowelCounter_using_Keylistener extends JFrame {
    private Container c;
    private Font f;
    private JTextArea area1;
    private JLabel label1,label2,Alabel,Elabel,Ilabel,Olabel,Ulabel;
    private JScrollPane scrollBar;

    int total=0;
    int letterA =0;
    int letterE=0;
    int letterI =0;
    int letterO =0;
    int letterU =0;
    VowelCounter_using_Keylistener(){
        init();
    }
    void init(){
        // this is font block
        f=new Font("arial",Font.BOLD,15);
        //this is container block
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);

        label1 =new JLabel("Enter something");
        label1.setBounds(3,3,150,50);
        label1.setFont(f);
        c.add(label1);

        area1=new JTextArea();
        area1.setLineWrap(true);
        area1.setWrapStyleWord(true);
        scrollBar =new JScrollPane(area1);
        scrollBar.setBounds(150,3,300,200);
        c.add(scrollBar);




        label2 =new JLabel("Total Number of Vowel: ");
        label2.setBounds(3,220,200,50);
        label2.setFont(f);
        c.add(label2);

        Alabel =new JLabel("A = ");
        Alabel.setBounds(140,270,200,50);
        Alabel.setFont(f);
        c.add(Alabel);


        Elabel =new JLabel("E = ");
        Elabel.setBounds(140,310,200,50);
        Elabel.setFont(f);
        c.add(Elabel);


        Ilabel =new JLabel(" I = ");
        Ilabel.setBounds(140,350,200,50);
        Ilabel.setFont(f);
        c.add(Ilabel);

        Olabel =new JLabel("O = ");
        Olabel.setBounds(140,380,200,50);
        Olabel.setFont(f);
        c.add(Olabel);

        Ulabel =new JLabel("U = ");
        Ulabel.setBounds(140,410,200,50);
        Ulabel.setFont(f);
        c.add(Ulabel);

        area1.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getSource()==area1){
                    if(e.VK_A==e.getKeyCode()){
                        total++;
                        letterA++;
                    }

                    if(e.VK_E==e.getKeyCode()){
                        total++;
                        letterE++;
                    }

                    if(e.VK_I==e.getKeyCode()){
                        total++;
                        letterI++;
                    }

                    if(e.VK_O==e.getKeyCode()){
                        total++;
                        letterO++;
                    }

                    if(e.VK_U==e.getKeyCode()){
                        total++;
                        letterU++;
                    }
                }
                label2.setText("Total number of vowel: "+total);
                Alabel.setText("A = "+letterA);
                Elabel.setText("E = "+letterE);
                Ilabel.setText("I = "+letterI);
                Olabel.setText("O = "+letterO);
                Ulabel.setText("u = "+letterU);




            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

    }
    public static void main(String[] args) {
        VowelCounter_using_Keylistener frame=new VowelCounter_using_Keylistener();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(1,1,500,500);
        frame.setTitle("VowelCounter");
    }
}
