package rto.exam.rtoexam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import rto.exam.rtoexam.adapters.cardAdapter
import rto.exam.rtoexam.models.cardModel

class MainActivity : AppCompatActivity() {

    private lateinit var recycleView: RecyclerView
    private lateinit var cardModel: ArrayList<cardModel>
    private lateinit var cardAdapter: cardAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycleView = findViewById(R.id.recycleView)
        recycleView.startLayoutAnimation()
        cardModel = ArrayList()
        cardModel.add(cardModel(R.drawable.question,"Question bank","Question Relatied RTO Exam"))
        cardModel.add(cardModel(R.drawable.prohibited,"Symbol","Symbol Relatied RTO Exam"))
        cardModel.add(cardModel(R.drawable.notebook,"prectic question","MCQs Question & Symbol both"))
        cardModel.add(cardModel(R.drawable.test,"Exam","Give Exam and Show own Result"))
        cardModel.add(cardModel(R.drawable.law,"Driving laws","Different RTO laws"))
        cardModel.add(cardModel(R.drawable.process,"Licence process","RTO license process"))
//        cardModel.add(cardModel(R.drawable.promo,"RTO code","RTO related code"))
        cardAdapter = cardAdapter(this, cardModel)
        val manager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        recycleView.adapter = cardAdapter
        recycleView.layoutManager = manager
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.action_bar, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
//            R.id.menuProfile -> Toast.makeText(this, "Search Clicked", Toast.LENGTH_SHORT).show()
//            R.id.menuAbout -> Toast.makeText(this, "Refresh Clicked", Toast.LENGTH_SHORT).show()
//            R.id.menuLogout -> Toast.makeText(this, "Copy Clicked", Toast.LENGTH_SHORT).show()
//            R.id.menuLogin -> Toast.makeText(this, "Copy Clicked", Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }
}