package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for UserContentEdit
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class UserContentEditResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): UserContentEditResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): UserContentEditResponseProjection {
        this.createdAt()
        this.deletedAt()
        if (projectionDepthOnFields.getOrDefault("UserContentEditResponseProjection.ActorResponseProjection.deletedBy", 0) <= maxDepth) {
            projectionDepthOnFields["UserContentEditResponseProjection.ActorResponseProjection.deletedBy"] = projectionDepthOnFields.getOrDefault("UserContentEditResponseProjection.ActorResponseProjection.deletedBy", 0) + 1
            this.deletedBy(ActorResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("UserContentEditResponseProjection.ActorResponseProjection.deletedBy", 0)))
        }
        this.diff()
        this.editedAt()
        if (projectionDepthOnFields.getOrDefault("UserContentEditResponseProjection.ActorResponseProjection.editor", 0) <= maxDepth) {
            projectionDepthOnFields["UserContentEditResponseProjection.ActorResponseProjection.editor"] = projectionDepthOnFields.getOrDefault("UserContentEditResponseProjection.ActorResponseProjection.editor", 0) + 1
            this.editor(ActorResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("UserContentEditResponseProjection.ActorResponseProjection.editor", 0)))
        }
        this.id()
        this.updatedAt()
        this.typename()
        return this
    }

    fun createdAt(): UserContentEditResponseProjection = createdAt(null)

    fun createdAt(alias: String?): UserContentEditResponseProjection {
        fields.add(GraphQLResponseField("createdAt").alias(alias))
        return this
    }

    fun deletedAt(): UserContentEditResponseProjection = deletedAt(null)

    fun deletedAt(alias: String?): UserContentEditResponseProjection {
        fields.add(GraphQLResponseField("deletedAt").alias(alias))
        return this
    }

    fun deletedBy(subProjection: ActorResponseProjection): UserContentEditResponseProjection = deletedBy(null, subProjection)

    fun deletedBy(alias: String?, subProjection: ActorResponseProjection): UserContentEditResponseProjection {
        fields.add(GraphQLResponseField("deletedBy").alias(alias).projection(subProjection))
        return this
    }

    fun diff(): UserContentEditResponseProjection = diff(null)

    fun diff(alias: String?): UserContentEditResponseProjection {
        fields.add(GraphQLResponseField("diff").alias(alias))
        return this
    }

    fun editedAt(): UserContentEditResponseProjection = editedAt(null)

    fun editedAt(alias: String?): UserContentEditResponseProjection {
        fields.add(GraphQLResponseField("editedAt").alias(alias))
        return this
    }

    fun editor(subProjection: ActorResponseProjection): UserContentEditResponseProjection = editor(null, subProjection)

    fun editor(alias: String?, subProjection: ActorResponseProjection): UserContentEditResponseProjection {
        fields.add(GraphQLResponseField("editor").alias(alias).projection(subProjection))
        return this
    }

    fun id(): UserContentEditResponseProjection = id(null)

    fun id(alias: String?): UserContentEditResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun updatedAt(): UserContentEditResponseProjection = updatedAt(null)

    fun updatedAt(alias: String?): UserContentEditResponseProjection {
        fields.add(GraphQLResponseField("updatedAt").alias(alias))
        return this
    }

    fun typename(): UserContentEditResponseProjection = typename(null)

    fun typename(alias: String?): UserContentEditResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
