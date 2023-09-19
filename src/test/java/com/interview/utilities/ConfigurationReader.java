package com.interview.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties properties = new Properties();
    static{
        try {
            //open file using FileInputStream
            FileInputStream file= new FileInputStream("configuration.properties");
            //load the properties object with file
            properties.load(file);
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("FILE NOT FOUND WITH GIVEN Path");
        }

    }

    //create a utility method to use the object to read
    //user properties object to read from the file
    public static String getProperty(String keyword){

        return properties.getProperty(keyword);
    }


}
