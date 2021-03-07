package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class CloneTemplateRepositoryMutationResponse extends GraphQLResult[JMap[String, CloneTemplateRepositoryPayloadTO]] {

    def cloneTemplateRepository(): CloneTemplateRepositoryPayloadTO = {
        val data: JMap[String, CloneTemplateRepositoryPayloadTO] = getData
        if (data != null) data.get(CloneTemplateRepositoryMutationResponse.OPERATION_NAME) else null
    }

}

object CloneTemplateRepositoryMutationResponse {

    private final val OPERATION_NAME: String = "cloneTemplateRepository"

}
