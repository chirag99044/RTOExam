package rto.exam.rtoexam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DrivinglawsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drivinglaws)

        val Rule1 = findViewById<TextView>(R.id.Rule1)
        Rule1.text = resources.getString(R.string.Rule1)
        val Ans1 = findViewById<TextView>(R.id.Ans1)
        Ans1.text = resources.getString(R.string.Ans1)

        val Rule2 = findViewById<TextView>(R.id.Rule2)
        Rule2.text = resources.getString(R.string.Rule2)
        val Ans2 = findViewById<TextView>(R.id.Ans2)
        Ans2.text = resources.getString(R.string.Ans2)

        val Rule3 = findViewById<TextView>(R.id.Rule3)
        Rule3.text = resources.getString(R.string.Rule3)
        val Ans3 = findViewById<TextView>(R.id.Ans3)
        Ans3.text = resources.getString(R.string.Ans3)

        val Rule4 = findViewById<TextView>(R.id.Rule4)
        Rule4.text = resources.getString(R.string.Rule4)
        val Ans4 = findViewById<TextView>(R.id.Ans4)
        Ans4.text = resources.getString(R.string.Ans4)

        val Rule5 = findViewById<TextView>(R.id.Rule5)
        Rule5.text = resources.getString(R.string.Rule5)
        val Ans5 = findViewById<TextView>(R.id.Ans5)
        Ans5.text = resources.getString(R.string.Ans5)

        val Rule6 = findViewById<TextView>(R.id.Rule6)
        Rule6.text = resources.getString(R.string.Rule6)
        val Ans6 = findViewById<TextView>(R.id.Ans6)
        Ans6.text = resources.getString(R.string.Ans6)

        val Rule7 = findViewById<TextView>(R.id.Rule7)
        Rule7.text = resources.getString(R.string.Rule7)
        val Ans7 = findViewById<TextView>(R.id.Ans7)
        Ans7.text = resources.getString(R.string.Ans7)

    }
}