package movingobjects;

import javax.swing.JFrame;

public class MyFrame extends JFrame {

    Panel panel;

    public MyFrame() {
        panel = new Panel();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
