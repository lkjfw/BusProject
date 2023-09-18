package com.ansan.busproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ansan.busproject.databinding.ActivityNotedBinding

class NotedActivity : AppCompatActivity() {
    private  lateinit var binding: ActivityNotedBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_noted)

        binding = ActivityNotedBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.notedtomainbtn.setOnClickListener {
            val myIntent = Intent( this, MainActivity::class.java)
            startActivity(myIntent)
        }

        binding.notedtotimebtn.setOnClickListener {
            //시간표 화면
            val myIntent = Intent( this, timeActivity::class.java)
            startActivity(myIntent)
        }
        binding.notedtocheckbtn.setOnClickListener {
            //실시간 화면으로 이동
            val myIntent = Intent( this, CheckActivity::class.java)
            startActivity(myIntent)
        }
        binding.notedtonotedbtn.setOnClickListener {
            //공지 화면으로 이동
            val myIntent = Intent( this, NotedActivity::class.java)
            startActivity(myIntent)
        }
        binding.notedtouserbtn.setOnClickListener {
            //유저 화면으로 이동
            val myIntent = Intent( this, UserActivity::class.java)
            startActivity(myIntent)
        }
    }
}