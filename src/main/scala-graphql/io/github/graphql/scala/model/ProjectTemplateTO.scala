package io.github.graphql.scala.model

import com.fasterxml.jackson.core.`type`.TypeReference

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
object ProjectTemplateTO extends Enumeration {

    type ProjectTemplateTO = Value

    val AUTOMATED_KANBAN_V2: Value = Value("AUTOMATED_KANBAN_V2")
    val AUTOMATED_REVIEWS_KANBAN: Value = Value("AUTOMATED_REVIEWS_KANBAN")
    val BASIC_KANBAN: Value = Value("BASIC_KANBAN")
    val BUG_TRIAGE: Value = Value("BUG_TRIAGE")

}

class ProjectTemplateTOTypeRefer extends TypeReference[ProjectTemplateTO.type]
