package io.github.graphql.scala.model

import com.fasterxml.jackson.core.`type`.TypeReference

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
object RepositoryContributionTypeTO extends Enumeration {

    type RepositoryContributionTypeTO = Value

    val COMMIT: Value = Value("COMMIT")
    val ISSUE: Value = Value("ISSUE")
    val PULL_REQUEST: Value = Value("PULL_REQUEST")
    val PULL_REQUEST_REVIEW: Value = Value("PULL_REQUEST_REVIEW")
    val REPOSITORY: Value = Value("REPOSITORY")

}

class RepositoryContributionTypeTOTypeRefer extends TypeReference[RepositoryContributionTypeTO.type]
