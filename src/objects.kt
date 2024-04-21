//import jdk.jfr.internal.test.DeprecatedMethods.counter

fun main() {
    Student.numberOfStudents()

    val marie = Student(1, "Marie", "Curie")
    val albert = Student(2, "Albert", "Einstein")
    val emmy = Student(3, "Emmy", "Noether")

    StudentRegistry.addStudent(marie)
    StudentRegistry.addStudent(albert)
    StudentRegistry.addStudent(emmy)

    StudentRegistry.listAllStudents()
    Student.numberOfStudents()
}

class Student(
    val id: Int,
    val firstName: String,
    val lastName: String
) {
    var fullName = "$lastName, $firstName"

    companion object {
        var registeredStudentsCounter = 0

        fun numberOfStudents() {
            when {
                registeredStudentsCounter < 0 -> println("There is now student in the student registry.")
                registeredStudentsCounter == 1 -> println("$registeredStudentsCounter in the Student Registry.")
                else -> println("$registeredStudentsCounter students created in the Student Registry.")
            }
        }
    }

    init {
        registeredStudentsCounter++
    }

}


// Student Registry
object StudentRegistry {
    val allStudents = mutableListOf<Student>()

    fun addStudent(student: Student) {
        allStudents.add(student)
    }

    fun removeStudent(student: Student) {
        allStudents.remove(student)
    }

    fun listAllStudents() {
        allStudents.forEach {
            println(it.fullName)
        }
    }
}


// Another example use case is to object to provide a namespace for constants and methods that need to be referenced
//   from multiple places in your app:

object JsonKeys {
    const val JSON_KEY_ID = "id"
    const val JSON_KEY_FIRSTNAME = "first_name"
    const val JSON_KEY_LASTNAME = "last_name"
}