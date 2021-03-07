package io.github.graphql.scala.model

import com.fasterxml.jackson.core.`type`.TypeReference

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
object TeamPrivacyTO extends Enumeration {

    type TeamPrivacyTO = Value

    val SECRET: Value = Value("SECRET")
    val VISIBLE: Value = Value("VISIBLE")

}

class TeamPrivacyTOTypeRefer extends TypeReference[TeamPrivacyTO.type]
