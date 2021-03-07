package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for ReleaseAsset
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class ReleaseAssetResponseProjection extends GraphQLResponseProjection {

    public ReleaseAssetResponseProjection() {
    }

    @Override
    public ReleaseAssetResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ReleaseAssetResponseProjection all$(int maxDepth) {
        this.contentType();
        this.createdAt();
        this.downloadCount();
        this.downloadUrl();
        this.id();
        this.name();
        if (projectionDepthOnFields.getOrDefault("ReleaseAssetResponseProjection.ReleaseResponseProjection.release", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReleaseAssetResponseProjection.ReleaseResponseProjection.release", projectionDepthOnFields.getOrDefault("ReleaseAssetResponseProjection.ReleaseResponseProjection.release", 0) + 1);
            this.release(new ReleaseResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReleaseAssetResponseProjection.ReleaseResponseProjection.release", 0)));
        }
        this.size();
        this.updatedAt();
        if (projectionDepthOnFields.getOrDefault("ReleaseAssetResponseProjection.UserResponseProjection.uploadedBy", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReleaseAssetResponseProjection.UserResponseProjection.uploadedBy", projectionDepthOnFields.getOrDefault("ReleaseAssetResponseProjection.UserResponseProjection.uploadedBy", 0) + 1);
            this.uploadedBy(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReleaseAssetResponseProjection.UserResponseProjection.uploadedBy", 0)));
        }
        this.url();
        this.typename();
        return this;
    }

    public ReleaseAssetResponseProjection contentType() {
        return contentType(null);
    }

    public ReleaseAssetResponseProjection contentType(String alias) {
        fields.add(new GraphQLResponseField("contentType").alias(alias));
        return this;
    }

    public ReleaseAssetResponseProjection createdAt() {
        return createdAt(null);
    }

    public ReleaseAssetResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public ReleaseAssetResponseProjection downloadCount() {
        return downloadCount(null);
    }

    public ReleaseAssetResponseProjection downloadCount(String alias) {
        fields.add(new GraphQLResponseField("downloadCount").alias(alias));
        return this;
    }

    public ReleaseAssetResponseProjection downloadUrl() {
        return downloadUrl(null);
    }

    public ReleaseAssetResponseProjection downloadUrl(String alias) {
        fields.add(new GraphQLResponseField("downloadUrl").alias(alias));
        return this;
    }

    public ReleaseAssetResponseProjection id() {
        return id(null);
    }

    public ReleaseAssetResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ReleaseAssetResponseProjection name() {
        return name(null);
    }

    public ReleaseAssetResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public ReleaseAssetResponseProjection release(ReleaseResponseProjection subProjection) {
        return release(null, subProjection);
    }

    public ReleaseAssetResponseProjection release(String alias, ReleaseResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("release").alias(alias).projection(subProjection));
        return this;
    }

    public ReleaseAssetResponseProjection size() {
        return size(null);
    }

    public ReleaseAssetResponseProjection size(String alias) {
        fields.add(new GraphQLResponseField("size").alias(alias));
        return this;
    }

    public ReleaseAssetResponseProjection updatedAt() {
        return updatedAt(null);
    }

    public ReleaseAssetResponseProjection updatedAt(String alias) {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias));
        return this;
    }

    public ReleaseAssetResponseProjection uploadedBy(UserResponseProjection subProjection) {
        return uploadedBy(null, subProjection);
    }

    public ReleaseAssetResponseProjection uploadedBy(String alias, UserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("uploadedBy").alias(alias).projection(subProjection));
        return this;
    }

    public ReleaseAssetResponseProjection url() {
        return url(null);
    }

    public ReleaseAssetResponseProjection url(String alias) {
        fields.add(new GraphQLResponseField("url").alias(alias));
        return this;
    }

    public ReleaseAssetResponseProjection typename() {
        return typename(null);
    }

    public ReleaseAssetResponseProjection typename(String alias) {
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
        final ReleaseAssetResponseProjection that = (ReleaseAssetResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
