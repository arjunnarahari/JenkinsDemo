package com.example.jenkinstestapplication.activities

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.jenkinstestapplication.databinding.ActivityHomeBinding
import com.example.jenkinstestapplication.helper.Constants

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding
    private lateinit var context : Context

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        context = this
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        if(intent.hasExtra(Constants.SOURCE) && intent.getStringExtra(Constants.SOURCE)!=null){
            binding.textFromActivity.text = "from "+intent.getStringExtra(Constants.SOURCE)
        }
    }
}