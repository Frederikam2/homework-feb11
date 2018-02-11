package com.frederikam.albumdb;

import com.frederikam.albumdb.entities.Album;
import space.npstr.sqlsauce.DatabaseConnection;
import space.npstr.sqlsauce.DatabaseWrapper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

@SuppressWarnings("WeakerAccess")
public class DbManager {

    private DatabaseConnection connection;

    DbManager(File config) throws IOException {
        Properties props = new Properties();
        props.load(new FileInputStream(config));
        connection = new DatabaseConnection.Builder("main", props.getProperty("jdbcUrl"))
                .addEntityPackage("com.frederikam.albumdb.entities")
                .setAppName("DbManager")
                .setHibernateProperty("hibernate.hbm2ddl.auto", "update")
                .build();
    }

    public List<Album> getAllAlbums() {
        DatabaseWrapper dbWrapper = new DatabaseWrapper(connection);
        return dbWrapper.selectJpqlQuery("SELECT a FROM Album a", Album.class);
    }

}
