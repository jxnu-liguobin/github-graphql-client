package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for DeleteRefPayload
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as DeleteRefPayloadResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
