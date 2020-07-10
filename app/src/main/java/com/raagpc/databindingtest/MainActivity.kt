package com.raagpc.databindingtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.databinding.DataBindingUtil
import com.raagpc.databindingtest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel
    private lateinit var mIncrementButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding =  DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = MainViewModel()
        mBinding.viewModel = viewModel
        mBinding.lifecycleOwner = this

        mIncrementButton = findViewById(R.id.increment_button)
        setupEvents()
    }

    private fun setupEvents() {
        mIncrementButton.setOnClickListener {
            viewModel.incrementCounter()
        }
    }
}