import javax.swing.*;
import java.awt.*;

public class MenuBar extends JFrame  {

    MenuBar() {

        JMenuBar menu = new JMenuBar();

        JMenu File = new JMenu("File");
        JMenu Help = new JMenu("Help");

        JMenuItem Open = new JMenuItem("Open");
        JMenuItem Load = new JMenuItem("Load");
        JMenuItem Exit = new JMenuItem("Exit");

        JMenuItem About = new JMenuItem("About");
        JMenuItem Register = new JMenuItem("Register");

        File.add(Open);
        File.add(Load);
        File.add(Exit);

        Help.add(About);
        Help.add(Register);


        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());

        menu.add(File);
        menu.add(Help);

        this.setJMenuBar(menu);
        this.setVisible(true);

        Open.addActionListener(e -> System.out.println("You Are Opening A File"));
        Load.addActionListener(x -> System.out.println("You Are Loading A File"));
        Exit.addActionListener(x -> this.dispose());
        About.addActionListener(x -> System.out.println("Made By Sreyank Bose \n Java JMenu Project"));
        Register.addActionListener(x -> System.out.println("You Are Registering"));


    }

}
