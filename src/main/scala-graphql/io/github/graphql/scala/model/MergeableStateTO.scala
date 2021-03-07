package io.github.graphql.scala.model

import com.fasterxml.jackson.core.`type`.TypeReference

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
object MergeableStateTO extends Enumeration {

    type MergeableStateTO = Value

    val CONFLICTING: Value = Value("CONFLICTING")
    val MERGEABLE: Value = Value("MERGEABLE")
    val UNKNOWN: Value = Value("UNKNOWN")

}

class MergeableStateTOTypeRefer extends TypeReference[MergeableStateTO.type]
