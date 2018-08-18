import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Util {

	private static final String propertyFile="C:\\Users\\srini\\noorjahan\\Projects\\config.properties";
	/**this method will get us property value by it property name/key
	 * 
	 * @param key
	 * @return
	 */
	public static String getMyProperty(String key) {
		String propertyValue=null;
		Properties prop = new Properties();

		try(InputStream input = new FileInputStream(propertyFile)) {
			// load a properties file
			prop.load(input);
			propertyValue=prop.getProperty(key);

		} catch (IOException ex) {
			ex.printStackTrace();
		} 
		return propertyValue;

	}
	public static String[] getMyPropertyArray(String propertyName) {
		String propertyValue[]=null;
		Properties prop = new Properties();

		try(InputStream input = new FileInputStream(propertyFile)) {
			// load a properties file
			prop.load(input);
			propertyValue=prop.getProperty(propertyName).split(",");

		} catch (IOException ex) {
			ex.printStackTrace();
		} 
		return propertyValue;

	}
}
