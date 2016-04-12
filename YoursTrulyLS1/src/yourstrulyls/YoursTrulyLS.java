/*
    - Application class for 2016 Yours Truly app
    - This is the actual application itself.

    Changelog:
    3/16/16	22:45	Kevin McMilian  - Create file + set up basic layout/design
    3/17/16     19:47   Kevin McMilian  - Create a Panel in which pages can be navigated to/from
    3/17/16     21:40   Kevin McMilian  - Change access level on Panel Page and add an access function for Page
*/
package yourstrulyls;

import yourstrulyls.AppWide.HomePage;
import yourstrulyls.AppWide.Header;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class YoursTrulyLS extends JFrame
{
    JPanel Screen;
    Panel Header;
    public static Panel Page;
    
    public YoursTrulyLS()
    {
        //set layout for header and define GridBag constraints
        Screen = new JPanel();
        Screen.setLayout(new GridBagLayout());
	GridBagConstraints c = new GridBagConstraints();

        
        //Instantiate Header and add to GUI
        Header = new Header();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        Screen.add(Header, c);
        
        Page = new Panel(new GridLayout(1,1));
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
        c.gridy = 1;
        c.weightx = 1.0;
        c.weighty = 1.0;
        
        //Your panel will go here for testing-- just replace "TestPage" with your class name.
        Panel HomePage = new HomePage();
        Page.add(HomePage);      
        // ----------------------------------
        Screen.add(Page, c);
        
        add(Screen);
    }
    
    public static Panel GetPagePanel()
    {
        return Page;
    }
}
