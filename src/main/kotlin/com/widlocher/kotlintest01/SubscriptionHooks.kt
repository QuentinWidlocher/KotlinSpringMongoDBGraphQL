package com.widlocher.kotlintest01

import com.expediagroup.graphql.execution.GraphQLContext
import com.expediagroup.graphql.spring.execution.ApolloSubscriptionHooks
import kotlinx.coroutines.reactor.mono
import org.springframework.http.server.reactive.ServerHttpRequest
import org.springframework.http.server.reactive.ServerHttpResponse
import org.springframework.web.reactive.socket.WebSocketSession
import reactor.core.publisher.Mono

class MyGraphQLContext(val myCustomValue: String, val request: ServerHttpRequest, val response: ServerHttpResponse, var subscriptionValue: String? = null) : GraphQLContext

open class SubscriptionHooks : ApolloSubscriptionHooks {
    override fun onConnect(
            connectionParams: Map<String, String>,
            session: WebSocketSession,
            graphQLContext: Any?
    ): Mono<Unit> = mono {
        val bearer = connectionParams["Authorization"] ?: "none"
        val context = graphQLContext as? MyGraphQLContext
        context?.subscriptionValue = bearer
    }
}