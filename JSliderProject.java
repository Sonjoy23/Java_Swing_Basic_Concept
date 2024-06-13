import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Container;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
//this is Backend interface
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
public class JSliderProject extends JFrame implements ChangeListener {
    private Font font1;
    private Container c;
    private JLabel redLabel,greenLabel,blueLabel,preview;
    private JSlider redSlider,greenSlider,blueSlider;
    private JTextField redField,greenField,blueField;
    private JPanel panel;

    JSliderProject(){
        initComponent();
    }
    void initComponent(){
        //this is Container block
        c=this.getContentPane();
        c.setBackground(Color.PINK);
        c.setLayout(null);

        //this is font block
        font1=new Font("Aril",Font.BOLD,16);

        //this is JLabel block
        redLabel=new JLabel("Red");
        redLabel.setBounds(10,50,50,50);
        redLabel.setOpaque(true);
        redLabel.setForeground(Color.RED);
        redLabel.setBackground(Color.PINK);
        redLabel.setFont(font1);
        c.add(redLabel);

        greenLabel=new JLabel("Green");
        greenLabel.setBounds(10,150,50,50);
        greenLabel.setOpaque(true);
        greenLabel.setForeground(Color.GREEN);
        greenLabel.setBackground(Color.PINK);
        greenLabel.setFont(font1);
        c.add(greenLabel);

        blueLabel=new JLabel("Blue");
        blueLabel.setBounds(10,250,50,50);
        blueLabel.setOpaque(true);
        blueLabel.setBackground(Color.PINK);
        blueLabel.setForeground(Color.BLUE);
        blueLabel.setFont(font1);
        c.add(blueLabel);

        preview=new JLabel("Preview");
        preview.setBounds(600,300,100,50);
        preview.setBackground(Color.PINK);
        preview.setFont(font1);
        c.add(preview);

        //this is JSlider Block
        redSlider=new JSlider();
        redSlider.setBounds(80,50,250,50);
        redSlider.setBackground(Color.PINK);
        redSlider.setValue(0);
        c.add(redSlider);

        greenSlider=new JSlider();
        greenSlider.setBounds(80,150,250,50);
        greenSlider.setBackground(Color.PINK);
        greenSlider.setValue(0);
        c.add(greenSlider);

        blueSlider=new JSlider();
        blueSlider.setBounds(80,250,250,50);
        blueSlider.setBackground(Color.PINK);
        blueSlider.setValue(0);
        c.add(blueSlider);

        //this is JTextField block
        redField=new JTextField();
        redField.setBounds(350,50,100,50);
        redField.setFont(font1);
        c.add(redField);

        greenField=new JTextField();
        greenField.setBounds(350,150,100,50);
        greenField.setFont(font1);
        c.add(greenField);

        blueField=new JTextField();
        blueField.setBounds(350,250,100,50);
        blueField.setFont(font1);
        c.add(blueField);

        //this is JPanel Block
        panel=new JPanel();
        panel.setBounds(500,50,250,250);
        c.add(panel);
//start Backend block ------------------------------------------------------------------------------
        //this is backend
        redSlider.addChangeListener(this);
        greenSlider.addChangeListener(this);
        blueSlider.addChangeListener(this);



    }
    //this is Interface @Override  method
    @Override
    public void stateChanged(ChangeEvent e) {
        // slider er man gulu integer type variable er modhe store korlam
        int redValue=redSlider.getValue();
        int greenValue=greenSlider.getValue();
        int blueValue=blueSlider.getValue();

        // JTextField gulu te slider er man gulu set korlam
        redField.setText("  "+redValue);
        greenField.setText("  "+greenValue);
        blueField.setText("  "+blueValue);

        // color object er mothe RGB value variable er madhome set  korlam
        Color color=new Color(redValue,greenValue,blueValue);
        // panel er background e color object pas korlam
        panel.setBackground(color);

    }
//close backend block -------------------------------------------------------------------------------
    public static void main(String[] args) {
        JSliderProject frame=new JSliderProject();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setBounds(4,4,800,400);
        frame.setTitle("JSlider");

    }

}
