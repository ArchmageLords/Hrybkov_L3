package com.example.hrybkov_l3

fun main(){
    val map: MutableMap<Int, String> = HashMap()
    map[1] = "First"
    map[5] = "Fifth"
    map[2] = "Second"
    map[4] = "Fourth"
    map[3] = "Third"

    val sortedMapByKey: MutableMap<Int, String> = HashMap()
    map.entries.sortedBy { it.key }
            .forEach { sortedMapByKey[it.key] = it.value }
    println("Отсортированный по ключу map: $sortedMapByKey")
}