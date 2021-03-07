package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for RemoveAssigneesFromAssignablePayload
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class RemoveAssigneesFromAssignablePayloadResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): RemoveAssigneesFromAssignablePayloadResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): RemoveAssigneesFromAssignablePayloadResponseProjection {
        if (projectionDepthOnFields.getOrDefault("RemoveAssigneesFromAssignablePayloadResponseProjection.AssignableResponseProjection.assignable", 0) <= maxDepth) {
            projectionDepthOnFields["RemoveAssigneesFromAssignablePayloadResponseProjection.AssignableResponseProjection.assignable"] = projectionDepthOnFields.getOrDefault("RemoveAssigneesFromAssignablePayloadResponseProjection.AssignableResponseProjection.assignable", 0) + 1
            this.assignable(AssignableResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RemoveAssigneesFromAssignablePayloadResponseProjection.AssignableResponseProjection.assignable", 0)))
        }
        this.clientMutationId()
        this.typename()
        return this
    }

    fun assignable(subProjection: AssignableResponseProjection): RemoveAssigneesFromAssignablePayloadResponseProjection = assignable(null, subProjection)

    fun assignable(alias: String?, subProjection: AssignableResponseProjection): RemoveAssigneesFromAssignablePayloadResponseProjection {
        fields.add(GraphQLResponseField("assignable").alias(alias).projection(subProjection))
        return this
    }

    fun clientMutationId(): RemoveAssigneesFromAssignablePayloadResponseProjection = clientMutationId(null)

    fun clientMutationId(alias: String?): RemoveAssigneesFromAssignablePayloadResponseProjection {
        fields.add(GraphQLResponseField("clientMutationId").alias(alias))
        return this
    }

    fun typename(): RemoveAssigneesFromAssignablePayloadResponseProjection = typename(null)

    fun typename(alias: String?): RemoveAssigneesFromAssignablePayloadResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
