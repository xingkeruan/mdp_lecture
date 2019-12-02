package com.example.activitylifecycleapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    val MY_TAG = "Activity1"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var click = findViewById<Button>(R.id.btn)
        Log.i(MY_TAG,"Method in OnCreate");
        click.setOnClickListener{
            var intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }
    }
    override fun onStart() {
        super.onStart()
        Log.i(MY_TAG, "Method in OnStart")
        //   Toast.makeText(this, "OnStart Finished", Toast.LENGTH_LONG).show()
    }
    override fun onResume() {
        super.onResume()
        Log.i(MY_TAG, "Method in OnResume")
        //  Toast.makeText(this, "OnResume Finished", Toast.LENGTH_LONG).show()
    }
    override fun onPause() {
        super.onPause()
        Log.i(MY_TAG, "Method in OnPause")
        //  Toast.makeText(this, "OnPause Finished", Toast.LENGTH_LONG).show()
    }

    override fun onStop() {
        super.onStop()
        Log.i(MY_TAG, "Method in OnStop")
        //Toast.makeText(this, "OnStop Finished", Toast.LENGTH_LONG).show()
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(MY_TAG, "Method in OnRestart")
        //Toast.makeText(this, "OnRestart Finished", Toast.LENGTH_LONG).show()
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.i(MY_TAG, "Method in OnDestroy")
        //Toast.makeText(this, "OnDestroy Finished", Toast.LENGTH_LONG).show()
    }
}
