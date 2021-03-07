package io.github.graphql.scala.model

import com.fasterxml.jackson.core.`type`.TypeReference

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
object OrganizationInvitationTypeTO extends Enumeration {

    type OrganizationInvitationTypeTO = Value

    val EMAIL: Value = Value("EMAIL")
    val USER: Value = Value("USER")

}

class OrganizationInvitationTypeTOTypeRefer extends TypeReference[OrganizationInvitationTypeTO.type]
