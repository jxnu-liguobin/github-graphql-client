package io.github.graphql.scala.model

import com.fasterxml.jackson.core.`type`.TypeReference

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
object GistOrderFieldTO extends Enumeration {

    type GistOrderFieldTO = Value

    val CREATED_AT: Value = Value("CREATED_AT")
    val PUSHED_AT: Value = Value("PUSHED_AT")
    val UPDATED_AT: Value = Value("UPDATED_AT")

}

class GistOrderFieldTOTypeRefer extends TypeReference[GistOrderFieldTO.type]
