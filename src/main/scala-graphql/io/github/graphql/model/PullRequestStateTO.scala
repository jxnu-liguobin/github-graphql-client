package io.github.graphql.model

import com.fasterxml.jackson.core.`type`.TypeReference

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
object PullRequestStateTO extends Enumeration {

    type PullRequestStateTO = Value

    val CLOSED: Value = Value("CLOSED")
    val MERGED: Value = Value("MERGED")
    val OPEN: Value = Value("OPEN")

}

class PullRequestStateTOTypeRefer extends TypeReference[PullRequestStateTO.type]
