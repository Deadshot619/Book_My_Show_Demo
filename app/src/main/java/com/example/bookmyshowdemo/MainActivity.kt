package com.example.bookmyshowdemo

import android.os.Bundle
import com.example.bookmyshowdemo.databinding.ActivityMainBinding
import com.example.common.BaseActivity
import com.example.showtimes_presentation.ui.ShowTimesActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity() {

    var mBinding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding?.root)

        setUpListeners()
    }

    private fun setUpListeners() {
        mBinding?.run {
            btnShowTimes.setOnClickListener {
                goToShowTimesActivity()
            }
        }
    }

    private fun goToShowTimesActivity() {
//        lifecycleScope.launch {
//            delay(3000L)
            startActivity(ShowTimesActivity.newInstance(this@MainActivity))
//        }
    }
}