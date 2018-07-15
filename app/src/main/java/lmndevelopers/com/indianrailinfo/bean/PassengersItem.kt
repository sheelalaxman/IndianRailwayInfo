package lmndevelopers.com.indianrailinfo.bean

import com.google.gson.annotations.SerializedName

data class PassengersItem(@SerializedName("no")
                          val no: Int = 0,
                          @SerializedName("current_status")
                          val currentStatus: String = "",
                          @SerializedName("booking_status")
                          val bookingStatus: String = "")