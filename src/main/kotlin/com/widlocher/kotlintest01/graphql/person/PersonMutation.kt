package com.widlocher.kotlintest01.graphql.person

import com.expediagroup.graphql.spring.operations.Mutation
import com.widlocher.kotlintest01.models.Person
import com.widlocher.kotlintest01.repository.PersonRepository
import org.springframework.stereotype.Component
import java.util.*

@Component
class PersonMutation(
        val personRepository: PersonRepository
): Mutation {

    private fun generateStringUUID(): String = UUID.randomUUID().toString()

    fun addPerson(person: Person): Person {
        person.id = person.id ?: generateStringUUID()
        personAdded.onNext(person)
        return personRepository.insert(person);
    }
}