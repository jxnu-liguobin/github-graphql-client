package io.github.graphql.scala.model

import com.fasterxml.jackson.core.`type`.TypeReference

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
object OrganizationInvitationRoleTO extends Enumeration {

    type OrganizationInvitationRoleTO = Value

    val ADMIN: Value = Value("ADMIN")
    val BILLING_MANAGER: Value = Value("BILLING_MANAGER")
    val DIRECT_MEMBER: Value = Value("DIRECT_MEMBER")
    val REINSTATE: Value = Value("REINSTATE")

}

class OrganizationInvitationRoleTOTypeRefer extends TypeReference[OrganizationInvitationRoleTO.type]
