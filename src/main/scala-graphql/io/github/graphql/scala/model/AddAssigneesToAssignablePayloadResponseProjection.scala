package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for AddAssigneesToAssignablePayload
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
class AddAssigneesToAssignablePayloadResponseProjection extends GraphQLResponseProjection {

    override def all$(): AddAssigneesToAssignablePayloadResponseProjection = all$(3)

    override def all$(maxDepth: Int): AddAssigneesToAssignablePayloadResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("AddAssigneesToAssignablePayloadResponseProjection.AssignableResponseProjection.assignable", 0) <= maxDepth) {
            projectionDepthOnFields.put("AddAssigneesToAssignablePayloadResponseProjection.AssignableResponseProjection.assignable", projectionDepthOnFields.getOrDefault("AddAssigneesToAssignablePayloadResponseProjection.AssignableResponseProjection.assignable", 0) + 1)
            this.assignable(new AssignableResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("AddAssigneesToAssignablePayloadResponseProjection.AssignableResponseProjection.assignable", 0)))
        }
        this.clientMutationId()
        this.typename()
        this
    }

    def assignable(subProjection: AssignableResponseProjection): AddAssigneesToAssignablePayloadResponseProjection = {
        assignable(null.asInstanceOf[String], subProjection)
    }

    def assignable(alias: String, subProjection: AssignableResponseProjection): AddAssigneesToAssignablePayloadResponseProjection = {
        fields.add(new GraphQLResponseField("assignable").alias(alias).projection(subProjection))
        this
    }

    def clientMutationId(): AddAssigneesToAssignablePayloadResponseProjection = {
        clientMutationId(null.asInstanceOf[String])
    }

    def clientMutationId(alias: String): AddAssigneesToAssignablePayloadResponseProjection = {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias))
        this
    }

    def typename(): AddAssigneesToAssignablePayloadResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): AddAssigneesToAssignablePayloadResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[AddAssigneesToAssignablePayloadResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
