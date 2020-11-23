package me.naganithin.bdaa.hw8common

/* Kotlin Data Class to not have any boilerplate */
data class KafkaWeatherReport(var airport: String,
                              var clear: Boolean,
                              var fog: Boolean,
                              var rain: Boolean,
                              var snow: Boolean,
                              var hail: Boolean,
                              var thunder: Boolean,
                              var tornado: Boolean)
