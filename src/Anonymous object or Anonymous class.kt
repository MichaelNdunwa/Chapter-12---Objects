fun main() {
    val counter = object : Counts {
        override fun studentCount(): Int {
            return StudentRegistry.allStudents.size
        }

        override fun scientistCount(): Int {
            return ScientistRepository.allScientist.size
        }
    }

    // Three scientist
    StudentRegistry.addStudent(Student(1, "Michael", "Ndunwa"))
    StudentRegistry.addStudent(Student(1, "Michael", "Ndunwa"))
    StudentRegistry.addStudent(Student(1, "Michael", "Ndunwa"))


    // Two scientist
    ScientistRepository.addScientist(Scientist.newScientist("Michael", "Ndunwa"))
    ScientistRepository.addScientist(Scientist.newScientist("Michael", "Ndunwa"))

    println("Number of students: ${counter.studentCount()}")
    println("Number of scientist: ${counter.scientistCount()}")
}

interface Counts {
    fun studentCount(): Int
    fun scientistCount(): Int
}