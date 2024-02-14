package utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigProperties 
{
	Properties pro;
	public ConfigProperties() throws Exception
	{
		File source=new File("/Test/Configuration/config.properties");
		FileInputStream fis=new FileInputStream(source);
		pro=new Properties();
		pro.load(fis);
	}

	public String getBrowser()
	{
		return pro.getProperty("Browser");
	}
	public String getURL()
	{
		return pro.getProperty("URL");
	}
}