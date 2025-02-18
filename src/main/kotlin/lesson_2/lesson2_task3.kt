fun main() {
    val departureHour = 9
    val departureMinutes = 39
    val timePassed = (departureHour * 60) + departureMinutes
    val travelTime = 457
    val overallTime = timePassed + travelTime
    val overallHours = overallTime / 60
    val overallMinutes = overallTime % 60
    println("Время прибытия поезда: $overallHours:$overallMinutes")
}