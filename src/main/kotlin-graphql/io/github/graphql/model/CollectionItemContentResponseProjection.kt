package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for CollectionItemContent
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class CollectionItemContentResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): CollectionItemContentResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): CollectionItemContentResponseProjection {
        this.typename()
        return this
    }

    fun onRepository(subProjection: RepositoryResponseProjection): CollectionItemContentResponseProjection = onRepository(null, subProjection)

    fun onRepository(alias: String?, subProjection: RepositoryResponseProjection): CollectionItemContentResponseProjection {
        fields.add(GraphQLResponseField("...on Repository").alias(alias).projection(subProjection))
        return this
    }

    fun onOrganization(subProjection: OrganizationResponseProjection): CollectionItemContentResponseProjection = onOrganization(null, subProjection)

    fun onOrganization(alias: String?, subProjection: OrganizationResponseProjection): CollectionItemContentResponseProjection {
        fields.add(GraphQLResponseField("...on Organization").alias(alias).projection(subProjection))
        return this
    }

    fun onUser(subProjection: UserResponseProjection): CollectionItemContentResponseProjection = onUser(null, subProjection)

    fun onUser(alias: String?, subProjection: UserResponseProjection): CollectionItemContentResponseProjection {
        fields.add(GraphQLResponseField("...on User").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): CollectionItemContentResponseProjection = typename(null)

    fun typename(alias: String?): CollectionItemContentResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
