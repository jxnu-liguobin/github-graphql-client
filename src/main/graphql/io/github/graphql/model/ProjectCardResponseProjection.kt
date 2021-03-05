package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for ProjectCard
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class ProjectCardResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): ProjectCardResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): ProjectCardResponseProjection {
        if (projectionDepthOnFields.getOrDefault("ProjectCardResponseProjection.ProjectColumnResponseProjection.column", 0) <= maxDepth) {
            projectionDepthOnFields["ProjectCardResponseProjection.ProjectColumnResponseProjection.column"] = projectionDepthOnFields.getOrDefault("ProjectCardResponseProjection.ProjectColumnResponseProjection.column", 0) + 1
            this.column(ProjectColumnResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ProjectCardResponseProjection.ProjectColumnResponseProjection.column", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ProjectCardResponseProjection.ProjectCardItemResponseProjection.content", 0) <= maxDepth) {
            projectionDepthOnFields["ProjectCardResponseProjection.ProjectCardItemResponseProjection.content"] = projectionDepthOnFields.getOrDefault("ProjectCardResponseProjection.ProjectCardItemResponseProjection.content", 0) + 1
            this.content(ProjectCardItemResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ProjectCardResponseProjection.ProjectCardItemResponseProjection.content", 0)))
        }
        this.createdAt()
        if (projectionDepthOnFields.getOrDefault("ProjectCardResponseProjection.ActorResponseProjection.creator", 0) <= maxDepth) {
            projectionDepthOnFields["ProjectCardResponseProjection.ActorResponseProjection.creator"] = projectionDepthOnFields.getOrDefault("ProjectCardResponseProjection.ActorResponseProjection.creator", 0) + 1
            this.creator(ActorResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ProjectCardResponseProjection.ActorResponseProjection.creator", 0)))
        }
        this.databaseId()
        this.id()
        this.isArchived()
        this.note()
        if (projectionDepthOnFields.getOrDefault("ProjectCardResponseProjection.ProjectResponseProjection.project", 0) <= maxDepth) {
            projectionDepthOnFields["ProjectCardResponseProjection.ProjectResponseProjection.project"] = projectionDepthOnFields.getOrDefault("ProjectCardResponseProjection.ProjectResponseProjection.project", 0) + 1
            this.project(ProjectResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ProjectCardResponseProjection.ProjectResponseProjection.project", 0)))
        }
        this.resourcePath()
        this.state()
        this.updatedAt()
        this.url()
        this.typename()
        return this
    }

    fun column(subProjection: ProjectColumnResponseProjection): ProjectCardResponseProjection = column(null, subProjection)

    fun column(alias: String?, subProjection: ProjectColumnResponseProjection): ProjectCardResponseProjection {
        fields.add(GraphQLResponseField("column").alias(alias).projection(subProjection))
        return this
    }

    fun content(subProjection: ProjectCardItemResponseProjection): ProjectCardResponseProjection = content(null, subProjection)

    fun content(alias: String?, subProjection: ProjectCardItemResponseProjection): ProjectCardResponseProjection {
        fields.add(GraphQLResponseField("content").alias(alias).projection(subProjection))
        return this
    }

    fun createdAt(): ProjectCardResponseProjection = createdAt(null)

    fun createdAt(alias: String?): ProjectCardResponseProjection {
        fields.add(GraphQLResponseField("createdAt").alias(alias))
        return this
    }

    fun creator(subProjection: ActorResponseProjection): ProjectCardResponseProjection = creator(null, subProjection)

    fun creator(alias: String?, subProjection: ActorResponseProjection): ProjectCardResponseProjection {
        fields.add(GraphQLResponseField("creator").alias(alias).projection(subProjection))
        return this
    }

    fun databaseId(): ProjectCardResponseProjection = databaseId(null)

    fun databaseId(alias: String?): ProjectCardResponseProjection {
        fields.add(GraphQLResponseField("databaseId").alias(alias))
        return this
    }

    fun id(): ProjectCardResponseProjection = id(null)

    fun id(alias: String?): ProjectCardResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun isArchived(): ProjectCardResponseProjection = isArchived(null)

    fun isArchived(alias: String?): ProjectCardResponseProjection {
        fields.add(GraphQLResponseField("isArchived").alias(alias))
        return this
    }

    fun note(): ProjectCardResponseProjection = note(null)

    fun note(alias: String?): ProjectCardResponseProjection {
        fields.add(GraphQLResponseField("note").alias(alias))
        return this
    }

    fun project(subProjection: ProjectResponseProjection): ProjectCardResponseProjection = project(null, subProjection)

    fun project(alias: String?, subProjection: ProjectResponseProjection): ProjectCardResponseProjection {
        fields.add(GraphQLResponseField("project").alias(alias).projection(subProjection))
        return this
    }

    fun resourcePath(): ProjectCardResponseProjection = resourcePath(null)

    fun resourcePath(alias: String?): ProjectCardResponseProjection {
        fields.add(GraphQLResponseField("resourcePath").alias(alias))
        return this
    }

    fun state(): ProjectCardResponseProjection = state(null)

    fun state(alias: String?): ProjectCardResponseProjection {
        fields.add(GraphQLResponseField("state").alias(alias))
        return this
    }

    fun updatedAt(): ProjectCardResponseProjection = updatedAt(null)

    fun updatedAt(alias: String?): ProjectCardResponseProjection {
        fields.add(GraphQLResponseField("updatedAt").alias(alias))
        return this
    }

    fun url(): ProjectCardResponseProjection = url(null)

    fun url(alias: String?): ProjectCardResponseProjection {
        fields.add(GraphQLResponseField("url").alias(alias))
        return this
    }

    fun typename(): ProjectCardResponseProjection = typename(null)

    fun typename(alias: String?): ProjectCardResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
