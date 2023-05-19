package com.example.showtimes_presentation.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import com.example.common.BaseActivity
import com.example.showtimes_presentation.databinding.ActivityShowTimesBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

@AndroidEntryPoint
class ShowTimesActivity: BaseActivity() {

    private var _mBinding: ActivityShowTimesBinding? = null
    private val mBinding: ActivityShowTimesBinding
        get() = _mBinding!!

    private var mAdapter: ShowTimesAdapter? = null

    private val mViewModel: ShowTimesViewModel by viewModels()

    //region Lifecycle methods
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _mBinding = ActivityShowTimesBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        setUpViews()
        setUpObservers()
    }
    //endregion Lifecycle methods

    private fun setUpViews() {
        mBinding.run {
            mAdapter = ShowTimesAdapter()
            rvShowTimes.adapter = mAdapter
        }
    }

    private fun setUpObservers(){
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                mViewModel.showTimes.collectLatest {
                    when {
                        it.isLoading -> {
                            mBinding.clpProgressBar.show()
                        }
                        it.error.isNotBlank() -> {
                            mBinding.clpProgressBar.hide()
                            showToast(it.error)
                        }
                        it.data.isNullOrEmpty().not() -> {
                            mBinding.clpProgressBar.hide()
                            mAdapter?.submitList(it.data)
                            showToast(it.data?.first()?.name.toString())
                        }
                    }
                }
            }
        }
    }

    companion object {

        fun newInstance(context: Context) = Intent(context, ShowTimesActivity::class.java)
    }
}