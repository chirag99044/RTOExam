package rto.exam.rtoexam.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import rto.exam.rtoexam.R
import rto.exam.rtoexam.models.symbolModel

class symbolAdapter(
    private var mycontext: Context,
    private var model: ArrayList<symbolModel>
) : RecyclerView.Adapter<symbolAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder
    {
        val myview =
            LayoutInflater.from(mycontext).inflate(R.layout.symbol_view_design, null, true)
        return ViewHolder(myview)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val model2 = model[position]
        holder.SymbolImage.setImageResource(model2.SymbolImage)
        holder.SymbolName.text = model2.SymbolName
    }

    override fun getItemCount(): Int {
        return model.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var SymbolImage: ImageView
        var SymbolName: TextView

        init {
            SymbolImage = itemView.findViewById(R.id.ImgSymbol)
            SymbolName = itemView.findViewById(R.id.SymbolName)
        }
    }
}