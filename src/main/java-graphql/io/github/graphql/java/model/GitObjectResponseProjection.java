package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for GitObject
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class GitObjectResponseProjection extends GraphQLResponseProjection {

    public GitObjectResponseProjection() {
    }

    @Override
    public GitObjectResponseProjection all$() {
        return all$(3);
    }

    @Override
    public GitObjectResponseProjection all$(int maxDepth) {
        this.abbreviatedOid();
        this.commitResourcePath();
        this.commitUrl();
        this.id();
        this.oid();
        if (projectionDepthOnFields.getOrDefault("GitObjectResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields.put("GitObjectResponseProjection.RepositoryResponseProjection.repository", projectionDepthOnFields.getOrDefault("GitObjectResponseProjection.RepositoryResponseProjection.repository", 0) + 1);
            this.repository(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("GitObjectResponseProjection.RepositoryResponseProjection.repository", 0)));
        }
        this.typename();
        return this;
    }

    public GitObjectResponseProjection abbreviatedOid() {
        return abbreviatedOid(null);
    }

    public GitObjectResponseProjection abbreviatedOid(String alias) {
        fields.add(new GraphQLResponseField("abbreviatedOid").alias(alias));
        return this;
    }

    public GitObjectResponseProjection commitResourcePath() {
        return commitResourcePath(null);
    }

    public GitObjectResponseProjection commitResourcePath(String alias) {
        fields.add(new GraphQLResponseField("commitResourcePath").alias(alias));
        return this;
    }

    public GitObjectResponseProjection commitUrl() {
        return commitUrl(null);
    }

    public GitObjectResponseProjection commitUrl(String alias) {
        fields.add(new GraphQLResponseField("commitUrl").alias(alias));
        return this;
    }

    public GitObjectResponseProjection id() {
        return id(null);
    }

    public GitObjectResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public GitObjectResponseProjection oid() {
        return oid(null);
    }

    public GitObjectResponseProjection oid(String alias) {
        fields.add(new GraphQLResponseField("oid").alias(alias));
        return this;
    }

    public GitObjectResponseProjection repository(RepositoryResponseProjection subProjection) {
        return repository(null, subProjection);
    }

    public GitObjectResponseProjection repository(String alias, RepositoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("repository").alias(alias).projection(subProjection));
        return this;
    }

    public GitObjectResponseProjection onBlob(BlobResponseProjection subProjection) {
        return onBlob(null, subProjection);
    }

    public GitObjectResponseProjection onBlob(String alias, BlobResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Blob").alias(alias).projection(subProjection));
        return this;
    }

    public GitObjectResponseProjection onCommit(CommitResponseProjection subProjection) {
        return onCommit(null, subProjection);
    }

    public GitObjectResponseProjection onCommit(String alias, CommitResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Commit").alias(alias).projection(subProjection));
        return this;
    }

    public GitObjectResponseProjection onTree(TreeResponseProjection subProjection) {
        return onTree(null, subProjection);
    }

    public GitObjectResponseProjection onTree(String alias, TreeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Tree").alias(alias).projection(subProjection));
        return this;
    }

    public GitObjectResponseProjection onTag(TagResponseProjection subProjection) {
        return onTag(null, subProjection);
    }

    public GitObjectResponseProjection onTag(String alias, TagResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Tag").alias(alias).projection(subProjection));
        return this;
    }

    public GitObjectResponseProjection typename() {
        return typename(null);
    }

    public GitObjectResponseProjection typename(String alias) {
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
        final GitObjectResponseProjection that = (GitObjectResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
