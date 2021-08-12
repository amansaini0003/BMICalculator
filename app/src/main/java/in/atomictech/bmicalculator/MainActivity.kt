package `in`.atomictech.bmicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var height : EditText
    lateinit var weight : EditText
    lateinit var result : TextView
    lateinit var calcButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        calcButton = findViewById(R.id._calc_button) as Button
        height = findViewById(R.id._height) as EditText
        weight = findViewById(R.id._weight) as EditText
        result = findViewById(R.id._result) as TextView

        calcButton.setOnClickListener {
            val ht = (height.text).toString().toFloat() /100
            val wt = weight.text.toString().toFloat()
            val res =(wt/(ht*ht))                // BMI Formula
            result.text = "%.2f".format(res)
        }
    }
}