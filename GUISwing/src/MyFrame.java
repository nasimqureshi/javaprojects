import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame(){

        this.setTitle("This is my first Java frame");
        this.setSize(600, 600);
        this.setVisible(true);
        this.getContentPane().setBackground(new Color(123, 50, 230));
    }
}
