package io.github.graphql.model

import com.fasterxml.jackson.core.`type`.TypeReference

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
object StarOrderFieldTO extends Enumeration {

    type StarOrderFieldTO = Value

    val STARRED_AT: Value = Value("STARRED_AT")

}

class StarOrderFieldTOTypeRefer extends TypeReference[StarOrderFieldTO.type]
