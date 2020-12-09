package com.example.hrybkov_l3

fun main(){
    val listOfNumbers = listOf(1, 2, 3, 2, 45, 56, 34, 24, 2, 34, 65, 477)
    val countNumbersInList = listOfNumbers.groupingBy { it }.eachCount()
    val maximumRecurringElementInList = countNumbersInList.maxByOrNull { it.value }
    println("Наиболее повторяющийся элемент в списке: ${maximumRecurringElementInList?.key} \n" +
            "Количество повторений элемента: ${maximumRecurringElementInList?.value}")
}