package com.example.mygridlayot.adapters

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mygridlayot.R
import com.example.mygridlayot.model.AlphaChar

class AlphaAdapters(var context: Context, var arrayList: ArrayList<AlphaChar>) :


    class ItemHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var icons = itemView.findViewById<ImageView>(R.id.icon_image_view)
        var alphas = itemView.findViewById<TextView>(R.id.alpha_text_view)
    }
}