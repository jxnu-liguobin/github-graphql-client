package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for MarketplaceCategory
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class MarketplaceCategoryResponseProjection extends GraphQLResponseProjection {

    public MarketplaceCategoryResponseProjection() {
    }

    @Override
    public MarketplaceCategoryResponseProjection all$() {
        return all$(3);
    }

    @Override
    public MarketplaceCategoryResponseProjection all$(int maxDepth) {
        this.description();
        this.howItWorks();
        this.id();
        this.name();
        this.primaryListingCount();
        this.resourcePath();
        this.secondaryListingCount();
        this.slug();
        this.url();
        this.typename();
        return this;
    }

    public MarketplaceCategoryResponseProjection description() {
        return description(null);
    }

    public MarketplaceCategoryResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public MarketplaceCategoryResponseProjection howItWorks() {
        return howItWorks(null);
    }

    public MarketplaceCategoryResponseProjection howItWorks(String alias) {
        fields.add(new GraphQLResponseField("howItWorks").alias(alias));
        return this;
    }

    public MarketplaceCategoryResponseProjection id() {
        return id(null);
    }

    public MarketplaceCategoryResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public MarketplaceCategoryResponseProjection name() {
        return name(null);
    }

    public MarketplaceCategoryResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public MarketplaceCategoryResponseProjection primaryListingCount() {
        return primaryListingCount(null);
    }

    public MarketplaceCategoryResponseProjection primaryListingCount(String alias) {
        fields.add(new GraphQLResponseField("primaryListingCount").alias(alias));
        return this;
    }

    public MarketplaceCategoryResponseProjection resourcePath() {
        return resourcePath(null);
    }

    public MarketplaceCategoryResponseProjection resourcePath(String alias) {
        fields.add(new GraphQLResponseField("resourcePath").alias(alias));
        return this;
    }

    public MarketplaceCategoryResponseProjection secondaryListingCount() {
        return secondaryListingCount(null);
    }

    public MarketplaceCategoryResponseProjection secondaryListingCount(String alias) {
        fields.add(new GraphQLResponseField("secondaryListingCount").alias(alias));
        return this;
    }

    public MarketplaceCategoryResponseProjection slug() {
        return slug(null);
    }

    public MarketplaceCategoryResponseProjection slug(String alias) {
        fields.add(new GraphQLResponseField("slug").alias(alias));
        return this;
    }

    public MarketplaceCategoryResponseProjection url() {
        return url(null);
    }

    public MarketplaceCategoryResponseProjection url(String alias) {
        fields.add(new GraphQLResponseField("url").alias(alias));
        return this;
    }

    public MarketplaceCategoryResponseProjection typename() {
        return typename(null);
    }

    public MarketplaceCategoryResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
