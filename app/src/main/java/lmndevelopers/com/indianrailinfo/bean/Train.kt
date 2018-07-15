package lmndevelopers.com.indianrailinfo.bean

import com.google.gson.annotations.SerializedName

data class Train(@SerializedName("name")
                 val name: String = "",
                 @SerializedName("number")
                 val number: String = "")