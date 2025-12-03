package classes;

import classes.TextStatistics;

public class TextStatisticsDemo {

    public static void main(String[] args) {
        // Create an object for calculating statistics
        TextStatistics stats = new TextStatistics();

        // Sample text
        String sampleText = "Java is an object-oriented programming language.";

        // Display statistics
        stats.displayStatistics(sampleText);
    }
}

