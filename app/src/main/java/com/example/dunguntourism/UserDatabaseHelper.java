package com.example.dunguntourism;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class UserDatabaseHelper extends SQLiteOpenHelper {
    public static final String DBNAME = "Tourism.db";

    public UserDatabaseHelper(@Nullable Context context) {
        super(context, DBNAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE USERS(username TEXT primary key, password TEXT, email TEXT, phone TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS USERS");
    }

    public Boolean createUser(String username, String password)
    {
        SQLiteDatabase myDB = this.getWritableDatabase();
        String email = "";
        String phone = "";
        ContentValues contentValues = new ContentValues();
        contentValues.put("username",username);
        contentValues.put("password",password);
        contentValues.put("email",email);
        contentValues.put("phone",phone);
        long result = myDB.insert("users", null, contentValues);
        if(result == -1)
        {
            return  false;
        }
        else
        {
            return true;
        }
    }

    public Boolean checkUsername(String username)
    {
        SQLiteDatabase myDB = this.getWritableDatabase();
        Cursor cursor = myDB.rawQuery("SELECT * FROM users where username = ?", new String[]{username});
        if(cursor.getCount() > 0)
        {
            return  true;
        }
        else
        {
            return false;
        }
    }

    public Boolean checkUsernamePassword(String username, String password)
    {
        SQLiteDatabase myDB = this.getWritableDatabase();
        Cursor cursor = myDB.rawQuery("SELECT * FROM users where username = ? and password = ?", new String[]{username, password});
        if(cursor.getCount() > 0)
        {
            return  true;
        }
        else
        {
            return false;
        }
    }

    public User getUserInformation(String username)
    {
        SQLiteDatabase myDB = this.getWritableDatabase();
        Cursor cursor = myDB.rawQuery("SELECT * FROM users where username = ?", new String[]{username});
        if(cursor.getCount() > 0)
        {
            cursor.moveToFirst();
        }
        User user = new User(cursor.getString(0),cursor.getString(1),cursor.getString(2),cursor.getString(3));
        return user;
    }

    public Boolean updateUser(User user)
    {
        SQLiteDatabase myDB = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("email",user.getEmail());
        contentValues.put("phone",user.getPhone());
        long result = myDB.update("users", contentValues, "username = ?",  new String[]{user.getUsername()});
        if(result == 1)
        {
            return  true;
        }
        else
        {
            return false;
        }
    }
}
