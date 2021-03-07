package io.github.graphql.model

import com.fasterxml.jackson.core.`type`.TypeReference

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
object RefOrderFieldTO extends Enumeration {

    type RefOrderFieldTO = Value

    val ALPHABETICAL: Value = Value("ALPHABETICAL")
    val TAG_COMMIT_DATE: Value = Value("TAG_COMMIT_DATE")

}

class RefOrderFieldTOTypeRefer extends TypeReference[RefOrderFieldTO.type]
