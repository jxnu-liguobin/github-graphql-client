package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for PinnableItem
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class PinnableItemResponseProjection extends GraphQLResponseProjection {

    override def all$(): PinnableItemResponseProjection = all$(3)

    override def all$(maxDepth: Int): PinnableItemResponseProjection = {
        this.typename()
        this
    }

    def onGist(subProjection: GistResponseProjection): PinnableItemResponseProjection = {
        onGist(null.asInstanceOf[String], subProjection)
    }

    def onGist(alias: String, subProjection: GistResponseProjection): PinnableItemResponseProjection = {
        fields.add(new GraphQLResponseField("...on Gist").alias(alias).projection(subProjection))
        this
    }

    def onRepository(subProjection: RepositoryResponseProjection): PinnableItemResponseProjection = {
        onRepository(null.asInstanceOf[String], subProjection)
    }

    def onRepository(alias: String, subProjection: RepositoryResponseProjection): PinnableItemResponseProjection = {
        fields.add(new GraphQLResponseField("...on Repository").alias(alias).projection(subProjection))
        this
    }

    def typename(): PinnableItemResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): PinnableItemResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
