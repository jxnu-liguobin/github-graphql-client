package io.github.graphql.model

import com.fasterxml.jackson.core.`type`.TypeReference

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
object CollaboratorAffiliationTO extends Enumeration {

    type CollaboratorAffiliationTO = Value

    val ALL: Value = Value("ALL")
    val DIRECT: Value = Value("DIRECT")
    val OUTSIDE: Value = Value("OUTSIDE")

}

class CollaboratorAffiliationTOTypeRefer extends TypeReference[CollaboratorAffiliationTO.type]
