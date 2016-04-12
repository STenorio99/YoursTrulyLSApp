/*
	- Navigation methods for 2016 Yours Truly app
		
	Changelog:
	3/17/16     20:30      Kevin McMilian  - Create file and set up method
*/

package YT;

import java.awt.Component;
import java.awt.Panel;
import yourstrulyls.YoursTrulyLS;

public class Nav 
{
    private static Panel LastPage;
    
    public Nav()
    {
        
    }
    
    public static void GoTo(Panel TargetView)
    {
        LastPage = (Panel) YoursTrulyLS.GetPagePanel().getComponent(0);
        YoursTrulyLS.GetPagePanel().removeAll();
        YoursTrulyLS.GetPagePanel().add(TargetView);
        YoursTrulyLS.GetPagePanel().revalidate();
    }
    
    public static void GoBack()
    {
        YoursTrulyLS.GetPagePanel().removeAll();
        YoursTrulyLS.GetPagePanel().add(LastPage);
        YoursTrulyLS.GetPagePanel().revalidate();
    }
}
