/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slideShow;

import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.midlet.*;

/**
 * @author Naman
 */
public class SlidesMidlet extends MIDlet implements CommandListener{
    
    
    //this is midlet which we had created manually
    public Form slide1;
    public Form slide2;
    public Form slide3;
    public Command Exit;
    public Display display;
    
    public SlidesMidlet()
            
{
    display=Display.getDisplay(this);
    Exit=new Command("Exit",Command.EXIT,1);
    
    
    slide1=new Form("Slide1");
    slide1.append("This is Slide number 1");
    slide1.addCommand(Exit);
    
    slide2=new Form("Slide2");
    slide2.append("This is Slide number 2");
    slide2.addCommand(Exit);
    
    slide3=new Form("Slide3");
    slide3.append("This is Slide number 3");
    slide3.addCommand(Exit);
    
    slide1.setCommandListener(this);
    slide2.setCommandListener(this);
    slide3.setCommandListener(this);
}

    public void startApp() {
        
        Thread runner = new Thread(new ThreadRunner(display,slide1,slide2,slide3));
        runner.start();
    }
    
    public void pauseApp() {
    }
    
    public void destroyApp(boolean unconditional) {
    }
    public void commandAction(Command command,Displayable displayable)
    {
        if(displayable==slide1)
        {
            if(command==Exit)
            notifyDestroyed();  
        }
        else if(displayable==slide2)
        {
            if(command==Exit)
            notifyDestroyed();
        }
        else if(displayable==slide3)
        {
            if(command==Exit)
            notifyDestroyed();
        }
    }
}

