package com.example.android.pets.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.provider.BaseColumns;

/**
 * Created by khadijah on 1/26/2018.
 */
public class PetsContract {

    //CONTENT_AUTHORITY
    public static final String CONTENT_AUTHORITY = "com.example.android.pets";

    //BASE_CONTENT_URI
    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);

    //PATH_TableName
    //This constants stores the path for each of the tables which will be appended to the base content URI.
    public static final String PATH_PETS = "pets";

    public static final class PetsEntry implements BaseColumns{

        public final static String TABLE_NAME = "pets";

        public final static String _ID = BaseColumns._ID;
        public final static String COLUMN_PET_NAME = "name";//STRING
        public final static String COLUMN_PET_BREED = "preed";//STRING
        public final static String COLUMN_PET_GENDER = "gender";//INTEGER
        public final static String COLUMN_PET_WEIGHT = "weight";//INTEGER

        public final static int GENDER_UNKNOWN = 0;
        public final static int GENDER_MALE = 1;
        public final static int GENDER_FEMALE = 2;

        //Complete CONTENT_URI
        public static final Uri CONTENT_URI = Uri.withAppendedPath(BASE_CONTENT_URI, PATH_PETS);

        /**
         * The MIME type of the {@link #CONTENT_URI} for a list of pets.
         * CURSOR_DIR_BASE_TYPE (which maps to the constant "vnd.android.cursor.dir"
         */
        public static final String CONTENT_LIST_TYPE =
                ContentResolver.CURSOR_DIR_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_PETS;

        /**
         * The MIME type of the {@link #CONTENT_URI} for a single pet.
         * CURSOR_ITEM_BASE_TYPE (which maps to the constant “vnd.android.cursor.item”)
         */
        public static final String CONTENT_ITEM_TYPE =
                ContentResolver.CURSOR_ITEM_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_PETS;

        /**
         * Returns whether or not the given gender is {@link #GENDER_UNKNOWN}, {@link #GENDER_MALE},
         * or {@link #GENDER_FEMALE}.
         */
        public static boolean isValidGender(int gender) {
            if (gender == GENDER_UNKNOWN || gender == GENDER_MALE || gender == GENDER_FEMALE) {
                return true;
            }
            return false;
        }
    }
}
