package org.example

fun main() {
    val hours = 9
    val minutes = 39
    val time = 457
    val arrivalTimeHours = time / 60
    var hoursArrival = hours + arrivalTimeHours
    val arrivalTimeMinutes = time % 60
    var minutesArrival = minutes + arrivalTimeMinutes
    var addHours = minutesArrival / 60
    hoursArrival += addHours
    var addMinutes = minutesArrival % 60
    minutesArrival += addMinutes
    minutesArrival = addMinutes
    println("Время прибытия поезда: $hoursArrival:$minutesArrival")
}