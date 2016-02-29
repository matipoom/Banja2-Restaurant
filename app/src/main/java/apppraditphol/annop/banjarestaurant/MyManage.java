package apppraditphol.annop.banjarestaurant;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by annop_p on 29-Feb-16.
 */
public class MyManage {

    //Explicit
    private MyOpenHelper mymyOpenHelper;
    private SQLiteDatabase writeSqLiteDatabase, readSqLiteDatabase;

    public MyManage(Context context) {

        //Create Database
        mymyOpenHelper = new MyOpenHelper(context);
        writeSqLiteDatabase = mymyOpenHelper.getWritableDatabase();
        readSqLiteDatabase = mymyOpenHelper.getReadableDatabase();

    }   //Constructor

}   //Main Class
