package ui.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import com.example.miniproject.R;

import java.util.ArrayList;

import service.entity.Developers;
import service.entity.Languages_Collection;
import service.entity.Repositories;
import service.entity.Spoken_Languages_Collection;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mrecyclerview;
    private ArrayList<Developers> developers;
    private ArrayList<Languages_Collection> languages_collections;
    private ArrayList<Repositories> repositories;
    private ArrayList<Spoken_Languages_Collection> spoken_languages_collections;
    private TextView textView_1;
    private TextView textView_2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    public void init()
    {
        textView_1=(TextView)findViewById(R.id.item_t1);
        textView_2=(TextView)findViewById(R.id.item_t2);
        mrecyclerview=(RecyclerView) findViewById(R.id.recyclerview_1);

    }
}
