package com.developersbreach.noargsfragment

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Movie(
    val title: String
) : Parcelable {

    companion object {
        fun movieData(): List<Movie> = listOf(
            Movie("Spectre"),
            Movie("SkyFall"),
            Movie("Tenet"),
            Movie("Salt"),
            Movie("Sherlock Holmes"),
            Movie("Parasite"),
            Movie("Black Widow"),
            Movie("DoLittle"),
            Movie("Baby Driver"),
            Movie("Iron Man"),
            Movie("Civil War"),
            Movie("Extraction"),
            Movie("Inception"),
            Movie("Matrix"),
            Movie("Star Wars"),
            Movie("BloodShot"),
        )
    }
}