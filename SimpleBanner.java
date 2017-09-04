/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.*;
import java.applet.*;
/*
<applet code="SimpleBanner" width=300 height=100>
</applet>
*/
/**
 *
 * @author WELCOME
 */
public class SimpleBanner extends Applet implements Runnable{

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    String msg;
    Thread t=null;
    int state;
    boolean flag;
    
    public void init() {
        // TODO start asynchronous download of heavy resources
        msg= " Inside init() --";
    }

    // TODO overwrite start(), stop() and destroy() methods
    public void start()
    {
        t= new Thread(this);
        flag=false;
        t.start();
    }
    public void run()
    {
        char ch;
        
        for( ; ; )
        {
            try{
                repaint();
                Thread.sleep(400);
                ch=msg.charAt(0);
                msg=msg.substring(1, msg.length());
                msg += ch;
                if(flag)
                    break;
            }
            catch(InterruptedException e)
            {
                System.out.println("Interrupt");
            }
        }
    }
    
    public void stop()
    {
        flag=true;
        t=null;
    }
    public void paint(Graphics h)
    {
        h.drawString("Applet Window is showing", 100, 200);
        showStatus("Status Window");
    }
}
