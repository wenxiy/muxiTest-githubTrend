package ui.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.miniproject.R;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.ArrayList;
import java.util.List;

import service.entity.Developers;
import service.entity.Languages_Collection;
import service.entity.Repositories;
import service.entity.Spoken_Languages_Collection;
import service.presenter.DevelopersPresenter;
import ui.adpter.RecyclerViewAdpter;
import ui.view.DevelopersView;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mrecyclerview;
    private ArrayList<Developers> developers;
   // private RecyclerViewAdpter madpter=new RecyclerViewAdpter(List<developers>);
    private DevelopersPresenter mdeveloperspresenter=new DevelopersPresenter(this);
    private ArrayList<Languages_Collection> mlanguages_collections;
    private ArrayList<Repositories> mrepositories;
    private ArrayList<Spoken_Languages_Collection> mspoken_languages_collections;
    private TextView textView_1;
    private TextView textView_2;
    private SimpleDraweeView simpleDraweeView;

    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initdata();
        initView();
    }

    private void initView() {//将数据放到ui上
        textView_1=(TextView)findViewById(R.id.item_t1);
        textView_2=(TextView)findViewById(R.id.item_t2);
        simpleDraweeView=findViewById(R.id.aver);
        mrecyclerview=(RecyclerView)findViewById(R.id.recyclerview_1);
     //   mrecyclerview.setAdapter(madpter);

    }

    public void initdata()//拉取Developer的请求，将数据传入view里
    {
        mdeveloperspresenter.onCreate();//创建呈现层
        mdeveloperspresenter.getDevelopers();//调用网络请求方法
        mdeveloperspresenter.attachView((View) mDevelopersview);

    }
    private DevelopersView mDevelopersview=new DevelopersView() {//新建一个developersview层的数据去完成这些请求
        @Override
        public void success(Developers mdevelopers) {
            //请求成功，利用请求过来的数据mdevelopers去设置数据 textview1是作者名字 2是项目名字 sim是头像
             textView_1.setText(mdevelopers.getUsername());
             textView_2.setText(mdevelopers.getName());
             simpleDraweeView.setImageURI(mdevelopers.getUrl());
        }

        @Override
        public void error(String result) {

        }
    };

    private Context getData() {
        return this;
    }
}
