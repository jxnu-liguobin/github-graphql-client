package io.github.graphql.model

import com.fasterxml.jackson.core.`type`.TypeReference

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
object RepositoryAffiliationTO extends Enumeration {

    type RepositoryAffiliationTO = Value

    val COLLABORATOR: Value = Value("COLLABORATOR")
    val ORGANIZATION_MEMBER: Value = Value("ORGANIZATION_MEMBER")
    val OWNER: Value = Value("OWNER")

}

class RepositoryAffiliationTOTypeRefer extends TypeReference[RepositoryAffiliationTO.type]
