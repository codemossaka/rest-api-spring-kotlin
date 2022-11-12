package ru.godsonpeya.courseapp.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import ru.godsonpeya.courseapp.entity.Course
import ru.godsonpeya.courseapp.service.CourseService

//@Component - parent
//@Configuration - child of Component
//@Repository - child of Component
//@Service - child of Component
//@Controller  - child of Component
//@RestController -  extension of @Controller who is  child of Component


@CrossOrigin("http://localhost:8080")
@RestController
class CourseController @Autowired constructor(private val courseService: CourseService) {
    @GetMapping
    fun getAllData(): List<Course> {
        return courseService.getAll()
    }

    @GetMapping("/{id}")
    fun getOneData(@PathVariable id: Long): Course {
        return courseService.getOne(id)
    }

    @PostMapping
    fun createData(@RequestBody course: Course): Course {
        return courseService.create(course)
    }

    @PutMapping("/{id}")
    fun updateData(@PathVariable id: Long, @RequestBody course: Course): Course {
        return courseService.update(id, course)
    }

    @DeleteMapping("/{id}")
    fun deleteData(@PathVariable id: Long): String {
        return courseService.delete(id)
    }

}