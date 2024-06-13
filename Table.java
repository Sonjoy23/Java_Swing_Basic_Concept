import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JLabel;
import javax.swing.JTable;
import java.awt.Font;
import javax.swing.JScrollPane;
public class Table extends JFrame {
    private Container c;
    private JLabel label1;
    private Font f;
    JTable table;
    JScrollPane scrollpane;
    private String[] cols={"Name","Roll","CGPA"};
    private String[][] rows={
            {"Sonjoy","616396","3.50"},
            {"raju","616397","3.60"},
            {"rifat","616366","3.89"},
            {"korash","616896","3.99"},
            {"korim","616596","3.90"},
            {"Sonjoy","616396","3.50"},
            {"raju","616397","3.60"},
            {"rifat","616366","3.89"},
            {"korash","616896","3.99"},
            {"korim","616596","3.90"},
            {"Sonjoy","616396","3.50"},
            {"raju","616397","3.60"},
            {"rifat","616366","3.89"},
            {"korash","616896","3.99"},
            {"korim","616596","3.90"},
    };

    Table(){
        initTable();
    }
    void initTable(){
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);

        //this is font block
        f=new Font("Aril",Font.BOLD,16);





        //this is Label block
        label1=new JLabel("Student Table");
        label1.setBounds(110,4,200,50);
        label1.setFont(f);
        c.add(label1);
        // this is table block
        table=new JTable(rows,cols);
        scrollpane=new JScrollPane(table);
        scrollpane.setBounds(40,40,200,200);
        c.add(scrollpane);



    }
    public static void main(String[] args) {
        Table frame=new Table();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setBounds(1,1,400,400);
        frame.setTitle("Table");
    }

}
