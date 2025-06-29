package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingApp{

    //create logger for this class

    private static final Logger logger = LoggerFactory.getLogger(LoggingApp.class);

    public static void main(String[] args){
        System.out.println("Starting application");

        //logging a warning
        logger.warn("This is a warning.");

        //logging an error
        logger.error("This is an error with details : {}","File not found");

        System.out.println("Application finished.");
    }
}
