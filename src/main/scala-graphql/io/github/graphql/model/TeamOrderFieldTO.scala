package io.github.graphql.model

import com.fasterxml.jackson.core.`type`.TypeReference

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
object TeamOrderFieldTO extends Enumeration {

    type TeamOrderFieldTO = Value

    val NAME: Value = Value("NAME")

}

class TeamOrderFieldTOTypeRefer extends TypeReference[TeamOrderFieldTO.type]
