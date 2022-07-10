package com.cydeo.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    // 1. create properties object
    //  we make this private to be inaccessible from outside
    //  make static because static runs first and before everything else
    //  we will use this object under static method

    private static Properties properties= new Properties();

    // create FileInput steam object to oepn file as a stream in Java memory....
    static {
        try {
            FileInputStream file= new FileInputStream("Configuration.properties");
            properties.load(file);
            file.close();
        }catch (IOException e) {
            System.out.println("Error occured while configuration read file");
            e.printStackTrace();
        }
    }

    public static String getProperty (String key){

        return properties.getProperty(key);
    }

}
