
fun main() {
    val emmy = Scientist.Factory.newScientist("Emmy", "Noether") // Using the companion object name when accessing companion object member is redundant in Kotlin.
    val isaac = Scientist.newScientist("Isaac", "Newton")
    val nick = Scientist.newScientist("Nikola", "Tesla")

    ScientistRepository.addScientist(emmy)
    ScientistRepository.addScientist(isaac)
    ScientistRepository.addScientist(nick)

    ScientistRepository.listAllScientists()
}

/// Creating companion objects
class Scientist private constructor(
    val id: Int,
    val firstName: String,
    val lastName: String
) {

    companion object Factory {
        var currentId = 0

        fun newScientist(
            firstName: String,
            lastName: String
        ): Scientist {
            currentId += 1
            return Scientist(currentId, firstName, lastName)
        }
    }


    var fullName = "$firstName $lastName"
}


// Scientist Repository
object ScientistRepository {
    val allScientist = mutableListOf<Scientist>()

    fun addScientist(scientist: Scientist) {
        allScientist.add(scientist)
    }

    fun removeScientist(scientist: Scientist) {
        allScientist.remove(scientist)
    }

    fun listAllScientists() {
        allScientist.forEach {
            println("${it.id}: ${it.fullName}")
        }
    }
}