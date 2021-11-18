package com.nomisma.generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;
import org.openqa.selenium.server.ClassPathResource;
import org.testng.Reporter;

/**
 * The Class CommonUtilities.
 */
public class CommonUtilities {

	/*
	 * Test Constants
	 */
	private static String WORK_DIR;

	public static Logger log;

	/*
	 * public CommonUtilities() {
	 * 
	 * readPropertiesFromTestEnviromentFiles(); }
	 */
	public Logger getLog() {
		return log;
	}

	public void setLog(Logger lg) {
		log = lg;
	}

	/**
	 * Read properties from test environment files.
	 */

	public void readPropertiesFromTestEnviromentFiles() {

		try {

			File testEnvironmentFile = new File(
					this.getClass().getClassLoader().getResource("TestEnvironment.properties").toURI());
			FileInputStream input = new FileInputStream(testEnvironmentFile);

			Properties prop = new Properties();
			prop.load(input);

			WORK_DIR = prop.getProperty("WORK_DIR");

			input.close();

		} catch (URISyntaxException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Gets the Test Data input values from json.
	 *
	 * @param absolutePathToJsonFile the absolute path to json file
	 * @param testCaseId             the test case id
	 * @return the key value from json
	 */
	public HashMap<String, String> getKeyValueFromJson(String absolutePathToJsonFile, String testCaseId) {

		HashMap<String, String> testDataMap = new HashMap();

		ObjectMapper mapper = new ObjectMapper();

		try {

			 
			File jsonInputFile = new File(getClass().getClassLoader().getResource(absolutePathToJsonFile).toURI());
			JsonNode rootNode = mapper.readTree(jsonInputFile);

			for (JsonNode root : rootNode) {

				String testId = root.path("TestCaseId").asText();

				if (testId.equals(testCaseId)) {
					JsonNode keyNode = root.path("Keys");

					if (keyNode.isArray()) {

						for (JsonNode node : keyNode) {
							Iterator<Entry<String, JsonNode>> itr = node.getFields();

							while (itr.hasNext()) {
								String[] field = itr.next().toString().split("=");
								String name = field[0];
								String value = field[1];
								testDataMap.put(name, value);
							}
						}
					}
				}
			}

		} catch (Exception e) {

			System.out.println(e.getMessage());

		}
		return testDataMap;
	}

	public static Logger getLogger(String methodName) {

		Logger log = Logger.getLogger(methodName);

		// creates pattern layout
		PatternLayout layout = new PatternLayout();
		String conversionPattern = "%-7p %d [%t] %c %x - %m%n";
		layout.setConversionPattern(conversionPattern);

		// creates console appender
		ConsoleAppender consoleAppender = new ConsoleAppender();
		consoleAppender.setLayout(layout);
		consoleAppender.activateOptions();

		// creates file appender
		FileAppender fileAppender = new FileAppender();
		String logDirectory = WORK_DIR + "/" + methodName;

		createDirectory(logDirectory);

		fileAppender.setFile(logDirectory + "//" + methodName + "_sel.log");
		fileAppender.setLayout(layout);
		fileAppender.activateOptions();

		log.addAppender(fileAppender);

		return log;
	}

	public static void createDirectory(String directory) {
		File file = new File(directory);
		
		try {
			FileUtils.deleteDirectory(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (!file.exists()) {

			if (file.mkdir()) {
				System.out.println("Directory is created!");
			} 
			else {
				System.out.println("Failed to create directory!");
			}
			
		}

	}

	public File getFileFromResources(String fileName) {

		ClassLoader classLoader = getClass().getClassLoader();

		URL resource = classLoader.getResource(fileName);
		if (resource == null) {
			throw new IllegalArgumentException("file is not found!");
		} else {
			return new File(resource.getFile());
		}

	}
	
}