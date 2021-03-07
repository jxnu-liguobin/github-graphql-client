package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for ConvertedNoteToIssueEvent
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class ConvertedNoteToIssueEventResponseProjection extends GraphQLResponseProjection {

    override def all$(): ConvertedNoteToIssueEventResponseProjection = all$(3)

    override def all$(maxDepth: Int): ConvertedNoteToIssueEventResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("ConvertedNoteToIssueEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields.put("ConvertedNoteToIssueEventResponseProjection.ActorResponseProjection.actor", projectionDepthOnFields.getOrDefault("ConvertedNoteToIssueEventResponseProjection.ActorResponseProjection.actor", 0) + 1)
            this.actor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ConvertedNoteToIssueEventResponseProjection.ActorResponseProjection.actor", 0)))
        }
        this.createdAt()
        this.databaseId()
        this.id()
        this.typename()
        this
    }

    def actor(subProjection: ActorResponseProjection): ConvertedNoteToIssueEventResponseProjection = {
        actor(null.asInstanceOf[String], subProjection)
    }

    def actor(alias: String, subProjection: ActorResponseProjection): ConvertedNoteToIssueEventResponseProjection = {
        fields.add(new GraphQLResponseField("actor").alias(alias).projection(subProjection))
        this
    }

    def createdAt(): ConvertedNoteToIssueEventResponseProjection = {
        createdAt(null.asInstanceOf[String])
    }

    def createdAt(alias: String): ConvertedNoteToIssueEventResponseProjection = {
        fields.add(new GraphQLResponseField("createdAt").alias(alias))
        this
    }

    def databaseId(): ConvertedNoteToIssueEventResponseProjection = {
        databaseId(null.asInstanceOf[String])
    }

    def databaseId(alias: String): ConvertedNoteToIssueEventResponseProjection = {
        fields.add(new GraphQLResponseField("databaseId").alias(alias))
        this
    }

    def id(): ConvertedNoteToIssueEventResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): ConvertedNoteToIssueEventResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def typename(): ConvertedNoteToIssueEventResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): ConvertedNoteToIssueEventResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
