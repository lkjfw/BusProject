package com.ansan.busproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ansan.busproject.databinding.ActivityCheckBinding

class CheckActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCheckBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check)

        binding = ActivityCheckBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.checktomainbtn.setOnClickListener {
            //메인 화면으로 이동
            val myIntent = Intent( this, MainActivity::class.java)
            startActivity(myIntent)
        }
        binding.checktotimebtn.setOnClickListener {
            //시간 화면으로 이동
            val myIntent = Intent( this, timeActivity::class.java)
            startActivity(myIntent)
        }
        binding.checktocheckbtn.setOnClickListener {
            //실시간 화면으로 이동
            val myIntent = Intent( this, CheckActivity::class.java)
            startActivity(myIntent)
        }
        binding.checktonotedbtn.setOnClickListener {
            //공지 화면으로 이동
            val myIntent = Intent( this, NotedActivity::class.java)
            startActivity(myIntent)
        }
        binding.checktouserbtn.setOnClickListener {
            //유저 화면으로 이동
            val myIntent = Intent( this, UserActivity::class.java)
            startActivity(myIntent)
        }
    }
}