package com.developersbreach.noargsfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_list.*

class ListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val movieList = Movie.movieData()
        val recyclerView = view.findViewById<RecyclerView>(R.id.recycler_view)
        val adapter = MovieAdapter(movieList, findNavController())
        recyclerView.adapter = adapter

        fab.setOnClickListener {
            findNavController().navigate(
                ListFragmentDirections.listToDetailFragment(null)
            )
        }
    }
}