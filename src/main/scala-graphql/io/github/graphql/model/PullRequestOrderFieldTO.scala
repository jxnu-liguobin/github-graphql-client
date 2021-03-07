package io.github.graphql.model

import com.fasterxml.jackson.core.`type`.TypeReference

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
object PullRequestOrderFieldTO extends Enumeration {

    type PullRequestOrderFieldTO = Value

    val CREATED_AT: Value = Value("CREATED_AT")
    val UPDATED_AT: Value = Value("UPDATED_AT")

}

class PullRequestOrderFieldTOTypeRefer extends TypeReference[PullRequestOrderFieldTO.type]
