package io.github.graphql.scala.model

import com.fasterxml.jackson.core.`type`.TypeReference

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
object SearchTypeTO extends Enumeration {

    type SearchTypeTO = Value

    val ISSUE: Value = Value("ISSUE")
    val REPOSITORY: Value = Value("REPOSITORY")
    val USER: Value = Value("USER")

}

class SearchTypeTOTypeRefer extends TypeReference[SearchTypeTO.type]
