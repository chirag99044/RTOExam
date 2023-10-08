package rto.exam.rtoexam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class SymbolCatagory : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_symbol_catagory)

        findViewById<CardView>(R.id.Mandatory).setOnClickListener {
            startActivity(Intent(this,SymbolActivity1::class.java))
        }
//        findViewById<CardView>(R.id.Compulsory_direction).setOnClickListener {
//            startActivity(Intent(this,question::class.java))
//        }
//        findViewById<CardView>(R.id.Cautionary_sign).setOnClickListener {
//            startActivity(Intent(this,question::class.java))
//        }
//        findViewById<CardView>(R.id.information_signs).setOnClickListener {
//            startActivity(Intent(this,question::class.java))
//        }
    }
}