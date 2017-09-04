/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.*;
import java.applet.*;

/**
 *
 * @author WELCOME
 */
public class BasicApplet extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    String msg;
    public void init() {
        // TODO start asynchronous download of heavy resources
        //setBackground(Color.blue);
        //setForeground(Color.red);
        msg= " Inside init()-- ";
    }
    public void start()
    {
        msg= " Inside start()-- ";
    }
    public void paint(Graphics g)
    {
        msg= " Inside paint()--";
        g.drawString(msg, 10, 30);
    }
}

