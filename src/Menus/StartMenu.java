package Menus;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StartMenu extends JFrame implements ActionListener
{
    private JPanel basePanel;
    private JPanel buttonsPanel;
    private JButton newGameBtn;
    private JLabel textLbl;
    private JLabel nameLbl;
    private JButton loadGameBtn;
    private JButton testGameBtn;

    public StartMenu()
    {
        BorderLayout baseLayout = new BorderLayout();
        GridLayout buttonLayout = new GridLayout(3, 1);
        basePanel = new JPanel();
        basePanel.setLayout(baseLayout);

        buttonsPanel = new JPanel();
        buttonsPanel.setLayout(buttonLayout);

        newGameBtn = new JButton("Start New Game");
        loadGameBtn = new JButton("View Test Squad");
        testGameBtn = new JButton("Test Game");
        newGameBtn.addActionListener(this);
        loadGameBtn.addActionListener(this);
        testGameBtn.addActionListener(this);

        textLbl = new JLabel("Cricket Manager");
        nameLbl = new JLabel("By Joseph Holt");

        setTitle("Cricket Manager");

        basePanel.add("North", textLbl);
        basePanel.add("Center", buttonsPanel);
        basePanel.add("South", nameLbl);

        buttonsPanel.add(newGameBtn);
        buttonsPanel.add(loadGameBtn);
        buttonsPanel.add(testGameBtn);

        add(basePanel);
        setSize(640, 480);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == newGameBtn) {
            System.out.println("New game");
        }
        else if(e.getSource() == loadGameBtn) {
            ViewSquadPlayersMenu menu = new ViewSquadPlayersMenu();
            this.dispose();
        }
        else if(e.getSource() == testGameBtn){
            System.out.println("Testing match");
        }
    }

}
