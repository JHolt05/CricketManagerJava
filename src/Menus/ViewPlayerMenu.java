package Menus;
import Classes.Player;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class ViewPlayerMenu extends JFrame
{
    private Player player;
    private JPanel basePanel;
    private JPanel statsPanel;
    private JPanel infoPanel;
    private JLabel playerNameLbl;
    private JLabel playerRoleLbl;
    private JLabel playerBowlStyleLbl;
    private JLabel playerAgeLbl;

    public ViewPlayerMenu(Player iPlayer)
    {
        player  = iPlayer;
        setTitle("Player Viewer");

        BorderLayout baseLayout = new BorderLayout();
        basePanel = new JPanel();
        basePanel.setLayout(baseLayout);

        playerNameLbl = new JLabel(player.getForename() + " " + player.getSurname());
        playerNameLbl.setFont(new Font(playerNameLbl.getFont().getFontName(), Font.PLAIN, 30));
        basePanel.add("North", playerNameLbl);

        GridLayout playerInfoLayout = new GridLayout(3, 1);
        infoPanel = new JPanel();
        infoPanel.setLayout(playerInfoLayout);
        playerAgeLbl = new JLabel("Age: " + player.getAge() + " years");
        playerRoleLbl = new JLabel(player.getRole());
        playerBowlStyleLbl = new JLabel(player.getBowlStyle());
        infoPanel.add(playerAgeLbl);
        infoPanel.add(playerRoleLbl);
        infoPanel.add(playerBowlStyleLbl);
        basePanel.add("West", infoPanel);

        add(basePanel);
        setSize(640, 480);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

}
