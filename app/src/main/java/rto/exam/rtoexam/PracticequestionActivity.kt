package rto.exam.rtoexam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class PracticequestionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_precticquestion)

        findViewById<CardView>(R.id.cvQuestion).setOnClickListener {
            startActivity(Intent(this,question::class.java))
        }
       findViewById<CardView>(R.id.cvSymbol).setOnClickListener {
           startActivity(Intent(this,symbol::class.java))
       }
    }
}