package io.github.graphql.kotlin.resolver

import io.github.graphql.kotlin.model.*

/**
 * Resolver for Deployment
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:14+0800"
)
interface DeploymentResolver {

    @Throws(Exception::class)
    fun statuses(deploymentTO: DeploymentTO, after: String?, before: String?, first: Int?, last: Int?): DeploymentStatusConnectionTO?

}
