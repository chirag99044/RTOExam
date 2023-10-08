package rto.exam.rtoexam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import rto.exam.rtoexam.adapters.resultAdapter
import rto.exam.rtoexam.models.result

class ResultActivity : AppCompatActivity() {

    private lateinit var recycleView: RecyclerView
    private lateinit var result : ArrayList<result>
    private lateinit var resultAdapter: resultAdapter
    private lateinit var btnFinishQuiz: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        supportActionBar!!.hide()

        val userAns = intent.extras!!.getStringArrayList("UserAns")

        btnFinishQuiz = findViewById(R.id.btnFinishQuiz)

        recycleView = findViewById(R.id.recycleView)
        recycleView.startLayoutAnimation()
        result = ArrayList()
        result.add(result("Question 1 : Validity of learners licence ?","Your Ans is : " + userAns!![0].toString(),"Correct Answer is :- 6 month"))
        result.add(result( "Image 2 : ","Your Ans is : " + userAns[1].toString(),"Correct Answer is :- stop"))
        result.add(result("Question 3 : On a road designated as one way ","Your Ans is : " + userAns[2].toString(),"Correct Answer is :- Should not drive in reverse gear"))
        result.add(result("Question 4 : You can overtake a vehicle in front","Your Ans is : " + userAns[3].toString(),"Correct Answer is :- Through the right side of that vehicle "))
        result.add(result( "Image 5 : ","Your Ans is : " + userAns[4].toString(),"Correct Answer is :- width limit"))
        result.add(result("Question 6  : In a road without footpath, the pedestrians ","Your Ans is : " + userAns[5].toString(),"Correct Answer is :- Should walk on the right side of the road"))
        result.add(result("Question 7 : Free passage should be given to the following types of vehicles","Your Ans is : " + userAns[6].toString(),"Correct Answer is :- Ambulance and fire service vehicles "))
        result.add(result("Image 8 : ","Your Ans is : " + userAns[7].toString(),"Correct Answer is :- u turn prohibited"))
        result.add(result("Question 9 : Driver of a vehicle may overtake ?","Your Ans is : " + userAns[8].toString(),"Correct Answer is :- When the driver of the vehicle in front shows the signal to overtake"))
        result.add(result("Question 10 : Driver of a motor vehicle shall drive through","Your Ans is : " + userAns[9].toString(),"Correct Answer is :- The park light shall remain lit"))


        resultAdapter = resultAdapter(this, result)
        val manager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        recycleView.adapter = resultAdapter
        recycleView.layoutManager = manager


        btnFinishQuiz.setOnClickListener {
            val intent = Intent(this,ExamActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}