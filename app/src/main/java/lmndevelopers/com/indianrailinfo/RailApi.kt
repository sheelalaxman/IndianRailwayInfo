package lmndevelopers.com.indianrailinfo

import lmndevelopers.com.indianrailinfo.bean.PnrStatus
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface RailApi {

    @GET("pnr-status/pnr/{pnrno}/apikey/rw49ulgx7d/")
    fun getPnrInfo(@Path("pnrno") pnrno : String) : Call<PnrStatus>
}