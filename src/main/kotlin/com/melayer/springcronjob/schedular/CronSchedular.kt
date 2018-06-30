package com.melayer.springcronjob.schedular

import org.slf4j.LoggerFactory
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component
import java.util.*

@Component
class CronSchedular() {
    private companion object {
        var map = HashMap<String, Any>()
        val log = LoggerFactory.getLogger(CronSchedular::class.java)
    }

    @Scheduled(fixedDelay = 1000)
    fun scheduleFixedDelayTask() {
        log.info("Fixed delay task : ${System.currentTimeMillis() / 1000}")
    }

    @Scheduled(fixedRate = 1000)
    fun scheduleFixedRateTask() {
        log.info("Fixed rate task : ${System.currentTimeMillis() / 1000}")
    }

    @Scheduled(fixedDelay = 1000, initialDelay = 2000)
    fun scheduleFixedRateWithInitialDelayTask() {

        val now = System.currentTimeMillis() / 1000
        log.info("Fixed rate task with one second initial delay - $now")
    }

//    Below you can find the example patterns from the spring forum:
//    * "0 0 * * * *" = the top of every hour of every day.
//    * "*/10 * * * * *" = every ten seconds.
//    * "0 0 8-10 * * *" = 8, 9 and 10 o'clock of every day.
//    * "0 0 8,10 * * *" = 8 and 10 o'clock of every day.
//    * "0 0/30 8-10 * * *" = 8:00, 8:30, 9:00, 9:30 and 10 o'clock every day.
//    * "0 0 9-17 * * MON-FRI" = on the hour nine-to-five weekdays
//    * "0 0 0 25 12 ?" = every Christmas Day at midnight

//    Cron expression is represented by six fields:
//    second, minute, hour, day of month, month, day(s) of week

    @Scheduled(cron = "0 0/5 * * * ?")
    fun schedule() {
        log.info("Schedule @ " + Date())
        log.info("@Scheduled(cron=\"* * * * * *\")")
        log.info("*****Every Five Minutes*****")
        currentTime()
    }
//
    private fun currentTime() {
        log.info("Current TimeMillis : ${System.currentTimeMillis()}")
    }

}