package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for RepositoryInfo
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class RepositoryInfoResponseProjection extends GraphQLResponseProjection {

    override def all$(): RepositoryInfoResponseProjection = all$(3)

    override def all$(maxDepth: Int): RepositoryInfoResponseProjection = {
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
            projectionDepthOnFields.put("RepositoryInfoResponseProjection.LicenseResponseProjection.licenseInfo", projectionDepthOnFields.getOrDefault("RepositoryInfoResponseProjection.LicenseResponseProjection.licenseInfo", 0) + 1)
            this.licenseInfo(new LicenseResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryInfoResponseProjection.LicenseResponseProjection.licenseInfo", 0)))
        }
        this.lockReason()
        this.mirrorUrl()
        this.name()
        this.nameWithOwner()
        this.openGraphImageUrl()
        if (projectionDepthOnFields.getOrDefault("RepositoryInfoResponseProjection.RepositoryOwnerResponseProjection.owner", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryInfoResponseProjection.RepositoryOwnerResponseProjection.owner", projectionDepthOnFields.getOrDefault("RepositoryInfoResponseProjection.RepositoryOwnerResponseProjection.owner", 0) + 1)
            this.owner(new RepositoryOwnerResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryInfoResponseProjection.RepositoryOwnerResponseProjection.owner", 0)))
        }
        this.pushedAt()
        this.resourcePath()
        this.shortDescriptionHTML()
        this.updatedAt()
        this.url()
        this.usesCustomOpenGraphImage()
        this.typename()
        this
    }

    def createdAt(): RepositoryInfoResponseProjection = {
        createdAt(null.asInstanceOf[String])
    }

    def createdAt(alias: String): RepositoryInfoResponseProjection = {
        fields.add(new GraphQLResponseField("createdAt").alias(alias))
        this
    }

    def description(): RepositoryInfoResponseProjection = {
        description(null.asInstanceOf[String])
    }

    def description(alias: String): RepositoryInfoResponseProjection = {
        fields.add(new GraphQLResponseField("description").alias(alias))
        this
    }

    def descriptionHTML(): RepositoryInfoResponseProjection = {
        descriptionHTML(null.asInstanceOf[String])
    }

    def descriptionHTML(alias: String): RepositoryInfoResponseProjection = {
        fields.add(new GraphQLResponseField("descriptionHTML").alias(alias))
        this
    }

    def forkCount(): RepositoryInfoResponseProjection = {
        forkCount(null.asInstanceOf[String])
    }

    def forkCount(alias: String): RepositoryInfoResponseProjection = {
        fields.add(new GraphQLResponseField("forkCount").alias(alias))
        this
    }

    def hasIssuesEnabled(): RepositoryInfoResponseProjection = {
        hasIssuesEnabled(null.asInstanceOf[String])
    }

    def hasIssuesEnabled(alias: String): RepositoryInfoResponseProjection = {
        fields.add(new GraphQLResponseField("hasIssuesEnabled").alias(alias))
        this
    }

    def hasWikiEnabled(): RepositoryInfoResponseProjection = {
        hasWikiEnabled(null.asInstanceOf[String])
    }

    def hasWikiEnabled(alias: String): RepositoryInfoResponseProjection = {
        fields.add(new GraphQLResponseField("hasWikiEnabled").alias(alias))
        this
    }

    def homepageUrl(): RepositoryInfoResponseProjection = {
        homepageUrl(null.asInstanceOf[String])
    }

    def homepageUrl(alias: String): RepositoryInfoResponseProjection = {
        fields.add(new GraphQLResponseField("homepageUrl").alias(alias))
        this
    }

    def isArchived(): RepositoryInfoResponseProjection = {
        isArchived(null.asInstanceOf[String])
    }

    def isArchived(alias: String): RepositoryInfoResponseProjection = {
        fields.add(new GraphQLResponseField("isArchived").alias(alias))
        this
    }

    def isFork(): RepositoryInfoResponseProjection = {
        isFork(null.asInstanceOf[String])
    }

    def isFork(alias: String): RepositoryInfoResponseProjection = {
        fields.add(new GraphQLResponseField("isFork").alias(alias))
        this
    }

    def isLocked(): RepositoryInfoResponseProjection = {
        isLocked(null.asInstanceOf[String])
    }

    def isLocked(alias: String): RepositoryInfoResponseProjection = {
        fields.add(new GraphQLResponseField("isLocked").alias(alias))
        this
    }

    def isMirror(): RepositoryInfoResponseProjection = {
        isMirror(null.asInstanceOf[String])
    }

    def isMirror(alias: String): RepositoryInfoResponseProjection = {
        fields.add(new GraphQLResponseField("isMirror").alias(alias))
        this
    }

    def isPrivate(): RepositoryInfoResponseProjection = {
        isPrivate(null.asInstanceOf[String])
    }

    def isPrivate(alias: String): RepositoryInfoResponseProjection = {
        fields.add(new GraphQLResponseField("isPrivate").alias(alias))
        this
    }

    def isTemplate(): RepositoryInfoResponseProjection = {
        isTemplate(null.asInstanceOf[String])
    }

    def isTemplate(alias: String): RepositoryInfoResponseProjection = {
        fields.add(new GraphQLResponseField("isTemplate").alias(alias))
        this
    }

    def licenseInfo(subProjection: LicenseResponseProjection): RepositoryInfoResponseProjection = {
        licenseInfo(null.asInstanceOf[String], subProjection)
    }

    def licenseInfo(alias: String, subProjection: LicenseResponseProjection): RepositoryInfoResponseProjection = {
        fields.add(new GraphQLResponseField("licenseInfo").alias(alias).projection(subProjection))
        this
    }

    def lockReason(): RepositoryInfoResponseProjection = {
        lockReason(null.asInstanceOf[String])
    }

    def lockReason(alias: String): RepositoryInfoResponseProjection = {
        fields.add(new GraphQLResponseField("lockReason").alias(alias))
        this
    }

    def mirrorUrl(): RepositoryInfoResponseProjection = {
        mirrorUrl(null.asInstanceOf[String])
    }

    def mirrorUrl(alias: String): RepositoryInfoResponseProjection = {
        fields.add(new GraphQLResponseField("mirrorUrl").alias(alias))
        this
    }

    def name(): RepositoryInfoResponseProjection = {
        name(null.asInstanceOf[String])
    }

    def name(alias: String): RepositoryInfoResponseProjection = {
        fields.add(new GraphQLResponseField("name").alias(alias))
        this
    }

    def nameWithOwner(): RepositoryInfoResponseProjection = {
        nameWithOwner(null.asInstanceOf[String])
    }

    def nameWithOwner(alias: String): RepositoryInfoResponseProjection = {
        fields.add(new GraphQLResponseField("nameWithOwner").alias(alias))
        this
    }

    def openGraphImageUrl(): RepositoryInfoResponseProjection = {
        openGraphImageUrl(null.asInstanceOf[String])
    }

    def openGraphImageUrl(alias: String): RepositoryInfoResponseProjection = {
        fields.add(new GraphQLResponseField("openGraphImageUrl").alias(alias))
        this
    }

    def owner(subProjection: RepositoryOwnerResponseProjection): RepositoryInfoResponseProjection = {
        owner(null.asInstanceOf[String], subProjection)
    }

    def owner(alias: String, subProjection: RepositoryOwnerResponseProjection): RepositoryInfoResponseProjection = {
        fields.add(new GraphQLResponseField("owner").alias(alias).projection(subProjection))
        this
    }

    def pushedAt(): RepositoryInfoResponseProjection = {
        pushedAt(null.asInstanceOf[String])
    }

    def pushedAt(alias: String): RepositoryInfoResponseProjection = {
        fields.add(new GraphQLResponseField("pushedAt").alias(alias))
        this
    }

    def resourcePath(): RepositoryInfoResponseProjection = {
        resourcePath(null.asInstanceOf[String])
    }

    def resourcePath(alias: String): RepositoryInfoResponseProjection = {
        fields.add(new GraphQLResponseField("resourcePath").alias(alias))
        this
    }

    def shortDescriptionHTML(): RepositoryInfoResponseProjection = {
        shortDescriptionHTML(null.asInstanceOf[String])
    }

    def shortDescriptionHTML(alias: String): RepositoryInfoResponseProjection = {
        fields.add(new GraphQLResponseField("shortDescriptionHTML").alias(alias))
        this
    }

    def shortDescriptionHTML(input: RepositoryInfoShortDescriptionHTMLParametrizedInput): RepositoryInfoResponseProjection = {
        shortDescriptionHTML(null.asInstanceOf[String], input)
    }

    def shortDescriptionHTML(alias: String, input: RepositoryInfoShortDescriptionHTMLParametrizedInput ): RepositoryInfoResponseProjection = {
        fields.add(new GraphQLResponseField("shortDescriptionHTML").alias(alias).parameters(input))
        this
    }

    def updatedAt(): RepositoryInfoResponseProjection = {
        updatedAt(null.asInstanceOf[String])
    }

    def updatedAt(alias: String): RepositoryInfoResponseProjection = {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias))
        this
    }

    def url(): RepositoryInfoResponseProjection = {
        url(null.asInstanceOf[String])
    }

    def url(alias: String): RepositoryInfoResponseProjection = {
        fields.add(new GraphQLResponseField("url").alias(alias))
        this
    }

    def usesCustomOpenGraphImage(): RepositoryInfoResponseProjection = {
        usesCustomOpenGraphImage(null.asInstanceOf[String])
    }

    def usesCustomOpenGraphImage(alias: String): RepositoryInfoResponseProjection = {
        fields.add(new GraphQLResponseField("usesCustomOpenGraphImage").alias(alias))
        this
    }

    def onRepository(subProjection: RepositoryResponseProjection): RepositoryInfoResponseProjection = {
        onRepository(null.asInstanceOf[String], subProjection)
    }

    def onRepository(alias: String, subProjection: RepositoryResponseProjection): RepositoryInfoResponseProjection = {
        fields.add(new GraphQLResponseField("...on Repository").alias(alias).projection(subProjection))
        this
    }

    def typename(): RepositoryInfoResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): RepositoryInfoResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
