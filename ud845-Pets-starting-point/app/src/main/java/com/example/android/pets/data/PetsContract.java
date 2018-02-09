package com.example.android.pets.data;

import android.provider.BaseColumns;

/**
 * Created by khadijah on 1/26/2018.
 */
public class PetsContract {

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
    }
}
