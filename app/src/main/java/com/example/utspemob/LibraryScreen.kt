package com.example.utspemob

import android.os.Bundle
import android.widget.GridView
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity


class LibraryScreen : AppCompatActivity() {private lateinit var listView: ListView
    private lateinit var motorList: ArrayList<Motor>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_library)

        listView = findViewById(R.id.listViewMotor)

        motorList = arrayListOf(
            Motor(name = "Aerox Olive", genres = "Porting 58 Free | Monting 4cm | Billed AES", R.drawable.aerox),
            Motor(name = "Vario GreenTea", genres = "Kirian Bubut Pully | Thai Style | 200m Drag", R.drawable.vario),
            Motor(name = "WR Rumble", genres = "Ohlines Shocks | American Style | EZ Standing", R.drawable.wr),
            Motor(name = "Vesmet Casper", genres = "66free Daily | City Look | Shijiro", R.drawable.vesmet),
            Motor(name = "Costom Miu", genres = "Basic Scorpio225 | All Role | Bandung Boys", R.drawable.custom)
        )

        val adapter = MotorAdapter(this, motorList)
        listView.adapter = adapter
    }
}