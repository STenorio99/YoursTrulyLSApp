
package yourstrulyls.Shopping;

import YT.*;
import java.awt.*;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;

public class SearchByName extends Panel
{
    //declare all GUI Elements
    JLabel PageTitle;
    JScrollPane ScrollPane;
    JPanel PageContent;
    
    JTextField SearchBox;
    
    public SearchByName()
    {
        //set page layout & background
        setLayout(new GridBagLayout());
        setBackground(Brand.White);
	GridBagConstraints c = new GridBagConstraints();
        
        //throw up the header
        PageTitle = new JLabel("Search Shopping by Name", SwingConstants.CENTER);
        PageTitle.setFont(Brand.H3);
        PageTitle.setBorder(Brand.PageTitleBBottom);
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
        c.gridy = 0;
        c.weightx = 1;
        add(PageTitle, c);
        
        //throw up the search box
        SearchBox = new JTextField("Search");
        SearchBox.setBorder(BorderFactory.createCompoundBorder(new MatteBorder(1, 1, 1, 1, Brand.YTGrey), Brand.Padding10));
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 1;
        add(SearchBox, c);
        /*
            Note:  There will need to be programming in place to get rid of the 
            placeholder "Search" text as soon as the textfield gains focus.
        
            Also, we want it to be so that any time a letter is typed, the app 
            runs the SQL query to search for it-- that way it is live-- that also
            means we mitigate the need for an Enter button.
        */
        
        PageContent = new JPanel(new GridBagLayout());
        PageContent.setBackground(Brand.White);
        
        //This for loop is simply for GUI demonstration purposes.  The real 
        //implementation will have a foreach(){} loop that checks the DB query
        for (int i = 0; i <5;i++)
        {
          SearchResult SearchResult = new SearchResult();
            c.fill = GridBagConstraints.HORIZONTAL;
            c.gridx = 0;
            c.gridy = i;
            PageContent.add(SearchResult, c);  
        }
        
        //Scroll Pane for the search results-- the header and the search box stay stationary
        ScrollPane = new JScrollPane(PageContent);
        ScrollPane.setBackground(Brand.White);
        ScrollPane.setBorder(null);
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
        c.gridy = 2;
        c.weightx = 1.0;
        c.weighty = 1.0;
        add(ScrollPane, c);
    }
}
