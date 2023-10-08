package rto.exam.rtoexam

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import rto.exam.rtoexam.adapters.questionAdapter
import rto.exam.rtoexam.models.questionModel

class QuestionbankActivity : AppCompatActivity() {

    private lateinit var recycleView: RecyclerView
    private lateinit var questionmodel: ArrayList<questionModel>
    private lateinit var questionAdapter: questionAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questionbank)

        recycleView = findViewById(R.id.recycleView)
        questionmodel = ArrayList()

        val Question: Array<out String> = resources.getStringArray(R.array.Question)
        val Answer: Array<out  String> = resources.getStringArray(R.array.Answer)

        for (i in 1 until Question.size) {
            val Question: String = Question.get(i)
            val Answer: String = Answer.get(i)
            questionmodel.add(questionModel("$i : " + Question,Answer))
        }

        questionAdapter = questionAdapter(this, questionmodel)
        val manager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        recycleView.adapter = questionAdapter
        recycleView.layoutManager = manager

    }
}