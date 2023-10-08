package rto.exam.rtoexam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import rto.exam.rtoexam.adapters.symbolAdapter
import rto.exam.rtoexam.models.symbolModel

class SymbolActivity1 : AppCompatActivity() {

    private lateinit var recycleView: RecyclerView
    private lateinit var symbolModel: ArrayList<symbolModel>
    private lateinit var symbolAdapter: symbolAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_symbol1)

        recycleView = findViewById(R.id.recycleView)
        symbolModel = ArrayList()
        symbolModel.add(symbolModel(R.drawable.all_motor_vehicles_prohibited,"Stop"))
        symbolModel.add(symbolModel(R.drawable.axle_load_limit,"axle load limit"))
//        symbolModel.add(symbolModel(R.drawable.bullock_and_hand_carts_prohibited,"bullock and hand carts prohibited"))
        symbolModel.add(symbolModel(R.drawable.bullock_cart_prohibited,"bullock cart prohibited"))
        symbolModel.add(symbolModel(R.drawable.cycle_prohobited,"cycle prohobited"))
        symbolModel.add(symbolModel(R.drawable.give_way,"give way"))
        symbolModel.add(symbolModel(R.drawable.hand_card_prohibited,"hand card prohibited"))
        symbolModel.add(symbolModel(R.drawable.horn_prohibited,"horn prohibited"))
        symbolModel.add(symbolModel(R.drawable.left_turn_prohibited,"left turn prohibited"))
        symbolModel.add(symbolModel(R.drawable.length_limit,"length limit"))
        symbolModel.add(symbolModel(R.drawable.load_limit,"load limit"))
        symbolModel.add(symbolModel(R.drawable.no_entry,"no entry"))
        symbolModel.add(symbolModel(R.drawable.no_parking,"no parking"))
        symbolModel.add(symbolModel(R.drawable.no_parking_or_stopping,"no parking or stopping"))
        symbolModel.add(symbolModel(R.drawable.one_way,"one way"))
        symbolModel.add(symbolModel(R.drawable.one_way_s,"one way s"))
        symbolModel.add(symbolModel(R.drawable.overtaking_prohibited,"overtaking prohibited"))
        symbolModel.add(symbolModel(R.drawable.pedestrians_prohibited,"pedestrians prohibited"))
        symbolModel.add(symbolModel(R.drawable.restriction_ands,"restriction ands"))
        symbolModel.add(symbolModel(R.drawable.right_turn_prohibited,"right turn prohibited"))
        symbolModel.add(symbolModel(R.drawable.speed_limit,"speed limit"))
        symbolModel.add(symbolModel(R.drawable.stop,"stop"))
        symbolModel.add(symbolModel(R.drawable.straight_prohibited,"straight prohibited"))
        symbolModel.add(symbolModel(R.drawable.tonga_prohibited,"tonga prohibited"))
        symbolModel.add(symbolModel(R.drawable.trucks_prohibited,"trucks prohibited"))
        symbolModel.add(symbolModel(R.drawable.u_turn_prohibited,"u turn prohibited"))
//        symbolModel.add(symbolModel(R.drawable.vehicles_prohibited_in_both_direction,"vehicles prohibited in both direction"))
        symbolModel.add(symbolModel(R.drawable.weight_limit,"weight limit"))
        symbolModel.add(symbolModel(R.drawable.width_limit,"width limit"))

        symbolAdapter = symbolAdapter(this, symbolModel)
        val manager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        recycleView.adapter = symbolAdapter
        recycleView.layoutManager = manager
    }
}