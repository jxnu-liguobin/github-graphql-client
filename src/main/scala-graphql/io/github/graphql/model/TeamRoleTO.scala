package io.github.graphql.model

import com.fasterxml.jackson.core.`type`.TypeReference

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
object TeamRoleTO extends Enumeration {

    type TeamRoleTO = Value

    val ADMIN: Value = Value("ADMIN")
    val MEMBER: Value = Value("MEMBER")

}

class TeamRoleTOTypeRefer extends TypeReference[TeamRoleTO.type]
