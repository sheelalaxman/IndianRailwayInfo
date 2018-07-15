package lmndevelopers.com.indianrailinfo.bean

import com.google.gson.annotations.SerializedName

data class ReservationUpto(@SerializedName("name")
                           val name: String = "",
                           @SerializedName("code")
                           val code: String = "")