package io.github.graphql.scala.model

import com.fasterxml.jackson.core.`type`.TypeReference

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
object OrderDirectionTO extends Enumeration {

    type OrderDirectionTO = Value

    val ASC: Value = Value("ASC")
    val DESC: Value = Value("DESC")

}

class OrderDirectionTOTypeRefer extends TypeReference[OrderDirectionTO.type]
