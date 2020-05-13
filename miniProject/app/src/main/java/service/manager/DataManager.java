package service.manager;

import android.content.Context;

import io.reactivex.Observable;
import service.RetrofitHelper;
import service.RetrofitService;
import service.entity.Developers;
import service.entity.Languages_Collection;
import service.entity.Repositories;
import service.entity.Spoken_Languages_Collection;

public class DataManager {
    private RetrofitService mRetrofitService;
    public DataManager(Context context)
    {
        /*
        下面👇一行报错，我怀疑是context的问题，没有吧context传入我的mainactivity里，单例模式的问题
         */
        this.mRetrofitService= RetrofitHelper.getInstance().getServer();

    }
    public Observable<Repositories> getRepositories(){
        return mRetrofitService.getRepositories();
    }

    public Observable<Developers>getDevelopers(){
        return mRetrofitService.getDevelopers();
    }

    public Observable<Languages_Collection> getLanguages_Collection(){
        return mRetrofitService.getLanguages();
    }

    public Observable<Spoken_Languages_Collection> getSpoken_Languages_collection(){
        return mRetrofitService.getSpoken_Languages_Collection();
    }
}
