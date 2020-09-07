package com.widlocher.kotlintest01.graphql.person

import com.expediagroup.graphql.spring.operations.Subscription
import com.widlocher.kotlintest01.models.Person
import com.widlocher.kotlintest01.repository.PersonRepository
import io.reactivex.rxjava3.core.BackpressureStrategy
import io.reactivex.rxjava3.core.Flowable
import io.reactivex.rxjava3.subjects.PublishSubject
import org.reactivestreams.Publisher
import org.springframework.stereotype.Component

@Component
class PersonSubscription(
        val personRepository: PersonRepository
): Subscription {

    private fun <T> PublishSubject<T>.toPublisher(): Flowable<T> = this.toFlowable(BackpressureStrategy.BUFFER)

    fun onPersonAdded(): Publisher<Person> = personAdded.toPublisher()
}