package dev.nabil.kotlinsimplecalculator

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sum(view: View) {
        if (!(txtNum1.text.toString().equals("")) || !(txtNum2.text.toString().equals(""))) {
            val a = txtNum1.text.toString().toInt()
            val b = txtNum2.text.toString().toInt()
            val result = a + b

            tvResult.text = "Result: $result"
        } else {
            tvResult.text = "field can't be empty"
        }


    }

    fun sub(view: View) {
        val a = txtNum1.text.toString().toInt()
        val b = txtNum2.text.toString().toInt()

        val result = a - b

        tvResult.text = "Result: $result"
    }

    fun multiply(view: View) {
        val a = txtNum1.text.toString().toInt()
        val b = txtNum2.text.toString().toInt()

        val result = a * b

        tvResult.text = "Result: $result"
    }

    fun div(view: View) {
        val a = txtNum1.text.toString().toInt()
        val b = txtNum2.text.toString().toInt()

        val result = a / b

        tvResult.text = "Result: $result"
    }
}
