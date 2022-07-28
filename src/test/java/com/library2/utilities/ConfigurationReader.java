package com.library2.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    //1. create properties object
    // make this private to be inaccessible from outside
    // make this static, bcs static runs first and before everything else, and will use the object under static method
    private static Properties properties = new Properties();

    //2.
    //use static block its run first
    static {

        try {
            String path = "configuration.properties";
            //Create FileInputStream object to open file as a stream in Java memory.
            FileInputStream input = new FileInputStream( path );

            //Load properties object with the file we opened using FileInputStream
            properties.load(input);

            input.close();

        } catch (IOException e) {
            System.out.println("Error occurred while reading configuration file");
            e.printStackTrace();
        }

    }

    //3.
    public static String getProperty(String keyName){
        return properties.getProperty(keyName);
    }


}
