package com.frederikam.albumdb;

import java.io.File;

public class Launcher {

    public static void main(String[] args) {
        new DbManager(new File("application.properties"));
    }

}
