package io.github.graphql.model

import com.fasterxml.jackson.core.`type`.TypeReference

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
object RepositoryPrivacyTO extends Enumeration {

    type RepositoryPrivacyTO = Value

    val PRIVATE: Value = Value("PRIVATE")
    val PUBLIC: Value = Value("PUBLIC")

}

class RepositoryPrivacyTOTypeRefer extends TypeReference[RepositoryPrivacyTO.type]
