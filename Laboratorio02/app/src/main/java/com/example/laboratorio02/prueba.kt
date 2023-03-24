package com.example.laboratorio02

import androidx.core.util.rangeTo
import kotlin.math.*

fun main() {

    calcuteFunction(69, 172)

}

fun calcuteFunction(weight: Int, height: Int) {
    val calculateBMI: Double = (weight / height.toDouble().pow(2))
    println(calculateBMI)


    if(calculateBMI <= 18.5){
        println("entre 1")

    }else if (calculateBMI in 18.5..24.99){
        println("entre 2")

    }else if (calculateBMI in 25.0..29.99){
        println("entre 3")

    }else if (calculateBMI >= 30 ){
        println("entre 4")

    }else
    {
        println("invalido")
    }

}