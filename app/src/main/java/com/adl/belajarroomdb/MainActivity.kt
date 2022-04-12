package com.adl.belajarroomdb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioGroup
import android.widget.SeekBar
import android.widget.Switch
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        seekBar.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                txtSlider.setText("nilainya adalah : ${p1.toString()}")
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
            }
        })

        radioGrup.setOnCheckedChangeListener(object : RadioGroup.OnCheckedChangeListener{
            override fun onCheckedChanged(p0: RadioGroup?, p1: Int) {

                val result = when(p1){
                    R.id.radioButton1 -> "opsi 1"
                    R.id.radioButton2 -> "opsi 2"
                    R.id.radioButton3 -> "opsi 3"
                    else -> "no opsi"
                }
                Toast.makeText(this@MainActivity, "pilihan nya adalah : ${result}", Toast.LENGTH_SHORT).show()
            }
        })


        switch1.setOnCheckedChangeListener({ _ , isChecked ->
            if (isChecked) switch1.text="on" else switch1.text="off"
        })
    }

}