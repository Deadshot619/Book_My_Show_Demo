package com.example.bookmyshowdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.bookmyshowdemo.databinding.ActivityMainBinding
import com.example.common.BaseActivity

class MainActivity : BaseActivity() {

    var mBinding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding?.root)
    }
}