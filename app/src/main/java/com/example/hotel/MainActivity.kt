package com.example.hotel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hotel.databinding.ActivityMainBinding
import com.example.hotel.databinding.FragmentHotelBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}