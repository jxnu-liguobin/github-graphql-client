package io.github.graphql.scala.model

import com.fasterxml.jackson.core.`type`.TypeReference

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
object TeamRoleTO extends Enumeration {

    type TeamRoleTO = Value

    val ADMIN: Value = Value("ADMIN")
    val MEMBER: Value = Value("MEMBER")

}

class TeamRoleTOTypeRefer extends TypeReference[TeamRoleTO.type]
