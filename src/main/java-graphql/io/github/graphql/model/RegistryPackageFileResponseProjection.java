package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for RegistryPackageFile
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class RegistryPackageFileResponseProjection extends GraphQLResponseProjection {

    public RegistryPackageFileResponseProjection() {
    }

    @Override
    public RegistryPackageFileResponseProjection all$() {
        return all$(3);
    }

    @Override
    public RegistryPackageFileResponseProjection all$(int maxDepth) {
        this.guid();
        this.id();
        this.md5();
        this.metadataUrl();
        this.name();
        if (projectionDepthOnFields.getOrDefault("RegistryPackageFileResponseProjection.RegistryPackageVersionResponseProjection.packageVersion", 0) <= maxDepth) {
            projectionDepthOnFields.put("RegistryPackageFileResponseProjection.RegistryPackageVersionResponseProjection.packageVersion", projectionDepthOnFields.getOrDefault("RegistryPackageFileResponseProjection.RegistryPackageVersionResponseProjection.packageVersion", 0) + 1);
            this.packageVersion(new RegistryPackageVersionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageFileResponseProjection.RegistryPackageVersionResponseProjection.packageVersion", 0)));
        }
        this.sha1();
        this.sha256();
        this.size();
        this.updatedAt();
        this.url();
        this.typename();
        return this;
    }

    public RegistryPackageFileResponseProjection guid() {
        return guid(null);
    }

    public RegistryPackageFileResponseProjection guid(String alias) {
        fields.add(new GraphQLResponseField("guid").alias(alias));
        return this;
    }

    public RegistryPackageFileResponseProjection id() {
        return id(null);
    }

    public RegistryPackageFileResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public RegistryPackageFileResponseProjection md5() {
        return md5(null);
    }

    public RegistryPackageFileResponseProjection md5(String alias) {
        fields.add(new GraphQLResponseField("md5").alias(alias));
        return this;
    }

    public RegistryPackageFileResponseProjection metadataUrl() {
        return metadataUrl(null);
    }

    public RegistryPackageFileResponseProjection metadataUrl(String alias) {
        fields.add(new GraphQLResponseField("metadataUrl").alias(alias));
        return this;
    }

    public RegistryPackageFileResponseProjection name() {
        return name(null);
    }

    public RegistryPackageFileResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public RegistryPackageFileResponseProjection packageVersion(RegistryPackageVersionResponseProjection subProjection) {
        return packageVersion(null, subProjection);
    }

    public RegistryPackageFileResponseProjection packageVersion(String alias, RegistryPackageVersionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("packageVersion").alias(alias).projection(subProjection));
        return this;
    }

    public RegistryPackageFileResponseProjection sha1() {
        return sha1(null);
    }

    public RegistryPackageFileResponseProjection sha1(String alias) {
        fields.add(new GraphQLResponseField("sha1").alias(alias));
        return this;
    }

    public RegistryPackageFileResponseProjection sha256() {
        return sha256(null);
    }

    public RegistryPackageFileResponseProjection sha256(String alias) {
        fields.add(new GraphQLResponseField("sha256").alias(alias));
        return this;
    }

    public RegistryPackageFileResponseProjection size() {
        return size(null);
    }

    public RegistryPackageFileResponseProjection size(String alias) {
        fields.add(new GraphQLResponseField("size").alias(alias));
        return this;
    }

    public RegistryPackageFileResponseProjection updatedAt() {
        return updatedAt(null);
    }

    public RegistryPackageFileResponseProjection updatedAt(String alias) {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias));
        return this;
    }

    public RegistryPackageFileResponseProjection url() {
        return url(null);
    }

    public RegistryPackageFileResponseProjection url(String alias) {
        fields.add(new GraphQLResponseField("url").alias(alias));
        return this;
    }

    public RegistryPackageFileResponseProjection typename() {
        return typename(null);
    }

    public RegistryPackageFileResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
