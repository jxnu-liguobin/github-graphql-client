package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for Sponsorship
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class SponsorshipResponseProjection extends GraphQLResponseProjection {

    public SponsorshipResponseProjection() {
    }

    @Override
    public SponsorshipResponseProjection all$() {
        return all$(3);
    }

    @Override
    public SponsorshipResponseProjection all$(int maxDepth) {
        this.createdAt();
        this.id();
        if (projectionDepthOnFields.getOrDefault("SponsorshipResponseProjection.UserResponseProjection.maintainer", 0) <= maxDepth) {
            projectionDepthOnFields.put("SponsorshipResponseProjection.UserResponseProjection.maintainer", projectionDepthOnFields.getOrDefault("SponsorshipResponseProjection.UserResponseProjection.maintainer", 0) + 1);
            this.maintainer(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SponsorshipResponseProjection.UserResponseProjection.maintainer", 0)));
        }
        this.privacyLevel();
        if (projectionDepthOnFields.getOrDefault("SponsorshipResponseProjection.UserResponseProjection.sponsor", 0) <= maxDepth) {
            projectionDepthOnFields.put("SponsorshipResponseProjection.UserResponseProjection.sponsor", projectionDepthOnFields.getOrDefault("SponsorshipResponseProjection.UserResponseProjection.sponsor", 0) + 1);
            this.sponsor(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SponsorshipResponseProjection.UserResponseProjection.sponsor", 0)));
        }
        this.typename();
        return this;
    }

    public SponsorshipResponseProjection createdAt() {
        return createdAt(null);
    }

    public SponsorshipResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public SponsorshipResponseProjection id() {
        return id(null);
    }

    public SponsorshipResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public SponsorshipResponseProjection maintainer(UserResponseProjection subProjection) {
        return maintainer(null, subProjection);
    }

    public SponsorshipResponseProjection maintainer(String alias, UserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("maintainer").alias(alias).projection(subProjection));
        return this;
    }

    public SponsorshipResponseProjection privacyLevel() {
        return privacyLevel(null);
    }

    public SponsorshipResponseProjection privacyLevel(String alias) {
        fields.add(new GraphQLResponseField("privacyLevel").alias(alias));
        return this;
    }

    public SponsorshipResponseProjection sponsor(UserResponseProjection subProjection) {
        return sponsor(null, subProjection);
    }

    public SponsorshipResponseProjection sponsor(String alias, UserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("sponsor").alias(alias).projection(subProjection));
        return this;
    }

    public SponsorshipResponseProjection typename() {
        return typename(null);
    }

    public SponsorshipResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
