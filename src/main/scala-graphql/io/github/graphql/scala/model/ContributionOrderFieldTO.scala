package io.github.graphql.scala.model

import com.fasterxml.jackson.core.`type`.TypeReference

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
object ContributionOrderFieldTO extends Enumeration {

    type ContributionOrderFieldTO = Value

    val OCCURRED_AT: Value = Value("OCCURRED_AT")

}

class ContributionOrderFieldTOTypeRefer extends TypeReference[ContributionOrderFieldTO.type]
