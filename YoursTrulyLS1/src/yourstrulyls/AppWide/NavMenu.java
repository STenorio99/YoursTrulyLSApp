/*
	- Menu Page for 2016 Yours Truly app
		
	Changelog:
	3/17/16     18:43       Kevin McMilian  - Create file
        3/18/16     13:44       Kevin McMilian  - Added action handlers for all buttons
        3/19/16     00:50       Kevin McMilian  - Changed the called NavService class to use the Nav.java from the YTNavigation package
*/

package yourstrulyls.AppWide;

import yourstrulyls.Parking.ParkingLocation;
import YT.*;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import yourstrulyls.AboutAndHelp.AboutThisApp;
import yourstrulyls.Shopping.ChooseRoute;

public class NavMenu extends Panel implements ActionListener
{
    private final NavMenuButton Shopping, Restaurants, Parking, History, Events, About;
    
    //call in HomePage
    HomePage Home = new HomePage();
    
    //call in About Page
    AboutThisApp AboutThisApp = new AboutThisApp();
    
    //call in Parking Page
    ParkingLocation ParkingLocation = new ParkingLocation();
    
    //call in Shopping Page
    ChooseRoute ChooseRoute = new ChooseRoute();
    
    
    
    public NavMenu()
    {
        setLayout(new GridLayout(3,2));
        
        Shopping = new NavMenuButton("Shopping");
        add(Shopping);
        Restaurants = new NavMenuButton("Restaurants");
        add(Restaurants);
        Parking = new NavMenuButton("Parking");
        add(Parking);
        History = new NavMenuButton("History");
        add(History);
        Events = new NavMenuButton("Events");
        add(Events);
        About = new NavMenuButton("About");
        add(About);
        
        Shopping.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                    Nav.GoTo(ChooseRoute);
                    Header.SetMenuActivationStatus(false);
            }
        });
        Parking.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                    Nav.GoTo(Home);
                    Header.SetMenuActivationStatus(false);
            }
        });
        Restaurants.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                    Nav.GoTo(Home);
                    Header.SetMenuActivationStatus(false);
            }
        });
        Events.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                    Nav.GoTo(Home);
                    Header.SetMenuActivationStatus(false);
            }
        });
        History.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                    Nav.GoTo(Home);
                    Header.SetMenuActivationStatus(false);
            }
        });
        About.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                    Nav.GoTo(AboutThisApp);
                    Header.SetMenuActivationStatus(false);
            }
        });
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
