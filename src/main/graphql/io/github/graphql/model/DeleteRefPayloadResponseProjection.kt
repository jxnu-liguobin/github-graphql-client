package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for DeleteRefPayload
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class DeleteRefPayloadResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): DeleteRefPayloadResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): DeleteRefPayloadResponseProjection {
        this.clientMutationId()
        this.typename()
        return this
    }

    fun clientMutationId(): DeleteRefPayloadResponseProjection = clientMutationId(null)

    fun clientMutationId(alias: String?): DeleteRefPayloadResponseProjection {
        fields.add(GraphQLResponseField("clientMutationId").alias(alias))
        return this
    }

    fun typename(): DeleteRefPayloadResponseProjection = typename(null)

    fun typename(alias: String?): DeleteRefPayloadResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
