package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for ProfileOwner
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class ProfileOwnerResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): ProfileOwnerResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): ProfileOwnerResponseProjection {
        this.anyPinnableItems()
        this.email()
        this.id()
        if (projectionDepthOnFields.getOrDefault("ProfileOwnerResponseProjection.ProfileItemShowcaseResponseProjection.itemShowcase", 0) <= maxDepth) {
            projectionDepthOnFields["ProfileOwnerResponseProjection.ProfileItemShowcaseResponseProjection.itemShowcase"] = projectionDepthOnFields.getOrDefault("ProfileOwnerResponseProjection.ProfileItemShowcaseResponseProjection.itemShowcase", 0) + 1
            this.itemShowcase(ProfileItemShowcaseResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ProfileOwnerResponseProjection.ProfileItemShowcaseResponseProjection.itemShowcase", 0)))
        }
        this.location()
        this.login()
        this.name()
        if (projectionDepthOnFields.getOrDefault("ProfileOwnerResponseProjection.PinnableItemConnectionResponseProjection.pinnableItems", 0) <= maxDepth) {
            projectionDepthOnFields["ProfileOwnerResponseProjection.PinnableItemConnectionResponseProjection.pinnableItems"] = projectionDepthOnFields.getOrDefault("ProfileOwnerResponseProjection.PinnableItemConnectionResponseProjection.pinnableItems", 0) + 1
            this.pinnableItems(PinnableItemConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ProfileOwnerResponseProjection.PinnableItemConnectionResponseProjection.pinnableItems", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ProfileOwnerResponseProjection.PinnableItemConnectionResponseProjection.pinnedItems", 0) <= maxDepth) {
            projectionDepthOnFields["ProfileOwnerResponseProjection.PinnableItemConnectionResponseProjection.pinnedItems"] = projectionDepthOnFields.getOrDefault("ProfileOwnerResponseProjection.PinnableItemConnectionResponseProjection.pinnedItems", 0) + 1
            this.pinnedItems(PinnableItemConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ProfileOwnerResponseProjection.PinnableItemConnectionResponseProjection.pinnedItems", 0)))
        }
        this.pinnedItemsRemaining()
        this.viewerCanChangePinnedItems()
        this.websiteUrl()
        this.typename()
        return this
    }

    fun anyPinnableItems(): ProfileOwnerResponseProjection = anyPinnableItems(null)

    fun anyPinnableItems(alias: String?): ProfileOwnerResponseProjection {
        fields.add(GraphQLResponseField("anyPinnableItems").alias(alias))
        return this
    }

    fun anyPinnableItems(input: ProfileOwnerAnyPinnableItemsParametrizedInput): ProfileOwnerResponseProjection = anyPinnableItems(null, input)

    fun anyPinnableItems(alias: String?, input: ProfileOwnerAnyPinnableItemsParametrizedInput): ProfileOwnerResponseProjection {
        fields.add(GraphQLResponseField("anyPinnableItems").alias(alias).parameters(input))
        return this
    }

    fun email(): ProfileOwnerResponseProjection = email(null)

    fun email(alias: String?): ProfileOwnerResponseProjection {
        fields.add(GraphQLResponseField("email").alias(alias))
        return this
    }

    fun id(): ProfileOwnerResponseProjection = id(null)

    fun id(alias: String?): ProfileOwnerResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun itemShowcase(subProjection: ProfileItemShowcaseResponseProjection): ProfileOwnerResponseProjection = itemShowcase(null, subProjection)

    fun itemShowcase(alias: String?, subProjection: ProfileItemShowcaseResponseProjection): ProfileOwnerResponseProjection {
        fields.add(GraphQLResponseField("itemShowcase").alias(alias).projection(subProjection))
        return this
    }

    fun location(): ProfileOwnerResponseProjection = location(null)

    fun location(alias: String?): ProfileOwnerResponseProjection {
        fields.add(GraphQLResponseField("location").alias(alias))
        return this
    }

    fun login(): ProfileOwnerResponseProjection = login(null)

    fun login(alias: String?): ProfileOwnerResponseProjection {
        fields.add(GraphQLResponseField("login").alias(alias))
        return this
    }

    fun name(): ProfileOwnerResponseProjection = name(null)

    fun name(alias: String?): ProfileOwnerResponseProjection {
        fields.add(GraphQLResponseField("name").alias(alias))
        return this
    }

    fun pinnableItems(subProjection: PinnableItemConnectionResponseProjection): ProfileOwnerResponseProjection = pinnableItems(null, subProjection)

    fun pinnableItems(alias: String?, subProjection: PinnableItemConnectionResponseProjection): ProfileOwnerResponseProjection {
        fields.add(GraphQLResponseField("pinnableItems").alias(alias).projection(subProjection))
        return this
    }

    fun pinnableItems(input: ProfileOwnerPinnableItemsParametrizedInput, subProjection: PinnableItemConnectionResponseProjection): ProfileOwnerResponseProjection = pinnableItems(null, input, subProjection)

    fun pinnableItems(alias: String?, input: ProfileOwnerPinnableItemsParametrizedInput, subProjection: PinnableItemConnectionResponseProjection): ProfileOwnerResponseProjection {
        fields.add(GraphQLResponseField("pinnableItems").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun pinnedItems(subProjection: PinnableItemConnectionResponseProjection): ProfileOwnerResponseProjection = pinnedItems(null, subProjection)

    fun pinnedItems(alias: String?, subProjection: PinnableItemConnectionResponseProjection): ProfileOwnerResponseProjection {
        fields.add(GraphQLResponseField("pinnedItems").alias(alias).projection(subProjection))
        return this
    }

    fun pinnedItems(input: ProfileOwnerPinnedItemsParametrizedInput, subProjection: PinnableItemConnectionResponseProjection): ProfileOwnerResponseProjection = pinnedItems(null, input, subProjection)

    fun pinnedItems(alias: String?, input: ProfileOwnerPinnedItemsParametrizedInput, subProjection: PinnableItemConnectionResponseProjection): ProfileOwnerResponseProjection {
        fields.add(GraphQLResponseField("pinnedItems").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun pinnedItemsRemaining(): ProfileOwnerResponseProjection = pinnedItemsRemaining(null)

    fun pinnedItemsRemaining(alias: String?): ProfileOwnerResponseProjection {
        fields.add(GraphQLResponseField("pinnedItemsRemaining").alias(alias))
        return this
    }

    fun viewerCanChangePinnedItems(): ProfileOwnerResponseProjection = viewerCanChangePinnedItems(null)

    fun viewerCanChangePinnedItems(alias: String?): ProfileOwnerResponseProjection {
        fields.add(GraphQLResponseField("viewerCanChangePinnedItems").alias(alias))
        return this
    }

    fun websiteUrl(): ProfileOwnerResponseProjection = websiteUrl(null)

    fun websiteUrl(alias: String?): ProfileOwnerResponseProjection {
        fields.add(GraphQLResponseField("websiteUrl").alias(alias))
        return this
    }

    fun onOrganization(subProjection: OrganizationResponseProjection): ProfileOwnerResponseProjection = onOrganization(null, subProjection)

    fun onOrganization(alias: String?, subProjection: OrganizationResponseProjection): ProfileOwnerResponseProjection {
        fields.add(GraphQLResponseField("...on Organization").alias(alias).projection(subProjection))
        return this
    }

    fun onUser(subProjection: UserResponseProjection): ProfileOwnerResponseProjection = onUser(null, subProjection)

    fun onUser(alias: String?, subProjection: UserResponseProjection): ProfileOwnerResponseProjection {
        fields.add(GraphQLResponseField("...on User").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): ProfileOwnerResponseProjection = typename(null)

    fun typename(alias: String?): ProfileOwnerResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
