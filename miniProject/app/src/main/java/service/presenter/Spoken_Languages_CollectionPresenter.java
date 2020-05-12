package service.presenter;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import io.reactivex.internal.subscriptions.ArrayCompositeSubscription;
import service.entity.Spoken_Languages_Collection;
import service.manager.DataManager;
//import ui.view.DataView;

public class Spoken_Languages_CollectionPresenter implements Presenter{
    private DataManager dataManager;
    private Context context;
   // private DataView dataView;
    private Spoken_Languages_Collection spoken_languages_collection;
    private ArrayCompositeSubscription compositeSubscription;
    public Spoken_Languages_CollectionPresenter(Context context)
    {
        this.context=context;
    }


    @Override
    public void onCreate() {

    }

    @Override
    public void onStart() {

    }

    @Override
    public void onStop() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void attachView(View view) {

    }

    @Override
    public void attachIncomingIntent(Intent intent) {

    }
}
