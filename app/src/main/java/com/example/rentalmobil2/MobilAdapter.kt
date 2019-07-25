package com.example.rentalmobil2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.layout_mobil.view.*

class MobilAdapter(val mobiles : List<Mobil>) : RecyclerView.Adapter<MobilAdapter.MobilViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MobilViewHolder {
        return MobilViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.layout_mobil,parent,false)
        )

    }

    override fun getItemCount() = mobiles.size

    override fun onBindViewHolder(holder: MobilViewHolder, position: Int) {
        val mobil = mobiles[position]

        holder.view.textViewNama.text = mobil.nama_mobil
        holder.view.textViewHarga.text = mobil.harga_sewa

        Glide.with(holder.view.context)
            .load(mobil.image)
            .into(holder.view.imageMobil)
    }

    class MobilViewHolder(val view: View) : RecyclerView.ViewHolder(view)
}