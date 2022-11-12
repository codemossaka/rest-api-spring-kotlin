package ru.godsonpeya.courseapp

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import ru.godsonpeya.courseapp.entity.Course
import ru.godsonpeya.courseapp.repository.CourseRepository

@SpringBootApplication
class CourseAppApplication @Autowired constructor(private val courseRepository: CourseRepository):CommandLineRunner{
    override fun run(vararg args: String?) {
        courseRepository.saveAll(
            listOf<Course>(
                Course(name="Json", image = "https://png.pngtree.com/png-clipart/20190630/original/pngtree-json-file-document-icon-png-image_4166911.jpg"),
                Course(name="xml", image = "https://w7.pngwing.com/pngs/641/474/png-transparent-xml-editor-computer-icons-others-angle-text-rectangle-thumbnail.png"),
                Course(name="java", image = "https://proxys.io/files/blog/Java/javalogo.png"),
            )
        )
    }

}

fun main(args: Array<String>) {

    runApplication<CourseAppApplication>(*args);
}


