package service;

import android.app.job.JobInfo;
import android.content.Context;

import com.google.gson.GsonBuilder;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitHelper {
    private Context mCntext;
    OkHttpClient client=new OkHttpClient();
    GsonConverterFactory factory=GsonConverterFactory.create(new GsonBuilder().create());
    private static RetrofitHelper instance=null;
    private Retrofit mRetrofit=null;

    public static RetrofitHelper getInstance(Context mContext) {
        if (instance == null) {
            instance = new RetrofitHelper(mContext);
        }
        return instance;
    }
    public RetrofitHelper(Context mContext) {
        mCntext=mContext;
        init();
    }
    private void init()
    {
        resetAPP();
    }

    private void resetAPP() {
        mRetrofit=new Retrofit.Builder()
                .baseUrl("https://ghapi.huchen.dev")
                .client(client)
                .addConverterFactory(factory)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }
    public RetrofitService getServer(){
        return mRetrofit.create(RetrofitService.class);
    }

}
