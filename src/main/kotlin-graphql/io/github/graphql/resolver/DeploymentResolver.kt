package io.github.graphql.resolver

import io.github.graphql.model.*

/**
 * Resolver for Deployment
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
interface DeploymentResolver {

    @Throws(Exception::class)
    fun statuses(deploymentTO: DeploymentTO, after: String?, before: String?, first: Int?, last: Int?): DeploymentStatusConnectionTO?

}
