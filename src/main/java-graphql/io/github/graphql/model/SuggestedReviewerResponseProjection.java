package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for SuggestedReviewer
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class SuggestedReviewerResponseProjection extends GraphQLResponseProjection {

    public SuggestedReviewerResponseProjection() {
    }

    @Override
    public SuggestedReviewerResponseProjection all$() {
        return all$(3);
    }

    @Override
    public SuggestedReviewerResponseProjection all$(int maxDepth) {
        this.isAuthor();
        this.isCommenter();
        if (projectionDepthOnFields.getOrDefault("SuggestedReviewerResponseProjection.UserResponseProjection.reviewer", 0) <= maxDepth) {
            projectionDepthOnFields.put("SuggestedReviewerResponseProjection.UserResponseProjection.reviewer", projectionDepthOnFields.getOrDefault("SuggestedReviewerResponseProjection.UserResponseProjection.reviewer", 0) + 1);
            this.reviewer(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SuggestedReviewerResponseProjection.UserResponseProjection.reviewer", 0)));
        }
        this.typename();
        return this;
    }

    public SuggestedReviewerResponseProjection isAuthor() {
        return isAuthor(null);
    }

    public SuggestedReviewerResponseProjection isAuthor(String alias) {
        fields.add(new GraphQLResponseField("isAuthor").alias(alias));
        return this;
    }

    public SuggestedReviewerResponseProjection isCommenter() {
        return isCommenter(null);
    }

    public SuggestedReviewerResponseProjection isCommenter(String alias) {
        fields.add(new GraphQLResponseField("isCommenter").alias(alias));
        return this;
    }

    public SuggestedReviewerResponseProjection reviewer(UserResponseProjection subProjection) {
        return reviewer(null, subProjection);
    }

    public SuggestedReviewerResponseProjection reviewer(String alias, UserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("reviewer").alias(alias).projection(subProjection));
        return this;
    }

    public SuggestedReviewerResponseProjection typename() {
        return typename(null);
    }

    public SuggestedReviewerResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
