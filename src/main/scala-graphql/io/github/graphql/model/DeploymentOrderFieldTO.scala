package io.github.graphql.model

import com.fasterxml.jackson.core.`type`.TypeReference

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
object DeploymentOrderFieldTO extends Enumeration {

    type DeploymentOrderFieldTO = Value

    val CREATED_AT: Value = Value("CREATED_AT")

}

class DeploymentOrderFieldTOTypeRefer extends TypeReference[DeploymentOrderFieldTO.type]
