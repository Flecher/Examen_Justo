package mx.gerardo.examen_justo.service

import mx.gerardo.examen_justo.model.api.SpaceXResponseItem
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface SpaceApiService {

    @GET("rockets")
    fun getSpaceXInfo(): Call<ArrayList<SpaceXResponseItem>>

}