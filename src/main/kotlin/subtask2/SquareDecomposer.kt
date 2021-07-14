package subtask2

import java.util.*
import kotlin.collections.ArrayList

class SquareDecomposer {

    fun decomposeNumber(number: Int): Array<Int>? {
        return findDec(square(number), number)?.toTypedArray()
    }

    private fun findDec(sum: Long, number: Int): ArrayList<Int>? {
        var list: ArrayList<Int>? = null
        var buffNumber = number

        if (sum < 0) {
            return null
        }
        if (sum == 0L) {
            return arrayListOf()
        }

        while (list == null && buffNumber > 1) {
            buffNumber--
            val newSum = sum - (buffNumber.toLong() * buffNumber.toLong())
            list = findDec(newSum, buffNumber)
        }
        list?.add(buffNumber)
        return list
    }

    private fun square(a: Int): Long {
        return a.toLong() * a.toLong()
    }

}
