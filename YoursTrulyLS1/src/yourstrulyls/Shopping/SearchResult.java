
package yourstrulyls.Shopping;

import YT.Brand;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.border.MatteBorder;

// THIS CLASS IS NOT FINISHED:  IT IS A WORK IN PROGRESS  -Kevin

public class SearchResult extends JPanel
{
    JLabel BusinessNameLabel;
    
    String BusinessName;
    
    public SearchResult()
    {
        setBorder(BorderFactory.createCompoundBorder(new MatteBorder(1, 0, 1, 0, Brand.YTGrey), Brand.Padding10));
        setBackground(Brand.White);
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        
        JLabel ImageHolder = new JLabel("{Image Goes Here}");
        c.weightx = 0.5;
        c.weighty = 1;
        c.gridx = 0;
        c.gridy = 0;
        ImageHolder.setOpaque(true);
        ImageHolder.setBackground(Brand.Marigold);
        ImageHolder.setBorder(BorderFactory.createEmptyBorder(25,30,25,30));
        add(ImageHolder, c);
        
        BusinessNameLabel = new JLabel("Business Name Here");
        c.weightx = 1;
        c.weighty = 1;
        c.gridx = 1;
        c.gridy = 0;
        add(BusinessNameLabel, c);
    }
}
