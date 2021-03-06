object Permutations {

  fun <T> List<T>.permutations(k0: Int = this.size): List<List<T>> {

    val n = this.size
    val k = if(k0 > n) n else k0

    fun <T> List<T>.generatePermutations(k: Int, n: Int): List<List<T>> {

      var retList = emptyList<List<T>>().toMutableList()

      this.forEach { a ->
        if (this.size == n - k + 1)
          retList.add(listOf(a))

        else {
          var nextList = emptyList<T>().toMutableList()
          this.forEach { b -> if (a != b) nextList.add(b) }
            nextList.generatePermutations(k, n).forEach { c -> retList.add(listOf(a).plus(c)) }
        }
      }
      return retList.toList()
    }
    return this.generatePermutations(k, n)
  }

  fun permutations(n: Int = 0, k0: Int = n): List<List<Int>> =
    return List<Int>(n){it}.permutations(k0)
}