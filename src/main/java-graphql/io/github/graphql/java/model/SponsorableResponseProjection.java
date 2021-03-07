package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for Sponsorable
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class SponsorableResponseProjection extends GraphQLResponseProjection {

    public SponsorableResponseProjection() {
    }

    @Override
    public SponsorableResponseProjection all$() {
        return all$(3);
    }

    @Override
    public SponsorableResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("SponsorableResponseProjection.SponsorshipConnectionResponseProjection.sponsorshipsAsMaintainer", 0) <= maxDepth) {
            projectionDepthOnFields.put("SponsorableResponseProjection.SponsorshipConnectionResponseProjection.sponsorshipsAsMaintainer", projectionDepthOnFields.getOrDefault("SponsorableResponseProjection.SponsorshipConnectionResponseProjection.sponsorshipsAsMaintainer", 0) + 1);
            this.sponsorshipsAsMaintainer(new SponsorshipConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SponsorableResponseProjection.SponsorshipConnectionResponseProjection.sponsorshipsAsMaintainer", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("SponsorableResponseProjection.SponsorshipConnectionResponseProjection.sponsorshipsAsSponsor", 0) <= maxDepth) {
            projectionDepthOnFields.put("SponsorableResponseProjection.SponsorshipConnectionResponseProjection.sponsorshipsAsSponsor", projectionDepthOnFields.getOrDefault("SponsorableResponseProjection.SponsorshipConnectionResponseProjection.sponsorshipsAsSponsor", 0) + 1);
            this.sponsorshipsAsSponsor(new SponsorshipConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SponsorableResponseProjection.SponsorshipConnectionResponseProjection.sponsorshipsAsSponsor", 0)));
        }
        this.typename();
        return this;
    }

    public SponsorableResponseProjection sponsorshipsAsMaintainer(SponsorshipConnectionResponseProjection subProjection) {
        return sponsorshipsAsMaintainer((String)null, subProjection);
    }

    public SponsorableResponseProjection sponsorshipsAsMaintainer(String alias, SponsorshipConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("sponsorshipsAsMaintainer").alias(alias).projection(subProjection));
        return this;
    }

    public SponsorableResponseProjection sponsorshipsAsMaintainer(SponsorableSponsorshipsAsMaintainerParametrizedInput input, SponsorshipConnectionResponseProjection subProjection) {
        return sponsorshipsAsMaintainer(null, input, subProjection);
    }

    public SponsorableResponseProjection sponsorshipsAsMaintainer(String alias, SponsorableSponsorshipsAsMaintainerParametrizedInput input, SponsorshipConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("sponsorshipsAsMaintainer").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public SponsorableResponseProjection sponsorshipsAsSponsor(SponsorshipConnectionResponseProjection subProjection) {
        return sponsorshipsAsSponsor((String)null, subProjection);
    }

    public SponsorableResponseProjection sponsorshipsAsSponsor(String alias, SponsorshipConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("sponsorshipsAsSponsor").alias(alias).projection(subProjection));
        return this;
    }

    public SponsorableResponseProjection sponsorshipsAsSponsor(SponsorableSponsorshipsAsSponsorParametrizedInput input, SponsorshipConnectionResponseProjection subProjection) {
        return sponsorshipsAsSponsor(null, input, subProjection);
    }

    public SponsorableResponseProjection sponsorshipsAsSponsor(String alias, SponsorableSponsorshipsAsSponsorParametrizedInput input, SponsorshipConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("sponsorshipsAsSponsor").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public SponsorableResponseProjection onUser(UserResponseProjection subProjection) {
        return onUser(null, subProjection);
    }

    public SponsorableResponseProjection onUser(String alias, UserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on User").alias(alias).projection(subProjection));
        return this;
    }

    public SponsorableResponseProjection typename() {
        return typename(null);
    }

    public SponsorableResponseProjection typename(String alias) {
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
        final SponsorableResponseProjection that = (SponsorableResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
