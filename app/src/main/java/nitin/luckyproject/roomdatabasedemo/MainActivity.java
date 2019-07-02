package nitin.luckyproject.roomdatabasedemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;

import nitin.luckyproject.roomdatabasedemo.Database.NoteDatabase;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        NoteDatabase db = Room.databaseBuilder(getApplicationContext(),
                NoteDatabase.class, "note_db").build();
    }
}
