package io.github.graphql.scala.model

import com.fasterxml.jackson.core.`type`.TypeReference

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
object StarOrderFieldTO extends Enumeration {

    type StarOrderFieldTO = Value

    val STARRED_AT: Value = Value("STARRED_AT")

}

class StarOrderFieldTOTypeRefer extends TypeReference[StarOrderFieldTO.type]
