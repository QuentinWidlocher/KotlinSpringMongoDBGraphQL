package com.widlocher.kotlintest01.graphql.person

import com.expediagroup.graphql.spring.operations.Query
import com.widlocher.kotlintest01.models.Person
import com.widlocher.kotlintest01.repository.PersonRepository
import org.springframework.stereotype.Component

@Component
class PersonQuery(
        val personRepository: PersonRepository
): Query {
    fun findPerson(id: String): Person? = personRepository.findById(id).orElse(null)

    fun allPersons(): List<Person> = personRepository.findAll()
}