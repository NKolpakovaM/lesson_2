package org.example

fun main() {
    val workers = 50
    val salaryWorkers = 30000
    val newcomers = 30
    val salaryNewcomers = 20000
    val regularSalary = workers * salaryWorkers
    val increasedSalary = regularSalary + (newcomers * salaryNewcomers)
    val averageSalary = increasedSalary / (workers + newcomers)
    println("Расходы на выплату зарплаты для постоянных сотрудников: $regularSalary")
    println("Общие расходы по ЗП после прихода стажеров: $increasedSalary")
    println("Средняя ЗП одного сотрудника после устройства стажеров: $averageSalary")
}