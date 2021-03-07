package io.github.graphql.model

import com.fasterxml.jackson.core.`type`.TypeReference

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
object SecurityAdvisoryOrderFieldTO extends Enumeration {

    type SecurityAdvisoryOrderFieldTO = Value

    val PUBLISHED_AT: Value = Value("PUBLISHED_AT")
    val UPDATED_AT: Value = Value("UPDATED_AT")

}

class SecurityAdvisoryOrderFieldTOTypeRefer extends TypeReference[SecurityAdvisoryOrderFieldTO.type]
