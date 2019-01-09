import java.io.IOException;
import java.io.InputStream;
import java.util.PropertyResourceBundle;


public class ProgramProperties extends PropertyResourceBundle {

  public ProgramProperties() throws IOException {
   super(ProgramProperties.class.getResourceAsStream("ProgramProperties.txt"));
  }
}
