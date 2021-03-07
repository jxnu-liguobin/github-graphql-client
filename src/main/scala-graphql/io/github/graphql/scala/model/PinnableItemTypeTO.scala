package io.github.graphql.scala.model

import com.fasterxml.jackson.core.`type`.TypeReference

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
object PinnableItemTypeTO extends Enumeration {

    type PinnableItemTypeTO = Value

    val GIST: Value = Value("GIST")
    val ISSUE: Value = Value("ISSUE")
    val ORGANIZATION: Value = Value("ORGANIZATION")
    val PROJECT: Value = Value("PROJECT")
    val PULL_REQUEST: Value = Value("PULL_REQUEST")
    val REPOSITORY: Value = Value("REPOSITORY")
    val TEAM: Value = Value("TEAM")
    val USER: Value = Value("USER")

}

class PinnableItemTypeTOTypeRefer extends TypeReference[PinnableItemTypeTO.type]
