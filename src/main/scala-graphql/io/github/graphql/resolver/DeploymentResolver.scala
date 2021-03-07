package io.github.graphql.resolver

import io.github.graphql.model._

/**
 * Resolver for Deployment
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
trait DeploymentResolver {

    @throws[Exception]
    def statuses(deploymentTO: DeploymentTO, after: String, before: String, first: Option[Int], last: Option[Int]): DeploymentStatusConnectionTO

}
