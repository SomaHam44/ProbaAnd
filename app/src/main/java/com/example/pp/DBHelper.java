package com.example.pp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {
    private static final String DB_NAME = "pirulapolc.db";
    private static final int version = 1;
    public DBHelper(Context context) {
        super(context, DB_NAME, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String Create_Profil_Table = "CREATE TABLE IF NOT EXISTS Profil(" +
                "profilID INTEGER NOT NULL UNIQUE," +
                "nev TEXT," +
                "szuldatum TEXT," +
                "TAJ INTEGER," +
                "PRIMARY KEY(profilID AUTOINCREMENT));";
        String Create_Gyogyszerek_Table = "CREATE TABLE IF NOT EXISTS Gyogyszerek (" +
                "gyogyszerID INTEGER NOT NULL," +
                "gyogyszerNev TEXT," +
                "lejarat TEXT," +
                "keszlet INTEGER," +
                "utolsomod TEXT," +
                "PRIMARY KEY(gyogyszerID AUTOINCREMENT)" +
                ");";

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}

