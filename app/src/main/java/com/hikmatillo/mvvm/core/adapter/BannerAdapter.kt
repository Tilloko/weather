package uz.hikmatillo.mynewsapi.core.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.hikmatillo.mvvm.core.model.now.BannerResult
import com.hikmatillo.mvvm.databinding.ItemBannerBinding



class BannerAdapter : RecyclerView.Adapter<BannerAdapter.BannerViewHolder>() {

    private val data = ArrayList<BannerResult>()

    fun setData(data: List<BannerResult>) {
        this.data.clear()
        this.data.addAll(data)
        notifyDataSetChanged()
    }

    inner class BannerViewHolder(private val binding: ItemBannerBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bindData(data: BannerResult) {
            binding.bannerImage.load("https://image.tmdb.org/t/p/original${data.posterPath}")
            binding.text.text = data.title
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BannerViewHolder {
        return BannerViewHolder(
            ItemBannerBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: BannerViewHolder, position: Int) {
        holder.bindData(data[position])
    }
}
