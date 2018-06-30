package com.melayer.springcronjob

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Configuration
import org.springframework.scheduling.annotation.EnableScheduling

@SpringBootApplication
@Configuration
@EnableScheduling
class SpringcronjobApplication

fun main(args: Array<String>) {
    runApplication<SpringcronjobApplication>(*args)
}
