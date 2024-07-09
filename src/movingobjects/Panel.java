package movingobjects;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Panel extends JPanel implements ActionListener {

    final int PANEL_WİTDH = 900;
    final int PANEL_HEİGHT = 630;
    int x = 0;
    int y = 0;
    int xVelocity = 2;
    int yVelocity = 1;
    Image bird;
    Image backgroundImage;
    Timer timer;

    public Panel() {
        this.setPreferredSize(new Dimension(PANEL_WİTDH, PANEL_HEİGHT));
        bird = new ImageIcon("C:\\Users\\omerf\\Downloads\\images (1).png").getImage();
        backgroundImage = new ImageIcon("C:\\Users\\omerf\\Downloads\\sky.png").getImage();
        timer = new Timer(10, this);
        timer.start();
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.drawImage(backgroundImage, 0, 0, null);
        g2.drawImage(bird, x, y, null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (x >= PANEL_WİTDH - bird.getWidth(null) || x < 0) {
            xVelocity = xVelocity * -1;
        }
        x = x + xVelocity;

        if (y >= PANEL_HEİGHT - bird.getHeight(null) || y < 0) {
            yVelocity = yVelocity * -1;
        }
        y = y + yVelocity;
        repaint();
    }
}
