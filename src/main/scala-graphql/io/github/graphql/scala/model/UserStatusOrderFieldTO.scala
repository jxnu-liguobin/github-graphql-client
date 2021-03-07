package io.github.graphql.scala.model

import com.fasterxml.jackson.core.`type`.TypeReference

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
object UserStatusOrderFieldTO extends Enumeration {

    type UserStatusOrderFieldTO = Value

    val UPDATED_AT: Value = Value("UPDATED_AT")

}

class UserStatusOrderFieldTOTypeRefer extends TypeReference[UserStatusOrderFieldTO.type]
