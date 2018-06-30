package com.melayer.springcronjob.domain

import com.fasterxml.jackson.annotation.JsonInclude
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@JsonInclude(JsonInclude.Include.NON_NULL)
@Document(collection = "student")
class Student(

        @Id
        val id: String? = null,

        var name: String? = null,

        var emailId: String? = null,

        var contactNo: String? = null,

        var address: String? = null,

        var date: Long = System.currentTimeMillis()

) {
}