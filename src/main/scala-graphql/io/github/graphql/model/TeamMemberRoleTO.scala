package io.github.graphql.model

import com.fasterxml.jackson.core.`type`.TypeReference

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
object TeamMemberRoleTO extends Enumeration {

    type TeamMemberRoleTO = Value

    val MAINTAINER: Value = Value("MAINTAINER")
    val MEMBER: Value = Value("MEMBER")

}

class TeamMemberRoleTOTypeRefer extends TypeReference[TeamMemberRoleTO.type]