package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for DeleteProjectColumnPayload
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class DeleteProjectColumnPayloadResponseProjection extends GraphQLResponseProjection {

    override def all$(): DeleteProjectColumnPayloadResponseProjection = all$(3)

    override def all$(maxDepth: Int): DeleteProjectColumnPayloadResponseProjection = {
        this.clientMutationId()
        this.deletedColumnId()
        if (projectionDepthOnFields.getOrDefault("DeleteProjectColumnPayloadResponseProjection.ProjectResponseProjection.project", 0) <= maxDepth) {
            projectionDepthOnFields.put("DeleteProjectColumnPayloadResponseProjection.ProjectResponseProjection.project", projectionDepthOnFields.getOrDefault("DeleteProjectColumnPayloadResponseProjection.ProjectResponseProjection.project", 0) + 1)
            this.project(new ProjectResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DeleteProjectColumnPayloadResponseProjection.ProjectResponseProjection.project", 0)))
        }
        this.typename()
        this
    }

    def clientMutationId(): DeleteProjectColumnPayloadResponseProjection = {
        clientMutationId(null.asInstanceOf[String])
    }

    def clientMutationId(alias: String): DeleteProjectColumnPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias))
        this
    }

    def deletedColumnId(): DeleteProjectColumnPayloadResponseProjection = {
        deletedColumnId(null.asInstanceOf[String])
    }

    def deletedColumnId(alias: String): DeleteProjectColumnPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("deletedColumnId").alias(alias))
        this
    }

    def project(subProjection: ProjectResponseProjection): DeleteProjectColumnPayloadResponseProjection = {
        project(null.asInstanceOf[String], subProjection)
    }

    def project(alias: String, subProjection: ProjectResponseProjection): DeleteProjectColumnPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("project").alias(alias).projection(subProjection))
        this
    }

    def typename(): DeleteProjectColumnPayloadResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): DeleteProjectColumnPayloadResponseProjection = {
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
        val that = obj.asInstanceOf[DeleteProjectColumnPayloadResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
