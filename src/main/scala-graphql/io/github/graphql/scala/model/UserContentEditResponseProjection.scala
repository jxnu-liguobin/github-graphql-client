package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for UserContentEdit
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class UserContentEditResponseProjection extends GraphQLResponseProjection {

    override def all$(): UserContentEditResponseProjection = all$(3)

    override def all$(maxDepth: Int): UserContentEditResponseProjection = {
        this.createdAt()
        this.deletedAt()
        if (projectionDepthOnFields.getOrDefault("UserContentEditResponseProjection.ActorResponseProjection.deletedBy", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserContentEditResponseProjection.ActorResponseProjection.deletedBy", projectionDepthOnFields.getOrDefault("UserContentEditResponseProjection.ActorResponseProjection.deletedBy", 0) + 1)
            this.deletedBy(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserContentEditResponseProjection.ActorResponseProjection.deletedBy", 0)))
        }
        this.diff()
        this.editedAt()
        if (projectionDepthOnFields.getOrDefault("UserContentEditResponseProjection.ActorResponseProjection.editor", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserContentEditResponseProjection.ActorResponseProjection.editor", projectionDepthOnFields.getOrDefault("UserContentEditResponseProjection.ActorResponseProjection.editor", 0) + 1)
            this.editor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserContentEditResponseProjection.ActorResponseProjection.editor", 0)))
        }
        this.id()
        this.updatedAt()
        this.typename()
        this
    }

    def createdAt(): UserContentEditResponseProjection = {
        createdAt(null.asInstanceOf[String])
    }

    def createdAt(alias: String): UserContentEditResponseProjection = {
        fields.add(new GraphQLResponseField("createdAt").alias(alias))
        this
    }

    def deletedAt(): UserContentEditResponseProjection = {
        deletedAt(null.asInstanceOf[String])
    }

    def deletedAt(alias: String): UserContentEditResponseProjection = {
        fields.add(new GraphQLResponseField("deletedAt").alias(alias))
        this
    }

    def deletedBy(subProjection: ActorResponseProjection): UserContentEditResponseProjection = {
        deletedBy(null.asInstanceOf[String], subProjection)
    }

    def deletedBy(alias: String, subProjection: ActorResponseProjection): UserContentEditResponseProjection = {
        fields.add(new GraphQLResponseField("deletedBy").alias(alias).projection(subProjection))
        this
    }

    def diff(): UserContentEditResponseProjection = {
        diff(null.asInstanceOf[String])
    }

    def diff(alias: String): UserContentEditResponseProjection = {
        fields.add(new GraphQLResponseField("diff").alias(alias))
        this
    }

    def editedAt(): UserContentEditResponseProjection = {
        editedAt(null.asInstanceOf[String])
    }

    def editedAt(alias: String): UserContentEditResponseProjection = {
        fields.add(new GraphQLResponseField("editedAt").alias(alias))
        this
    }

    def editor(subProjection: ActorResponseProjection): UserContentEditResponseProjection = {
        editor(null.asInstanceOf[String], subProjection)
    }

    def editor(alias: String, subProjection: ActorResponseProjection): UserContentEditResponseProjection = {
        fields.add(new GraphQLResponseField("editor").alias(alias).projection(subProjection))
        this
    }

    def id(): UserContentEditResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): UserContentEditResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def updatedAt(): UserContentEditResponseProjection = {
        updatedAt(null.asInstanceOf[String])
    }

    def updatedAt(alias: String): UserContentEditResponseProjection = {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias))
        this
    }

    def typename(): UserContentEditResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): UserContentEditResponseProjection = {
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
        val that = obj.asInstanceOf[UserContentEditResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
