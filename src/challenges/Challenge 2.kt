package challenges

/***
 * 2. Create a version of the Student class that uses a factory method loadStudent(studentMap: Map<String, String>)
 *   to create a student with a first and last name from a map such as mapOf("first_name" to "Neils", "last_name" to "Bohr").
 *   Default to using “First” and “Last” as the names if the map not contain a first name or last name.
 */

data class Student private constructor(val firstName: String, val lastName: String) {

    companion object {
        fun loadStudent(studentMap: Map<String, String>): Student {
            val firstName = studentMap["first_name"] ?: "First"
            val lastName = studentMap["last_name"] ?: "Last"
            return Student(firstName, lastName)
        }
    }
}