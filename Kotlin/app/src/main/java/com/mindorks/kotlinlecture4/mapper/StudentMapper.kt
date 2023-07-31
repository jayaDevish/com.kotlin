package com.mindorks.kotlinlecture4.mapper

import com.mindorks.kotlinlecture4.model.ApiStudent
import com.mindorks.kotlinlecture4.model.Student

object StudentMapper {

    fun map(apiStudent: ApiStudent): Student {

        return Student(
            apiStudent.firsName + " " + apiStudent.lastName,
            apiStudent.averageMark
        )
    }
}