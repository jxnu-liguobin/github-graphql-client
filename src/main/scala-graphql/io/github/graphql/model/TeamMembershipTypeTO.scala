package io.github.graphql.model

import com.fasterxml.jackson.core.`type`.TypeReference

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
object TeamMembershipTypeTO extends Enumeration {

    type TeamMembershipTypeTO = Value

    val ALL: Value = Value("ALL")
    val CHILD_TEAM: Value = Value("CHILD_TEAM")
    val IMMEDIATE: Value = Value("IMMEDIATE")

}

class TeamMembershipTypeTOTypeRefer extends TypeReference[TeamMembershipTypeTO.type]
