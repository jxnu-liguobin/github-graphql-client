package io.github.graphql.scala.model

import com.fasterxml.jackson.core.`type`.TypeReference

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
object PullRequestReviewStateTO extends Enumeration {

    type PullRequestReviewStateTO = Value

    val APPROVED: Value = Value("APPROVED")
    val CHANGES_REQUESTED: Value = Value("CHANGES_REQUESTED")
    val COMMENTED: Value = Value("COMMENTED")
    val DISMISSED: Value = Value("DISMISSED")
    val PENDING: Value = Value("PENDING")

}

class PullRequestReviewStateTOTypeRefer extends TypeReference[PullRequestReviewStateTO.type]
