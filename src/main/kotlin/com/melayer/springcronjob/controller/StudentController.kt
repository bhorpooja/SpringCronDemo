package com.melayer.springcronjob.controller

import com.melayer.springcronjob.repository.StudentRepository
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/student")
class StudentController(
        private val studentRepository: StudentRepository
) {
    private val encoder = BCryptPasswordEncoder()

    fun saveStudent(){

    }
}