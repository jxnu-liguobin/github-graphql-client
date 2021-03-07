package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for SavedReply
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class SavedReplyResponseProjection extends GraphQLResponseProjection {

    override def all$(): SavedReplyResponseProjection = all$(3)

    override def all$(maxDepth: Int): SavedReplyResponseProjection = {
        this.body()
        this.bodyHTML()
        this.databaseId()
        this.id()
        this.title()
        if (projectionDepthOnFields.getOrDefault("SavedReplyResponseProjection.ActorResponseProjection.user", 0) <= maxDepth) {
            projectionDepthOnFields.put("SavedReplyResponseProjection.ActorResponseProjection.user", projectionDepthOnFields.getOrDefault("SavedReplyResponseProjection.ActorResponseProjection.user", 0) + 1)
            this.user(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SavedReplyResponseProjection.ActorResponseProjection.user", 0)))
        }
        this.typename()
        this
    }

    def body(): SavedReplyResponseProjection = {
        body(null.asInstanceOf[String])
    }

    def body(alias: String): SavedReplyResponseProjection = {
        fields.add(new GraphQLResponseField("body").alias(alias))
        this
    }

    def bodyHTML(): SavedReplyResponseProjection = {
        bodyHTML(null.asInstanceOf[String])
    }

    def bodyHTML(alias: String): SavedReplyResponseProjection = {
        fields.add(new GraphQLResponseField("bodyHTML").alias(alias))
        this
    }

    def databaseId(): SavedReplyResponseProjection = {
        databaseId(null.asInstanceOf[String])
    }

    def databaseId(alias: String): SavedReplyResponseProjection = {
        fields.add(new GraphQLResponseField("databaseId").alias(alias))
        this
    }

    def id(): SavedReplyResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): SavedReplyResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def title(): SavedReplyResponseProjection = {
        title(null.asInstanceOf[String])
    }

    def title(alias: String): SavedReplyResponseProjection = {
        fields.add(new GraphQLResponseField("title").alias(alias))
        this
    }

    def user(subProjection: ActorResponseProjection): SavedReplyResponseProjection = {
        user(null.asInstanceOf[String], subProjection)
    }

    def user(alias: String, subProjection: ActorResponseProjection): SavedReplyResponseProjection = {
        fields.add(new GraphQLResponseField("user").alias(alias).projection(subProjection))
        this
    }

    def typename(): SavedReplyResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): SavedReplyResponseProjection = {
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
        val that = obj.asInstanceOf[SavedReplyResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
