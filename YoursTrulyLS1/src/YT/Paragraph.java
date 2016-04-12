/*
	- Paragraph Class for 2016 Yours Truly app
		
	Changelog:
	3/19/16	09:53	Kevin McMilian  - Create File
*/

package YT;

import java.awt.Font;
import javax.swing.JTextArea;

public class Paragraph extends JTextArea
{
    public Paragraph(String Text)
    {
        setText(Text);
        setWrapStyleWord(true);
        setLineWrap(true);
        setOpaque(false);
        setEditable(false);
        setFocusable(false);
        setBackground(null);
        setFont(new Font("Calibri", Font.PLAIN, 14));
        setBorder(null);
    }
}
