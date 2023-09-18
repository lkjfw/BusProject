package com.ansan.busproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ansan.busproject.databinding.ActivityTimeBinding

class timeActivity : AppCompatActivity() {
    private  lateinit var binding: ActivityTimeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_time)

        binding = ActivityTimeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.timetomainbtn.setOnClickListener {
            val myIntent = Intent( this, MainActivity::class.java)
            startActivity(myIntent)
        }

        binding.timetocheckbtn.setOnClickListener {
            val myIntent = Intent( this, CheckActivity::class.java)
            startActivity(myIntent)
        }
        binding.timetocheckbtn.setOnClickListener {
            //실시간 화면으로 이동
            val myIntent = Intent( this, CheckActivity::class.java)
            startActivity(myIntent)
        }
        binding.timetonotedbtn.setOnClickListener {
            //공지 화면으로 이동
            val myIntent = Intent( this, NotedActivity::class.java)
            startActivity(myIntent)
        }
        binding.timetouserbtn.setOnClickListener {
            //유저 화면으로 이동
            val myIntent = Intent( this, UserActivity::class.java)
            startActivity(myIntent)
        }
    }
}