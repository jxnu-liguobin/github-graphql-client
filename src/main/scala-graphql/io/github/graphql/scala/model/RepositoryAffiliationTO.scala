package io.github.graphql.scala.model

import com.fasterxml.jackson.core.`type`.TypeReference

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
object RepositoryAffiliationTO extends Enumeration {

    type RepositoryAffiliationTO = Value

    val COLLABORATOR: Value = Value("COLLABORATOR")
    val ORGANIZATION_MEMBER: Value = Value("ORGANIZATION_MEMBER")
    val OWNER: Value = Value("OWNER")

}

class RepositoryAffiliationTOTypeRefer extends TypeReference[RepositoryAffiliationTO.type]
