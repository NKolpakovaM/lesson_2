import java.math.BigDecimal
fun main() {
    val crystalOre = BigDecimal(7)
    val ironOre = BigDecimal(11)
    val buffPercentage = BigDecimal("0.20")
    val crystalBonus = crystalOre * buffPercentage
    val ironBonus = ironOre * buffPercentage
    println("Бонусная кристаллическая руда: $crystalBonus") // Output: 1.40
    println("Бонусная железная руда: $ironBonus") // Output: 2.20
}