package com.example.thehuh

import android.app.TaskStackBuilder
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.bumptech.glide.Glide
import org.json.simple.JSONObject
import org.json.simple.parser.JSONParser

class api2 : AppCompatActivity() {

    private lateinit var rq: RequestQueue
    private val url = "https://italian-jokes.vercel.app"
    private lateinit var response: JSONObject
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_api2)



        val btn = findViewById<Button>(R.id.button9)
        val btn2 = findViewById<Button>(R.id.button10)
        val btn3 = findViewById<Button>(R.id.button11)
        val btn4 = findViewById<Button>(R.id.button12)
        val text = findViewById<TextView>(R.id.textView)
        val btnhome = findViewById<Button>(R.id.button14)

        rq = Volley.newRequestQueue(this)


        btn.setOnClickListener(){
            val url2 = url + "/api/jokes?subtype=One-liner"
            val r = StringRequest(
                Request.Method.GET, url2,
                { res ->
                    val parser = JSONParser()
                    val obj: Any? = parser.parse(res as String)
                    response = obj as JSONObject
                    val joke = response["joke"].toString()
                    text.setText(joke)
                    Log.d("Hello", res.toString())
                },
                { err -> Log.d("Debug", err.toString()) }
            )
            rq.add(r)
        }

        btn2.setOnClickListener(){
            val url2 = url + "/api/jokes?subtype=Observational"
            val r = StringRequest(
                Request.Method.GET, url2,
                { res ->
                    val parser = JSONParser()
                    val obj: Any? = parser.parse(res as String)
                    response = obj as JSONObject
                    val joke = response["joke"].toString()
                    text.setText(joke)
                    Log.d("Hello", res.toString())
                },
                { err -> Log.d("Debug", err.toString()) }
            )
            rq.add(r)
        }

        btn3.setOnClickListener(){
            val url2 = url + "/api/jokes?subtype=Stereotype"
            val r = StringRequest(
                Request.Method.GET, url2,
                { res ->
                    val parser = JSONParser()
                    val obj: Any? = parser.parse(res as String)
                    response = obj as JSONObject
                    val joke = response["joke"].toString()
                    text.setText(joke)
                    Log.d("Hello", res.toString())
                },
                { err -> Log.d("Debug", err.toString()) }
            )
            rq.add(r)
        }

        btn4.setOnClickListener(){
            val url2 = url + "/api/jokes?subtype=Wordplay"
            val r = StringRequest(
                Request.Method.GET, url2,
                { res ->
                    val parser = JSONParser()
                    val obj: Any? = parser.parse(res as String)
                    response = obj as JSONObject
                    val joke = response["joke"].toString()
                    text.setText(joke)
                    Log.d("Hello", res.toString())
                },
                { err -> Log.d("Debug", err.toString()) }
            )
            rq.add(r)
        }


        btnhome.setOnClickListener(){
            val intent = Intent()
            intent.setClass(this, MainActivity::class.java)
            val stackBuilder: TaskStackBuilder = TaskStackBuilder.create(this)
            stackBuilder.addNextIntentWithParentStack(intent)
            stackBuilder.startActivities(Bundle())
        }

    }



    /*verride fun onBackPressed() {
        super.onBackPressed()

        intent = Intent(this, MainActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
        this.startActivity(intent)
    }*/
}