package ru.godsonpeya.courseapp.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Course(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long?=null,
    var image: String?=null,
    var name: String?=null,
)
