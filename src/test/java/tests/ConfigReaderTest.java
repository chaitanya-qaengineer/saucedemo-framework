package tests;

import utils.ConfigReader;

public class ConfigReaderTest {

	public static void main(String[] args) {
		ConfigReader.initProperties();

        System.out.println(ConfigReader.getBrowser());
        System.out.println(ConfigReader.getUrl());
        System.out.println(ConfigReader.getUsername());
        System.out.println(ConfigReader.getPassword());

	}

}
