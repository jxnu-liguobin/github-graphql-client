package io.github.graphql.scala.model

import com.fasterxml.jackson.core.`type`.TypeReference

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
object PullRequestReviewCommentStateTO extends Enumeration {

    type PullRequestReviewCommentStateTO = Value

    val PENDING: Value = Value("PENDING")
    val SUBMITTED: Value = Value("SUBMITTED")

}

class PullRequestReviewCommentStateTOTypeRefer extends TypeReference[PullRequestReviewCommentStateTO.type]
