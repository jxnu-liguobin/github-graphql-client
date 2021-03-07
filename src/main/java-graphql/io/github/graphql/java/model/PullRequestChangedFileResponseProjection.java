package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for PullRequestChangedFile
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class PullRequestChangedFileResponseProjection extends GraphQLResponseProjection {

    public PullRequestChangedFileResponseProjection() {
    }

    @Override
    public PullRequestChangedFileResponseProjection all$() {
        return all$(3);
    }

    @Override
    public PullRequestChangedFileResponseProjection all$(int maxDepth) {
        this.additions();
        this.deletions();
        this.path();
        this.typename();
        return this;
    }

    public PullRequestChangedFileResponseProjection additions() {
        return additions(null);
    }

    public PullRequestChangedFileResponseProjection additions(String alias) {
        fields.add(new GraphQLResponseField("additions").alias(alias));
        return this;
    }

    public PullRequestChangedFileResponseProjection deletions() {
        return deletions(null);
    }

    public PullRequestChangedFileResponseProjection deletions(String alias) {
        fields.add(new GraphQLResponseField("deletions").alias(alias));
        return this;
    }

    public PullRequestChangedFileResponseProjection path() {
        return path(null);
    }

    public PullRequestChangedFileResponseProjection path(String alias) {
        fields.add(new GraphQLResponseField("path").alias(alias));
        return this;
    }

    public PullRequestChangedFileResponseProjection typename() {
        return typename(null);
    }

    public PullRequestChangedFileResponseProjection typename(String alias) {
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
        final PullRequestChangedFileResponseProjection that = (PullRequestChangedFileResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
