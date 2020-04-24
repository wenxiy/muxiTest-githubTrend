package service;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import service.entity.Developers;
import service.entity.Languages_Collection;
import service.entity.Repositories;

public interface RetrofitService {
    @GET("/repositories?language=&since=daily&spoken_language_code=")//repositories请求
    Observable<Repositories> getRepositories();
    @GET("/developers?language=&since=daily")//Developer请求
    Observable<Developers>getDevelopers();
    @GET("/languages?New%20item=")//Languages_Collection请求
    Observable<Languages_Collection>getLanguages();
}
