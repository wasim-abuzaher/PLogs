package com.wasimapps.plogs;

import android.net.Uri;
import android.provider.BaseColumns;

/**
 * Created by wasim on 2015-12-04.
 */
public class NotesContract {
    interface NotesColumns {
        String NOTES_ID = "ID";
        String NOTES_TITLE = "notes_title";
        String NOTES_DESCRIPTION = "notes_description";
        String NOTES_DATE = "notes_date";
        String NOTES_TIME = "notes_time";
        String NOTES_IMAGE = "notes_image";
        String NOTES_TYPE = "notes_type";
        String NOTES_IMAGE_STORAGE_SELECTION = "notes_image_store_selection";
    }

    public static final String CONTENT_AUTHORITY = "com.wasimapps.plogs.provider";
    public static final Uri BASE_CONTENT_URI = Uri.parse("content://");
    private static final String PATH_NOTES = "notes";
    public static final Uri URI_TABLE = BASE_CONTENT_URI.buildUpon().appendEncodedPath(PATH_NOTES).build();

    public static class Notes implements NotesColumns, BaseColumns {
        public static final String CONTENT_TYPE = "nd.android.cursor.dir/vnd." + CONTENT_AUTHORITY + ".notes";
        public static final String CONTENT_ITEM_TYPE = "nd.android.cursor.item/vnd." + CONTENT_AUTHORITY + ".notes";

        public static Uri buildNotesUri(String noteId) {
            return BASE_CONTENT_URI.buildUpon().appendEncodedPath(noteId).build();
        }

        public static String getNoteId(Uri uri) {

            return uri.getPathSegments().get(1);
        }




    }
}
