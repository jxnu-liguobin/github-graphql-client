package io.github.graphql.scala.model

import com.fasterxml.jackson.core.`type`.TypeReference

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
object CommitContributionOrderFieldTO extends Enumeration {

    type CommitContributionOrderFieldTO = Value

    val COMMIT_COUNT: Value = Value("COMMIT_COUNT")
    val OCCURRED_AT: Value = Value("OCCURRED_AT")

}

class CommitContributionOrderFieldTOTypeRefer extends TypeReference[CommitContributionOrderFieldTO.type]
