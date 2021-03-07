package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for RemoveAssigneesFromAssignablePayload
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class RemoveAssigneesFromAssignablePayloadResponseProjection extends GraphQLResponseProjection {

    override def all$(): RemoveAssigneesFromAssignablePayloadResponseProjection = all$(3)

    override def all$(maxDepth: Int): RemoveAssigneesFromAssignablePayloadResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("RemoveAssigneesFromAssignablePayloadResponseProjection.AssignableResponseProjection.assignable", 0) <= maxDepth) {
            projectionDepthOnFields.put("RemoveAssigneesFromAssignablePayloadResponseProjection.AssignableResponseProjection.assignable", projectionDepthOnFields.getOrDefault("RemoveAssigneesFromAssignablePayloadResponseProjection.AssignableResponseProjection.assignable", 0) + 1)
            this.assignable(new AssignableResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RemoveAssigneesFromAssignablePayloadResponseProjection.AssignableResponseProjection.assignable", 0)))
        }
        this.clientMutationId()
        this.typename()
        this
    }

    def assignable(subProjection: AssignableResponseProjection): RemoveAssigneesFromAssignablePayloadResponseProjection = {
        assignable(null.asInstanceOf[String], subProjection)
    }

    def assignable(alias: String, subProjection: AssignableResponseProjection): RemoveAssigneesFromAssignablePayloadResponseProjection = {
        fields.add(new GraphQLResponseField("assignable").alias(alias).projection(subProjection))
        this
    }

    def clientMutationId(): RemoveAssigneesFromAssignablePayloadResponseProjection = {
        clientMutationId(null.asInstanceOf[String])
    }

    def clientMutationId(alias: String): RemoveAssigneesFromAssignablePayloadResponseProjection = {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias))
        this
    }

    def typename(): RemoveAssigneesFromAssignablePayloadResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): RemoveAssigneesFromAssignablePayloadResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
