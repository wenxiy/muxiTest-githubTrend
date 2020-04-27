package ui.adpter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.miniproject.R;

import java.util.Objects;

public class RecyclerViewAdpter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context context;
    private final LayoutInflater layoutInflater;

    public RecyclerViewAdpter(Context context) {
        this.context = context;
        layoutInflater=LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new recyclerviewholder(layoutInflater.inflate(R.layout.item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    private class recyclerviewholder extends RecyclerView.ViewHolder {
        public recyclerviewholder(View inflate) {
            super(inflate);

        }
    }
}
