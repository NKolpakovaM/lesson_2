fun main() {
    val crystalOre: Int = 7
    val ironOre: Int = 11

    val buffPercentage: Double = 0.20

    val crystalBonus = (crystalOre * buffPercentage).toInt()
    val ironBonus = (ironOre * buffPercentage).toInt()

    println("Бонусная кристаллическая руда: $crystalBonus")
    println("Бонусная железная руда: $ironBonus")
}