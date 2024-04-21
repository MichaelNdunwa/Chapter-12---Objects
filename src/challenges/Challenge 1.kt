package challenges

/***
 * 1. Create a named object that lets you check whether a given Int value is above a
 *      threshold. Name the object Threshold and add a method isAboveThreshold(value: Int)
 */

fun main() {
    val voltage = 232
    Threshold.isAboveThreshold(voltage)
}

object Threshold {
    fun isAboveThreshold(value: Int) {
        if (value > 240) {
            println("The voltage have passed it threshold.")
        } else {
            println("The voltage is below it's threshold.")
        }
    }
}

object VoltageMax {
    private const val normalVoltage = 240
    fun isAboveVoltageMax(voltage: Int) = voltage > normalVoltage
}