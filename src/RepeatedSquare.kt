fun repeatedSquare(a: Long, b: Long, mod: Long): Long {

    if(b == 0.toLong())
        return 1
    if(b == 1.toLong())
        return a % mod
    if(b % 2.toLong() == 1.toLong())
        return (a * repeatedSquare(a, b - 1, mod)) % mod
    val y =  repeatedSquare(a, b / 2, mod)
    return (y * y) % mod
}