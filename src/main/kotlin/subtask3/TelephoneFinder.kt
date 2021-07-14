package subtask3

class TelephoneFinder {

    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {
        if (number.isEmpty() || number.toInt() < 0) {
            return null
        }

        val list = arrayListOf<String>()
        var arr: Array<Char>
        var buffer: StringBuffer

        for (i in number.indices) {
            arr = check(number[i])
            buffer = StringBuffer(number)
            arr.forEach {
                buffer.setCharAt(i, it)
                list.add(buffer.toString())
            }
        }

        return list.toTypedArray()
    }

    private fun check(number: Char): Array<Char> {
        return when (number) {
            '8' -> arrayOf('0', '7', '5', '9')
            '7' -> arrayOf('4', '8')
            '6' -> arrayOf('9', '5', '3')
            '5' -> arrayOf('8', '4', '2', '6')
            '4' -> arrayOf('1', '5', '7')
            '3' -> arrayOf('6', '2')
            '2' -> arrayOf('1', '3', '5')
            '1' -> arrayOf('4', '2')
            '0' -> arrayOf('8')
            else -> arrayOf('6', '8')
        }
    }
}
