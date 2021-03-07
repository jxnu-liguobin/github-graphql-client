package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for ConvertedNoteToIssueEvent
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class ConvertedNoteToIssueEventResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): ConvertedNoteToIssueEventResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): ConvertedNoteToIssueEventResponseProjection {
        if (projectionDepthOnFields.getOrDefault("ConvertedNoteToIssueEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields["ConvertedNoteToIssueEventResponseProjection.ActorResponseProjection.actor"] = projectionDepthOnFields.getOrDefault("ConvertedNoteToIssueEventResponseProjection.ActorResponseProjection.actor", 0) + 1
            this.actor(ActorResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ConvertedNoteToIssueEventResponseProjection.ActorResponseProjection.actor", 0)))
        }
        this.createdAt()
        this.databaseId()
        this.id()
        this.typename()
        return this
    }

    fun actor(subProjection: ActorResponseProjection): ConvertedNoteToIssueEventResponseProjection = actor(null, subProjection)

    fun actor(alias: String?, subProjection: ActorResponseProjection): ConvertedNoteToIssueEventResponseProjection {
        fields.add(GraphQLResponseField("actor").alias(alias).projection(subProjection))
        return this
    }

    fun createdAt(): ConvertedNoteToIssueEventResponseProjection = createdAt(null)

    fun createdAt(alias: String?): ConvertedNoteToIssueEventResponseProjection {
        fields.add(GraphQLResponseField("createdAt").alias(alias))
        return this
    }

    fun databaseId(): ConvertedNoteToIssueEventResponseProjection = databaseId(null)

    fun databaseId(alias: String?): ConvertedNoteToIssueEventResponseProjection {
        fields.add(GraphQLResponseField("databaseId").alias(alias))
        return this
    }

    fun id(): ConvertedNoteToIssueEventResponseProjection = id(null)

    fun id(alias: String?): ConvertedNoteToIssueEventResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun typename(): ConvertedNoteToIssueEventResponseProjection = typename(null)

    fun typename(alias: String?): ConvertedNoteToIssueEventResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
