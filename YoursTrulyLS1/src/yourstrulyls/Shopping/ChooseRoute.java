
package yourstrulyls.Shopping;

import YT.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;

public class ChooseRoute extends Panel
{
    //declare all GUI Elements
    JLabel PageTitle;
    
    NavMenuButton ByName, ByCategory, ByPrice, ListAZ;
    
    //declare navigation targets
    SearchByName SearchByName = new SearchByName();
    
    public ChooseRoute()
    {
        setLayout(new GridBagLayout());
        setBackground(Brand.White);
	GridBagConstraints c = new GridBagConstraints();
        
        c.fill = GridBagConstraints.BOTH;
        
        //Throw up header
        PageTitle = new JLabel("Find Shopping By...", SwingConstants.CENTER);
        PageTitle.setFont(Brand.H3);
        PageTitle.setBorder(Brand.PageTitleBBottom);
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
        c.gridy = 0;
        c.weightx = 1;
        add(PageTitle, c);
        
        //throw up buttons to choose how to choose restaurants
        
        /*
        Note: I reused the NavMenuButton class, since it did the same thing we want it to do here
        */
        ByName = new NavMenuButton("By Name...");
        ByName.setFont(Brand.H1);
        ByName.setBorder(BorderFactory.createCompoundBorder(new MatteBorder(1, 0, 1, 0, Color.BLACK), Brand.Padding10));
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
        c.gridy = 1;
        c.weighty = 1;
        add(ByName, c);
        
        ByCategory = new NavMenuButton("By Category...");
        ByCategory.setFont(Brand.H1);
        ByCategory.setBorder(BorderFactory.createCompoundBorder(new MatteBorder(1, 0, 1, 0, Color.BLACK), Brand.Padding10));
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
        c.gridy = 2;
        c.weighty = 1;
        add(ByCategory, c);
        
        ByPrice = new NavMenuButton("By Price...");
        ByPrice.setFont(Brand.H1);
        ByPrice.setBorder(BorderFactory.createCompoundBorder(new MatteBorder(1, 0, 1, 0, Color.BLACK), Brand.Padding10));
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
        c.gridy = 3;
        c.weighty = 1;
        add(ByPrice, c);
        
        ListAZ = new NavMenuButton("List A - Z...");
        ListAZ.setFont(Brand.H1);
        ListAZ.setBorder(BorderFactory.createCompoundBorder(new MatteBorder(1, 0, 1, 0, Color.BLACK), Brand.Padding10));
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
        c.gridy = 4;
        c.weighty = 1;
        add(ListAZ, c);
        
        //Action handlers for the buttons.  I started with ByName.
        ByName.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                    Nav.GoTo(SearchByName);
            }
        });
    }
}
