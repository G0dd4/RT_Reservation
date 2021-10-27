package client.gui;
import javax.swing.*;

public class Window extends JFrame{
    private int width;
    private int heigh;

    public Window(String title,int width, int heigh){
        super(title);
        this.width = width;
        this.heigh = heigh;
        setSize(width,heigh);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
