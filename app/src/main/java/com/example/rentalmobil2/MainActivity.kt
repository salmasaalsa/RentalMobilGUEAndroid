package com.example.rentalmobil2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.layout_mobil.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MobilApi().getMobil().enqueue(object : Callback<List<Mobil>>{
            override fun onFailure(call: Call<List<Mobil>>, t: Throwable) {
                Toast.makeText(applicationContext, t.message, Toast.LENGTH_LONG).show()
            }

            override fun onResponse(call: Call<List<Mobil>>, response: Response<List<Mobil>>) {
                val mobiles = response.body()

                mobiles?.let{
                    showMobil(it)
                }
            }

        })
    }

    private fun showMobil(mobiles: List<Mobil>){
        recyclerViewMobil.layoutManager = LinearLayoutManager(this)
        recyclerViewMobil.adapter = MobilAdapter(mobiles)
    }
}
