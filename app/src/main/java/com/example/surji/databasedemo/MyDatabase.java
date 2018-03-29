package com.example.surji.databasedemo;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by USER on 22-Mar-18.
 */

public class MyDatabase extends SQLiteOpenHelper{

        private static final int dbv =1;
        private static final String dbname = "mydb";

    Context ct;
    MyDatabase(Context c)
    {
        super(c,dbname,null,dbv);
        ct =c;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase)
    {
        Toast.makeText(ct,"IN Oncreate", Toast.LENGTH_SHORT).show();

        String s = "create table info (name text, mob integer, email text)";

        sqLiteDatabase.execSQL(s);

    }

    public void insertValues(String s1, long l, String s2)
    {
           SQLiteDatabase db = getWritableDatabase();

           ContentValues cv = new ContentValues();

           cv.put("name", s1);
           cv.put("mob",l);
           cv.put("email", s2);

           db.insert("info",null, cv);

        Toast.makeText(ct,"Insert Completed", Toast.LENGTH_SHORT).show();
    }


    public ArrayList<String> showValues()
    {
        Toast.makeText(ct,"Inside show values", Toast.LENGTH_SHORT).show();
        SQLiteDatabase db = getReadableDatabase();
        String s = "select * from info";
        Cursor cr = db.rawQuery(s, null);
        ArrayList<String > al = new ArrayList<>();

        while (cr.moveToNext())
        {
            String s1 =cr.getString(0);
            long l = cr.getLong(1);
            String s2 = cr.getString(2);

            String s3 = "Name is: "+ s1 + "\nMobile No. is: "+ l + "\nEmail is: "+ s2;
            al.add(s3);
            Log.d("Databse1", s1 + " "+ l + " "+ s2);
        }
        return al;
    }

    public void doDelete(String s)
    {
       SQLiteDatabase db = getWritableDatabase();

        String where = "name = ?";

        String [] ss = {s};
       db.delete("info",where,ss);

        Toast.makeText(ct,"Deletion Completed", Toast.LENGTH_SHORT).show();

    }

    public void doUpdate(String s1, long l, String s2)
    {
       SQLiteDatabase db = getWritableDatabase();
       ContentValues cv = new ContentValues();

       cv.put("mob",l);
       cv.put("email",s2);
       String where = "name = ?";

       String [] ss = {s1};

       db.update("info",cv,where,ss);

        Toast.makeText(ct,"Updation Completed", Toast.LENGTH_SHORT).show();
    }


    public ArrayList<String> searchName(String name)
    {
       // Toast.makeText(ct,"Inside search Name", Toast.LENGTH_SHORT).show();
        SQLiteDatabase db = getReadableDatabase();

        String s = "select * from info where name = ? ";

        String [] ss = {name};

        Cursor cr = db.rawQuery(s, ss);
        ArrayList<String > al = new ArrayList<>();

        while (cr.moveToNext())
        {
            String s1 =cr.getString(0);
            long l = cr.getLong(1);
            String s2 = cr.getString(2);

            String s3 = "Name is: "+ s1 + "\nMobile No. is: "+ l + "\nEmail is: "+ s2;
            al.add(s3);
           // Log.d("Databse1", s1 + " "+ l + " "+ s2);
        }
        return al;

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
