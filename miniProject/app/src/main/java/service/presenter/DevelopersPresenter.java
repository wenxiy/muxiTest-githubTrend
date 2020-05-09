package service.presenter;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.MainThread;

import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.subscriptions.ArrayCompositeSubscription;
import io.reactivex.schedulers.Schedulers;
import service.RetrofitHelper;
import service.RetrofitService;
import service.entity.Developers;
import service.manager.DataManager;
import service.view.DataView;

public class DevelopersPresenter implements Presenter{
    private DataManager dataManager;
    private Context context;
    private DataView dataView;
    private Developers developers;
    private CompositeDisposable compositeDisposable;
    public DevelopersPresenter(Context context){
        this.context=context;
    }

    @Override
    public void onCreate() {
        dataManager=new DataManager(context);
        compositeDisposable=new CompositeDisposable();
    }

    @Override
    public void onStart() {

    }

    @Override
    public void onStop() {
        if (compositeDisposable!=null&&!compositeDisposable.isDisposed()) {
            compositeDisposable.dispose();
        }


    }

    @Override
    public void pause() {

    }

    @Override
    public void attachView(View view) {
       // dataView=(DataView)view;
    }

    @Override
    public void attachIncomingIntent(Intent intent) {
        //添加网络请求，线程切换
        getDevelopers();
    }

    public void getDevelopers() {
        RetrofitHelper.getInstance(context)
                .getServer()
                .getDevelopers()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Developers>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        Log.d("TAG","订阅");
                    }

                    @Override
                    public void onNext(Developers developers) {
                        Log.d("TAG","++");
                    }

                    @Override
                    public void onError(Throwable e) {
                        Toast.makeText(context,"拉去请求失败",Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onComplete() {
                        Toast.makeText(context,"拉去请求完成",Toast.LENGTH_SHORT).show();
                    }
                });
    }
}
