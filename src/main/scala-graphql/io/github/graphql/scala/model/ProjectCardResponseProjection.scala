package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for ProjectCard
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class ProjectCardResponseProjection extends GraphQLResponseProjection {

    override def all$(): ProjectCardResponseProjection = all$(3)

    override def all$(maxDepth: Int): ProjectCardResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("ProjectCardResponseProjection.ProjectColumnResponseProjection.column", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProjectCardResponseProjection.ProjectColumnResponseProjection.column", projectionDepthOnFields.getOrDefault("ProjectCardResponseProjection.ProjectColumnResponseProjection.column", 0) + 1)
            this.column(new ProjectColumnResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProjectCardResponseProjection.ProjectColumnResponseProjection.column", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ProjectCardResponseProjection.ProjectCardItemResponseProjection.content", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProjectCardResponseProjection.ProjectCardItemResponseProjection.content", projectionDepthOnFields.getOrDefault("ProjectCardResponseProjection.ProjectCardItemResponseProjection.content", 0) + 1)
            this.content(new ProjectCardItemResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProjectCardResponseProjection.ProjectCardItemResponseProjection.content", 0)))
        }
        this.createdAt()
        if (projectionDepthOnFields.getOrDefault("ProjectCardResponseProjection.ActorResponseProjection.creator", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProjectCardResponseProjection.ActorResponseProjection.creator", projectionDepthOnFields.getOrDefault("ProjectCardResponseProjection.ActorResponseProjection.creator", 0) + 1)
            this.creator(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProjectCardResponseProjection.ActorResponseProjection.creator", 0)))
        }
        this.databaseId()
        this.id()
        this.isArchived()
        this.note()
        if (projectionDepthOnFields.getOrDefault("ProjectCardResponseProjection.ProjectResponseProjection.project", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProjectCardResponseProjection.ProjectResponseProjection.project", projectionDepthOnFields.getOrDefault("ProjectCardResponseProjection.ProjectResponseProjection.project", 0) + 1)
            this.project(new ProjectResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProjectCardResponseProjection.ProjectResponseProjection.project", 0)))
        }
        this.resourcePath()
        this.state()
        this.updatedAt()
        this.url()
        this.typename()
        this
    }

    def column(subProjection: ProjectColumnResponseProjection): ProjectCardResponseProjection = {
        column(null.asInstanceOf[String], subProjection)
    }

    def column(alias: String, subProjection: ProjectColumnResponseProjection): ProjectCardResponseProjection = {
        fields.add(new GraphQLResponseField("column").alias(alias).projection(subProjection))
        this
    }

    def content(subProjection: ProjectCardItemResponseProjection): ProjectCardResponseProjection = {
        content(null.asInstanceOf[String], subProjection)
    }

    def content(alias: String, subProjection: ProjectCardItemResponseProjection): ProjectCardResponseProjection = {
        fields.add(new GraphQLResponseField("content").alias(alias).projection(subProjection))
        this
    }

    def createdAt(): ProjectCardResponseProjection = {
        createdAt(null.asInstanceOf[String])
    }

    def createdAt(alias: String): ProjectCardResponseProjection = {
        fields.add(new GraphQLResponseField("createdAt").alias(alias))
        this
    }

    def creator(subProjection: ActorResponseProjection): ProjectCardResponseProjection = {
        creator(null.asInstanceOf[String], subProjection)
    }

    def creator(alias: String, subProjection: ActorResponseProjection): ProjectCardResponseProjection = {
        fields.add(new GraphQLResponseField("creator").alias(alias).projection(subProjection))
        this
    }

    def databaseId(): ProjectCardResponseProjection = {
        databaseId(null.asInstanceOf[String])
    }

    def databaseId(alias: String): ProjectCardResponseProjection = {
        fields.add(new GraphQLResponseField("databaseId").alias(alias))
        this
    }

    def id(): ProjectCardResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): ProjectCardResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def isArchived(): ProjectCardResponseProjection = {
        isArchived(null.asInstanceOf[String])
    }

    def isArchived(alias: String): ProjectCardResponseProjection = {
        fields.add(new GraphQLResponseField("isArchived").alias(alias))
        this
    }

    def note(): ProjectCardResponseProjection = {
        note(null.asInstanceOf[String])
    }

    def note(alias: String): ProjectCardResponseProjection = {
        fields.add(new GraphQLResponseField("note").alias(alias))
        this
    }

    def project(subProjection: ProjectResponseProjection): ProjectCardResponseProjection = {
        project(null.asInstanceOf[String], subProjection)
    }

    def project(alias: String, subProjection: ProjectResponseProjection): ProjectCardResponseProjection = {
        fields.add(new GraphQLResponseField("project").alias(alias).projection(subProjection))
        this
    }

    def resourcePath(): ProjectCardResponseProjection = {
        resourcePath(null.asInstanceOf[String])
    }

    def resourcePath(alias: String): ProjectCardResponseProjection = {
        fields.add(new GraphQLResponseField("resourcePath").alias(alias))
        this
    }

    def state(): ProjectCardResponseProjection = {
        state(null.asInstanceOf[String])
    }

    def state(alias: String): ProjectCardResponseProjection = {
        fields.add(new GraphQLResponseField("state").alias(alias))
        this
    }

    def updatedAt(): ProjectCardResponseProjection = {
        updatedAt(null.asInstanceOf[String])
    }

    def updatedAt(alias: String): ProjectCardResponseProjection = {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias))
        this
    }

    def url(): ProjectCardResponseProjection = {
        url(null.asInstanceOf[String])
    }

    def url(alias: String): ProjectCardResponseProjection = {
        fields.add(new GraphQLResponseField("url").alias(alias))
        this
    }

    def typename(): ProjectCardResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): ProjectCardResponseProjection = {
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
        val that = obj.asInstanceOf[ProjectCardResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
