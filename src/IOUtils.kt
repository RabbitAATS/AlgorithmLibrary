fun printIntList(a: List<Int>) {

    println(a.joinToString(" "))
}

fun printListOfIntList(a: List<List<Int>>) {

    for(i in 0 .. a.size -1) {
        println(a[i].joinToString(" "))
    }
}