package com.example.user.appadd;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by user on 06/05/2016.
 */
public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "events.db";
    public static final String TABLE_NAME = "events_table";
    public static final String COL_1= "TYPE";
    public static final String COL_4= "TITLE";
    public static final String COL_2= "DATE";
    public static final String COL_3= "TIME";


    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
        //SQLiteDatabase db= this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table"+TABLE_NAME+ "(DATE INTEGER PRIMARY KEY AUTOINCREMENT,TIME INTEGER,TYPE TEXT, TITLE TEXT,  )" );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_NAME);
        onCreate(db);
    }
}
