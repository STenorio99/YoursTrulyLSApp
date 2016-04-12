/*
	- Branding definitions for 2016 Yours Truly app
		
	Changelog:
	3/17/16     18:43       Kevin McMilian  - Create file and set up the branding colors
        3/19/16     09:43       Kevin McMilian  - Add Some Text features
*/

package YT;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.border.MatteBorder;

public class Brand {
    public static Color Sapphire = new Color(0,91,130);
    public static Color Olive = new Color(91,86,23);
    public static Color Almond = new Color(176,111,0);
    public static Color Ocean = new Color(0,185,228);
    public static Color Kiwi = new Color(168,180,0);
    public static Color Marigold = new Color(255,180,0);
    public static Color YTGrey = new Color(217,217,217);
    public static Color Black = new Color(0,0,0);
    public static Color White = new Color(255,255,255);
    
    public static Font H1 = new Font("Calibri",Font.BOLD,28);
    public static Font H3 = new Font("Calibri",Font.BOLD,18);
    public static Border H3Padding = BorderFactory.createEmptyBorder(20,0,8,0);
    public static Border Padding10 = BorderFactory.createEmptyBorder(10,10,10,10);
    public static Border PageTitleBBottom = new MatteBorder(0, 0, 8, 0, Ocean);
}
