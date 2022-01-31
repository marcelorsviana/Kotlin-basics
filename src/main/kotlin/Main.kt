fun main() {

    println(
        """
            This is an exercise done through the codelabs in Kotlin Bootcamp for Programmers (https://developer.android.com/courses/kotlin-bootcamp/overview) provided by Google Developers.
            Here are the lessons, which theses codelabs covered:
            
            lesson 1: Get started
            
                - Kotlin REPL
            
            Lesson 2: Kotlin basics
            
                - Kotlin data types, operators, and variables;
                - How to work with booleans and conditions;
                - Exploring the difference between nullable and non-nullable variables;
                - Practicing using arrays, lists, and loops in Kotlin.
            
        """.trimIndent()
    )

    println(2 + 2)
    println(1 + 1)
    println(53 - 3)
    println(50 / 10)
    println(1.0 / 2.0)
    println(2.0 * 3.5)
    println(6 * 50)
    println(6.0 * 50.0)
    println(6 * 50.0)
    println(6.0 * 50)
    println(2.times(3))
    println(3.5.plus(4))
    println(2.4.div(2))
    println(2.4.div(2))

    println()
    val i: Int = 6
    val b1 = i.toByte()
    println(b1)

    println()
    val b2: Byte = 1
    println(b2)
    println()

    /*
    The lines below show that we need to pay attention to the type of the variable while we are
    assigning a value to it. As the types differ, so it is not possible to assign the value to the variable.
    */

//    val i1: Int = b2
//    error: type mismatch: inferred type is Byte but Int was expected
//
//    val i2: String = b2
//    error: type mismatch: inferred type is Byte but String was expected
//
//    val 13: Double = b2
//    error: expecting property name or receiver type
//
//    val i3: Double = b2
//    error: type mismatch: inferred type is Byte but Double was expected


    val i4: Int = b2.toInt()
    println(i4)

    println()
    val i5: String = b2.toString()
    println(i5)

    println()
    val i6: Double = b2.toDouble()
    println(i6)

    val oneMillion = 1_000_000
    val socialSecurityNumber = 999_99_9999L
    val hexBytes = 0xFF_EC_DE_5E
    val bytes = 0b11010010_01101001_10010100_10010010


    /*
    In the lines below it is shown that we can't change the value of a variable declared with 'val',
    but if the variable is declared with 'var', we can change it.
     */

//    var fish = 1
//    fish = 2
//    val aquarium = 1
//    aquarium = 2
//    error: val cannot be reassigned

    println()
    val numberOfFish = 5
    val numberOfPlants = 12
    println("I have $numberOfFish fish" + " and $numberOfPlants plants")
    print("OR")
    println("I have $numberOfFish fish and $numberOfPlants plants")

    println()
    println("I have ${numberOfFish + numberOfPlants} fish and plants")

    println()
    val numberOfFishVal2 = 50
    val numberOfPlantsVal2 = 23
    if (numberOfFishVal2 > numberOfPlantsVal2) {
        println("Good ratio!")
    } else {
        println("Unheathy ratio")
    }

    println()
    val fish = 50
    if (fish in 1..100) {
        println(fish)
    }

    println()
    if (numberOfFish == 0) {
        println("Empty tank")
    } else if (numberOfFish < 40) {
        println("Got fish!")
    } else {
        println("That's a lot of fish!")
    }

    println()
    when (numberOfFish) {
        0 -> println("Empty tank")
        in 1..39 -> println("Got fish!")
        else -> println("That's a lot of fish!")
    }

    /*
    The code below show that we can't assign a null value without the ?
    */

//    val rocks: Int = null
//    error: null can not be a value of a non-null type Int

    println()
    val rocks: Int? = null
    println(rocks)

    println()
    var fishFoodTreats1 = 6
    if (fishFoodTreats1 != null) {
        fishFoodTreats1 = fishFoodTreats1.dec()
    }

    var fishFoodTreats = 6
    fishFoodTreats = fishFoodTreats?.dec()

    fishFoodTreats = fishFoodTreats?.dec() ?: 0

    println("It's shorthand for if fishFoodTreats is not null, decrement and use it; otherwise use the value after the ?:, " +
            "which is 0. If fishFoodTreats is null, evaluation is stopped, and the dec() method is not called.")

    println()
    val school1 = listOf("mackerel", "trout", "halibut")
    println(school1)

    val myList = mutableListOf("tuna", "salmon", "shark")
    myList.remove("shark")

    println()
    val school2 = arrayOf("shark", "salmon", "monnow")
    println(java.util.Arrays.toString(school2))

    val mix = arrayOf("fish", 2)

    val numbers2 = intArrayOf(1, 2, 3)

    val numbers3 = intArrayOf(4, 5, 6)
    val foo2 = numbers3 + numbers2
    println(foo2[5])

    println()
    println(java.util.Arrays.toString(foo2))

    println()
    val numbers = intArrayOf(1, 2, 3)
    val oceans = listOf("Atlantic", "Pacific")
    val oddList = listOf(numbers, oceans, "salmon")
    println(oddList)

    println()
    val array = Array(5) { it * 2 }
    println(java.util.Arrays.toString(array))

    println()
    val school3 = arrayOf("shark", "salmon", "minnow")
    for (element in school3) {
        print(element + " ")
    }

    println()
    val school4 = arrayOf("shark", "salmon", "minnow")
    for (it in school4) {
        print(it + " ")
    }

    println()
    val school5 = arrayOf("shark", "salmon", "minnow")
    for (a in school5) {
        print(a + " ")
    }

    println()
    for ((index, element) in school5.withIndex()) {
        println("Item at $index is $element\n")
    }

    for (i in 1..5) print(i)

    println()
    for (i in 5 downTo 1) print(i)

    println()
    for (i in 3..6 step 2) print(i)

    println()
    for (i in 'd'..'g') print(i)

    println()
    println()
    var bubbles1 = 0
    while (bubbles1 < 50) {
        bubbles1++
    }
    println("$bubbles1 bubbles in the water\n")

    do {
        bubbles1--
    } while (bubbles1 > 50)
    println("$bubbles1 bubbles in the water\n")

    repeat(2) {
        println("A fish is swimming")
    }
}