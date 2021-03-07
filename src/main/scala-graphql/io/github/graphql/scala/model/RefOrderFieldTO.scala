package io.github.graphql.scala.model

import com.fasterxml.jackson.core.`type`.TypeReference

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
object RefOrderFieldTO extends Enumeration {

    type RefOrderFieldTO = Value

    val ALPHABETICAL: Value = Value("ALPHABETICAL")
    val TAG_COMMIT_DATE: Value = Value("TAG_COMMIT_DATE")

}

class RefOrderFieldTOTypeRefer extends TypeReference[RefOrderFieldTO.type]
