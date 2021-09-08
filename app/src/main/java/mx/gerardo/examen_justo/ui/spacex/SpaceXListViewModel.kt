package mx.gerardo.examen_justo.ui.spacex

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import mx.gerardo.examen_justo.model.api.SpaceXResponseItem
import mx.gerardo.examen_justo.service.SpaceApiService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class SpaceXListViewModel: ViewModel() {

    private val retrofit = Retrofit.Builder()
        .baseUrl("https://api.spacexdata.com/v3/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    private val service: SpaceApiService = retrofit.create(SpaceApiService::class.java)

    private val _spaceList = MutableLiveData<ArrayList<SpaceXResponseItem>>()
    val spaceList: LiveData<ArrayList<SpaceXResponseItem>>
    get() = _spaceList




    fun getRockets(){

        val call = service.getSpaceXInfo()
        call.enqueue(object : Callback<ArrayList<SpaceXResponseItem>>{

            override fun onResponse( call: Call<ArrayList<SpaceXResponseItem>>,response: Response<ArrayList<SpaceXResponseItem>> ) {

                response.body()?.let { data ->
                    Log.d("DAta", data.toString())
                    _spaceList.postValue(data)
                }
            }

            override fun onFailure(call: Call<ArrayList<SpaceXResponseItem>>, t: Throwable) {
                call.cancel()
            }

        })
    }

}


