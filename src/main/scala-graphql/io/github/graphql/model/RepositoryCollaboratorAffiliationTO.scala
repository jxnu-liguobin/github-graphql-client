package io.github.graphql.model

import com.fasterxml.jackson.core.`type`.TypeReference

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
object RepositoryCollaboratorAffiliationTO extends Enumeration {

    type RepositoryCollaboratorAffiliationTO = Value

    val ALL: Value = Value("ALL")
    val OUTSIDE: Value = Value("OUTSIDE")

}

class RepositoryCollaboratorAffiliationTOTypeRefer extends TypeReference[RepositoryCollaboratorAffiliationTO.type]
