package com.education.mosbach.classes.class09persistence;

import com.education.mosbach.structure.api.DatabaseManager;
import com.education.mosbach.structure.impl.OracleDatabaseManagerImpl;

public class DummyManagerPlay {

    public static void main(String[] args) {

        DatabaseManager databaseManager = OracleDatabaseManagerImpl.getInstance();
        databaseManager.writeToDatabase("All my data into database");
        System.out.println("Manager 1 " + databaseManager);

        // Ich bekomme die selbe Instanz, keine neue!!
        DatabaseManager databaseManager2 = OracleDatabaseManagerImpl.getInstance();
        databaseManager2.writeToDatabase("All my data into database with the same manager");
        System.out.println("Manager 2 wirklich neu? " + databaseManager2);
    }

}
