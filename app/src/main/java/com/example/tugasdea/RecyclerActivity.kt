package com.example.tugasdea

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerActivity : AppCompatActivity() {
    private lateinit var bonekaRv: RecyclerView
    private lateinit var bonekaMyAdapter: MyAdapter
    private lateinit var listBoneka: ArrayList<ItemData>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recycler)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        bonekaRv = findViewById(R.id.bonekaRV)
        listBoneka = arrayListOf(
            ItemData(R.drawable.image1, "Boneka Raccoon", "Warna"),
            ItemData(R.drawable.image2, "Boneka Teddy Bear", "Warna"),
            ItemData(R.drawable.image3, "Boneka Ddung", "Warna"),
            ItemData(R.drawable.image4, "Boneka reversible octopus plushie", "Warna"),
            ItemData(R.drawable.image5, "Boneka Bugs Bunny", "Warna"),
            ItemData(R.drawable.image6, "Boneka Panda Plushie", "Warna"),
            ItemData(R.drawable.image7, "Boneka Teddy Tales Bear Doll", "Warna"),
            ItemData(R.drawable.image8, "Boneka Lovioli Rora", "Warna"),
            ItemData(R.drawable.image9, "Boneka Pingiun Tsumtsum", "Warna"),
            ItemData(R.drawable.image10, "Boneka baby duck", "Warna")
        )

        bonekaMyAdapter = MyAdapter(listBoneka)
        bonekaRv.layoutManager = LinearLayoutManager(this)
        bonekaRv.setHasFixedSize(true)
        bonekaRv.adapter = bonekaMyAdapter
        }
}