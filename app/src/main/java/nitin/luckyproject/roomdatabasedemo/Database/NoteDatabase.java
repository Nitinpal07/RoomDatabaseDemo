package nitin.luckyproject.roomdatabasedemo.Database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {NoteModel.class},version = 1)
public abstract class NoteDatabase extends RoomDatabase {

    private static  NoteDatabase INSNTACE;
    public abstract NoteModelDao noteItemAndNotesModel();

    public static NoteDatabase getDatabase(Context context){
        if(INSNTACE ==null)
        {
            INSNTACE= Room.databaseBuilder(context.getApplicationContext(),NoteDatabase.class,"notes_db")
            .build();
        }
        return INSNTACE;
    }

    public static void destroyInstance(){
        INSNTACE=null;
    }


}
