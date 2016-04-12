/*
	- About Page for 2016 Yours Truly app
		
	Changelog:
	3/19/16	00:58	Kevin McMilian  - Create File
*/

package yourstrulyls.AboutAndHelp;

import YT.*;
import java.awt.*;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

public class AboutThisApp extends Panel
{
    //declare all GUI Elements
    JLabel PageTitle, PMHeader, LPHeader, DBAHeader, PDHeader, PTHeader, DBAssistHeader, AMHeader;
    JScrollPane ScrollPane;
    JPanel PageContent;
    Paragraph SummaryParagraph, ProjectManagers, LeadProgrammers, DBAs, Designers, Programmers, DBAssists, AssistManager;
    
    public AboutThisApp()
    {
        setLayout(new GridBagLayout());
        setBackground(Brand.White);
	GridBagConstraints c = new GridBagConstraints();
        
        PageTitle = new JLabel("About This App", SwingConstants.CENTER);
        PageTitle.setFont(Brand.H1);
        PageTitle.setBorder(Brand.PageTitleBBottom);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        add(PageTitle, c);
        
        PageContent = new JPanel(new GridBagLayout());
        PageContent.setBackground(Brand.White);
        PageContent.setBorder(Brand.Padding10);
        
        SummaryParagraph = new Paragraph("The Yours Truly app was written by Summit Technology Academy's Software Development Classes as a gift to the City of Lee's Summit.  The app was completed and presented to the City in May 2016."); 
        c.fill = GridBagConstraints.HORIZONTAL;
        c.anchor = GridBagConstraints.NORTH;
        c.gridx = 0;
        c.gridy = 0;
        PageContent.add(SummaryParagraph, c);
        
        
        //Project Managers
        PMHeader = new JLabel("Project Managers:", SwingConstants.CENTER);
        PMHeader.setFont(Brand.H3);
        PMHeader.setBorder(Brand.H3Padding);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.anchor = GridBagConstraints.NORTH;
        c.gridx = 0;
        c.gridy = 1;
        PageContent.add(PMHeader, c);
        
        ProjectManagers = new Paragraph("Kevin McMilian\nJames Russell"); 
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 2;
        PageContent.add(ProjectManagers, c);
        
        //Assistant Project Manager
        AMHeader = new JLabel("Assistant Project Manager:", SwingConstants.CENTER);
        AMHeader.setFont(Brand.H3);
        AMHeader.setBorder(Brand.H3Padding);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.anchor = GridBagConstraints.NORTH;
        c.gridx = 0;
        c.gridy = 3;
        PageContent.add(AMHeader, c);
        
        AssistManager = new Paragraph("Some Guy"); 
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 4;
        PageContent.add(AssistManager, c);
        
        //Lead Programmers
        LPHeader = new JLabel("Lead Programmers:", SwingConstants.CENTER);
        LPHeader.setFont(Brand.H3);
        LPHeader.setBorder(Brand.H3Padding);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.anchor = GridBagConstraints.NORTH;
        c.gridx = 0;
        c.gridy = 5;
        PageContent.add(LPHeader, c);
        
        LeadProgrammers = new Paragraph("Someone Else\nAlyssa Kramer"); 
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 6;
        PageContent.add(LeadProgrammers, c);
        
        //DBA
        DBAHeader = new JLabel("Database Administrators:", SwingConstants.CENTER);
        DBAHeader.setFont(Brand.H3);
        DBAHeader.setBorder(Brand.H3Padding);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.anchor = GridBagConstraints.NORTH;
        c.gridx = 0;
        c.gridy = 7;
        PageContent.add(DBAHeader, c);
        
        DBAs = new Paragraph("Vale Gibson\nSomeone Else"); 
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 8;
        PageContent.add(DBAs, c);
        
        //DBAssistants
        DBAssistHeader = new JLabel("Database Assistants:", SwingConstants.CENTER);
        DBAssistHeader.setFont(Brand.H3);
        DBAssistHeader.setBorder(Brand.H3Padding);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.anchor = GridBagConstraints.NORTH;
        c.gridx = 0;
        c.gridy = 9;
        PageContent.add(DBAssistHeader, c);
        
        DBAssists = new Paragraph("Nathan Craig"); 
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 10;
        PageContent.add(DBAssists, c);
        
        //Designers
        PDHeader = new JLabel("Program Designers:", SwingConstants.CENTER);
        PDHeader.setFont(Brand.H3);
        PDHeader.setBorder(Brand.H3Padding);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.anchor = GridBagConstraints.NORTH;
        c.gridx = 0;
        c.gridy = 11;
        PageContent.add(PDHeader, c);
        
        Designers = new Paragraph("Yurari Barerro\nSomeone Else"); 
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 12;
        PageContent.add(Designers, c);
        
        //Programmers
        PTHeader = new JLabel("Programming Team:", SwingConstants.CENTER);
        PTHeader.setFont(Brand.H3);
        PTHeader.setBorder(Brand.H3Padding);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.anchor = GridBagConstraints.NORTH;
        c.gridx = 0;
        c.gridy = 13;
        PageContent.add(PTHeader, c);
        
        Programmers = new Paragraph("People\nPeople\nPeople\nPeople"); 
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 14;
        c.weighty = 1;
        PageContent.add(Programmers, c);
        
        
        
        
        
        ScrollPane = new JScrollPane(PageContent);
        ScrollPane.setBackground(Brand.White);
        ScrollPane.setBorder(null);
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
        c.gridy = 1;
        c.weightx = 1.0;
        c.weighty = 1.0;
        add(ScrollPane, c);
    }
}