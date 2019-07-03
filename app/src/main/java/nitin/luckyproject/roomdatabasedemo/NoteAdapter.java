package nitin.luckyproject.roomdatabasedemo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import nitin.luckyproject.roomdatabasedemo.Database.NoteModel;

public class NoteAdapter extends RecyclerView.Adapter<NoteAdapter.Myviewholder> {

    private List<NoteModel> notelist;
    private View.OnLongClickListener onLongClickListener;

    public NoteAdapter(List<NoteModel> notelist,View.OnLongClickListener onLongClickListener){
        this.notelist =notelist;
        this.onLongClickListener=onLongClickListener;
    }

    public class Myviewholder extends RecyclerView.ViewHolder {

        TextView title;
        TextView description;
        public Myviewholder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title_note);
            description =itemView.findViewById(R.id.desc_note);
        }
    }


    @NonNull
    @Override
    public NoteAdapter.Myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflator = LayoutInflater.from(parent.getContext());
        View v = inflator.inflate(R.layout.noteitem,parent,false);
        return new Myviewholder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Myviewholder holder, int position) {
        NoteModel noteModel = notelist.get(position);
        holder.title.setText(noteModel.getNotetitle());
        holder.description.setText(noteModel.getNoteDesc());
        holder.itemView.setTag(noteModel);
        holder.itemView.setOnLongClickListener(onLongClickListener);
    }

    @Override
    public int getItemCount() {
        return notelist.size();
    }

    public void add(List<NoteModel> notelist){
        this.notelist =notelist;
        notifyDataSetChanged();

    }




}
