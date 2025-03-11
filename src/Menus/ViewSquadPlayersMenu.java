package Menus;
import Classes.Player;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class ViewSquadPlayersMenu extends JFrame implements ActionListener
{
    private JPanel panel;
    private ArrayList<JButton> playerButtons = new ArrayList<JButton>();
    private ArrayList<Player> players = new ArrayList<Player>();
    public ViewSquadPlayersMenu()
    {
        setTitle("Squad Viewer");
        panel = new JPanel();

        for(int i = 0; i < 20; i++)
        {
            players.add(new Player());
        }

        int i = 0;
        for(Player player : players)
        {
            playerButtons.add(new JButton(player.getForename() + " " + player.getSurname()));
            panel.add(playerButtons.get(i));
            playerButtons.get(i).addActionListener(this);
            i++;
        }

        setSize(640, 480);
        add(panel);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e)
    {
        int counter = 0;
        for(JButton button : playerButtons)
        {
            if(e.getSource() == button)
            {
                ViewPlayerMenu menu = new ViewPlayerMenu(players.get(counter));
            }
            counter++;
        }
    }
}
