package movingobjects;

import java.awt.Image;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Panel extends JPanel {

    final int PANEL_WİTDH = 900;
    final int PANEL_HEİGHT = 630;
    int x = 0;
    int y = 0;
    int xVelocity = 2;
    int yVelocity = 1;
    Image bird;
    Image backgroundImage;
    Timer timer;
}
