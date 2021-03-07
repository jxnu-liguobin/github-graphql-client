package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for Blob
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class BlobResponseProjection extends GraphQLResponseProjection {

    public BlobResponseProjection() {
    }

    @Override
    public BlobResponseProjection all$() {
        return all$(3);
    }

    @Override
    public BlobResponseProjection all$(int maxDepth) {
        this.abbreviatedOid();
        this.byteSize();
        this.commitResourcePath();
        this.commitUrl();
        this.id();
        this.isBinary();
        this.isTruncated();
        this.oid();
        if (projectionDepthOnFields.getOrDefault("BlobResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields.put("BlobResponseProjection.RepositoryResponseProjection.repository", projectionDepthOnFields.getOrDefault("BlobResponseProjection.RepositoryResponseProjection.repository", 0) + 1);
            this.repository(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("BlobResponseProjection.RepositoryResponseProjection.repository", 0)));
        }
        this.text();
        this.typename();
        return this;
    }

    public BlobResponseProjection abbreviatedOid() {
        return abbreviatedOid(null);
    }

    public BlobResponseProjection abbreviatedOid(String alias) {
        fields.add(new GraphQLResponseField("abbreviatedOid").alias(alias));
        return this;
    }

    public BlobResponseProjection byteSize() {
        return byteSize(null);
    }

    public BlobResponseProjection byteSize(String alias) {
        fields.add(new GraphQLResponseField("byteSize").alias(alias));
        return this;
    }

    public BlobResponseProjection commitResourcePath() {
        return commitResourcePath(null);
    }

    public BlobResponseProjection commitResourcePath(String alias) {
        fields.add(new GraphQLResponseField("commitResourcePath").alias(alias));
        return this;
    }

    public BlobResponseProjection commitUrl() {
        return commitUrl(null);
    }

    public BlobResponseProjection commitUrl(String alias) {
        fields.add(new GraphQLResponseField("commitUrl").alias(alias));
        return this;
    }

    public BlobResponseProjection id() {
        return id(null);
    }

    public BlobResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public BlobResponseProjection isBinary() {
        return isBinary(null);
    }

    public BlobResponseProjection isBinary(String alias) {
        fields.add(new GraphQLResponseField("isBinary").alias(alias));
        return this;
    }

    public BlobResponseProjection isTruncated() {
        return isTruncated(null);
    }

    public BlobResponseProjection isTruncated(String alias) {
        fields.add(new GraphQLResponseField("isTruncated").alias(alias));
        return this;
    }

    public BlobResponseProjection oid() {
        return oid(null);
    }

    public BlobResponseProjection oid(String alias) {
        fields.add(new GraphQLResponseField("oid").alias(alias));
        return this;
    }

    public BlobResponseProjection repository(RepositoryResponseProjection subProjection) {
        return repository(null, subProjection);
    }

    public BlobResponseProjection repository(String alias, RepositoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("repository").alias(alias).projection(subProjection));
        return this;
    }

    public BlobResponseProjection text() {
        return text(null);
    }

    public BlobResponseProjection text(String alias) {
        fields.add(new GraphQLResponseField("text").alias(alias));
        return this;
    }

    public BlobResponseProjection typename() {
        return typename(null);
    }

    public BlobResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
