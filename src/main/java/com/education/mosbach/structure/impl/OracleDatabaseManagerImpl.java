package com.education.mosbach.structure.impl;

import com.education.mosbach.structure.api.DatabaseManager;

public class OracleDatabaseManagerImpl implements DatabaseManager {

    final static DatabaseManager databaseManager = new OracleDatabaseManagerImpl();

    private OracleDatabaseManagerImpl() {}

    public static DatabaseManager getInstance() {
        return
                databaseManager;
    }

    @Override
    public boolean writeToDatabase(String data) {
        // Hier schreibt der Manager in die Datenbank und steuert
        // das alles.
        return false;
    }
}
