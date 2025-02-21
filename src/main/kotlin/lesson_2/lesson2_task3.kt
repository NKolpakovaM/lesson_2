fun main() {
    val departureHour = 9
    val departureMinutes = 39
    val timeFraction = 60
    val timePassed = (departureHour * timeFraction) + departureMinutes
    val travelTime = 457
    val overallTime = timePassed + travelTime
    val overallHours = overallTime / timeFraction
    val overallMinutes = overallTime % timeFraction
    println("Время прибытия поезда: $overallHours:$overallMinutes")
}