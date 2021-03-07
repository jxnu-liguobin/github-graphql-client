package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for ProfileItemShowcase
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class ProfileItemShowcaseResponseProjection extends GraphQLResponseProjection {

    override def all$(): ProfileItemShowcaseResponseProjection = all$(3)

    override def all$(maxDepth: Int): ProfileItemShowcaseResponseProjection = {
        this.hasPinnedItems()
        if (projectionDepthOnFields.getOrDefault("ProfileItemShowcaseResponseProjection.PinnableItemConnectionResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProfileItemShowcaseResponseProjection.PinnableItemConnectionResponseProjection.items", projectionDepthOnFields.getOrDefault("ProfileItemShowcaseResponseProjection.PinnableItemConnectionResponseProjection.items", 0) + 1)
            this.items(new PinnableItemConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProfileItemShowcaseResponseProjection.PinnableItemConnectionResponseProjection.items", 0)))
        }
        this.typename()
        this
    }

    def hasPinnedItems(): ProfileItemShowcaseResponseProjection = {
        hasPinnedItems(null.asInstanceOf[String])
    }

    def hasPinnedItems(alias: String): ProfileItemShowcaseResponseProjection = {
        fields.add(new GraphQLResponseField("hasPinnedItems").alias(alias))
        this
    }

    def items(subProjection: PinnableItemConnectionResponseProjection): ProfileItemShowcaseResponseProjection = {
        items(null.asInstanceOf[String], subProjection)
    }

    def items(alias: String, subProjection: PinnableItemConnectionResponseProjection): ProfileItemShowcaseResponseProjection = {
        fields.add(new GraphQLResponseField("items").alias(alias).projection(subProjection))
        this
    }

    def items(input: ProfileItemShowcaseItemsParametrizedInput,subProjection: PinnableItemConnectionResponseProjection): ProfileItemShowcaseResponseProjection = {
        items(null.asInstanceOf[String], input, subProjection)
    }

    def items(alias: String, input: ProfileItemShowcaseItemsParametrizedInput , subProjection: PinnableItemConnectionResponseProjection): ProfileItemShowcaseResponseProjection = {
        fields.add(new GraphQLResponseField("items").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def typename(): ProfileItemShowcaseResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): ProfileItemShowcaseResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
