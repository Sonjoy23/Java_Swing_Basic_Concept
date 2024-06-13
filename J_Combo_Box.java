package swingPac;
import javax.swing.JFrame;
import java.awt.Container;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class J_Combo_Box extends JFrame {
    private Container c;
    private JComboBox cBox1;
    private JLabel label1;
    private JButton button1;
    private String[] str={"Kotlin","C","Java","C#","C++","Python","Robby","PHP",};
    J_Combo_Box(){
        Method();
    }
    void Method(){
        c=this.getContentPane();
        c.setBackground(Color.PINK);
        c.setLayout(null);
        //this is JComboBox block
        cBox1=new JComboBox(str);
        cBox1.setBounds(4,4,100,50);
        cBox1.setBackground(Color.orange);
        cBox1.setOpaque(true);
        cBox1.setForeground(Color.BLACK);
        // using setEditable method
        cBox1.setEditable(true);
        // using getItemCount method
        int Ic=cBox1.getItemCount();
        System.out.println("Total Item is: "+Ic);
        //this is setSelectedIndex Method
        cBox1.setSelectedIndex(2);
        // this is setSelected item block
               // cBox1.setSelectedItem("Java");
        //this is addItem Method
        cBox1.addItem("Javascript");
        // single item remove method
        cBox1.removeItem("Kotlin");
        // this is removeAll method
                //cBox1.removeAll();
        c.add(cBox1);
        // this JLabel Block
        label1=new JLabel();
        label1.setBounds(4,65,200,50);
        label1.setBackground(Color.ORANGE);
        label1.setOpaque(true);
        label1.setForeground(Color.RED);
        //label1.setText("This is JLabel Block");
        c.add(label1);
        // this is JButton block
        button1=new JButton("Check item");
        button1.setBounds(150,4,100,50);
        button1.setBackground(Color.CYAN);
        c.add(button1);
        //this is backend block
        button1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //toString method diye amra item variable ke String e rupantor korlam
                String item=cBox1.getSelectedItem().toString();
                label1.setText("You have selected "+item);

            }
        });


    }
    public static void main(String[] args) {
        J_Combo_Box frame=new J_Combo_Box();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setBounds(4,4,400,300);
        frame.setTitle("JComboBox");
    }
}

