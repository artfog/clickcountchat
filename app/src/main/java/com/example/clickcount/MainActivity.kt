package com.example.clickcount

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       // mainButtonClick.setOnClickListener {
      //    Log.i(TAG,"Poga")
      //  }


    }

    private var clicks = 0

   // private var TAG = "MainACT"

    fun showToast(view: View) {
        Toast.makeText(this, "I'm a toast!", Toast.LENGTH_LONG).show()
    }

    fun clickme(view: View) {
        clicks++
        mainText.text = clicks.toString()
    }

    fun gotochat(view: View){
        val intent = Intent(this, ChatActivity ::class.java)
        startActivity(intent)
    }
}
