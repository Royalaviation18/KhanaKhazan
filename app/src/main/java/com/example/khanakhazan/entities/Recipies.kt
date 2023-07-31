package com.example.khanakhazan.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

//Data class is a simple class which is used to hold data/state and contains standard functionality.
// A data keyword is used to declare a class as a data class.
// Declaring a data class must contains at least one primary constructor with property argument (val or var)

@Entity(tableName = "Recipes")
data class Recipies(
    @PrimaryKey(autoGenerate = true)
    var id: Int,
) : Serializable