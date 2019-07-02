package nitin.luckyproject.roomdatabasedemo.Database;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class NoteModel {
    @PrimaryKey(autoGenerate = true)
    public int id;
    private String notetitle;
    private String noteDesc;

    public NoteModel(int id, String notetitle, String noteDesc) {
        this.id = id;
        this.notetitle = notetitle;
        this.noteDesc = noteDesc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNotetitle() {
        return notetitle;
    }

    public void setNotetitle(String notetitle) {
        this.notetitle = notetitle;
    }

    public String getNoteDesc() {
        return noteDesc;
    }

    public void setNoteDesc(String noteDesc) {
        this.noteDesc = noteDesc;
    }
}
