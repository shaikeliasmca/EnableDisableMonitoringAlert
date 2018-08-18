import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Date;

import org.apache.log4j.Logger;

public class EnableDisableMonitoring {
	public static Logger log = Logger.getLogger(EnableDisableMonitoring.class.getName());

	public static void main(String[] args) {
		log.info("EnableDisableMonitoring started"+new Date());

		try {
			if(Util.getMyProperty("enableDisableMonitoring").equals("disable")) {
				copyFiles();
			}else {
				deleteFiles();
			}
		}catch(Exception e) {
			log.error(e);
		}

		log.info("EnableDisableMonitoring  ended"+new Date());

	}


	private static void copyFiles() throws IOException
	{
		String sources[] = Util.getMyPropertyArray("source");
		String destination[] = Util.getMyPropertyArray("destination");
		if(sources.length==destination.length) {
			for(int i=0;i<sources.length;i++) {
				String path=sources[i];
				System.out.println(path);
				log.info(path);
				Path sourcePath=Paths.get(sources[i].trim());
				Path destinationPath=Paths.get(destination[i].trim());
				Files.copy(sourcePath, destinationPath, StandardCopyOption.REPLACE_EXISTING);

				log.info("Files copied successfully!!!");
			}
		}else {
			System.out.println("source and destination files are not equal.");
			log.error("source and destination files are not equal.");
		}
	}

	private static void deleteFiles() throws IOException
	{
		String destinations[] = Util.getMyProperty("destination").split(",");
		for(String destination:destinations) {
			System.out.println(destination);
			log.info(destination);
			Path destinationPath=Paths.get(destination.trim());
			Files.deleteIfExists(destinationPath);

			System.out.println("Files deleted successfully!!!");
		}
	}

}


