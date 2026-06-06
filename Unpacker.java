import javax.swing.*;
import javax.swing.JFrame;
import java.awt.event.*;

class MarvellousGUI implements ActionListener {

    public JFrame fobj;

    public JButton bobj;
    public JTextField tobj;
    public JTextField pobj;

    public JLabel Folderlabel, Filelabel, Resultlabel;

    public MarvellousGUI(String Title, int Width, int Height) {
        fobj = new JFrame();

        Folderlabel = new JLabel("File Name");
        Folderlabel.setBounds(30, 30, 120, 30);

        tobj = new JTextField();
        tobj.setBounds(100, 30, 140, 30);

        bobj = new JButton("UnPack");
        bobj.setBounds(100, 100, 80, 20);

        Resultlabel = new JLabel("");
        Resultlabel.setBounds(80, 130, 170, 20);

        fobj.add(bobj);
        fobj.add(tobj);
        fobj.add(Folderlabel);
        fobj.add(Resultlabel);

        bobj.addActionListener(this);

        fobj.setLayout(null);

        fobj.setTitle(Title);
        fobj.setSize(Width, Height);
        fobj.setVisible(true);

        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent aobj) {

        String Foldname = tobj.getText();

        if (Foldname.equals("zzz.txt")) {
            Resultlabel.setText("Successfully UnPacked");
        } else {
            Resultlabel.setText("Unable to Unpack");
        }
    }
}
class UnPacker
{
    public static void main(String A[]) {
        MarvellousGUI mobj = new MarvellousGUI("Marvellous UnPacker", 300, 200);
    }
}
