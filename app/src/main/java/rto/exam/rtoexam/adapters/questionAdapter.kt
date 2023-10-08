package rto.exam.rtoexam.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import rto.exam.rtoexam.R
import rto.exam.rtoexam.models.questionModel

class questionAdapter (
    private var mycontext: Context,
    private var model: ArrayList<questionModel>
) : RecyclerView.Adapter<questionAdapter.ViewHolder>() {

    private var currentPosition = 0

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder
    {
        val myview =
            LayoutInflater.from(mycontext).inflate(R.layout.question_view_design, null, true)
        return ViewHolder(myview)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var p = position
        val model2 = model[position]
        holder.Question.text = model2.Question
        holder.Answer.text = model2.Answer

        holder.lblAnswer.isVisible = false

        if (currentPosition == position)
        {
//            val slideDown: Animation =
//                AnimationUtils.loadAnimation(mycontext, androidx.appcompat.R.anim.abc_fade_out)
            holder.lblAnswer.isVisible = true

//            holder.lblAnswer.startAnimation(slideDown)
        }

        holder.Question.setOnClickListener {
            currentPosition = p

            notifyDataSetChanged()
        }
    }

    override fun getItemCount(): Int {
        return model.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var Question: TextView
        var Answer: TextView
        var lblAnswer : RelativeLayout

        init {
            Question = itemView.findViewById(R.id.Question)
            Answer = itemView.findViewById(R.id.Answer)
            lblAnswer = itemView.findViewById(R.id.LayoutAnswer)
        }
    }
}