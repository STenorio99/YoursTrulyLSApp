/*
	- Header class for 2016 Yours Truly app
	- This header will be shown on all screens of the app, except the
		home screen.
		
	Changelog:
	3/9/16      21:11	Kevin McMilian  - Created file, set up layout
	3/17/16     18:36	Kevin McMilian	- Add connection to YTLSBrand class (contains all app branding information)
        3/17/16     21:36       Kevin McMilian  - Added functionality to open/close menu
        3/18/16     13:43       Kevin McMilian  - Add functionality to alter MenuActivationStatus from another class
        3/19/16     00:50       Kevin McMilian  - Changed the called NavService class to use the Nav.java from the YTNavigation package

*/

package yourstrulyls.AppWide;

import YT.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import yourstrulyls.YoursTrulyLS;

public class Header extends Panel implements ActionListener
{
    //initialize menu activation status
    private static boolean MenuActivationStatus = false;
    
    //declare all GUI Elements
    JButton HeaderMenuDropButton;
    JLabel HeaderYoursTrulyText; 
    
    //call in NavMenu
    NavMenu MenuPage = new NavMenu();
    
    //call in HomePage
    HomePage Home = new HomePage();
    
    public Header()
    {        
        //set layout for header and define GridBag constraints
        setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        setLayout(new GridBagLayout());
        GridBagConstraints Headerc = new GridBagConstraints();
        Headerc.fill = GridBagConstraints.HORIZONTAL;
        
        //create MenuDropButton and add to header
        HeaderMenuDropButton = new JButton("@");
        Headerc.weightx = 0.1;
        HeaderMenuDropButton.setBackground(Brand.YTGrey);
        HeaderMenuDropButton.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        add(HeaderMenuDropButton, Headerc);
        
        //create "Yours Truly" text
        HeaderYoursTrulyText = new JLabel("Yours Truly");
        Headerc.weightx = 1.0;
        HeaderYoursTrulyText.setOpaque(true);
        HeaderYoursTrulyText.setBackground(Brand.White);
        HeaderYoursTrulyText.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        add(HeaderYoursTrulyText, Headerc);
        
        
        HeaderMenuDropButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (MenuActivationStatus == false)
                {
                    Nav.GoTo(MenuPage);
                    MenuActivationStatus = true;
                }
                else
                {
                    Nav.GoBack();
                    MenuActivationStatus = false; 
                }
            }
        });
    }
    
    public static void SetMenuActivationStatus(boolean TargetStatus)
    {
        MenuActivationStatus = TargetStatus;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


