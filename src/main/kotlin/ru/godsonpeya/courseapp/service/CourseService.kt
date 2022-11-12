package ru.godsonpeya.courseapp.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import ru.godsonpeya.courseapp.entity.Course
import ru.godsonpeya.courseapp.repository.CourseRepository

@Service
class CourseService @Autowired constructor(private val courseRepository: CourseRepository) {

    fun getAll(): List<Course> {
        return courseRepository.findAll()
    }

    fun getOne(id: Long): Course {
        return courseRepository.findById(id).orElseThrow { IllegalArgumentException("Such of course doesn't exist") }
    }

    fun create(course: Course): Course {
        return courseRepository.save(course)
    }

    fun update(id: Long, course: Course): Course {
        val found = getOne(id)
        found.name = course.name
        found.image = course.image
        return courseRepository.save(found)
    }

    fun delete(id: Long): String {
        return courseRepository.delete(getOne(id)).run { "Course deleted" }
    }
}