package com.developersbreach.noargsfragment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.NavController
import androidx.recyclerview.widget.RecyclerView
import com.developersbreach.noargsfragment.MovieAdapter.*


class MovieAdapter(
    private val movieList: List<Movie>,
    private val findNavController: NavController
) : RecyclerView.Adapter<MovieViewHolder>() {

    class MovieViewHolder(
        itemView: View
    ) : RecyclerView.ViewHolder(itemView) {

        private val title: TextView = itemView.findViewById(R.id.item_text_view)

        fun bind(movie: Movie, navController: NavController) {
            title.text = movie.title
            title.setOnClickListener {
                navController.navigate(ListFragmentDirections.listToDetailFragment(movie))
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        return MovieViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_movie, parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie = movieList[position]
        holder.bind(movie, findNavController)
    }

    override fun getItemCount() = movieList.size
}