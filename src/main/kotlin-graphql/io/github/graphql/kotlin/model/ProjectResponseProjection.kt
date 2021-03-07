package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for Project
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class ProjectResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): ProjectResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): ProjectResponseProjection {
        this.body()
        this.bodyHTML()
        this.closed()
        this.closedAt()
        if (projectionDepthOnFields.getOrDefault("ProjectResponseProjection.ProjectColumnConnectionResponseProjection.columns", 0) <= maxDepth) {
            projectionDepthOnFields["ProjectResponseProjection.ProjectColumnConnectionResponseProjection.columns"] = projectionDepthOnFields.getOrDefault("ProjectResponseProjection.ProjectColumnConnectionResponseProjection.columns", 0) + 1
            this.columns(ProjectColumnConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ProjectResponseProjection.ProjectColumnConnectionResponseProjection.columns", 0)))
        }
        this.createdAt()
        if (projectionDepthOnFields.getOrDefault("ProjectResponseProjection.ActorResponseProjection.creator", 0) <= maxDepth) {
            projectionDepthOnFields["ProjectResponseProjection.ActorResponseProjection.creator"] = projectionDepthOnFields.getOrDefault("ProjectResponseProjection.ActorResponseProjection.creator", 0) + 1
            this.creator(ActorResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ProjectResponseProjection.ActorResponseProjection.creator", 0)))
        }
        this.databaseId()
        this.id()
        this.name()
        this.number()
        if (projectionDepthOnFields.getOrDefault("ProjectResponseProjection.ProjectOwnerResponseProjection.owner", 0) <= maxDepth) {
            projectionDepthOnFields["ProjectResponseProjection.ProjectOwnerResponseProjection.owner"] = projectionDepthOnFields.getOrDefault("ProjectResponseProjection.ProjectOwnerResponseProjection.owner", 0) + 1
            this.owner(ProjectOwnerResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ProjectResponseProjection.ProjectOwnerResponseProjection.owner", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ProjectResponseProjection.ProjectCardConnectionResponseProjection.pendingCards", 0) <= maxDepth) {
            projectionDepthOnFields["ProjectResponseProjection.ProjectCardConnectionResponseProjection.pendingCards"] = projectionDepthOnFields.getOrDefault("ProjectResponseProjection.ProjectCardConnectionResponseProjection.pendingCards", 0) + 1
            this.pendingCards(ProjectCardConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ProjectResponseProjection.ProjectCardConnectionResponseProjection.pendingCards", 0)))
        }
        this.resourcePath()
        this.state()
        this.updatedAt()
        this.url()
        this.viewerCanUpdate()
        this.typename()
        return this
    }

    fun body(): ProjectResponseProjection = body(null)

    fun body(alias: String?): ProjectResponseProjection {
        fields.add(GraphQLResponseField("body").alias(alias))
        return this
    }

    fun bodyHTML(): ProjectResponseProjection = bodyHTML(null)

    fun bodyHTML(alias: String?): ProjectResponseProjection {
        fields.add(GraphQLResponseField("bodyHTML").alias(alias))
        return this
    }

    fun closed(): ProjectResponseProjection = closed(null)

    fun closed(alias: String?): ProjectResponseProjection {
        fields.add(GraphQLResponseField("closed").alias(alias))
        return this
    }

    fun closedAt(): ProjectResponseProjection = closedAt(null)

    fun closedAt(alias: String?): ProjectResponseProjection {
        fields.add(GraphQLResponseField("closedAt").alias(alias))
        return this
    }

    fun columns(subProjection: ProjectColumnConnectionResponseProjection): ProjectResponseProjection = columns(null, subProjection)

    fun columns(alias: String?, subProjection: ProjectColumnConnectionResponseProjection): ProjectResponseProjection {
        fields.add(GraphQLResponseField("columns").alias(alias).projection(subProjection))
        return this
    }

    fun columns(input: ProjectColumnsParametrizedInput, subProjection: ProjectColumnConnectionResponseProjection): ProjectResponseProjection = columns(null, input, subProjection)

    fun columns(alias: String?, input: ProjectColumnsParametrizedInput, subProjection: ProjectColumnConnectionResponseProjection): ProjectResponseProjection {
        fields.add(GraphQLResponseField("columns").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun createdAt(): ProjectResponseProjection = createdAt(null)

    fun createdAt(alias: String?): ProjectResponseProjection {
        fields.add(GraphQLResponseField("createdAt").alias(alias))
        return this
    }

    fun creator(subProjection: ActorResponseProjection): ProjectResponseProjection = creator(null, subProjection)

    fun creator(alias: String?, subProjection: ActorResponseProjection): ProjectResponseProjection {
        fields.add(GraphQLResponseField("creator").alias(alias).projection(subProjection))
        return this
    }

    fun databaseId(): ProjectResponseProjection = databaseId(null)

    fun databaseId(alias: String?): ProjectResponseProjection {
        fields.add(GraphQLResponseField("databaseId").alias(alias))
        return this
    }

    fun id(): ProjectResponseProjection = id(null)

    fun id(alias: String?): ProjectResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun name(): ProjectResponseProjection = name(null)

    fun name(alias: String?): ProjectResponseProjection {
        fields.add(GraphQLResponseField("name").alias(alias))
        return this
    }

    fun number(): ProjectResponseProjection = number(null)

    fun number(alias: String?): ProjectResponseProjection {
        fields.add(GraphQLResponseField("number").alias(alias))
        return this
    }

    fun owner(subProjection: ProjectOwnerResponseProjection): ProjectResponseProjection = owner(null, subProjection)

    fun owner(alias: String?, subProjection: ProjectOwnerResponseProjection): ProjectResponseProjection {
        fields.add(GraphQLResponseField("owner").alias(alias).projection(subProjection))
        return this
    }

    fun pendingCards(subProjection: ProjectCardConnectionResponseProjection): ProjectResponseProjection = pendingCards(null, subProjection)

    fun pendingCards(alias: String?, subProjection: ProjectCardConnectionResponseProjection): ProjectResponseProjection {
        fields.add(GraphQLResponseField("pendingCards").alias(alias).projection(subProjection))
        return this
    }

    fun pendingCards(input: ProjectPendingCardsParametrizedInput, subProjection: ProjectCardConnectionResponseProjection): ProjectResponseProjection = pendingCards(null, input, subProjection)

    fun pendingCards(alias: String?, input: ProjectPendingCardsParametrizedInput, subProjection: ProjectCardConnectionResponseProjection): ProjectResponseProjection {
        fields.add(GraphQLResponseField("pendingCards").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun resourcePath(): ProjectResponseProjection = resourcePath(null)

    fun resourcePath(alias: String?): ProjectResponseProjection {
        fields.add(GraphQLResponseField("resourcePath").alias(alias))
        return this
    }

    fun state(): ProjectResponseProjection = state(null)

    fun state(alias: String?): ProjectResponseProjection {
        fields.add(GraphQLResponseField("state").alias(alias))
        return this
    }

    fun updatedAt(): ProjectResponseProjection = updatedAt(null)

    fun updatedAt(alias: String?): ProjectResponseProjection {
        fields.add(GraphQLResponseField("updatedAt").alias(alias))
        return this
    }

    fun url(): ProjectResponseProjection = url(null)

    fun url(alias: String?): ProjectResponseProjection {
        fields.add(GraphQLResponseField("url").alias(alias))
        return this
    }

    fun viewerCanUpdate(): ProjectResponseProjection = viewerCanUpdate(null)

    fun viewerCanUpdate(alias: String?): ProjectResponseProjection {
        fields.add(GraphQLResponseField("viewerCanUpdate").alias(alias))
        return this
    }

    fun typename(): ProjectResponseProjection = typename(null)

    fun typename(alias: String?): ProjectResponseProjection {
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
        val that = other as ProjectResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
