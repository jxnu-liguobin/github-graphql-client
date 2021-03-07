package io.github.graphql.model

import com.fasterxml.jackson.core.`type`.TypeReference

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
object PullRequestReviewEventTO extends Enumeration {

    type PullRequestReviewEventTO = Value

    val APPROVE: Value = Value("APPROVE")
    val COMMENT: Value = Value("COMMENT")
    val DISMISS: Value = Value("DISMISS")
    val REQUEST_CHANGES: Value = Value("REQUEST_CHANGES")

}

class PullRequestReviewEventTOTypeRefer extends TypeReference[PullRequestReviewEventTO.type]
