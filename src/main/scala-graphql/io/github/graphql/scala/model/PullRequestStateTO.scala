package io.github.graphql.scala.model

import com.fasterxml.jackson.core.`type`.TypeReference

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
object PullRequestStateTO extends Enumeration {

    type PullRequestStateTO = Value

    val CLOSED: Value = Value("CLOSED")
    val MERGED: Value = Value("MERGED")
    val OPEN: Value = Value("OPEN")

}

class PullRequestStateTOTypeRefer extends TypeReference[PullRequestStateTO.type]
