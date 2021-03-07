package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for ProfileOwner
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class ProfileOwnerResponseProjection extends GraphQLResponseProjection {

    override def all$(): ProfileOwnerResponseProjection = all$(3)

    override def all$(maxDepth: Int): ProfileOwnerResponseProjection = {
        this.anyPinnableItems()
        this.email()
        this.id()
        if (projectionDepthOnFields.getOrDefault("ProfileOwnerResponseProjection.ProfileItemShowcaseResponseProjection.itemShowcase", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProfileOwnerResponseProjection.ProfileItemShowcaseResponseProjection.itemShowcase", projectionDepthOnFields.getOrDefault("ProfileOwnerResponseProjection.ProfileItemShowcaseResponseProjection.itemShowcase", 0) + 1)
            this.itemShowcase(new ProfileItemShowcaseResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProfileOwnerResponseProjection.ProfileItemShowcaseResponseProjection.itemShowcase", 0)))
        }
        this.location()
        this.login()
        this.name()
        if (projectionDepthOnFields.getOrDefault("ProfileOwnerResponseProjection.PinnableItemConnectionResponseProjection.pinnableItems", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProfileOwnerResponseProjection.PinnableItemConnectionResponseProjection.pinnableItems", projectionDepthOnFields.getOrDefault("ProfileOwnerResponseProjection.PinnableItemConnectionResponseProjection.pinnableItems", 0) + 1)
            this.pinnableItems(new PinnableItemConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProfileOwnerResponseProjection.PinnableItemConnectionResponseProjection.pinnableItems", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ProfileOwnerResponseProjection.PinnableItemConnectionResponseProjection.pinnedItems", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProfileOwnerResponseProjection.PinnableItemConnectionResponseProjection.pinnedItems", projectionDepthOnFields.getOrDefault("ProfileOwnerResponseProjection.PinnableItemConnectionResponseProjection.pinnedItems", 0) + 1)
            this.pinnedItems(new PinnableItemConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProfileOwnerResponseProjection.PinnableItemConnectionResponseProjection.pinnedItems", 0)))
        }
        this.pinnedItemsRemaining()
        this.viewerCanChangePinnedItems()
        this.websiteUrl()
        this.typename()
        this
    }

    def anyPinnableItems(): ProfileOwnerResponseProjection = {
        anyPinnableItems(null.asInstanceOf[String])
    }

    def anyPinnableItems(alias: String): ProfileOwnerResponseProjection = {
        fields.add(new GraphQLResponseField("anyPinnableItems").alias(alias))
        this
    }

    def anyPinnableItems(input: ProfileOwnerAnyPinnableItemsParametrizedInput): ProfileOwnerResponseProjection = {
        anyPinnableItems(null.asInstanceOf[String], input)
    }

    def anyPinnableItems(alias: String, input: ProfileOwnerAnyPinnableItemsParametrizedInput ): ProfileOwnerResponseProjection = {
        fields.add(new GraphQLResponseField("anyPinnableItems").alias(alias).parameters(input))
        this
    }

    def email(): ProfileOwnerResponseProjection = {
        email(null.asInstanceOf[String])
    }

    def email(alias: String): ProfileOwnerResponseProjection = {
        fields.add(new GraphQLResponseField("email").alias(alias))
        this
    }

    def id(): ProfileOwnerResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): ProfileOwnerResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def itemShowcase(subProjection: ProfileItemShowcaseResponseProjection): ProfileOwnerResponseProjection = {
        itemShowcase(null.asInstanceOf[String], subProjection)
    }

    def itemShowcase(alias: String, subProjection: ProfileItemShowcaseResponseProjection): ProfileOwnerResponseProjection = {
        fields.add(new GraphQLResponseField("itemShowcase").alias(alias).projection(subProjection))
        this
    }

    def location(): ProfileOwnerResponseProjection = {
        location(null.asInstanceOf[String])
    }

    def location(alias: String): ProfileOwnerResponseProjection = {
        fields.add(new GraphQLResponseField("location").alias(alias))
        this
    }

    def login(): ProfileOwnerResponseProjection = {
        login(null.asInstanceOf[String])
    }

    def login(alias: String): ProfileOwnerResponseProjection = {
        fields.add(new GraphQLResponseField("login").alias(alias))
        this
    }

    def name(): ProfileOwnerResponseProjection = {
        name(null.asInstanceOf[String])
    }

    def name(alias: String): ProfileOwnerResponseProjection = {
        fields.add(new GraphQLResponseField("name").alias(alias))
        this
    }

    def pinnableItems(subProjection: PinnableItemConnectionResponseProjection): ProfileOwnerResponseProjection = {
        pinnableItems(null.asInstanceOf[String], subProjection)
    }

    def pinnableItems(alias: String, subProjection: PinnableItemConnectionResponseProjection): ProfileOwnerResponseProjection = {
        fields.add(new GraphQLResponseField("pinnableItems").alias(alias).projection(subProjection))
        this
    }

    def pinnableItems(input: ProfileOwnerPinnableItemsParametrizedInput,subProjection: PinnableItemConnectionResponseProjection): ProfileOwnerResponseProjection = {
        pinnableItems(null.asInstanceOf[String], input, subProjection)
    }

    def pinnableItems(alias: String, input: ProfileOwnerPinnableItemsParametrizedInput , subProjection: PinnableItemConnectionResponseProjection): ProfileOwnerResponseProjection = {
        fields.add(new GraphQLResponseField("pinnableItems").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def pinnedItems(subProjection: PinnableItemConnectionResponseProjection): ProfileOwnerResponseProjection = {
        pinnedItems(null.asInstanceOf[String], subProjection)
    }

    def pinnedItems(alias: String, subProjection: PinnableItemConnectionResponseProjection): ProfileOwnerResponseProjection = {
        fields.add(new GraphQLResponseField("pinnedItems").alias(alias).projection(subProjection))
        this
    }

    def pinnedItems(input: ProfileOwnerPinnedItemsParametrizedInput,subProjection: PinnableItemConnectionResponseProjection): ProfileOwnerResponseProjection = {
        pinnedItems(null.asInstanceOf[String], input, subProjection)
    }

    def pinnedItems(alias: String, input: ProfileOwnerPinnedItemsParametrizedInput , subProjection: PinnableItemConnectionResponseProjection): ProfileOwnerResponseProjection = {
        fields.add(new GraphQLResponseField("pinnedItems").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def pinnedItemsRemaining(): ProfileOwnerResponseProjection = {
        pinnedItemsRemaining(null.asInstanceOf[String])
    }

    def pinnedItemsRemaining(alias: String): ProfileOwnerResponseProjection = {
        fields.add(new GraphQLResponseField("pinnedItemsRemaining").alias(alias))
        this
    }

    def viewerCanChangePinnedItems(): ProfileOwnerResponseProjection = {
        viewerCanChangePinnedItems(null.asInstanceOf[String])
    }

    def viewerCanChangePinnedItems(alias: String): ProfileOwnerResponseProjection = {
        fields.add(new GraphQLResponseField("viewerCanChangePinnedItems").alias(alias))
        this
    }

    def websiteUrl(): ProfileOwnerResponseProjection = {
        websiteUrl(null.asInstanceOf[String])
    }

    def websiteUrl(alias: String): ProfileOwnerResponseProjection = {
        fields.add(new GraphQLResponseField("websiteUrl").alias(alias))
        this
    }

    def onOrganization(subProjection: OrganizationResponseProjection): ProfileOwnerResponseProjection = {
        onOrganization(null.asInstanceOf[String], subProjection)
    }

    def onOrganization(alias: String, subProjection: OrganizationResponseProjection): ProfileOwnerResponseProjection = {
        fields.add(new GraphQLResponseField("...on Organization").alias(alias).projection(subProjection))
        this
    }

    def onUser(subProjection: UserResponseProjection): ProfileOwnerResponseProjection = {
        onUser(null.asInstanceOf[String], subProjection)
    }

    def onUser(alias: String, subProjection: UserResponseProjection): ProfileOwnerResponseProjection = {
        fields.add(new GraphQLResponseField("...on User").alias(alias).projection(subProjection))
        this
    }

    def typename(): ProfileOwnerResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): ProfileOwnerResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
