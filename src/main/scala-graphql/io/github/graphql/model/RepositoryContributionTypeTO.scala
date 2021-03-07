package io.github.graphql.model

import com.fasterxml.jackson.core.`type`.TypeReference

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
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
