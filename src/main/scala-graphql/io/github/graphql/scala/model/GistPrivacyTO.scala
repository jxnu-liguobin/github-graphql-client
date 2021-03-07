package io.github.graphql.scala.model

import com.fasterxml.jackson.core.`type`.TypeReference

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
object GistPrivacyTO extends Enumeration {

    type GistPrivacyTO = Value

    val ALL: Value = Value("ALL")
    val PUBLIC: Value = Value("PUBLIC")
    val SECRET: Value = Value("SECRET")

}

class GistPrivacyTOTypeRefer extends TypeReference[GistPrivacyTO.type]
