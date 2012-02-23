import consolebug.*

class BootStrap {

    def init = { servletContext ->
        // Try this code twice in "grails console"
        // import consolebug.*
        new School(name: 'school')
                .addToStudents(new Student(name: 'student 1'))
                .addToStudents(new Student(name: 'student 2'))
                .save()

        School.findByIdIsNotNull().students
    }
    def destroy = {
    }
}
