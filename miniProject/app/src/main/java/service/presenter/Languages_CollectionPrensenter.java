package service.presenter;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.internal.subscriptions.ArrayCompositeSubscription;
import service.entity.Languages_Collection;
import service.manager.DataManager;
//import ui.view.DataView;

public class Languages_CollectionPrensenter implements Presenter{
    private DataManager dataManager;
    private Context context;
//    private DataView dataView;
    private Languages_Collection languages_collection;
    private CompositeDisposable compositeDisposable;
    public Languages_CollectionPrensenter(Context context)
    {
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
        if(compositeDisposable==null)
        {
            compositeDisposable.clear();
        }
    }

    @Override
    public void pause() {

    }

    @Override
    public void attachView(View view) {
   //     dataView=(DataView)dataView;
    }



    @Override
    public void attachIncomingIntent(Intent intent) {


    }
    public void Languages_Collection_Retrofit()
    {
        //compositeDisposable.add();
    }
}
