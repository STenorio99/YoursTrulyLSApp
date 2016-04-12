/*
	- Test class for 2016 Yours Truly app
	- This is filler for me (Kevin) to test the application layout before collaborators start working
		
	Changelog:
	3/16/16	22:31	Kevin McMilian
        3/17/16 21:00   Kevin McMilian  - Refactored to "HomePage.java"
*/

package yourstrulyls.AppWide;


import java.awt.*;
import javax.swing.JLabel;

import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.swing.BrowserView;
import javax.swing.JPanel;


public class HomePage extends Panel
{
    //declare all GUI Elements
    JLabel Text;
    final Browser browser = new Browser();
    BrowserView browserView = new BrowserView(browser);
    
    public HomePage()
    {       
       JPanel map = new JPanel();
        map.setLayout(new BorderLayout());
        map.add(browserView, BorderLayout.CENTER);

        
       browser.loadURL("C:\\Users\\stenorio0619\\Documents\\NetBeansProjects\\YoursTrulyLS1\\src\\yourstrulyls\\Maps.html");
    }
}
