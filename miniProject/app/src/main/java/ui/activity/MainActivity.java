package ui.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import com.example.miniproject.R;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mrecyclerview;
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
