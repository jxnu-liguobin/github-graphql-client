package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for ProfileItemShowcase
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class ProfileItemShowcaseResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): ProfileItemShowcaseResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): ProfileItemShowcaseResponseProjection {
        this.hasPinnedItems()
        if (projectionDepthOnFields.getOrDefault("ProfileItemShowcaseResponseProjection.PinnableItemConnectionResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields["ProfileItemShowcaseResponseProjection.PinnableItemConnectionResponseProjection.items"] = projectionDepthOnFields.getOrDefault("ProfileItemShowcaseResponseProjection.PinnableItemConnectionResponseProjection.items", 0) + 1
            this.items(PinnableItemConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ProfileItemShowcaseResponseProjection.PinnableItemConnectionResponseProjection.items", 0)))
        }
        this.typename()
        return this
    }

    fun hasPinnedItems(): ProfileItemShowcaseResponseProjection = hasPinnedItems(null)

    fun hasPinnedItems(alias: String?): ProfileItemShowcaseResponseProjection {
        fields.add(GraphQLResponseField("hasPinnedItems").alias(alias))
        return this
    }

    fun items(subProjection: PinnableItemConnectionResponseProjection): ProfileItemShowcaseResponseProjection = items(null, subProjection)

    fun items(alias: String?, subProjection: PinnableItemConnectionResponseProjection): ProfileItemShowcaseResponseProjection {
        fields.add(GraphQLResponseField("items").alias(alias).projection(subProjection))
        return this
    }

    fun items(input: ProfileItemShowcaseItemsParametrizedInput, subProjection: PinnableItemConnectionResponseProjection): ProfileItemShowcaseResponseProjection = items(null, input, subProjection)

    fun items(alias: String?, input: ProfileItemShowcaseItemsParametrizedInput, subProjection: PinnableItemConnectionResponseProjection): ProfileItemShowcaseResponseProjection {
        fields.add(GraphQLResponseField("items").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun typename(): ProfileItemShowcaseResponseProjection = typename(null)

    fun typename(alias: String?): ProfileItemShowcaseResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
