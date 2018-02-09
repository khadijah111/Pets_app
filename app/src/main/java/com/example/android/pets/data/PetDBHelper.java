package com.example.android.pets.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by khadijah on 1/27/2018.
 *  Database helper for Pets app. Manages database creation and version management.
 */
public class PetDBHelper extends SQLiteOpenHelper {

    //IF you change the DB scheme you SHOULD increment the DB version
    /**
      * Database version. If you change the database schema, you must increment the database version.
     * */
    public static final int DATABASE_VERSION = 1;
    /** Name of the database file */
    public static final String  DATABASE_NAME = "Pets.db";

    //CONSTRUCTOR
    public PetDBHelper(Context context)
    {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    //This is called when the database is created for the first time.
    @Override
    public void onCreate(SQLiteDatabase db) {

        // Create a String that contains the SQL statement to create the pets table
             String SQL_CREATE_PETS_TABLE =  "CREATE TABLE " + PetsContract.PetsEntry.TABLE_NAME + " ("
                                + PetsContract.PetsEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                                + PetsContract.PetsEntry.COLUMN_PET_NAME + " TEXT NOT NULL, "
                                + PetsContract.PetsEntry.COLUMN_PET_BREED + " TEXT, "
                                + PetsContract.PetsEntry.COLUMN_PET_GENDER + " INTEGER NOT NULL, "
                                + PetsContract.PetsEntry.COLUMN_PET_WEIGHT + " INTEGER NOT NULL DEFAULT 0);";
        db.execSQL(SQL_CREATE_PETS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        // The database is still at version 1, so there's nothing to do be done here.
       // db.execSQL(SQL_DELETE_ENTRIES);
       // onCreate(db);
    }

}
