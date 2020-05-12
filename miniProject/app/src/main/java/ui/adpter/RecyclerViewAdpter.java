package ui.adpter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.miniproject.R;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.ArrayList;
import java.util.List;
import service.entity.Developers;

public class RecyclerViewAdpter extends RecyclerView.Adapter<RecyclerViewAdpter.Innerholder> {
    private Context context;
    private List<Developers> mDevelopers;
    public RecyclerViewAdpter(List<Developers> developers) {
        this.mDevelopers=developers;
    }
    @NonNull
    @Override
    public Innerholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        return new Innerholder(layoutInflater.inflate(R.layout.item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull Innerholder holder, int position) {
        if(mDevelopers!=null) holder.setdata(mDevelopers.get(position));
    }
    @Override
    public int getItemCount() {
        if(mDevelopers!=null) return mDevelopers.size();
        else return 0;
    }
    public class Innerholder extends RecyclerView.ViewHolder {
        private SimpleDraweeView simpleDraweeView;
        private TextView item_1;
        private TextView item_2;
        public Innerholder(View inflate) {
            super(inflate);
            simpleDraweeView=inflate.findViewById(R.id.aver);
            item_1=inflate.findViewById(R.id.item_t1);
            item_2=inflate.findViewById(R.id.item_t2);
        }
        public void setdata(Developers developers)
        {
             simpleDraweeView.setImageURI(developers.getAvatar());
            item_1.setText(developers.getUsername());
            item_2.setText(developers.getName());
        }
    }
}
