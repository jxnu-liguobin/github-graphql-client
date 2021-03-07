package io.github.graphql.scala.model

import com.fasterxml.jackson.core.`type`.TypeReference

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
object TeamMemberRoleTO extends Enumeration {

    type TeamMemberRoleTO = Value

    val MAINTAINER: Value = Value("MAINTAINER")
    val MEMBER: Value = Value("MEMBER")

}

class TeamMemberRoleTOTypeRefer extends TypeReference[TeamMemberRoleTO.type]
