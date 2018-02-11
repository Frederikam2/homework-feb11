package com.frederikam.albumdb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;

public class Launcher {

    private static final Logger log = LoggerFactory.getLogger(Launcher.class);

    public static void main(String[] args) throws IOException {
        DbManager dbManager = new DbManager(new File("application.properties"));
        log.info("Dumping all data. Let this be our 'user interface'");
        dbManager.getAllAlbums().forEach(album -> log.info(album.toString()));
        System.exit(0);
    }

}
