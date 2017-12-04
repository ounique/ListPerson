package main;
import main.comparators.PersonComparator;
import main.sort.PersonSort;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configurator {

    public static final String PATH_TO_PROPERTIES = "src/main/resources/config.properties";

    public static PersonComparator getComparator() throws IOException {
        FileInputStream fileInputStream;
        Properties properties = new Properties();

        fileInputStream = new FileInputStream(PATH_TO_PROPERTIES);
        properties.load(fileInputStream);
        String sorter = properties.getProperty("sort");
        return null;
    }
    public static PersonSort getSorter(){
        return null;
    }
}