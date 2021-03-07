package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for Labelable
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class LabelableResponseProjection extends GraphQLResponseProjection {

    public LabelableResponseProjection() {
    }

    @Override
    public LabelableResponseProjection all$() {
        return all$(3);
    }

    @Override
    public LabelableResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("LabelableResponseProjection.LabelConnectionResponseProjection.labels", 0) <= maxDepth) {
            projectionDepthOnFields.put("LabelableResponseProjection.LabelConnectionResponseProjection.labels", projectionDepthOnFields.getOrDefault("LabelableResponseProjection.LabelConnectionResponseProjection.labels", 0) + 1);
            this.labels(new LabelConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LabelableResponseProjection.LabelConnectionResponseProjection.labels", 0)));
        }
        this.typename();
        return this;
    }

    public LabelableResponseProjection labels(LabelConnectionResponseProjection subProjection) {
        return labels((String)null, subProjection);
    }

    public LabelableResponseProjection labels(String alias, LabelConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("labels").alias(alias).projection(subProjection));
        return this;
    }

    public LabelableResponseProjection labels(LabelableLabelsParametrizedInput input, LabelConnectionResponseProjection subProjection) {
        return labels(null, input, subProjection);
    }

    public LabelableResponseProjection labels(String alias, LabelableLabelsParametrizedInput input, LabelConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("labels").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public LabelableResponseProjection onIssue(IssueResponseProjection subProjection) {
        return onIssue(null, subProjection);
    }

    public LabelableResponseProjection onIssue(String alias, IssueResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Issue").alias(alias).projection(subProjection));
        return this;
    }

    public LabelableResponseProjection onPullRequest(PullRequestResponseProjection subProjection) {
        return onPullRequest(null, subProjection);
    }

    public LabelableResponseProjection onPullRequest(String alias, PullRequestResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on PullRequest").alias(alias).projection(subProjection));
        return this;
    }

    public LabelableResponseProjection typename() {
        return typename(null);
    }

    public LabelableResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
