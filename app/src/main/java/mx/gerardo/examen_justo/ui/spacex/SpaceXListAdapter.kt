package mx.gerardo.examen_justo.ui.spacex

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import mx.gerardo.examen_justo.R
import mx.gerardo.examen_justo.databinding.CardSpacexItemBinding
import mx.gerardo.examen_justo.model.api.SpaceXResponseItem

class SpaceXListAdapter(val click: (Int) -> Unit): RecyclerView.Adapter<SpaceXListAdapter.ViewHolder>() {
    var rocketsList: List<SpaceXResponseItem> = emptyList<SpaceXResponseItem>()


    fun setData(list: List<SpaceXResponseItem>){
        rocketsList = list
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.card_spacex_item, parent, false))
    }


    override fun getItemCount(): Int {
        return rocketsList.size
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val rocket = rocketsList[position]
        holder.itemView.setOnClickListener { click(position + 1) }

        holder.bind(rocket)
    }



    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        private val binding = CardSpacexItemBinding.bind(itemView)

        fun bind(rockets: SpaceXResponseItem){
            Glide.with(itemView).load(rockets.flickr_images[0]).into(binding.imageView)
            binding.rocketTypeText.text = rockets.rocket_type
            binding.nameText.text = rockets.rocket_name
            if (rockets.active) binding.statusText.text = "Active" else binding.statusText.text = "Inactive"

        }
    }
}
