package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for ReferencedSubject
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class ReferencedSubjectResponseProjection extends GraphQLResponseProjection {

    public ReferencedSubjectResponseProjection() {
    }

    @Override
    public ReferencedSubjectResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ReferencedSubjectResponseProjection all$(int maxDepth) {
        this.typename();
        return this;
    }

    public ReferencedSubjectResponseProjection onIssue(IssueResponseProjection subProjection) {
        return onIssue(null, subProjection);
    }

    public ReferencedSubjectResponseProjection onIssue(String alias, IssueResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Issue").alias(alias).projection(subProjection));
        return this;
    }

    public ReferencedSubjectResponseProjection onPullRequest(PullRequestResponseProjection subProjection) {
        return onPullRequest(null, subProjection);
    }

    public ReferencedSubjectResponseProjection onPullRequest(String alias, PullRequestResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on PullRequest").alias(alias).projection(subProjection));
        return this;
    }

    public ReferencedSubjectResponseProjection typename() {
        return typename(null);
    }

    public ReferencedSubjectResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
