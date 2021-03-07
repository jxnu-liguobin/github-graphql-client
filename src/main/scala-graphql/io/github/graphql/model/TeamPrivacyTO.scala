package io.github.graphql.model

import com.fasterxml.jackson.core.`type`.TypeReference

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
object TeamPrivacyTO extends Enumeration {

    type TeamPrivacyTO = Value

    val SECRET: Value = Value("SECRET")
    val VISIBLE: Value = Value("VISIBLE")

}

class TeamPrivacyTOTypeRefer extends TypeReference[TeamPrivacyTO.type]
