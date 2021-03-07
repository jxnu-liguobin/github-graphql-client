package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for RepositoryInfo
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class RepositoryInfoResponseProjection extends GraphQLResponseProjection {

    public RepositoryInfoResponseProjection() {
    }

    @Override
    public RepositoryInfoResponseProjection all$() {
        return all$(3);
    }

    @Override
    public RepositoryInfoResponseProjection all$(int maxDepth) {
        this.createdAt();
        this.description();
        this.descriptionHTML();
        this.forkCount();
        this.hasIssuesEnabled();
        this.hasWikiEnabled();
        this.homepageUrl();
        this.isArchived();
        this.isFork();
        this.isLocked();
        this.isMirror();
        this.isPrivate();
        this.isTemplate();
        if (projectionDepthOnFields.getOrDefault("RepositoryInfoResponseProjection.LicenseResponseProjection.licenseInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryInfoResponseProjection.LicenseResponseProjection.licenseInfo", projectionDepthOnFields.getOrDefault("RepositoryInfoResponseProjection.LicenseResponseProjection.licenseInfo", 0) + 1);
            this.licenseInfo(new LicenseResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryInfoResponseProjection.LicenseResponseProjection.licenseInfo", 0)));
        }
        this.lockReason();
        this.mirrorUrl();
        this.name();
        this.nameWithOwner();
        this.openGraphImageUrl();
        if (projectionDepthOnFields.getOrDefault("RepositoryInfoResponseProjection.RepositoryOwnerResponseProjection.owner", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryInfoResponseProjection.RepositoryOwnerResponseProjection.owner", projectionDepthOnFields.getOrDefault("RepositoryInfoResponseProjection.RepositoryOwnerResponseProjection.owner", 0) + 1);
            this.owner(new RepositoryOwnerResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryInfoResponseProjection.RepositoryOwnerResponseProjection.owner", 0)));
        }
        this.pushedAt();
        this.resourcePath();
        this.shortDescriptionHTML();
        this.updatedAt();
        this.url();
        this.usesCustomOpenGraphImage();
        this.typename();
        return this;
    }

    public RepositoryInfoResponseProjection createdAt() {
        return createdAt(null);
    }

    public RepositoryInfoResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public RepositoryInfoResponseProjection description() {
        return description(null);
    }

    public RepositoryInfoResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public RepositoryInfoResponseProjection descriptionHTML() {
        return descriptionHTML(null);
    }

    public RepositoryInfoResponseProjection descriptionHTML(String alias) {
        fields.add(new GraphQLResponseField("descriptionHTML").alias(alias));
        return this;
    }

    public RepositoryInfoResponseProjection forkCount() {
        return forkCount(null);
    }

    public RepositoryInfoResponseProjection forkCount(String alias) {
        fields.add(new GraphQLResponseField("forkCount").alias(alias));
        return this;
    }

    public RepositoryInfoResponseProjection hasIssuesEnabled() {
        return hasIssuesEnabled(null);
    }

    public RepositoryInfoResponseProjection hasIssuesEnabled(String alias) {
        fields.add(new GraphQLResponseField("hasIssuesEnabled").alias(alias));
        return this;
    }

    public RepositoryInfoResponseProjection hasWikiEnabled() {
        return hasWikiEnabled(null);
    }

    public RepositoryInfoResponseProjection hasWikiEnabled(String alias) {
        fields.add(new GraphQLResponseField("hasWikiEnabled").alias(alias));
        return this;
    }

    public RepositoryInfoResponseProjection homepageUrl() {
        return homepageUrl(null);
    }

    public RepositoryInfoResponseProjection homepageUrl(String alias) {
        fields.add(new GraphQLResponseField("homepageUrl").alias(alias));
        return this;
    }

    public RepositoryInfoResponseProjection isArchived() {
        return isArchived(null);
    }

    public RepositoryInfoResponseProjection isArchived(String alias) {
        fields.add(new GraphQLResponseField("isArchived").alias(alias));
        return this;
    }

    public RepositoryInfoResponseProjection isFork() {
        return isFork(null);
    }

    public RepositoryInfoResponseProjection isFork(String alias) {
        fields.add(new GraphQLResponseField("isFork").alias(alias));
        return this;
    }

    public RepositoryInfoResponseProjection isLocked() {
        return isLocked(null);
    }

    public RepositoryInfoResponseProjection isLocked(String alias) {
        fields.add(new GraphQLResponseField("isLocked").alias(alias));
        return this;
    }

    public RepositoryInfoResponseProjection isMirror() {
        return isMirror(null);
    }

    public RepositoryInfoResponseProjection isMirror(String alias) {
        fields.add(new GraphQLResponseField("isMirror").alias(alias));
        return this;
    }

    public RepositoryInfoResponseProjection isPrivate() {
        return isPrivate(null);
    }

    public RepositoryInfoResponseProjection isPrivate(String alias) {
        fields.add(new GraphQLResponseField("isPrivate").alias(alias));
        return this;
    }

    public RepositoryInfoResponseProjection isTemplate() {
        return isTemplate(null);
    }

    public RepositoryInfoResponseProjection isTemplate(String alias) {
        fields.add(new GraphQLResponseField("isTemplate").alias(alias));
        return this;
    }

    public RepositoryInfoResponseProjection licenseInfo(LicenseResponseProjection subProjection) {
        return licenseInfo(null, subProjection);
    }

    public RepositoryInfoResponseProjection licenseInfo(String alias, LicenseResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("licenseInfo").alias(alias).projection(subProjection));
        return this;
    }

    public RepositoryInfoResponseProjection lockReason() {
        return lockReason(null);
    }

    public RepositoryInfoResponseProjection lockReason(String alias) {
        fields.add(new GraphQLResponseField("lockReason").alias(alias));
        return this;
    }

    public RepositoryInfoResponseProjection mirrorUrl() {
        return mirrorUrl(null);
    }

    public RepositoryInfoResponseProjection mirrorUrl(String alias) {
        fields.add(new GraphQLResponseField("mirrorUrl").alias(alias));
        return this;
    }

    public RepositoryInfoResponseProjection name() {
        return name(null);
    }

    public RepositoryInfoResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public RepositoryInfoResponseProjection nameWithOwner() {
        return nameWithOwner(null);
    }

    public RepositoryInfoResponseProjection nameWithOwner(String alias) {
        fields.add(new GraphQLResponseField("nameWithOwner").alias(alias));
        return this;
    }

    public RepositoryInfoResponseProjection openGraphImageUrl() {
        return openGraphImageUrl(null);
    }

    public RepositoryInfoResponseProjection openGraphImageUrl(String alias) {
        fields.add(new GraphQLResponseField("openGraphImageUrl").alias(alias));
        return this;
    }

    public RepositoryInfoResponseProjection owner(RepositoryOwnerResponseProjection subProjection) {
        return owner(null, subProjection);
    }

    public RepositoryInfoResponseProjection owner(String alias, RepositoryOwnerResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("owner").alias(alias).projection(subProjection));
        return this;
    }

    public RepositoryInfoResponseProjection pushedAt() {
        return pushedAt(null);
    }

    public RepositoryInfoResponseProjection pushedAt(String alias) {
        fields.add(new GraphQLResponseField("pushedAt").alias(alias));
        return this;
    }

    public RepositoryInfoResponseProjection resourcePath() {
        return resourcePath(null);
    }

    public RepositoryInfoResponseProjection resourcePath(String alias) {
        fields.add(new GraphQLResponseField("resourcePath").alias(alias));
        return this;
    }

    public RepositoryInfoResponseProjection shortDescriptionHTML() {
        return shortDescriptionHTML((String)null);
    }

    public RepositoryInfoResponseProjection shortDescriptionHTML(String alias) {
        fields.add(new GraphQLResponseField("shortDescriptionHTML").alias(alias));
        return this;
    }

    public RepositoryInfoResponseProjection shortDescriptionHTML(RepositoryInfoShortDescriptionHTMLParametrizedInput input) {
        return shortDescriptionHTML(null, input);
    }

    public RepositoryInfoResponseProjection shortDescriptionHTML(String alias, RepositoryInfoShortDescriptionHTMLParametrizedInput input) {
        fields.add(new GraphQLResponseField("shortDescriptionHTML").alias(alias).parameters(input));
        return this;
    }

    public RepositoryInfoResponseProjection updatedAt() {
        return updatedAt(null);
    }

    public RepositoryInfoResponseProjection updatedAt(String alias) {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias));
        return this;
    }

    public RepositoryInfoResponseProjection url() {
        return url(null);
    }

    public RepositoryInfoResponseProjection url(String alias) {
        fields.add(new GraphQLResponseField("url").alias(alias));
        return this;
    }

    public RepositoryInfoResponseProjection usesCustomOpenGraphImage() {
        return usesCustomOpenGraphImage(null);
    }

    public RepositoryInfoResponseProjection usesCustomOpenGraphImage(String alias) {
        fields.add(new GraphQLResponseField("usesCustomOpenGraphImage").alias(alias));
        return this;
    }

    public RepositoryInfoResponseProjection onRepository(RepositoryResponseProjection subProjection) {
        return onRepository(null, subProjection);
    }

    public RepositoryInfoResponseProjection onRepository(String alias, RepositoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Repository").alias(alias).projection(subProjection));
        return this;
    }

    public RepositoryInfoResponseProjection typename() {
        return typename(null);
    }

    public RepositoryInfoResponseProjection typename(String alias) {
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
        final RepositoryInfoResponseProjection that = (RepositoryInfoResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
