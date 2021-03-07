package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for ProfileOwner
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class ProfileOwnerResponseProjection extends GraphQLResponseProjection {

    public ProfileOwnerResponseProjection() {
    }

    @Override
    public ProfileOwnerResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ProfileOwnerResponseProjection all$(int maxDepth) {
        this.anyPinnableItems();
        this.email();
        this.id();
        if (projectionDepthOnFields.getOrDefault("ProfileOwnerResponseProjection.ProfileItemShowcaseResponseProjection.itemShowcase", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProfileOwnerResponseProjection.ProfileItemShowcaseResponseProjection.itemShowcase", projectionDepthOnFields.getOrDefault("ProfileOwnerResponseProjection.ProfileItemShowcaseResponseProjection.itemShowcase", 0) + 1);
            this.itemShowcase(new ProfileItemShowcaseResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProfileOwnerResponseProjection.ProfileItemShowcaseResponseProjection.itemShowcase", 0)));
        }
        this.location();
        this.login();
        this.name();
        if (projectionDepthOnFields.getOrDefault("ProfileOwnerResponseProjection.PinnableItemConnectionResponseProjection.pinnableItems", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProfileOwnerResponseProjection.PinnableItemConnectionResponseProjection.pinnableItems", projectionDepthOnFields.getOrDefault("ProfileOwnerResponseProjection.PinnableItemConnectionResponseProjection.pinnableItems", 0) + 1);
            this.pinnableItems(new PinnableItemConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProfileOwnerResponseProjection.PinnableItemConnectionResponseProjection.pinnableItems", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ProfileOwnerResponseProjection.PinnableItemConnectionResponseProjection.pinnedItems", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProfileOwnerResponseProjection.PinnableItemConnectionResponseProjection.pinnedItems", projectionDepthOnFields.getOrDefault("ProfileOwnerResponseProjection.PinnableItemConnectionResponseProjection.pinnedItems", 0) + 1);
            this.pinnedItems(new PinnableItemConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProfileOwnerResponseProjection.PinnableItemConnectionResponseProjection.pinnedItems", 0)));
        }
        this.pinnedItemsRemaining();
        this.viewerCanChangePinnedItems();
        this.websiteUrl();
        this.typename();
        return this;
    }

    public ProfileOwnerResponseProjection anyPinnableItems() {
        return anyPinnableItems((String)null);
    }

    public ProfileOwnerResponseProjection anyPinnableItems(String alias) {
        fields.add(new GraphQLResponseField("anyPinnableItems").alias(alias));
        return this;
    }

    public ProfileOwnerResponseProjection anyPinnableItems(ProfileOwnerAnyPinnableItemsParametrizedInput input) {
        return anyPinnableItems(null, input);
    }

    public ProfileOwnerResponseProjection anyPinnableItems(String alias, ProfileOwnerAnyPinnableItemsParametrizedInput input) {
        fields.add(new GraphQLResponseField("anyPinnableItems").alias(alias).parameters(input));
        return this;
    }

    public ProfileOwnerResponseProjection email() {
        return email(null);
    }

    public ProfileOwnerResponseProjection email(String alias) {
        fields.add(new GraphQLResponseField("email").alias(alias));
        return this;
    }

    public ProfileOwnerResponseProjection id() {
        return id(null);
    }

    public ProfileOwnerResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ProfileOwnerResponseProjection itemShowcase(ProfileItemShowcaseResponseProjection subProjection) {
        return itemShowcase(null, subProjection);
    }

    public ProfileOwnerResponseProjection itemShowcase(String alias, ProfileItemShowcaseResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("itemShowcase").alias(alias).projection(subProjection));
        return this;
    }

    public ProfileOwnerResponseProjection location() {
        return location(null);
    }

    public ProfileOwnerResponseProjection location(String alias) {
        fields.add(new GraphQLResponseField("location").alias(alias));
        return this;
    }

    public ProfileOwnerResponseProjection login() {
        return login(null);
    }

    public ProfileOwnerResponseProjection login(String alias) {
        fields.add(new GraphQLResponseField("login").alias(alias));
        return this;
    }

    public ProfileOwnerResponseProjection name() {
        return name(null);
    }

    public ProfileOwnerResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public ProfileOwnerResponseProjection pinnableItems(PinnableItemConnectionResponseProjection subProjection) {
        return pinnableItems((String)null, subProjection);
    }

    public ProfileOwnerResponseProjection pinnableItems(String alias, PinnableItemConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pinnableItems").alias(alias).projection(subProjection));
        return this;
    }

    public ProfileOwnerResponseProjection pinnableItems(ProfileOwnerPinnableItemsParametrizedInput input, PinnableItemConnectionResponseProjection subProjection) {
        return pinnableItems(null, input, subProjection);
    }

    public ProfileOwnerResponseProjection pinnableItems(String alias, ProfileOwnerPinnableItemsParametrizedInput input, PinnableItemConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pinnableItems").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public ProfileOwnerResponseProjection pinnedItems(PinnableItemConnectionResponseProjection subProjection) {
        return pinnedItems((String)null, subProjection);
    }

    public ProfileOwnerResponseProjection pinnedItems(String alias, PinnableItemConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pinnedItems").alias(alias).projection(subProjection));
        return this;
    }

    public ProfileOwnerResponseProjection pinnedItems(ProfileOwnerPinnedItemsParametrizedInput input, PinnableItemConnectionResponseProjection subProjection) {
        return pinnedItems(null, input, subProjection);
    }

    public ProfileOwnerResponseProjection pinnedItems(String alias, ProfileOwnerPinnedItemsParametrizedInput input, PinnableItemConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pinnedItems").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public ProfileOwnerResponseProjection pinnedItemsRemaining() {
        return pinnedItemsRemaining(null);
    }

    public ProfileOwnerResponseProjection pinnedItemsRemaining(String alias) {
        fields.add(new GraphQLResponseField("pinnedItemsRemaining").alias(alias));
        return this;
    }

    public ProfileOwnerResponseProjection viewerCanChangePinnedItems() {
        return viewerCanChangePinnedItems(null);
    }

    public ProfileOwnerResponseProjection viewerCanChangePinnedItems(String alias) {
        fields.add(new GraphQLResponseField("viewerCanChangePinnedItems").alias(alias));
        return this;
    }

    public ProfileOwnerResponseProjection websiteUrl() {
        return websiteUrl(null);
    }

    public ProfileOwnerResponseProjection websiteUrl(String alias) {
        fields.add(new GraphQLResponseField("websiteUrl").alias(alias));
        return this;
    }

    public ProfileOwnerResponseProjection onOrganization(OrganizationResponseProjection subProjection) {
        return onOrganization(null, subProjection);
    }

    public ProfileOwnerResponseProjection onOrganization(String alias, OrganizationResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Organization").alias(alias).projection(subProjection));
        return this;
    }

    public ProfileOwnerResponseProjection onUser(UserResponseProjection subProjection) {
        return onUser(null, subProjection);
    }

    public ProfileOwnerResponseProjection onUser(String alias, UserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on User").alias(alias).projection(subProjection));
        return this;
    }

    public ProfileOwnerResponseProjection typename() {
        return typename(null);
    }

    public ProfileOwnerResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final ProfileOwnerResponseProjection that = (ProfileOwnerResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
