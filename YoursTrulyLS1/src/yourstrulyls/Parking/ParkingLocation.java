/*
	- Test class for 2016 Yours Truly app
	- This is filler for me (Kevin) to test the application layout before collaborators start working
		
	Changelog:
	3/16/16	22:31	Kevin McMilian
*/

package yourstrulyls.Parking;


import YT.*;
import java.awt.*;
import javax.swing.JLabel;
import java.sql.*;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;

public class ParkingLocation extends Panel
{
    //declare all GUI Elements
    JLabel pSummaryL, AddressLabel, OpenStatus, FooterL, tSpacesLabel, tSpacesValue, handicapSpacesLabel, handicapSpacesValue, hOpenLabel, hOpenValue, setIcon;
    String address, open, tSpacesVal, handicapSpacesVal, hOpenVal;
    
    public ParkingLocation()
    {
        //set layout for header and define GridBag constraints
        setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        setLayout(new GridBagLayout());
        setBackground(Brand.White);
        
        GridBagConstraints ParkingC = new GridBagConstraints();
        ParkingC.fill = GridBagConstraints.BOTH;
        
        //instantiate fillers for all data
        address = "--Loading--";
        open = "--Loading--";
        tSpacesVal = "---";
        handicapSpacesVal = "---";
        hOpenVal = "---";
        
        // "- Parking Summary -" header thingy
        pSummaryL = new JLabel("- Parking Summary -", SwingConstants.CENTER);
        ParkingC.weightx = 1.0;
        ParkingC.weighty = 0;
        ParkingC.gridx = 0;
        ParkingC.gridy = 0;
        pSummaryL.setForeground(Color.gray);
        pSummaryL.setBorder(BorderFactory.createEmptyBorder(10,10,0,10));
        add(pSummaryL, ParkingC);
        
        
        //throw up the big address of the parking area
        AddressLabel = new JLabel(address, SwingConstants.CENTER);
        ParkingC.weightx = 1.0;
        ParkingC.weighty = 0;
        ParkingC.gridx = 0;
        ParkingC.gridy = 1;
        AddressLabel.setBorder(Brand.Padding10);
        AddressLabel.setFont(Brand.H1);
        add(AddressLabel, ParkingC);
        
        //open status box
        
        /*
        NOTE:  This will need to be changed later to fit with the programming
        from the database.
        */
        OpenStatus = new JLabel(open, SwingConstants.CENTER);
        ParkingC.weightx = 1.0;
        ParkingC.weighty = 0;
        ParkingC.gridx = 0;
        ParkingC.gridy = 2;
        OpenStatus.setOpaque(true);
        OpenStatus.setBackground(Brand.YTGrey);
        OpenStatus.setBorder(BorderFactory.createCompoundBorder(new MatteBorder(2, 0, 2, 0, Brand.Kiwi), Brand.Padding10));
        add(OpenStatus, ParkingC);
        
        //This is a filler for the images until the PM parking team (or anyone else)
        //can figure out images
        JLabel ImageHolder = new JLabel("{Image Goes Here}");
        ParkingC.weightx = 1.0;
        ParkingC.weighty = 0;
        ParkingC.gridx = 0;
        ParkingC.gridy = 3;
        ImageHolder.setOpaque(true);
        ImageHolder.setBackground(Brand.Marigold);
        ImageHolder.setBorder(BorderFactory.createEmptyBorder(50,0,50,0));
        add(ImageHolder, ParkingC);
        
        //Label for total # of spaces
        tSpacesLabel = new JLabel("Total Parking Spaces:", SwingConstants.CENTER);
        ParkingC.weightx = 1.0;
        ParkingC.weighty = 0;
        ParkingC.gridx = 0;
        ParkingC.gridy = 4;
        tSpacesLabel.setBorder(BorderFactory.createEmptyBorder(10,10,0,10));
        tSpacesLabel.setFont(Brand.H3);
        add(tSpacesLabel, ParkingC);
        
        //Display total # of spaces value
        tSpacesValue = new JLabel(tSpacesVal, SwingConstants.CENTER);
        ParkingC.weightx = 1.0;
        ParkingC.weighty = 0;
        ParkingC.gridx = 0;
        ParkingC.gridy = 5;
        add(tSpacesValue, ParkingC);
        
        //same for handicap spaces
        handicapSpacesLabel = new JLabel("# of Handicap Accessible Spots", SwingConstants.CENTER);
        ParkingC.weightx = 1.0;
        ParkingC.weighty = 0;
        ParkingC.gridx = 0;
        ParkingC.gridy = 6;
        handicapSpacesLabel.setBorder(BorderFactory.createEmptyBorder(10,10,0,10));
        handicapSpacesLabel.setFont(Brand.H3);
        add(handicapSpacesLabel, ParkingC);
        
        //same for handicap spaces
        handicapSpacesValue = new JLabel(handicapSpacesVal, SwingConstants.CENTER);
        ParkingC.weightx = 1.0;
        ParkingC.weighty = 0;
        ParkingC.gridx = 0;
        ParkingC.gridy = 7;
        add(handicapSpacesValue, ParkingC);
        
        //same for hours available
        hOpenLabel = new JLabel("Normal Hours Available:", SwingConstants.CENTER);
        ParkingC.weightx = 1.0;
        ParkingC.weighty = 0;
        ParkingC.gridx = 0;
        ParkingC.gridy = 8;
        hOpenLabel.setBorder(BorderFactory.createEmptyBorder(10,10,0,10));
        hOpenLabel.setFont(Brand.H3);
        add(hOpenLabel, ParkingC);
        
        //same for hours available
        hOpenValue = new JLabel(hOpenVal, SwingConstants.CENTER);
        ParkingC.weightx = 1.0;
        ParkingC.weighty = 0;
        ParkingC.gridx = 0;
        ParkingC.gridy = 9;
        add(hOpenValue, ParkingC);
        
        // Why is this here?  I don't get what this Footer is for  -Kevin
        FooterL = new JLabel(" ");
        ParkingC.weightx = 1.0;
        ParkingC.weighty = 1;
        ParkingC.gridx = 0;
        ParkingC.gridy = 11;
        add(FooterL, ParkingC);
        
        //after everything has been put up onto the screen, we want to go ahead
        //and grab our database data.
        GetDatabaseData();
        
    }
    
    public void GetDatabaseData()
    {
        //this function grabs the database data and updates the GUI elements
        
        
        
        revalidate();   //this must be here at the end of the function, 
                        //so after the database data has been gotten the GUI
                        //gets revalidated, or updated.
    }
    
}