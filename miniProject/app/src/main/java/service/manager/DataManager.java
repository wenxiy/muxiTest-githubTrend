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
        this.mRetrofitService= RetrofitHelper.getInstance(context).getServer();
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
