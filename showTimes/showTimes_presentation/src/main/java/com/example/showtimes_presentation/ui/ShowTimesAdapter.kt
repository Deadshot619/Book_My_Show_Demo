package com.example.showtimes_presentation.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.showtimes_domain.model.Venue
import com.example.showtimes_presentation.databinding.ItemShowTimesBinding

class ShowTimesAdapter: ListAdapter<Venue, ShowTimesAdapter.ShowTimesViewHolder>(DIFF_UTIL) {

    //region Overridden methods
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShowTimesViewHolder {
        return ShowTimesViewHolder(
            ItemShowTimesBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: ShowTimesViewHolder, position: Int) {
        holder.onBind(getItem(position))
    }
    //endregion Overridden methods

    //region ViewHolders
    inner class ShowTimesViewHolder(val mBinding: ItemShowTimesBinding): RecyclerView.ViewHolder(mBinding.root) {

        fun onBind(data: Venue) {
            setUpViews(data)
        }

        private fun setUpViews(data: Venue) {
            mBinding.run {
                tvTitle.text = data.name
                tvShowDate.text= data.showDate
            }
        }
    }
    //endregion ViewHolders


    companion object DIFF_UTIL: DiffUtil.ItemCallback<Venue>() {
        override fun areItemsTheSame(oldItem: Venue, newItem: Venue): Boolean {
            return oldItem.name == newItem.name
        }

        override fun areContentsTheSame(oldItem: Venue, newItem: Venue): Boolean {
            return oldItem == newItem
        }
    }
}