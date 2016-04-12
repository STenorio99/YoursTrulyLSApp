/*
	- Paragraph Class for 2016 Yours Truly app
		
	Changelog:
	3/19/16	09:53	Kevin McMilian  - Create File
*/

package YT;

import java.awt.Font;
import javax.swing.JButton;

public class NavMenuButton extends JButton
{
    public NavMenuButton(String Text)
    {
        setText(Text);
        setBackground(Brand.White);
        setFont(new Font("Calibri", Font.PLAIN, 19));
        setBorder(null);
    }
}
