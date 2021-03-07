package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for ProjectColumn
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class ProjectColumnResponseProjection extends GraphQLResponseProjection {

    override def all$(): ProjectColumnResponseProjection = all$(3)

    override def all$(maxDepth: Int): ProjectColumnResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("ProjectColumnResponseProjection.ProjectCardConnectionResponseProjection.cards", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProjectColumnResponseProjection.ProjectCardConnectionResponseProjection.cards", projectionDepthOnFields.getOrDefault("ProjectColumnResponseProjection.ProjectCardConnectionResponseProjection.cards", 0) + 1)
            this.cards(new ProjectCardConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProjectColumnResponseProjection.ProjectCardConnectionResponseProjection.cards", 0)))
        }
        this.createdAt()
        this.databaseId()
        this.id()
        this.name()
        if (projectionDepthOnFields.getOrDefault("ProjectColumnResponseProjection.ProjectResponseProjection.project", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProjectColumnResponseProjection.ProjectResponseProjection.project", projectionDepthOnFields.getOrDefault("ProjectColumnResponseProjection.ProjectResponseProjection.project", 0) + 1)
            this.project(new ProjectResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProjectColumnResponseProjection.ProjectResponseProjection.project", 0)))
        }
        this.purpose()
        this.resourcePath()
        this.updatedAt()
        this.url()
        this.typename()
        this
    }

    def cards(subProjection: ProjectCardConnectionResponseProjection): ProjectColumnResponseProjection = {
        cards(null.asInstanceOf[String], subProjection)
    }

    def cards(alias: String, subProjection: ProjectCardConnectionResponseProjection): ProjectColumnResponseProjection = {
        fields.add(new GraphQLResponseField("cards").alias(alias).projection(subProjection))
        this
    }

    def cards(input: ProjectColumnCardsParametrizedInput,subProjection: ProjectCardConnectionResponseProjection): ProjectColumnResponseProjection = {
        cards(null.asInstanceOf[String], input, subProjection)
    }

    def cards(alias: String, input: ProjectColumnCardsParametrizedInput , subProjection: ProjectCardConnectionResponseProjection): ProjectColumnResponseProjection = {
        fields.add(new GraphQLResponseField("cards").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def createdAt(): ProjectColumnResponseProjection = {
        createdAt(null.asInstanceOf[String])
    }

    def createdAt(alias: String): ProjectColumnResponseProjection = {
        fields.add(new GraphQLResponseField("createdAt").alias(alias))
        this
    }

    def databaseId(): ProjectColumnResponseProjection = {
        databaseId(null.asInstanceOf[String])
    }

    def databaseId(alias: String): ProjectColumnResponseProjection = {
        fields.add(new GraphQLResponseField("databaseId").alias(alias))
        this
    }

    def id(): ProjectColumnResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): ProjectColumnResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def name(): ProjectColumnResponseProjection = {
        name(null.asInstanceOf[String])
    }

    def name(alias: String): ProjectColumnResponseProjection = {
        fields.add(new GraphQLResponseField("name").alias(alias))
        this
    }

    def project(subProjection: ProjectResponseProjection): ProjectColumnResponseProjection = {
        project(null.asInstanceOf[String], subProjection)
    }

    def project(alias: String, subProjection: ProjectResponseProjection): ProjectColumnResponseProjection = {
        fields.add(new GraphQLResponseField("project").alias(alias).projection(subProjection))
        this
    }

    def purpose(): ProjectColumnResponseProjection = {
        purpose(null.asInstanceOf[String])
    }

    def purpose(alias: String): ProjectColumnResponseProjection = {
        fields.add(new GraphQLResponseField("purpose").alias(alias))
        this
    }

    def resourcePath(): ProjectColumnResponseProjection = {
        resourcePath(null.asInstanceOf[String])
    }

    def resourcePath(alias: String): ProjectColumnResponseProjection = {
        fields.add(new GraphQLResponseField("resourcePath").alias(alias))
        this
    }

    def updatedAt(): ProjectColumnResponseProjection = {
        updatedAt(null.asInstanceOf[String])
    }

    def updatedAt(alias: String): ProjectColumnResponseProjection = {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias))
        this
    }

    def url(): ProjectColumnResponseProjection = {
        url(null.asInstanceOf[String])
    }

    def url(alias: String): ProjectColumnResponseProjection = {
        fields.add(new GraphQLResponseField("url").alias(alias))
        this
    }

    def typename(): ProjectColumnResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): ProjectColumnResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
