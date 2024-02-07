import com.hikmatillo.mvvm.core.model.now.FilmsNowPlayingResponse
import com.hikmatillo.mvvm.core.model.popular.FilmsPopularResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ProjectService {

    @GET("/3/movie/now_playing")
    suspend fun getNowPlaying(@Query("api_key") apiKey:String) :Response<FilmsNowPlayingResponse>

    @GET("/3/movie/popular")
    suspend fun getPopular(@Query("api_key") apiKey:String) :Response<FilmsPopularResponse>

}