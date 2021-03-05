package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for PinnableItem
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class PinnableItemResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): PinnableItemResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): PinnableItemResponseProjection {
        this.typename()
        return this
    }

    fun onGist(subProjection: GistResponseProjection): PinnableItemResponseProjection = onGist(null, subProjection)

    fun onGist(alias: String?, subProjection: GistResponseProjection): PinnableItemResponseProjection {
        fields.add(GraphQLResponseField("...on Gist").alias(alias).projection(subProjection))
        return this
    }

    fun onRepository(subProjection: RepositoryResponseProjection): PinnableItemResponseProjection = onRepository(null, subProjection)

    fun onRepository(alias: String?, subProjection: RepositoryResponseProjection): PinnableItemResponseProjection {
        fields.add(GraphQLResponseField("...on Repository").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): PinnableItemResponseProjection = typename(null)

    fun typename(alias: String?): PinnableItemResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
