package service.presenter;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.internal.subscriptions.ArrayCompositeSubscription;
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
