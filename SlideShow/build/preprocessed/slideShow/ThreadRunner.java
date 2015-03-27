/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slideShow;

import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Form;

/**
 *
 * @author Naman
 */
class ThreadRunner implements Runnable {
   Display display;
public int c=0;
public Form slide1;
public Form slide2;
public Form slide3;

    public ThreadRunner(Display display, Form slide1, Form slide2, Form slide3) {
         this.display = display;
    this.slide1=slide1;
    this.slide2=slide2;
    this.slide3=slide3;
    }

    public void run() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        while(true)
    {
           // int c = 0;
        c++;
        if(c==1)
        display.setCurrent(slide1);
        else if(c==2)
        display.setCurrent(slide2); 
        else if(c==3)
        display.setCurrent(slide3);
        else if(c==4)
        c=0;
        try
        {
            Thread.sleep(1500);
        }
        catch(Exception ex)
        {

        }
    }
    
    }
    
}
