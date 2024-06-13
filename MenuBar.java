import javax.swing.JFrame;
import java.awt.Container;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;

public class MenuBar extends JFrame implements ActionListener {
    private JMenuBar menuBar;
    private JMenu file,edit,help;
    private JMenuItem newItem, openItem, cutItem, copyItem, pasteItem,selectItem,exitItem;
    private Container c;
    private ImageIcon cutIcon;
    MenuBar(){
        initComponent();
    }
    void initComponent(){
        c=this.getContentPane();
        c.setLayout(null);
        //c.setBackground(Color.PINK);

        //this is Image block
        cutIcon=new ImageIcon("src/swingPac/icon_Pic/cut.png");

        menuBar=new JMenuBar();
        this.setJMenuBar(menuBar);

        file=new JMenu("File");
        edit=new JMenu("Edit");
        help=new JMenu("Help");

        menuBar.add(file);
        menuBar.add(edit);
        menuBar.add(help);

        newItem=new JMenuItem("New");
        openItem=new JMenuItem("Open");
        cutItem=new JMenuItem("Cut");
        cutItem.setIcon(cutIcon);
        copyItem =new JMenuItem("Copy");
        pasteItem=new JMenuItem("Paste");
        selectItem=new JMenuItem("Select All");
        exitItem =new JMenuItem("Exit");

        file.add(newItem);
        file.add(copyItem);
        file.add(exitItem);

        edit.add(cutItem);
        edit.addSeparator();
        edit.add(pasteItem);
        edit.add(selectItem);



        newItem.addActionListener(this);
        exitItem.addActionListener(this);




    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==newItem){
            JFrame frame=new JFrame();
            frame.setTitle("New File");
            frame.setVisible(true);
            frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            frame.setBounds(4,4,400,400);

        }
        else if (e.getSource()==exitItem){
            System.exit(0);

        }

    }


    public static void main(String[] args) {
        MenuBar frame=new MenuBar();
        frame.setVisible(true);
        frame.setBounds(4,4,400,400);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setTitle("Menu");



    }

}
