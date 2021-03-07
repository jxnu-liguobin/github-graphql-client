package io.github.graphql.scala.model

import com.fasterxml.jackson.core.`type`.TypeReference

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
object SponsorshipPrivacyTO extends Enumeration {

    type SponsorshipPrivacyTO = Value

    val PRIVATE: Value = Value("PRIVATE")
    val PUBLIC: Value = Value("PUBLIC")

}

class SponsorshipPrivacyTOTypeRefer extends TypeReference[SponsorshipPrivacyTO.type]
