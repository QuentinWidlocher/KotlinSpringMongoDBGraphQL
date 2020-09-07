package com.widlocher.kotlintest01

import com.expediagroup.graphql.spring.execution.ApolloSubscriptionHooks
import io.reactivex.rxjava3.core.BackpressureStrategy
import io.reactivex.rxjava3.subjects.PublishSubject
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class KotlinTest01Application

fun main(args: Array<String>) {
	runApplication<KotlinTest01Application>(*args)
}
