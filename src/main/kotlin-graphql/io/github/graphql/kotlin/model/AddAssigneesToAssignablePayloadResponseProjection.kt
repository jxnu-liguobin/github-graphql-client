package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for AddAssigneesToAssignablePayload
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class AddAssigneesToAssignablePayloadResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): AddAssigneesToAssignablePayloadResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): AddAssigneesToAssignablePayloadResponseProjection {
        if (projectionDepthOnFields.getOrDefault("AddAssigneesToAssignablePayloadResponseProjection.AssignableResponseProjection.assignable", 0) <= maxDepth) {
            projectionDepthOnFields["AddAssigneesToAssignablePayloadResponseProjection.AssignableResponseProjection.assignable"] = projectionDepthOnFields.getOrDefault("AddAssigneesToAssignablePayloadResponseProjection.AssignableResponseProjection.assignable", 0) + 1
            this.assignable(AssignableResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("AddAssigneesToAssignablePayloadResponseProjection.AssignableResponseProjection.assignable", 0)))
        }
        this.clientMutationId()
        this.typename()
        return this
    }

    fun assignable(subProjection: AssignableResponseProjection): AddAssigneesToAssignablePayloadResponseProjection = assignable(null, subProjection)

    fun assignable(alias: String?, subProjection: AssignableResponseProjection): AddAssigneesToAssignablePayloadResponseProjection {
        fields.add(GraphQLResponseField("assignable").alias(alias).projection(subProjection))
        return this
    }

    fun clientMutationId(): AddAssigneesToAssignablePayloadResponseProjection = clientMutationId(null)

    fun clientMutationId(alias: String?): AddAssigneesToAssignablePayloadResponseProjection {
        fields.add(GraphQLResponseField("clientMutationId").alias(alias))
        return this
    }

    fun typename(): AddAssigneesToAssignablePayloadResponseProjection = typename(null)

    fun typename(alias: String?): AddAssigneesToAssignablePayloadResponseProjection {
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
        val that = other as AddAssigneesToAssignablePayloadResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
