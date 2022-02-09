package Application;

import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame {
private int width = 1024;
private int height = 768;
private int posX=300;
private int posY=150;

    private JButton btnStart;
    private JButton btnExit;

    private JButton btnSize;
    private JButton btnWin;

    private JPanel mainToolsPanel;
    private JPanel settingsPanel;
    private Map map;

    GameWindow() {
        prepareWindow();
        prepareToolsPanel();
        prepareButtons();
        prepareSettingsPanel();
        map = new Map();

        mainToolsPanel.add(settingsPanel, BorderLayout.NORTH);
        add(mainToolsPanel, BorderLayout.EAST);

        add(map);

     /*   add(btnStart);
        add(btnExit);*/
        setVisible(true);
    }

    private void prepareWindow() {
        setSize(1024,768);
        setLocation(300, 150);
        setTitle("Application");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private void prepareToolsPanel(){
        mainToolsPanel= new JPanel();
        mainToolsPanel.setLayout(new GridLayout(2, 1));
    }
    private void prepareButtons(){
        btnStart = new JButton("Start Game");
        btnExit =new JButton("End Game");
        btnSize = new JButton("Change field size");
        btnWin =new JButton("Change win length");

    }
    private void prepareSettingsPanel(){
        settingsPanel= new JPanel();
        settingsPanel.setLayout(new GridLayout(4, 1));

        settingsPanel.add(btnStart);
        settingsPanel.add(btnExit);
        settingsPanel.add(btnSize);
        settingsPanel.add(btnWin);

    }
}
