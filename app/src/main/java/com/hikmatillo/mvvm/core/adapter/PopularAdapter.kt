package uz.hikmatillo.mynewsapi.core.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.hikmatillo.mvvm.core.model.popular.PopularResult
import com.hikmatillo.mvvm.databinding.ItemFilmsBinding



class PopularAdapter : RecyclerView.Adapter<PopularAdapter.NewsViewHolder>() {

    private val data = ArrayList<PopularResult?>()
    var itemNewsClick: ((data: PopularResult) -> Unit)? = null

    fun setData(data: List<PopularResult?>){
        this.data.clear()
        this.data.addAll(data)
        notifyDataSetChanged()
    }

    inner class NewsViewHolder(private val binding: ItemFilmsBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bindData(data: PopularResult) {
            binding.filmImage.load("https://image.tmdb.org/t/p/original${data.posterPath}")
            binding.filmDescription.text = data.title

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        return NewsViewHolder(
            ItemFilmsBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int = data.size


    override fun onBindViewHolder(holder: PopularAdapter.NewsViewHolder, position: Int) {
        holder.bindData(data[position]!!)
    }


}