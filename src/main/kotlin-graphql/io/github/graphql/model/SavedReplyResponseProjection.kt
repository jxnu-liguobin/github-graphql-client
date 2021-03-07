package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for SavedReply
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class SavedReplyResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): SavedReplyResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): SavedReplyResponseProjection {
        this.body()
        this.bodyHTML()
        this.databaseId()
        this.id()
        this.title()
        if (projectionDepthOnFields.getOrDefault("SavedReplyResponseProjection.ActorResponseProjection.user", 0) <= maxDepth) {
            projectionDepthOnFields["SavedReplyResponseProjection.ActorResponseProjection.user"] = projectionDepthOnFields.getOrDefault("SavedReplyResponseProjection.ActorResponseProjection.user", 0) + 1
            this.user(ActorResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("SavedReplyResponseProjection.ActorResponseProjection.user", 0)))
        }
        this.typename()
        return this
    }

    fun body(): SavedReplyResponseProjection = body(null)

    fun body(alias: String?): SavedReplyResponseProjection {
        fields.add(GraphQLResponseField("body").alias(alias))
        return this
    }

    fun bodyHTML(): SavedReplyResponseProjection = bodyHTML(null)

    fun bodyHTML(alias: String?): SavedReplyResponseProjection {
        fields.add(GraphQLResponseField("bodyHTML").alias(alias))
        return this
    }

    fun databaseId(): SavedReplyResponseProjection = databaseId(null)

    fun databaseId(alias: String?): SavedReplyResponseProjection {
        fields.add(GraphQLResponseField("databaseId").alias(alias))
        return this
    }

    fun id(): SavedReplyResponseProjection = id(null)

    fun id(alias: String?): SavedReplyResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun title(): SavedReplyResponseProjection = title(null)

    fun title(alias: String?): SavedReplyResponseProjection {
        fields.add(GraphQLResponseField("title").alias(alias))
        return this
    }

    fun user(subProjection: ActorResponseProjection): SavedReplyResponseProjection = user(null, subProjection)

    fun user(alias: String?, subProjection: ActorResponseProjection): SavedReplyResponseProjection {
        fields.add(GraphQLResponseField("user").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): SavedReplyResponseProjection = typename(null)

    fun typename(alias: String?): SavedReplyResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
