package com.widlocher.kotlintest01.graphql.person

import com.widlocher.kotlintest01.models.Person
import io.reactivex.rxjava3.subjects.PublishSubject

val personAdded: PublishSubject<Person> = PublishSubject.create<Person>()