package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for AddAssigneesToAssignablePayload
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
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


}
