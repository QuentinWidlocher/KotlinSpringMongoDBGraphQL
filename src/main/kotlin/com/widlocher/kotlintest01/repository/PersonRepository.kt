package com.widlocher.kotlintest01.repository

import com.widlocher.kotlintest01.models.Person
import org.springframework.data.mongodb.repository.MongoRepository
import java.util.*

interface PersonRepository: MongoRepository<Person, String>