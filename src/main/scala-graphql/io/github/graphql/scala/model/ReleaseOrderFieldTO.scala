package io.github.graphql.scala.model

import com.fasterxml.jackson.core.`type`.TypeReference

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
object ReleaseOrderFieldTO extends Enumeration {

    type ReleaseOrderFieldTO = Value

    val CREATED_AT: Value = Value("CREATED_AT")
    val NAME: Value = Value("NAME")

}

class ReleaseOrderFieldTOTypeRefer extends TypeReference[ReleaseOrderFieldTO.type]
