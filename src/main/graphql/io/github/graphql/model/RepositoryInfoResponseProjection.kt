package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for RepositoryInfo
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class RepositoryInfoResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): RepositoryInfoResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): RepositoryInfoResponseProjection {
        this.createdAt()
        this.description()
        this.descriptionHTML()
        this.forkCount()
        this.hasIssuesEnabled()
        this.hasWikiEnabled()
        this.homepageUrl()
        this.isArchived()
        this.isFork()
        this.isLocked()
        this.isMirror()
        this.isPrivate()
        this.isTemplate()
        if (projectionDepthOnFields.getOrDefault("RepositoryInfoResponseProjection.LicenseResponseProjection.licenseInfo", 0) <= maxDepth) {
            projectionDepthOnFields["RepositoryInfoResponseProjection.LicenseResponseProjection.licenseInfo"] = projectionDepthOnFields.getOrDefault("RepositoryInfoResponseProjection.LicenseResponseProjection.licenseInfo", 0) + 1
            this.licenseInfo(LicenseResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryInfoResponseProjection.LicenseResponseProjection.licenseInfo", 0)))
        }
        this.lockReason()
        this.mirrorUrl()
        this.name()
        this.nameWithOwner()
        this.openGraphImageUrl()
        if (projectionDepthOnFields.getOrDefault("RepositoryInfoResponseProjection.RepositoryOwnerResponseProjection.owner", 0) <= maxDepth) {
            projectionDepthOnFields["RepositoryInfoResponseProjection.RepositoryOwnerResponseProjection.owner"] = projectionDepthOnFields.getOrDefault("RepositoryInfoResponseProjection.RepositoryOwnerResponseProjection.owner", 0) + 1
            this.owner(RepositoryOwnerResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryInfoResponseProjection.RepositoryOwnerResponseProjection.owner", 0)))
        }
        this.pushedAt()
        this.resourcePath()
        this.shortDescriptionHTML()
        this.updatedAt()
        this.url()
        this.usesCustomOpenGraphImage()
        this.typename()
        return this
    }

    fun createdAt(): RepositoryInfoResponseProjection = createdAt(null)

    fun createdAt(alias: String?): RepositoryInfoResponseProjection {
        fields.add(GraphQLResponseField("createdAt").alias(alias))
        return this
    }

    fun description(): RepositoryInfoResponseProjection = description(null)

    fun description(alias: String?): RepositoryInfoResponseProjection {
        fields.add(GraphQLResponseField("description").alias(alias))
        return this
    }

    fun descriptionHTML(): RepositoryInfoResponseProjection = descriptionHTML(null)

    fun descriptionHTML(alias: String?): RepositoryInfoResponseProjection {
        fields.add(GraphQLResponseField("descriptionHTML").alias(alias))
        return this
    }

    fun forkCount(): RepositoryInfoResponseProjection = forkCount(null)

    fun forkCount(alias: String?): RepositoryInfoResponseProjection {
        fields.add(GraphQLResponseField("forkCount").alias(alias))
        return this
    }

    fun hasIssuesEnabled(): RepositoryInfoResponseProjection = hasIssuesEnabled(null)

    fun hasIssuesEnabled(alias: String?): RepositoryInfoResponseProjection {
        fields.add(GraphQLResponseField("hasIssuesEnabled").alias(alias))
        return this
    }

    fun hasWikiEnabled(): RepositoryInfoResponseProjection = hasWikiEnabled(null)

    fun hasWikiEnabled(alias: String?): RepositoryInfoResponseProjection {
        fields.add(GraphQLResponseField("hasWikiEnabled").alias(alias))
        return this
    }

    fun homepageUrl(): RepositoryInfoResponseProjection = homepageUrl(null)

    fun homepageUrl(alias: String?): RepositoryInfoResponseProjection {
        fields.add(GraphQLResponseField("homepageUrl").alias(alias))
        return this
    }

    fun isArchived(): RepositoryInfoResponseProjection = isArchived(null)

    fun isArchived(alias: String?): RepositoryInfoResponseProjection {
        fields.add(GraphQLResponseField("isArchived").alias(alias))
        return this
    }

    fun isFork(): RepositoryInfoResponseProjection = isFork(null)

    fun isFork(alias: String?): RepositoryInfoResponseProjection {
        fields.add(GraphQLResponseField("isFork").alias(alias))
        return this
    }

    fun isLocked(): RepositoryInfoResponseProjection = isLocked(null)

    fun isLocked(alias: String?): RepositoryInfoResponseProjection {
        fields.add(GraphQLResponseField("isLocked").alias(alias))
        return this
    }

    fun isMirror(): RepositoryInfoResponseProjection = isMirror(null)

    fun isMirror(alias: String?): RepositoryInfoResponseProjection {
        fields.add(GraphQLResponseField("isMirror").alias(alias))
        return this
    }

    fun isPrivate(): RepositoryInfoResponseProjection = isPrivate(null)

    fun isPrivate(alias: String?): RepositoryInfoResponseProjection {
        fields.add(GraphQLResponseField("isPrivate").alias(alias))
        return this
    }

    fun isTemplate(): RepositoryInfoResponseProjection = isTemplate(null)

    fun isTemplate(alias: String?): RepositoryInfoResponseProjection {
        fields.add(GraphQLResponseField("isTemplate").alias(alias))
        return this
    }

    fun licenseInfo(subProjection: LicenseResponseProjection): RepositoryInfoResponseProjection = licenseInfo(null, subProjection)

    fun licenseInfo(alias: String?, subProjection: LicenseResponseProjection): RepositoryInfoResponseProjection {
        fields.add(GraphQLResponseField("licenseInfo").alias(alias).projection(subProjection))
        return this
    }

    fun lockReason(): RepositoryInfoResponseProjection = lockReason(null)

    fun lockReason(alias: String?): RepositoryInfoResponseProjection {
        fields.add(GraphQLResponseField("lockReason").alias(alias))
        return this
    }

    fun mirrorUrl(): RepositoryInfoResponseProjection = mirrorUrl(null)

    fun mirrorUrl(alias: String?): RepositoryInfoResponseProjection {
        fields.add(GraphQLResponseField("mirrorUrl").alias(alias))
        return this
    }

    fun name(): RepositoryInfoResponseProjection = name(null)

    fun name(alias: String?): RepositoryInfoResponseProjection {
        fields.add(GraphQLResponseField("name").alias(alias))
        return this
    }

    fun nameWithOwner(): RepositoryInfoResponseProjection = nameWithOwner(null)

    fun nameWithOwner(alias: String?): RepositoryInfoResponseProjection {
        fields.add(GraphQLResponseField("nameWithOwner").alias(alias))
        return this
    }

    fun openGraphImageUrl(): RepositoryInfoResponseProjection = openGraphImageUrl(null)

    fun openGraphImageUrl(alias: String?): RepositoryInfoResponseProjection {
        fields.add(GraphQLResponseField("openGraphImageUrl").alias(alias))
        return this
    }

    fun owner(subProjection: RepositoryOwnerResponseProjection): RepositoryInfoResponseProjection = owner(null, subProjection)

    fun owner(alias: String?, subProjection: RepositoryOwnerResponseProjection): RepositoryInfoResponseProjection {
        fields.add(GraphQLResponseField("owner").alias(alias).projection(subProjection))
        return this
    }

    fun pushedAt(): RepositoryInfoResponseProjection = pushedAt(null)

    fun pushedAt(alias: String?): RepositoryInfoResponseProjection {
        fields.add(GraphQLResponseField("pushedAt").alias(alias))
        return this
    }

    fun resourcePath(): RepositoryInfoResponseProjection = resourcePath(null)

    fun resourcePath(alias: String?): RepositoryInfoResponseProjection {
        fields.add(GraphQLResponseField("resourcePath").alias(alias))
        return this
    }

    fun shortDescriptionHTML(): RepositoryInfoResponseProjection = shortDescriptionHTML(null)

    fun shortDescriptionHTML(alias: String?): RepositoryInfoResponseProjection {
        fields.add(GraphQLResponseField("shortDescriptionHTML").alias(alias))
        return this
    }

    fun shortDescriptionHTML(input: RepositoryInfoShortDescriptionHTMLParametrizedInput): RepositoryInfoResponseProjection = shortDescriptionHTML(null, input)

    fun shortDescriptionHTML(alias: String?, input: RepositoryInfoShortDescriptionHTMLParametrizedInput): RepositoryInfoResponseProjection {
        fields.add(GraphQLResponseField("shortDescriptionHTML").alias(alias).parameters(input))
        return this
    }

    fun updatedAt(): RepositoryInfoResponseProjection = updatedAt(null)

    fun updatedAt(alias: String?): RepositoryInfoResponseProjection {
        fields.add(GraphQLResponseField("updatedAt").alias(alias))
        return this
    }

    fun url(): RepositoryInfoResponseProjection = url(null)

    fun url(alias: String?): RepositoryInfoResponseProjection {
        fields.add(GraphQLResponseField("url").alias(alias))
        return this
    }

    fun usesCustomOpenGraphImage(): RepositoryInfoResponseProjection = usesCustomOpenGraphImage(null)

    fun usesCustomOpenGraphImage(alias: String?): RepositoryInfoResponseProjection {
        fields.add(GraphQLResponseField("usesCustomOpenGraphImage").alias(alias))
        return this
    }

    fun onRepository(subProjection: RepositoryResponseProjection): RepositoryInfoResponseProjection = onRepository(null, subProjection)

    fun onRepository(alias: String?, subProjection: RepositoryResponseProjection): RepositoryInfoResponseProjection {
        fields.add(GraphQLResponseField("...on Repository").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): RepositoryInfoResponseProjection = typename(null)

    fun typename(alias: String?): RepositoryInfoResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
