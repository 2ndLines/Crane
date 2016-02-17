package com.hakim.data.db;

import android.database.Cursor;

/**
 * Author    ：	Hakim Shi
 * E-Mail    :  hakim.shi@qq.com
 * CreatedAt ：	2016/1/27
 * <p/>
 * Summary   :
 */
public final class Db {
    public static final int BOOLEAN_FALSE = 0;
    public static final int BOOLEAN_TRUE = 1;

    /**
     * 获取子串
     *
     */
    public static String getString(Cursor cursor, String columnName){
        return cursor.getString(cursor.getColumnIndexOrThrow(columnName));
    }

    /**
     * 获取整型值
     *
     */
    public static int getInteger(Cursor cursor, String columnName){
        return cursor.getInt(cursor.getColumnIndexOrThrow(columnName));
    }

    /**
     * 获取长整型值
     *
     */
    public static long getLong(Cursor cursor, String columnName){
        return cursor.getLong(cursor.getColumnIndexOrThrow(columnName));
    }

    /**
     * 获取布尔结果
     *
     */
    public static boolean getBoolean(Cursor cursor , String columnName){
        return getInteger(cursor,columnName) == BOOLEAN_TRUE;
    }

    private Db(){
        throw new AssertionError("No instances");
    }
}
