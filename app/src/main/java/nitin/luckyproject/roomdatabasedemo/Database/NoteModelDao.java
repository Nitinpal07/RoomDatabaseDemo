package nitin.luckyproject.roomdatabasedemo.Database;


import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

import static androidx.room.OnConflictStrategy.REPLACE;

@Dao
public interface NoteModelDao {

    @Query("SELECT * FROM NoteModel")
    LiveData<List<NoteModel>> getAllnotes();


    //NoteModel getNoteById(String noteId);

    @Insert(onConflict = REPLACE)
    void insertnote(NoteModel notemodel);

    @Delete
    void deletenote(NoteModel noteModel);
}
