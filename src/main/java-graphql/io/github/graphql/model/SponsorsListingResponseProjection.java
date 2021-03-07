package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for SponsorsListing
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class SponsorsListingResponseProjection extends GraphQLResponseProjection {

    public SponsorsListingResponseProjection() {
    }

    @Override
    public SponsorsListingResponseProjection all$() {
        return all$(3);
    }

    @Override
    public SponsorsListingResponseProjection all$(int maxDepth) {
        this.fullDescription();
        this.id();
        this.shortDescription();
        this.slug();
        this.typename();
        return this;
    }

    public SponsorsListingResponseProjection fullDescription() {
        return fullDescription(null);
    }

    public SponsorsListingResponseProjection fullDescription(String alias) {
        fields.add(new GraphQLResponseField("fullDescription").alias(alias));
        return this;
    }

    public SponsorsListingResponseProjection id() {
        return id(null);
    }

    public SponsorsListingResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public SponsorsListingResponseProjection shortDescription() {
        return shortDescription(null);
    }

    public SponsorsListingResponseProjection shortDescription(String alias) {
        fields.add(new GraphQLResponseField("shortDescription").alias(alias));
        return this;
    }

    public SponsorsListingResponseProjection slug() {
        return slug(null);
    }

    public SponsorsListingResponseProjection slug(String alias) {
        fields.add(new GraphQLResponseField("slug").alias(alias));
        return this;
    }

    public SponsorsListingResponseProjection typename() {
        return typename(null);
    }

    public SponsorsListingResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
