package com.techproed.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {
    // Bu classi  her yerinden nesne uretmeden, miras almadan kullanabilecek sekilde tasarlayalim
    static Properties properties;

    static{
        try {
            FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "/configuration.properties");
            properties = new Properties();
            properties.load(file);
        } catch (Exception e){
            System.out.println("Something went wrong");
        }
    }

    public static String getProperty(String key){
        return properties.getProperty(key);
    }


}
