package com.example.funciones1

class Estudiante(var nombre:String,var  edad:Int,var lenguajes:Array<lengua>, var amigo:Array<Estudiante>? = null) {

    enum class  lengua{
        KOTLIN,
        PHP,
        JAVA,
        JAVASCRIPT,
        PYTHON
    }


    fun codigo(){

        for(lenguaje:lengua  in lenguajes){

            println("Los lenguajes de progrmacion son: $lenguaje")
        }
    }
}