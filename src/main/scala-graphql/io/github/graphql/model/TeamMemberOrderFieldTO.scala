package io.github.graphql.model

import com.fasterxml.jackson.core.`type`.TypeReference

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
object TeamMemberOrderFieldTO extends Enumeration {

    type TeamMemberOrderFieldTO = Value

    val CREATED_AT: Value = Value("CREATED_AT")
    val LOGIN: Value = Value("LOGIN")

}

class TeamMemberOrderFieldTOTypeRefer extends TypeReference[TeamMemberOrderFieldTO.type]
