package swingPac;
import javax.swing.JFrame;
import java.awt.Container;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class CollegeRegistration extends JFrame {
    private String  dateBox[]={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16",
            "17", "18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
    private String monthBox[]={"January","February","March","April","May","Jun","July","August","September",
            "October","November","December"};

    private String yearBox[]={"2010","2011","2012","2013","2014","2015","2016","2018","2019","2020",
            "2021","2022", "2023","2024"};
    private Container c;
    private JLabel regLabel,nameLabel,mobileLabel,genderLabel,DoBLabel,addressLabel;
    private Font f1,f2;
    private JRadioButton male,female;
    private JTextField nameField,mobileField;
    private ButtonGroup group1;
    private JComboBox date,month,year;
    private JCheckBox checkBox;
    private JButton button1,button2;
    CollegeRegistration(){
        initComponents();
    }
    void initComponents(){
        c=this.getContentPane();
        c.setBackground(Color.PINK);
        c.setLayout(null);

        // this is Font Block
        f1=new Font("Arial",Font.BOLD,16);
        f2=new Font("Arial",Font.BOLD,20);

        //this radioButton Block
        group1=new ButtonGroup();


        //this is Text Block
        regLabel=new JLabel();
        regLabel.setText("Registration Form");
        regLabel.setBounds(130,4,200,50);
        regLabel.setFont(f2);
        c.add(regLabel);

        //this is name block
        nameLabel=new JLabel("Name");
        nameLabel.setBounds(25,60,80,50);
        nameLabel.setFont(f1);
        c.add(nameLabel);
        nameField=new JTextField();
        nameField.setBounds(100,60,250,50);
        nameField.setFont(f1);
        c.add(nameField);

        //this is mobile block
        mobileLabel=new JLabel("Mobile");
        mobileLabel.setBounds(25,125,80,50);
        mobileLabel.setFont(f1);
        c.add(mobileLabel);
        mobileField=new JTextField();
        mobileField.setBounds(100,125,250,50);
        mobileField.setFont(f1);
        c.add(mobileField);

        //this is Gender Block
        genderLabel =new JLabel("Gender");
        genderLabel.setBounds(25,200,80,50);
        genderLabel.setFont(f1);
        c.add(genderLabel);

        male=new JRadioButton("Male");
        male.setFont(f1);
        male.setBounds(100,200,80,50);
        male.setBackground(Color.PINK);
        group1.add(male);
        c.add(male);
        female=new JRadioButton("Female");
        female.setFont(f1);
        female.setBackground(Color.PINK);
        female.setBounds(200,200,80,50);
        group1.add(female);
        c.add(female);

        //this is DOM block
        DoBLabel =new JLabel("DOB");
        DoBLabel.setBounds(25,260,80,50);
        DoBLabel.setFont(f1);
        c.add(DoBLabel);
        date=new JComboBox(dateBox);
        date.setBounds(100,260,50,50);
        c.add(date);
        month=new JComboBox(monthBox);
        month.setBounds(150,260,80,50);
        c.add(month);
        year=new JComboBox(yearBox);
        year.setBounds(240,260,100,50);
        c.add(year);

        //this is Address block
        addressLabel=new JLabel("Address");
        addressLabel.setBounds(25,320,100,50);
        addressLabel.setFont(f1);
        c.add(addressLabel);

        checkBox=new JCheckBox("Accept Terms And Conditions.");
        checkBox.setBounds(80,380,200,50);
        checkBox.setBackground(Color.PINK);
        c.add(checkBox);

        //this is button block
        button1=new JButton("Submit");
        button1.setBounds(80,440,100,50);
        c.add(button1);

        button2=new JButton("Reset");
        button2.setBounds(200,440,100,50);
        c.add(button2);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Thank you");
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nameField.setText("");
                mobileField.setText("");
            }
        });



    }
    public static void main(String[] args) {
        CollegeRegistration frame=new CollegeRegistration();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(4,4,450,600);
        frame.setTitle("Registration");
    }
}
