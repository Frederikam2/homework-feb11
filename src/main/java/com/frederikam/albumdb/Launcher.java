package com.frederikam.albumdb;

import java.io.File;
import java.io.IOException;

public class Launcher {

    public static void main(String[] args) throws IOException {
        new DbManager(new File("application.properties"));
    }

}
