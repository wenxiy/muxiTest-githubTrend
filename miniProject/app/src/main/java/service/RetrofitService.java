package service;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import service.entity.Developers;
import service.entity.Repositories;

public interface RetrofitService {
    @GET("/repositories")//Developer请求
    Observable<Repositories> getRepositories();
    @GET("/developers?language=&since=daily")
    Observable<Developers>getDevelopers();
}
