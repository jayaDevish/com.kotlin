package com.mindorks.kotlinlecture4.services

import com.mindorks.kotlinlecture4.model.ApiStudent

class NetworkService {

    fun getTopperStudent() = ApiStudent("Aamir", "Khan", 90)

    fun getListOfStudent(): List<ApiStudent> {

        val listOfStudent: List<ApiStudent> = listOf(
            ApiStudent("Aamir", "Khan", 90),
            ApiStudent("Amit", "Shekar", 90),
            ApiStudent("Janisar", "Ali", 90),
            ApiStudent("Anand", "Gaurav", 90)
        )

        return listOfStudent
    }

    fun getStudentClassWise(): Map<String, List<ApiStudent>> {

        val classAStudents: MutableList<ApiStudent> = mutableListOf(
            ApiStudent("Aamir", "Khan", 90),
            ApiStudent("Amit", "Shekar", 90)
        )

        val classBStudents: MutableList<ApiStudent> = mutableListOf(
            ApiStudent("Janisar", "Ali", 90),
            ApiStudent("Anand", "Gaurav", 90)
        )

        val classWiseStudent: MutableMap<String, MutableList<ApiStudent>> = mutableMapOf(
            "ClassB" to classBStudents,
            "ClassA" to classAStudents
        )

       classWiseStudent.put("ClassC" , classBStudents)

        return classWiseStudent
    }
}