package io.github.graphql.model

import com.fasterxml.jackson.core.`type`.TypeReference

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
object ContributionOrderFieldTO extends Enumeration {

    type ContributionOrderFieldTO = Value

    val OCCURRED_AT: Value = Value("OCCURRED_AT")

}

class ContributionOrderFieldTOTypeRefer extends TypeReference[ContributionOrderFieldTO.type]
