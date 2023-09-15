package com.example.thehuh

import android.app.TaskStackBuilder
import android.content.Intent
import com.bumptech.glide.Glide
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import androidx.core.content.ContentProviderCompat.requireContext
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.android.volley.toolbox.Volley.newRequestQueue
import com.squareup.picasso.Picasso
import org.json.simple.JSONObject
import org.json.simple.parser.JSONParser

class api : AppCompatActivity() {

    private lateinit var rq: RequestQueue
    private val url = "https://api.waifu.pics/sfw/"
    private lateinit var response: JSONObject

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_api)

        val imv = findViewById<ImageView>(R.id.imageView)
        val btn = findViewById<Button>(R.id.button4)
        val btn3 = findViewById<Button>(R.id.button6)
        val btn4 = findViewById<Button>(R.id.button7)
        val btn5 = findViewById<Button>(R.id.button8)



        rq = Volley.newRequestQueue(this)

        val btn2 = findViewById<Button>(R.id.button5)


        btn.setOnClickListener(){
            val url2 = url + "smile"
            val r = StringRequest(
                Request.Method.GET, url2,
                { res ->
                    val parser = JSONParser()
                    val obj: Any? = parser.parse(res as String)
                    response = obj as JSONObject
                    val imageUrl = response["url"].toString()
                    Glide.with(this).load(imageUrl).into(imv)
                    Log.d("Hello", res.toString())
                },
                { err -> Log.d("Debug", err.toString()) }
            )
            rq.add(r)
        }

        btn3.setOnClickListener(){
            val url2 = url + "pat"
            val r = StringRequest(
                Request.Method.GET, url2,
                { res ->
                    val parser = JSONParser()
                    val obj: Any? = parser.parse(res as String)
                    response = obj as JSONObject
                    val imageUrl = response["url"].toString()
                    Glide.with(this).load(imageUrl).into(imv)
                    Log.d("Hello", res.toString())
                },
                { err -> Log.d("Debug", err.toString()) }
            )
            rq.add(r)
        }

        btn4.setOnClickListener(){
            val url2 = url + "awoo"
            val r = StringRequest(
                Request.Method.GET, url2,
                { res ->
                    val parser = JSONParser()
                    val obj: Any? = parser.parse(res as String)
                    response = obj as JSONObject
                    val imageUrl = response["url"].toString()
                    Glide.with(this).load(imageUrl).into(imv)
                    Log.d("Hello", res.toString())
                },
                { err -> Log.d("Debug", err.toString()) }
            )
            rq.add(r)
        }

        btn5.setOnClickListener(){
            val url2 = url + "neko"
            val r = StringRequest(
                Request.Method.GET, url2,
                { res ->
                    val parser = JSONParser()
                    val obj: Any? = parser.parse(res as String)
                    response = obj as JSONObject
                    val imageUrl = response["url"].toString()
                    Glide.with(this).load(imageUrl).into(imv)
                    Log.d("Hello", res.toString())
                },
                { err -> Log.d("Debug", err.toString()) }
            )
            rq.add(r)
        }

        btn2.setOnClickListener(){
            val intent = Intent()
            intent.setClass(this, MainActivity::class.java)
            val stackBuilder: TaskStackBuilder = TaskStackBuilder.create(this)
            stackBuilder.addNextIntentWithParentStack(intent)
            stackBuilder.startActivities(Bundle())
        }

        /*val intent = Intent()
        intent.setClass(this, MainActivity::class.java)
        val stackBuilder: TaskStackBuilder = TaskStackBuilder.create(this)
        stackBuilder.addNextIntentWithParentStack(intent)
        stackBuilder.startActivities(Bundle())*/

     //   return view


    }

 /*   override fun onBackPressed() {
        super.onBackPressed()
        intent = Intent(this, MainActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
        this.startActivity(intent)
    }
*/

    }
