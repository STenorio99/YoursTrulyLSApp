/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yourstrulyls;

/**
 *
 * @author stenorio0619
 */

import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.swing.BrowserView;
 
import javax.swing.*;
import java.awt.*;
 
 
public class GmapsTest {
    
   public static void main(String[] args) {
       final Browser browser = new Browser();
       BrowserView browserView = new BrowserView(browser);
       JFrame frame = new JFrame("Maps.html");
       frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       frame.add(browserView, BorderLayout.CENTER);
       frame.setSize(900, 600);
       frame.setLocationRelativeTo(null);
       frame.setVisible(true);
               
 
       browser.loadURL("C:\\Users\\stenorio0619\\Documents\\NetBeansProjects\\YoursTrulyLS1\\src\\yourstrulyls\\Maps.html");
   }
}
    

