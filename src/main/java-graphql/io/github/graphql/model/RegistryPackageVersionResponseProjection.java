package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for RegistryPackageVersion
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class RegistryPackageVersionResponseProjection extends GraphQLResponseProjection {

    public RegistryPackageVersionResponseProjection() {
    }

    @Override
    public RegistryPackageVersionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public RegistryPackageVersionResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("RegistryPackageVersionResponseProjection.RegistryPackageDependencyConnectionResponseProjection.dependencies", 0) <= maxDepth) {
            projectionDepthOnFields.put("RegistryPackageVersionResponseProjection.RegistryPackageDependencyConnectionResponseProjection.dependencies", projectionDepthOnFields.getOrDefault("RegistryPackageVersionResponseProjection.RegistryPackageDependencyConnectionResponseProjection.dependencies", 0) + 1);
            this.dependencies(new RegistryPackageDependencyConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageVersionResponseProjection.RegistryPackageDependencyConnectionResponseProjection.dependencies", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("RegistryPackageVersionResponseProjection.RegistryPackageFileResponseProjection.fileByName", 0) <= maxDepth) {
            projectionDepthOnFields.put("RegistryPackageVersionResponseProjection.RegistryPackageFileResponseProjection.fileByName", projectionDepthOnFields.getOrDefault("RegistryPackageVersionResponseProjection.RegistryPackageFileResponseProjection.fileByName", 0) + 1);
            this.fileByName(new RegistryPackageFileResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageVersionResponseProjection.RegistryPackageFileResponseProjection.fileByName", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("RegistryPackageVersionResponseProjection.RegistryPackageFileConnectionResponseProjection.files", 0) <= maxDepth) {
            projectionDepthOnFields.put("RegistryPackageVersionResponseProjection.RegistryPackageFileConnectionResponseProjection.files", projectionDepthOnFields.getOrDefault("RegistryPackageVersionResponseProjection.RegistryPackageFileConnectionResponseProjection.files", 0) + 1);
            this.files(new RegistryPackageFileConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageVersionResponseProjection.RegistryPackageFileConnectionResponseProjection.files", 0)));
        }
        this.id();
        this.installationCommand();
        this.manifest();
        this.platform();
        this.readme();
        this.readmeHtml();
        if (projectionDepthOnFields.getOrDefault("RegistryPackageVersionResponseProjection.RegistryPackageResponseProjection.registryPackage", 0) <= maxDepth) {
            projectionDepthOnFields.put("RegistryPackageVersionResponseProjection.RegistryPackageResponseProjection.registryPackage", projectionDepthOnFields.getOrDefault("RegistryPackageVersionResponseProjection.RegistryPackageResponseProjection.registryPackage", 0) + 1);
            this.registryPackage(new RegistryPackageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageVersionResponseProjection.RegistryPackageResponseProjection.registryPackage", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("RegistryPackageVersionResponseProjection.ReleaseResponseProjection.release", 0) <= maxDepth) {
            projectionDepthOnFields.put("RegistryPackageVersionResponseProjection.ReleaseResponseProjection.release", projectionDepthOnFields.getOrDefault("RegistryPackageVersionResponseProjection.ReleaseResponseProjection.release", 0) + 1);
            this.release(new ReleaseResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageVersionResponseProjection.ReleaseResponseProjection.release", 0)));
        }
        this.sha256();
        this.size();
        if (projectionDepthOnFields.getOrDefault("RegistryPackageVersionResponseProjection.RegistryPackageVersionStatisticsResponseProjection.statistics", 0) <= maxDepth) {
            projectionDepthOnFields.put("RegistryPackageVersionResponseProjection.RegistryPackageVersionStatisticsResponseProjection.statistics", projectionDepthOnFields.getOrDefault("RegistryPackageVersionResponseProjection.RegistryPackageVersionStatisticsResponseProjection.statistics", 0) + 1);
            this.statistics(new RegistryPackageVersionStatisticsResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageVersionResponseProjection.RegistryPackageVersionStatisticsResponseProjection.statistics", 0)));
        }
        this.summary();
        this.updatedAt();
        this.version();
        this.viewerCanEdit();
        this.typename();
        return this;
    }

    public RegistryPackageVersionResponseProjection dependencies(RegistryPackageDependencyConnectionResponseProjection subProjection) {
        return dependencies((String)null, subProjection);
    }

    public RegistryPackageVersionResponseProjection dependencies(String alias, RegistryPackageDependencyConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("dependencies").alias(alias).projection(subProjection));
        return this;
    }

    public RegistryPackageVersionResponseProjection dependencies(RegistryPackageVersionDependenciesParametrizedInput input, RegistryPackageDependencyConnectionResponseProjection subProjection) {
        return dependencies(null, input, subProjection);
    }

    public RegistryPackageVersionResponseProjection dependencies(String alias, RegistryPackageVersionDependenciesParametrizedInput input, RegistryPackageDependencyConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("dependencies").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public RegistryPackageVersionResponseProjection fileByName(RegistryPackageFileResponseProjection subProjection) {
        return fileByName((String)null, subProjection);
    }

    public RegistryPackageVersionResponseProjection fileByName(String alias, RegistryPackageFileResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("fileByName").alias(alias).projection(subProjection));
        return this;
    }

    public RegistryPackageVersionResponseProjection fileByName(RegistryPackageVersionFileByNameParametrizedInput input, RegistryPackageFileResponseProjection subProjection) {
        return fileByName(null, input, subProjection);
    }

    public RegistryPackageVersionResponseProjection fileByName(String alias, RegistryPackageVersionFileByNameParametrizedInput input, RegistryPackageFileResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("fileByName").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public RegistryPackageVersionResponseProjection files(RegistryPackageFileConnectionResponseProjection subProjection) {
        return files((String)null, subProjection);
    }

    public RegistryPackageVersionResponseProjection files(String alias, RegistryPackageFileConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("files").alias(alias).projection(subProjection));
        return this;
    }

    public RegistryPackageVersionResponseProjection files(RegistryPackageVersionFilesParametrizedInput input, RegistryPackageFileConnectionResponseProjection subProjection) {
        return files(null, input, subProjection);
    }

    public RegistryPackageVersionResponseProjection files(String alias, RegistryPackageVersionFilesParametrizedInput input, RegistryPackageFileConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("files").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public RegistryPackageVersionResponseProjection id() {
        return id(null);
    }

    public RegistryPackageVersionResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public RegistryPackageVersionResponseProjection installationCommand() {
        return installationCommand(null);
    }

    public RegistryPackageVersionResponseProjection installationCommand(String alias) {
        fields.add(new GraphQLResponseField("installationCommand").alias(alias));
        return this;
    }

    public RegistryPackageVersionResponseProjection manifest() {
        return manifest(null);
    }

    public RegistryPackageVersionResponseProjection manifest(String alias) {
        fields.add(new GraphQLResponseField("manifest").alias(alias));
        return this;
    }

    public RegistryPackageVersionResponseProjection platform() {
        return platform(null);
    }

    public RegistryPackageVersionResponseProjection platform(String alias) {
        fields.add(new GraphQLResponseField("platform").alias(alias));
        return this;
    }

    public RegistryPackageVersionResponseProjection readme() {
        return readme(null);
    }

    public RegistryPackageVersionResponseProjection readme(String alias) {
        fields.add(new GraphQLResponseField("readme").alias(alias));
        return this;
    }

    public RegistryPackageVersionResponseProjection readmeHtml() {
        return readmeHtml(null);
    }

    public RegistryPackageVersionResponseProjection readmeHtml(String alias) {
        fields.add(new GraphQLResponseField("readmeHtml").alias(alias));
        return this;
    }

    public RegistryPackageVersionResponseProjection registryPackage(RegistryPackageResponseProjection subProjection) {
        return registryPackage(null, subProjection);
    }

    public RegistryPackageVersionResponseProjection registryPackage(String alias, RegistryPackageResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("registryPackage").alias(alias).projection(subProjection));
        return this;
    }

    public RegistryPackageVersionResponseProjection release(ReleaseResponseProjection subProjection) {
        return release(null, subProjection);
    }

    public RegistryPackageVersionResponseProjection release(String alias, ReleaseResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("release").alias(alias).projection(subProjection));
        return this;
    }

    public RegistryPackageVersionResponseProjection sha256() {
        return sha256(null);
    }

    public RegistryPackageVersionResponseProjection sha256(String alias) {
        fields.add(new GraphQLResponseField("sha256").alias(alias));
        return this;
    }

    public RegistryPackageVersionResponseProjection size() {
        return size(null);
    }

    public RegistryPackageVersionResponseProjection size(String alias) {
        fields.add(new GraphQLResponseField("size").alias(alias));
        return this;
    }

    public RegistryPackageVersionResponseProjection statistics(RegistryPackageVersionStatisticsResponseProjection subProjection) {
        return statistics(null, subProjection);
    }

    public RegistryPackageVersionResponseProjection statistics(String alias, RegistryPackageVersionStatisticsResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("statistics").alias(alias).projection(subProjection));
        return this;
    }

    public RegistryPackageVersionResponseProjection summary() {
        return summary(null);
    }

    public RegistryPackageVersionResponseProjection summary(String alias) {
        fields.add(new GraphQLResponseField("summary").alias(alias));
        return this;
    }

    public RegistryPackageVersionResponseProjection updatedAt() {
        return updatedAt(null);
    }

    public RegistryPackageVersionResponseProjection updatedAt(String alias) {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias));
        return this;
    }

    public RegistryPackageVersionResponseProjection version() {
        return version(null);
    }

    public RegistryPackageVersionResponseProjection version(String alias) {
        fields.add(new GraphQLResponseField("version").alias(alias));
        return this;
    }

    public RegistryPackageVersionResponseProjection viewerCanEdit() {
        return viewerCanEdit(null);
    }

    public RegistryPackageVersionResponseProjection viewerCanEdit(String alias) {
        fields.add(new GraphQLResponseField("viewerCanEdit").alias(alias));
        return this;
    }

    public RegistryPackageVersionResponseProjection typename() {
        return typename(null);
    }

    public RegistryPackageVersionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
