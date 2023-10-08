package rto.exam.rtoexam.adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import rto.exam.rtoexam.*
import rto.exam.rtoexam.models.cardModel

class cardAdapter(
    private var mycontext: Context, private var model: ArrayList<cardModel>
) : RecyclerView.Adapter<cardAdapter.ViewHolder>() {

    private var lastPosition = -1

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val myview = LayoutInflater.from(mycontext).inflate(R.layout.card_view_design, null, true)
        return ViewHolder(myview)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val model2 = model[position]
        holder.image.setImageResource(model2.image)
        holder.name.text = model2.Heading
        holder.state.text = model2.Description
        holder.Cardview.setCardBackgroundColor(holder.itemView.resources.getColor(getRamdomColor(),null))
        holder.Cardview.setOnClickListener {
            when (position) {
                0 -> mycontext.startActivity(Intent(mycontext, QuestionbankActivity::class.java))
                1 -> mycontext.startActivity(Intent(mycontext, SymbolCatagory::class.java))
                2 ->  mycontext.startActivity(Intent(mycontext, PracticequestionActivity::class.java))
                3 -> mycontext.startActivity(Intent(mycontext,ExamActivity::class.java))
                4 -> mycontext.startActivity(Intent(mycontext,DrivinglawsActivity::class.java))
                5 -> mycontext.startActivity(Intent(mycontext,Drivinglicenseprocess::class.java))
            }
        }
    }

    private fun getRamdomColor(): Int {
        val colorCode = ArrayList<Int>()
        colorCode.add(R.color.cardview1)
        colorCode.add(R.color.cardview1)
        colorCode.add(R.color.cardview1)
        colorCode.add(R.color.cardview1)
        colorCode.add(R.color.cardview1)

        val number = kotlin.random.Random.nextInt(colorCode.size)
        return colorCode[number]
    }
    override fun getItemCount(): Int {
        return model.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var image: ImageView
        var name: TextView
        var state: TextView
        var Cardview: CardView

        init {
            image = itemView.findViewById(R.id.cardImage)
            name = itemView.findViewById(R.id.Heading)
            state = itemView.findViewById(R.id.Description)
            Cardview = itemView.findViewById(R.id.cardView)

        }
    }
}