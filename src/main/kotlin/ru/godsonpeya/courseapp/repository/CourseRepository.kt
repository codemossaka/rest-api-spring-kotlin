package ru.godsonpeya.courseapp.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import ru.godsonpeya.courseapp.entity.Course

@Repository
interface CourseRepository :JpaRepository<Course, Long>{
}