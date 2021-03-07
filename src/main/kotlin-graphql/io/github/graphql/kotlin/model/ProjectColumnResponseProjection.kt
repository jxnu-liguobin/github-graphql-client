package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for ProjectColumn
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class ProjectColumnResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): ProjectColumnResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): ProjectColumnResponseProjection {
        if (projectionDepthOnFields.getOrDefault("ProjectColumnResponseProjection.ProjectCardConnectionResponseProjection.cards", 0) <= maxDepth) {
            projectionDepthOnFields["ProjectColumnResponseProjection.ProjectCardConnectionResponseProjection.cards"] = projectionDepthOnFields.getOrDefault("ProjectColumnResponseProjection.ProjectCardConnectionResponseProjection.cards", 0) + 1
            this.cards(ProjectCardConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ProjectColumnResponseProjection.ProjectCardConnectionResponseProjection.cards", 0)))
        }
        this.createdAt()
        this.databaseId()
        this.id()
        this.name()
        if (projectionDepthOnFields.getOrDefault("ProjectColumnResponseProjection.ProjectResponseProjection.project", 0) <= maxDepth) {
            projectionDepthOnFields["ProjectColumnResponseProjection.ProjectResponseProjection.project"] = projectionDepthOnFields.getOrDefault("ProjectColumnResponseProjection.ProjectResponseProjection.project", 0) + 1
            this.project(ProjectResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ProjectColumnResponseProjection.ProjectResponseProjection.project", 0)))
        }
        this.purpose()
        this.resourcePath()
        this.updatedAt()
        this.url()
        this.typename()
        return this
    }

    fun cards(subProjection: ProjectCardConnectionResponseProjection): ProjectColumnResponseProjection = cards(null, subProjection)

    fun cards(alias: String?, subProjection: ProjectCardConnectionResponseProjection): ProjectColumnResponseProjection {
        fields.add(GraphQLResponseField("cards").alias(alias).projection(subProjection))
        return this
    }

    fun cards(input: ProjectColumnCardsParametrizedInput, subProjection: ProjectCardConnectionResponseProjection): ProjectColumnResponseProjection = cards(null, input, subProjection)

    fun cards(alias: String?, input: ProjectColumnCardsParametrizedInput, subProjection: ProjectCardConnectionResponseProjection): ProjectColumnResponseProjection {
        fields.add(GraphQLResponseField("cards").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun createdAt(): ProjectColumnResponseProjection = createdAt(null)

    fun createdAt(alias: String?): ProjectColumnResponseProjection {
        fields.add(GraphQLResponseField("createdAt").alias(alias))
        return this
    }

    fun databaseId(): ProjectColumnResponseProjection = databaseId(null)

    fun databaseId(alias: String?): ProjectColumnResponseProjection {
        fields.add(GraphQLResponseField("databaseId").alias(alias))
        return this
    }

    fun id(): ProjectColumnResponseProjection = id(null)

    fun id(alias: String?): ProjectColumnResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun name(): ProjectColumnResponseProjection = name(null)

    fun name(alias: String?): ProjectColumnResponseProjection {
        fields.add(GraphQLResponseField("name").alias(alias))
        return this
    }

    fun project(subProjection: ProjectResponseProjection): ProjectColumnResponseProjection = project(null, subProjection)

    fun project(alias: String?, subProjection: ProjectResponseProjection): ProjectColumnResponseProjection {
        fields.add(GraphQLResponseField("project").alias(alias).projection(subProjection))
        return this
    }

    fun purpose(): ProjectColumnResponseProjection = purpose(null)

    fun purpose(alias: String?): ProjectColumnResponseProjection {
        fields.add(GraphQLResponseField("purpose").alias(alias))
        return this
    }

    fun resourcePath(): ProjectColumnResponseProjection = resourcePath(null)

    fun resourcePath(alias: String?): ProjectColumnResponseProjection {
        fields.add(GraphQLResponseField("resourcePath").alias(alias))
        return this
    }

    fun updatedAt(): ProjectColumnResponseProjection = updatedAt(null)

    fun updatedAt(alias: String?): ProjectColumnResponseProjection {
        fields.add(GraphQLResponseField("updatedAt").alias(alias))
        return this
    }

    fun url(): ProjectColumnResponseProjection = url(null)

    fun url(alias: String?): ProjectColumnResponseProjection {
        fields.add(GraphQLResponseField("url").alias(alias))
        return this
    }

    fun typename(): ProjectColumnResponseProjection = typename(null)

    fun typename(alias: String?): ProjectColumnResponseProjection {
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
        val that = other as ProjectColumnResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
