package com.example.laboratorio05.ui.movie

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.laboratorio05.R
import com.example.laboratorio05.data.model.MovieModel


class SecondFragment : Fragment() {

    private val movieViewModel: MovieViewModel by activityViewModels {
        MovieViewModel.Factory
    }

    private lateinit var nameMovieEditText: EditText
    private lateinit var nameCategoryEditText : EditText
    private lateinit var nameQualificationEditText: EditText
    private lateinit var descriptionEditText: EditText
    private lateinit var submitMovieButton: Button


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bind()

        submitMovieButton.setOnClickListener{
            addMovies()
        }
    }

    private fun bind(){
        nameMovieEditText = view?.findViewById(R.id.name_movie) !!
        nameCategoryEditText = view?.findViewById(R.id.name_category) !!
        nameQualificationEditText =view?.findViewById(R.id.name_calification) !!
        descriptionEditText = view?.findViewById(R.id.name_description) !!
        submitMovieButton = view?.findViewById(R.id.submitMovie) !!

    }

    private fun addMovies(){
        val name = nameMovieEditText.text.toString()
        val category = nameCategoryEditText.text.toString()
        val description = descriptionEditText.text.toString()
        val qualification = nameQualificationEditText.text.toString()

        val movie = MovieModel(name, category, description, qualification)

        movieViewModel.addMovies(movie)

        Log.d("NewMovieFragment", movieViewModel.getMovies().toString())

        findNavController().popBackStack()
    }


}