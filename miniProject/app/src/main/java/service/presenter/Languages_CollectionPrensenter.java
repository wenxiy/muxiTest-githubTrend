package service.presenter;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import io.reactivex.internal.subscriptions.ArrayCompositeSubscription;
import service.entity.Languages_Collection;
import service.manager.DataManager;
import service.view.DataView;

public class Languages_CollectionPrensenter implements Presenter{
    private DataManager dataManager;
    private Context context;
    private DataView dataView;
    private Languages_Collection languages_collection;
    private ArrayCompositeSubscription compositeSubscription;
    public Languages_CollectionPrensenter(Context context)
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
