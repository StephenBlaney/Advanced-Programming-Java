package Resource;
import java.util.ListResourceBundle;
//German language resource bundle
public class ProgramResource_fr extends ListResourceBundle {

	private Object[][] contents = {{"One","Un"},{"Two","Deux"},{"Three","Trois"}};

	public Object[][] getContents(){
		return contents;
		
		
	}
}