package service.presenter;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import androidx.annotation.MainThread;

import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
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
    }

    public void getDevelopers() {
      /*  compositeDisposable.add(dataManager.getDevelopers().
                subscribeOn()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Developers>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(Developers developers) {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                })
                )

        ;
*/
    }
}
