package service;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import service.entity.Developers;
import service.entity.Languages_Collection;
import service.entity.Repositories;
import service.entity.Spoken_Languages_Collection;

public interface RetrofitService {
    @GET("/repositories")//repositories请求//注意这里
    Observable<Repositories> getRepositories();
    @GET("https://ghapi.huchen.dev/developers")//Developer请求
    Observable<Developers>getDevelopers();
    @GET("/languages")//Languages_Collection请求
    Observable<Languages_Collection>getLanguages();
    @GET("/spoken_languages")//Spoken_Languages_Collection
    Observable<Spoken_Languages_Collection>getSpoken_Languages_Collection();
}
