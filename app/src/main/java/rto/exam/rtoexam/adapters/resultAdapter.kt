package rto.exam.rtoexam.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import rto.exam.rtoexam.R
import rto.exam.rtoexam.models.result

class resultAdapter(
    private var mycontext: Context,
    private var model: ArrayList<result>
) : RecyclerView.Adapter<resultAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder
    {
        val myview =
            LayoutInflater.from(mycontext).inflate(R.layout.result_view_design, null, true)
        return ViewHolder(myview)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val model2 = model[position]
        holder.txttvQuestion.text = model2.txtquestion
        holder.tvUserAns.text = model2.userAnswer
        holder.tvCorrAns.text = model2.corectAnswer
    }

    override fun getItemCount(): Int {
        return model.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var txttvQuestion: TextView
        var tvUserAns: TextView
        var tvCorrAns: TextView

        init {
            txttvQuestion = itemView.findViewById(R.id.txttvQuestion)
            tvUserAns = itemView.findViewById(R.id.tvUserAns)
            tvCorrAns = itemView.findViewById(R.id.tvCorrAns)
        }
    }
}