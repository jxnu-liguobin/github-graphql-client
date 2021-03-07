package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for Project
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class ProjectResponseProjection extends GraphQLResponseProjection {

    override def all$(): ProjectResponseProjection = all$(3)

    override def all$(maxDepth: Int): ProjectResponseProjection = {
        this.body()
        this.bodyHTML()
        this.closed()
        this.closedAt()
        if (projectionDepthOnFields.getOrDefault("ProjectResponseProjection.ProjectColumnConnectionResponseProjection.columns", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProjectResponseProjection.ProjectColumnConnectionResponseProjection.columns", projectionDepthOnFields.getOrDefault("ProjectResponseProjection.ProjectColumnConnectionResponseProjection.columns", 0) + 1)
            this.columns(new ProjectColumnConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProjectResponseProjection.ProjectColumnConnectionResponseProjection.columns", 0)))
        }
        this.createdAt()
        if (projectionDepthOnFields.getOrDefault("ProjectResponseProjection.ActorResponseProjection.creator", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProjectResponseProjection.ActorResponseProjection.creator", projectionDepthOnFields.getOrDefault("ProjectResponseProjection.ActorResponseProjection.creator", 0) + 1)
            this.creator(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProjectResponseProjection.ActorResponseProjection.creator", 0)))
        }
        this.databaseId()
        this.id()
        this.name()
        this.number()
        if (projectionDepthOnFields.getOrDefault("ProjectResponseProjection.ProjectOwnerResponseProjection.owner", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProjectResponseProjection.ProjectOwnerResponseProjection.owner", projectionDepthOnFields.getOrDefault("ProjectResponseProjection.ProjectOwnerResponseProjection.owner", 0) + 1)
            this.owner(new ProjectOwnerResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProjectResponseProjection.ProjectOwnerResponseProjection.owner", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ProjectResponseProjection.ProjectCardConnectionResponseProjection.pendingCards", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProjectResponseProjection.ProjectCardConnectionResponseProjection.pendingCards", projectionDepthOnFields.getOrDefault("ProjectResponseProjection.ProjectCardConnectionResponseProjection.pendingCards", 0) + 1)
            this.pendingCards(new ProjectCardConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProjectResponseProjection.ProjectCardConnectionResponseProjection.pendingCards", 0)))
        }
        this.resourcePath()
        this.state()
        this.updatedAt()
        this.url()
        this.viewerCanUpdate()
        this.typename()
        this
    }

    def body(): ProjectResponseProjection = {
        body(null.asInstanceOf[String])
    }

    def body(alias: String): ProjectResponseProjection = {
        fields.add(new GraphQLResponseField("body").alias(alias))
        this
    }

    def bodyHTML(): ProjectResponseProjection = {
        bodyHTML(null.asInstanceOf[String])
    }

    def bodyHTML(alias: String): ProjectResponseProjection = {
        fields.add(new GraphQLResponseField("bodyHTML").alias(alias))
        this
    }

    def closed(): ProjectResponseProjection = {
        closed(null.asInstanceOf[String])
    }

    def closed(alias: String): ProjectResponseProjection = {
        fields.add(new GraphQLResponseField("closed").alias(alias))
        this
    }

    def closedAt(): ProjectResponseProjection = {
        closedAt(null.asInstanceOf[String])
    }

    def closedAt(alias: String): ProjectResponseProjection = {
        fields.add(new GraphQLResponseField("closedAt").alias(alias))
        this
    }

    def columns(subProjection: ProjectColumnConnectionResponseProjection): ProjectResponseProjection = {
        columns(null.asInstanceOf[String], subProjection)
    }

    def columns(alias: String, subProjection: ProjectColumnConnectionResponseProjection): ProjectResponseProjection = {
        fields.add(new GraphQLResponseField("columns").alias(alias).projection(subProjection))
        this
    }

    def columns(input: ProjectColumnsParametrizedInput,subProjection: ProjectColumnConnectionResponseProjection): ProjectResponseProjection = {
        columns(null.asInstanceOf[String], input, subProjection)
    }

    def columns(alias: String, input: ProjectColumnsParametrizedInput , subProjection: ProjectColumnConnectionResponseProjection): ProjectResponseProjection = {
        fields.add(new GraphQLResponseField("columns").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def createdAt(): ProjectResponseProjection = {
        createdAt(null.asInstanceOf[String])
    }

    def createdAt(alias: String): ProjectResponseProjection = {
        fields.add(new GraphQLResponseField("createdAt").alias(alias))
        this
    }

    def creator(subProjection: ActorResponseProjection): ProjectResponseProjection = {
        creator(null.asInstanceOf[String], subProjection)
    }

    def creator(alias: String, subProjection: ActorResponseProjection): ProjectResponseProjection = {
        fields.add(new GraphQLResponseField("creator").alias(alias).projection(subProjection))
        this
    }

    def databaseId(): ProjectResponseProjection = {
        databaseId(null.asInstanceOf[String])
    }

    def databaseId(alias: String): ProjectResponseProjection = {
        fields.add(new GraphQLResponseField("databaseId").alias(alias))
        this
    }

    def id(): ProjectResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): ProjectResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def name(): ProjectResponseProjection = {
        name(null.asInstanceOf[String])
    }

    def name(alias: String): ProjectResponseProjection = {
        fields.add(new GraphQLResponseField("name").alias(alias))
        this
    }

    def number(): ProjectResponseProjection = {
        number(null.asInstanceOf[String])
    }

    def number(alias: String): ProjectResponseProjection = {
        fields.add(new GraphQLResponseField("number").alias(alias))
        this
    }

    def owner(subProjection: ProjectOwnerResponseProjection): ProjectResponseProjection = {
        owner(null.asInstanceOf[String], subProjection)
    }

    def owner(alias: String, subProjection: ProjectOwnerResponseProjection): ProjectResponseProjection = {
        fields.add(new GraphQLResponseField("owner").alias(alias).projection(subProjection))
        this
    }

    def pendingCards(subProjection: ProjectCardConnectionResponseProjection): ProjectResponseProjection = {
        pendingCards(null.asInstanceOf[String], subProjection)
    }

    def pendingCards(alias: String, subProjection: ProjectCardConnectionResponseProjection): ProjectResponseProjection = {
        fields.add(new GraphQLResponseField("pendingCards").alias(alias).projection(subProjection))
        this
    }

    def pendingCards(input: ProjectPendingCardsParametrizedInput,subProjection: ProjectCardConnectionResponseProjection): ProjectResponseProjection = {
        pendingCards(null.asInstanceOf[String], input, subProjection)
    }

    def pendingCards(alias: String, input: ProjectPendingCardsParametrizedInput , subProjection: ProjectCardConnectionResponseProjection): ProjectResponseProjection = {
        fields.add(new GraphQLResponseField("pendingCards").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def resourcePath(): ProjectResponseProjection = {
        resourcePath(null.asInstanceOf[String])
    }

    def resourcePath(alias: String): ProjectResponseProjection = {
        fields.add(new GraphQLResponseField("resourcePath").alias(alias))
        this
    }

    def state(): ProjectResponseProjection = {
        state(null.asInstanceOf[String])
    }

    def state(alias: String): ProjectResponseProjection = {
        fields.add(new GraphQLResponseField("state").alias(alias))
        this
    }

    def updatedAt(): ProjectResponseProjection = {
        updatedAt(null.asInstanceOf[String])
    }

    def updatedAt(alias: String): ProjectResponseProjection = {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias))
        this
    }

    def url(): ProjectResponseProjection = {
        url(null.asInstanceOf[String])
    }

    def url(alias: String): ProjectResponseProjection = {
        fields.add(new GraphQLResponseField("url").alias(alias))
        this
    }

    def viewerCanUpdate(): ProjectResponseProjection = {
        viewerCanUpdate(null.asInstanceOf[String])
    }

    def viewerCanUpdate(alias: String): ProjectResponseProjection = {
        fields.add(new GraphQLResponseField("viewerCanUpdate").alias(alias))
        this
    }

    def typename(): ProjectResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): ProjectResponseProjection = {
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
        val that = obj.asInstanceOf[ProjectResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
