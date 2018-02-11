package com.frederikam.albumdb;

import space.npstr.sqlsauce.DatabaseConnection;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

@SuppressWarnings("WeakerAccess")
public class DbManager {

    private DatabaseConnection connection;

    DbManager(File config) throws IOException {
        Properties props = new Properties();
        props.load(new FileInputStream(config));
        connection = new DatabaseConnection.Builder("albumdb", props.getProperty("jdbcUrl"))
                .addEntityPackage("com.frederikam.albumdb.entities")
                .setAppName("DbManager")
                .build();
    }

}
