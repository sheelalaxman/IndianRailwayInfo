package lmndevelopers.com.indianrailinfo.bean

import com.google.gson.annotations.SerializedName

data class ToStation(@SerializedName("name")
                     val name: String = "",
                     @SerializedName("code")
                     val code: String = "")