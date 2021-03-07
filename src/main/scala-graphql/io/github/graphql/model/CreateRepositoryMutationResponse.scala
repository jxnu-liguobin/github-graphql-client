package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class CreateRepositoryMutationResponse extends GraphQLResult[JMap[String, CreateRepositoryPayloadTO]] {

    def createRepository(): CreateRepositoryPayloadTO = {
        val data: JMap[String, CreateRepositoryPayloadTO] = getData
        if (data != null) data.get(CreateRepositoryMutationResponse.OPERATION_NAME) else null
    }

}

object CreateRepositoryMutationResponse {

    private final val OPERATION_NAME: String = "createRepository"

}
