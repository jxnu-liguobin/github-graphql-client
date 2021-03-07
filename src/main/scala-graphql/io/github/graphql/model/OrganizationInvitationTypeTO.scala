package io.github.graphql.model

import com.fasterxml.jackson.core.`type`.TypeReference

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
object OrganizationInvitationTypeTO extends Enumeration {

    type OrganizationInvitationTypeTO = Value

    val EMAIL: Value = Value("EMAIL")
    val USER: Value = Value("USER")

}

class OrganizationInvitationTypeTOTypeRefer extends TypeReference[OrganizationInvitationTypeTO.type]
