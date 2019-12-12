package com.kucingselfie.dicodingjetpacksubmission1.ui.tvshow

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.kucingselfie.dicodingjetpacksubmission1.databinding.ItemMovieBinding
import com.kucingselfie.dicodingjetpacksubmission1.databinding.ItemTvshowBinding
import com.kucingselfie.dicodingjetpacksubmission1.model.Movie
import com.kucingselfie.dicodingjetpacksubmission1.model.TVShow

class TVShowAdapter :
    ListAdapter<TVShow, TVShowAdapter.ViewHolder>(DiffCallback) {
    class ViewHolder(private var binding: ItemTvshowBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(tvshow: TVShow) {
            binding.model = tvshow
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemTvshowBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val tvshow = getItem(position)
        holder.bind(tvshow)
    }

    companion object DiffCallback : DiffUtil.ItemCallback<TVShow>() {
        override fun areItemsTheSame(oldItem: TVShow, newItem: TVShow): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: TVShow, newItem: TVShow): Boolean {
            return oldItem == newItem
        }
    }
}