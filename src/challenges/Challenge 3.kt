package challenges

/***
 * 3. create an anonymous object that implements the following interface:
 *      interface ThresholdChecker {
 *          val lower: Int
 *          val upper: Int
 *
 *          /**
 *          * Returns true if value is higher than the upper threshold
 *          * and false otherwise
 *          */
 *
 *          fun isLit(value: Int): Boolean
 *
 *          /**
 *          * Returns true if value is less than the lower threshold
 *          * and false otherwise
 *          */
 *
 *          fun tooQuiet(value: Int): Boolean
 *
 *      }
 *      Use a lower value of 7 and an upper value of 10 in the anonymous object
 */

fun main() {
    val threshold = object : ThresholdChecker {
        override val lower = 7
        override val upper = 10

        override fun isList(value: Int): Boolean {
            TODO("Not yet implemented")
        }

        override fun tooQuiet(value: Int): Boolean {
            TODO("Not yet implemented")
        }
    }
}

interface ThresholdChecker {
    val lower: Int
    val upper: Int

    fun isList(value: Int): Boolean
    fun tooQuiet(value: Int): Boolean
}