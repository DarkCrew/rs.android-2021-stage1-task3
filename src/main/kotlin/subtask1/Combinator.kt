package subtask1

class Combinator {

    fun checkChooseFromArray(array: Array<Int>): Int? {
        val m = array[0]
        val n = array[1]
        if (m == 0) {
            return null
        }
        if (m == n) {
            return 1
        }
        val znachLev = factorial(n) / m
        for (x in 1..(n / 2)) {
            if (znachLev == factorial(x) * factorial((n - x))) {
                return x
            }
        }
        return null
    }

    fun factorial(fac: Int): Long {
        var result: Long = 1
        for (i in 1..fac) {
            result *= i
        }
        return result
    }
}
