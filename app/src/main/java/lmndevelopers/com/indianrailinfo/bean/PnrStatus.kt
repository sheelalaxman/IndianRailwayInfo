package lmndevelopers.com.indianrailinfo.bean

import com.google.gson.annotations.SerializedName

data class PnrStatus(@SerializedName("response_code")
                     val responseCode: Int = 0,
                     @SerializedName("debit")
                     val debit: Int = 0,
                     @SerializedName("pnr")
                     val pnr: String = "",
                     @SerializedName("doj")
                     val doj: String = "",
                     @SerializedName("total_passengers")
                     val totalPassengers: Int = 0,
                     @SerializedName("chart_prepared")
                     val chartPrepared: Boolean = false,
                     @SerializedName("from_station")
                     val fromStation: FromStation,
                     @SerializedName("to_station")
                     val toStation: ToStation,
                     @SerializedName("boarding_point")
                     val boardingPoint: BoardingPoint,
                     @SerializedName("reservation_upto")
                     val reservationUpto: ReservationUpto,
                     @SerializedName("train")
                     val train: Train,
                     @SerializedName("journey_class")
                     val journeyClass: JourneyClass,
                     @SerializedName("passengers")
                     val passengers: List<PassengersItem>?)