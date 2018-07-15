package lmndevelopers.com.indianrailinfo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import lmndevelopers.com.indianrailinfo.bean.PnrStatus
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        submit.setOnClickListener {


            var r =Retrofit.Builder().addConverterFactory(GsonConverterFactory.create()).baseUrl("https://api.railwayapi.com/v2/").build()
            var uri = r.create(RailApi::class.java)

           var res= uri.getPnrInfo(pnr.text.toString())
           res.enqueue(object : Callback<PnrStatus> {

               override fun onFailure(call: Call<PnrStatus>?, t: Throwable?) {
                   Toast.makeText(this@MainActivity,"failed to load data",Toast.LENGTH_LONG).show()
               }

               override fun onResponse(call: Call<PnrStatus>?, response: Response<PnrStatus>?) {
                   var list= mutableListOf<String>()
                   var content = response!!.body()
                   list.add("PNR No :"+content!!.pnr)
                   list.add("Train No :"+content!!.train.number)
                   list.add("Train Name :"+content!!.train.name)
                   list.add("DOJ :"+content!!.doj)
                   list.add("To Station :"+content!!.toStation.name)
                   list.add("No Of Psgrs :"+content!!.totalPassengers)
                   list.add("From Station :"+content!!.fromStation.name)
                   for(x in content!!.passengers!!){
                       list.add("BStatus :"+x.bookingStatus+
                               ",CStatus"+x.currentStatus)
                   }
                   var myadapter = ArrayAdapter<String>(this@MainActivity,
                           android.R.layout.simple_list_item_single_choice,list)
                   lview.adapter = myadapter

               }
           })


        }
    }
}
