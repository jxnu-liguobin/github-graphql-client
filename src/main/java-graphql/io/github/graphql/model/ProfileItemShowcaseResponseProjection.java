package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for ProfileItemShowcase
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class ProfileItemShowcaseResponseProjection extends GraphQLResponseProjection {

    public ProfileItemShowcaseResponseProjection() {
    }

    @Override
    public ProfileItemShowcaseResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ProfileItemShowcaseResponseProjection all$(int maxDepth) {
        this.hasPinnedItems();
        if (projectionDepthOnFields.getOrDefault("ProfileItemShowcaseResponseProjection.PinnableItemConnectionResponseProjection.items", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProfileItemShowcaseResponseProjection.PinnableItemConnectionResponseProjection.items", projectionDepthOnFields.getOrDefault("ProfileItemShowcaseResponseProjection.PinnableItemConnectionResponseProjection.items", 0) + 1);
            this.items(new PinnableItemConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProfileItemShowcaseResponseProjection.PinnableItemConnectionResponseProjection.items", 0)));
        }
        this.typename();
        return this;
    }

    public ProfileItemShowcaseResponseProjection hasPinnedItems() {
        return hasPinnedItems(null);
    }

    public ProfileItemShowcaseResponseProjection hasPinnedItems(String alias) {
        fields.add(new GraphQLResponseField("hasPinnedItems").alias(alias));
        return this;
    }

    public ProfileItemShowcaseResponseProjection items(PinnableItemConnectionResponseProjection subProjection) {
        return items((String)null, subProjection);
    }

    public ProfileItemShowcaseResponseProjection items(String alias, PinnableItemConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("items").alias(alias).projection(subProjection));
        return this;
    }

    public ProfileItemShowcaseResponseProjection items(ProfileItemShowcaseItemsParametrizedInput input, PinnableItemConnectionResponseProjection subProjection) {
        return items(null, input, subProjection);
    }

    public ProfileItemShowcaseResponseProjection items(String alias, ProfileItemShowcaseItemsParametrizedInput input, PinnableItemConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("items").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public ProfileItemShowcaseResponseProjection typename() {
        return typename(null);
    }

    public ProfileItemShowcaseResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
