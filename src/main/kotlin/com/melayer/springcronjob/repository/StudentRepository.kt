package com.melayer.springcronjob.repository

import com.melayer.springcronjob.domain.Student
import org.springframework.data.mongodb.repository.ReactiveMongoRepository

interface StudentRepository : ReactiveMongoRepository<Student, String> {
}
