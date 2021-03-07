package io.github.graphql.model

import com.fasterxml.jackson.core.`type`.TypeReference

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
object ReportedContentClassifiersTO extends Enumeration {

    type ReportedContentClassifiersTO = Value

    val ABUSE: Value = Value("ABUSE")
    val OFF_TOPIC: Value = Value("OFF_TOPIC")
    val OUTDATED: Value = Value("OUTDATED")
    val RESOLVED: Value = Value("RESOLVED")
    val SPAM: Value = Value("SPAM")

}

class ReportedContentClassifiersTOTypeRefer extends TypeReference[ReportedContentClassifiersTO.type]
