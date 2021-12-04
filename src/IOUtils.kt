fun <T> List<T>.print() =
    println(joinToString(" "))

fun readIntList(): List<Int> =
    readLine()?.let{ line -> line.split(" ").map{it.toInt()}} ?: emptyList()

fun readList(): List<String> =
    readLine()?.let{ line -> line.split(" ")} ?: emptyList()