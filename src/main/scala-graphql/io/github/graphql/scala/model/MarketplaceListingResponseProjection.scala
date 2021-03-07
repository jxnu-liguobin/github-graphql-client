package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for MarketplaceListing
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
class MarketplaceListingResponseProjection extends GraphQLResponseProjection {

    override def all$(): MarketplaceListingResponseProjection = all$(3)

    override def all$(maxDepth: Int): MarketplaceListingResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("MarketplaceListingResponseProjection.AppResponseProjection.app", 0) <= maxDepth) {
            projectionDepthOnFields.put("MarketplaceListingResponseProjection.AppResponseProjection.app", projectionDepthOnFields.getOrDefault("MarketplaceListingResponseProjection.AppResponseProjection.app", 0) + 1)
            this.app(new AppResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MarketplaceListingResponseProjection.AppResponseProjection.app", 0)))
        }
        this.companyUrl()
        this.configurationResourcePath()
        this.configurationUrl()
        this.documentationUrl()
        this.extendedDescription()
        this.extendedDescriptionHTML()
        this.fullDescription()
        this.fullDescriptionHTML()
        this.hasApprovalBeenRequested()
        this.hasPublishedFreeTrialPlans()
        this.hasTermsOfService()
        this.howItWorks()
        this.howItWorksHTML()
        this.id()
        this.installationUrl()
        this.installedForViewer()
        this.isApproved()
        this.isArchived()
        this.isDelisted()
        this.isDraft()
        this.isPaid()
        this.isPublic()
        this.isRejected()
        this.isUnverified()
        this.isUnverifiedPending()
        this.isVerificationPendingFromDraft()
        this.isVerificationPendingFromUnverified()
        this.isVerified()
        this.logoBackgroundColor()
        this.logoUrl()
        this.name()
        this.normalizedShortDescription()
        this.pricingUrl()
        if (projectionDepthOnFields.getOrDefault("MarketplaceListingResponseProjection.MarketplaceCategoryResponseProjection.primaryCategory", 0) <= maxDepth) {
            projectionDepthOnFields.put("MarketplaceListingResponseProjection.MarketplaceCategoryResponseProjection.primaryCategory", projectionDepthOnFields.getOrDefault("MarketplaceListingResponseProjection.MarketplaceCategoryResponseProjection.primaryCategory", 0) + 1)
            this.primaryCategory(new MarketplaceCategoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MarketplaceListingResponseProjection.MarketplaceCategoryResponseProjection.primaryCategory", 0)))
        }
        this.privacyPolicyUrl()
        this.resourcePath()
        this.screenshotUrls()
        if (projectionDepthOnFields.getOrDefault("MarketplaceListingResponseProjection.MarketplaceCategoryResponseProjection.secondaryCategory", 0) <= maxDepth) {
            projectionDepthOnFields.put("MarketplaceListingResponseProjection.MarketplaceCategoryResponseProjection.secondaryCategory", projectionDepthOnFields.getOrDefault("MarketplaceListingResponseProjection.MarketplaceCategoryResponseProjection.secondaryCategory", 0) + 1)
            this.secondaryCategory(new MarketplaceCategoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MarketplaceListingResponseProjection.MarketplaceCategoryResponseProjection.secondaryCategory", 0)))
        }
        this.shortDescription()
        this.slug()
        this.statusUrl()
        this.supportEmail()
        this.supportUrl()
        this.termsOfServiceUrl()
        this.url()
        this.viewerCanAddPlans()
        this.viewerCanApprove()
        this.viewerCanDelist()
        this.viewerCanEdit()
        this.viewerCanEditCategories()
        this.viewerCanEditPlans()
        this.viewerCanRedraft()
        this.viewerCanReject()
        this.viewerCanRequestApproval()
        this.viewerHasPurchased()
        this.viewerHasPurchasedForAllOrganizations()
        this.viewerIsListingAdmin()
        this.typename()
        this
    }

    def app(subProjection: AppResponseProjection): MarketplaceListingResponseProjection = {
        app(null.asInstanceOf[String], subProjection)
    }

    def app(alias: String, subProjection: AppResponseProjection): MarketplaceListingResponseProjection = {
        fields.add(new GraphQLResponseField("app").alias(alias).projection(subProjection))
        this
    }

    def companyUrl(): MarketplaceListingResponseProjection = {
        companyUrl(null.asInstanceOf[String])
    }

    def companyUrl(alias: String): MarketplaceListingResponseProjection = {
        fields.add(new GraphQLResponseField("companyUrl").alias(alias))
        this
    }

    def configurationResourcePath(): MarketplaceListingResponseProjection = {
        configurationResourcePath(null.asInstanceOf[String])
    }

    def configurationResourcePath(alias: String): MarketplaceListingResponseProjection = {
        fields.add(new GraphQLResponseField("configurationResourcePath").alias(alias))
        this
    }

    def configurationUrl(): MarketplaceListingResponseProjection = {
        configurationUrl(null.asInstanceOf[String])
    }

    def configurationUrl(alias: String): MarketplaceListingResponseProjection = {
        fields.add(new GraphQLResponseField("configurationUrl").alias(alias))
        this
    }

    def documentationUrl(): MarketplaceListingResponseProjection = {
        documentationUrl(null.asInstanceOf[String])
    }

    def documentationUrl(alias: String): MarketplaceListingResponseProjection = {
        fields.add(new GraphQLResponseField("documentationUrl").alias(alias))
        this
    }

    def extendedDescription(): MarketplaceListingResponseProjection = {
        extendedDescription(null.asInstanceOf[String])
    }

    def extendedDescription(alias: String): MarketplaceListingResponseProjection = {
        fields.add(new GraphQLResponseField("extendedDescription").alias(alias))
        this
    }

    def extendedDescriptionHTML(): MarketplaceListingResponseProjection = {
        extendedDescriptionHTML(null.asInstanceOf[String])
    }

    def extendedDescriptionHTML(alias: String): MarketplaceListingResponseProjection = {
        fields.add(new GraphQLResponseField("extendedDescriptionHTML").alias(alias))
        this
    }

    def fullDescription(): MarketplaceListingResponseProjection = {
        fullDescription(null.asInstanceOf[String])
    }

    def fullDescription(alias: String): MarketplaceListingResponseProjection = {
        fields.add(new GraphQLResponseField("fullDescription").alias(alias))
        this
    }

    def fullDescriptionHTML(): MarketplaceListingResponseProjection = {
        fullDescriptionHTML(null.asInstanceOf[String])
    }

    def fullDescriptionHTML(alias: String): MarketplaceListingResponseProjection = {
        fields.add(new GraphQLResponseField("fullDescriptionHTML").alias(alias))
        this
    }

    @deprecated(message = "`hasApprovalBeenRequested` will be removed. Use `isVerificationPendingFromDraft` instead. Removal on 2019-10-01 UTC.")
    def hasApprovalBeenRequested(): MarketplaceListingResponseProjection = {
        hasApprovalBeenRequested(null.asInstanceOf[String])
    }

    def hasApprovalBeenRequested(alias: String): MarketplaceListingResponseProjection = {
        fields.add(new GraphQLResponseField("hasApprovalBeenRequested").alias(alias))
        this
    }

    def hasPublishedFreeTrialPlans(): MarketplaceListingResponseProjection = {
        hasPublishedFreeTrialPlans(null.asInstanceOf[String])
    }

    def hasPublishedFreeTrialPlans(alias: String): MarketplaceListingResponseProjection = {
        fields.add(new GraphQLResponseField("hasPublishedFreeTrialPlans").alias(alias))
        this
    }

    def hasTermsOfService(): MarketplaceListingResponseProjection = {
        hasTermsOfService(null.asInstanceOf[String])
    }

    def hasTermsOfService(alias: String): MarketplaceListingResponseProjection = {
        fields.add(new GraphQLResponseField("hasTermsOfService").alias(alias))
        this
    }

    def howItWorks(): MarketplaceListingResponseProjection = {
        howItWorks(null.asInstanceOf[String])
    }

    def howItWorks(alias: String): MarketplaceListingResponseProjection = {
        fields.add(new GraphQLResponseField("howItWorks").alias(alias))
        this
    }

    def howItWorksHTML(): MarketplaceListingResponseProjection = {
        howItWorksHTML(null.asInstanceOf[String])
    }

    def howItWorksHTML(alias: String): MarketplaceListingResponseProjection = {
        fields.add(new GraphQLResponseField("howItWorksHTML").alias(alias))
        this
    }

    def id(): MarketplaceListingResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): MarketplaceListingResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def installationUrl(): MarketplaceListingResponseProjection = {
        installationUrl(null.asInstanceOf[String])
    }

    def installationUrl(alias: String): MarketplaceListingResponseProjection = {
        fields.add(new GraphQLResponseField("installationUrl").alias(alias))
        this
    }

    def installedForViewer(): MarketplaceListingResponseProjection = {
        installedForViewer(null.asInstanceOf[String])
    }

    def installedForViewer(alias: String): MarketplaceListingResponseProjection = {
        fields.add(new GraphQLResponseField("installedForViewer").alias(alias))
        this
    }

    @deprecated(message = "`isApproved` will be removed. Use `isPublic` instead. Removal on 2019-10-01 UTC.")
    def isApproved(): MarketplaceListingResponseProjection = {
        isApproved(null.asInstanceOf[String])
    }

    def isApproved(alias: String): MarketplaceListingResponseProjection = {
        fields.add(new GraphQLResponseField("isApproved").alias(alias))
        this
    }

    def isArchived(): MarketplaceListingResponseProjection = {
        isArchived(null.asInstanceOf[String])
    }

    def isArchived(alias: String): MarketplaceListingResponseProjection = {
        fields.add(new GraphQLResponseField("isArchived").alias(alias))
        this
    }

    @deprecated(message = "`isDelisted` will be removed. Use `isArchived` instead. Removal on 2019-10-01 UTC.")
    def isDelisted(): MarketplaceListingResponseProjection = {
        isDelisted(null.asInstanceOf[String])
    }

    def isDelisted(alias: String): MarketplaceListingResponseProjection = {
        fields.add(new GraphQLResponseField("isDelisted").alias(alias))
        this
    }

    def isDraft(): MarketplaceListingResponseProjection = {
        isDraft(null.asInstanceOf[String])
    }

    def isDraft(alias: String): MarketplaceListingResponseProjection = {
        fields.add(new GraphQLResponseField("isDraft").alias(alias))
        this
    }

    def isPaid(): MarketplaceListingResponseProjection = {
        isPaid(null.asInstanceOf[String])
    }

    def isPaid(alias: String): MarketplaceListingResponseProjection = {
        fields.add(new GraphQLResponseField("isPaid").alias(alias))
        this
    }

    def isPublic(): MarketplaceListingResponseProjection = {
        isPublic(null.asInstanceOf[String])
    }

    def isPublic(alias: String): MarketplaceListingResponseProjection = {
        fields.add(new GraphQLResponseField("isPublic").alias(alias))
        this
    }

    def isRejected(): MarketplaceListingResponseProjection = {
        isRejected(null.asInstanceOf[String])
    }

    def isRejected(alias: String): MarketplaceListingResponseProjection = {
        fields.add(new GraphQLResponseField("isRejected").alias(alias))
        this
    }

    def isUnverified(): MarketplaceListingResponseProjection = {
        isUnverified(null.asInstanceOf[String])
    }

    def isUnverified(alias: String): MarketplaceListingResponseProjection = {
        fields.add(new GraphQLResponseField("isUnverified").alias(alias))
        this
    }

    def isUnverifiedPending(): MarketplaceListingResponseProjection = {
        isUnverifiedPending(null.asInstanceOf[String])
    }

    def isUnverifiedPending(alias: String): MarketplaceListingResponseProjection = {
        fields.add(new GraphQLResponseField("isUnverifiedPending").alias(alias))
        this
    }

    def isVerificationPendingFromDraft(): MarketplaceListingResponseProjection = {
        isVerificationPendingFromDraft(null.asInstanceOf[String])
    }

    def isVerificationPendingFromDraft(alias: String): MarketplaceListingResponseProjection = {
        fields.add(new GraphQLResponseField("isVerificationPendingFromDraft").alias(alias))
        this
    }

    def isVerificationPendingFromUnverified(): MarketplaceListingResponseProjection = {
        isVerificationPendingFromUnverified(null.asInstanceOf[String])
    }

    def isVerificationPendingFromUnverified(alias: String): MarketplaceListingResponseProjection = {
        fields.add(new GraphQLResponseField("isVerificationPendingFromUnverified").alias(alias))
        this
    }

    def isVerified(): MarketplaceListingResponseProjection = {
        isVerified(null.asInstanceOf[String])
    }

    def isVerified(alias: String): MarketplaceListingResponseProjection = {
        fields.add(new GraphQLResponseField("isVerified").alias(alias))
        this
    }

    def logoBackgroundColor(): MarketplaceListingResponseProjection = {
        logoBackgroundColor(null.asInstanceOf[String])
    }

    def logoBackgroundColor(alias: String): MarketplaceListingResponseProjection = {
        fields.add(new GraphQLResponseField("logoBackgroundColor").alias(alias))
        this
    }

    def logoUrl(): MarketplaceListingResponseProjection = {
        logoUrl(null.asInstanceOf[String])
    }

    def logoUrl(alias: String): MarketplaceListingResponseProjection = {
        fields.add(new GraphQLResponseField("logoUrl").alias(alias))
        this
    }

    def logoUrl(input: MarketplaceListingLogoUrlParametrizedInput): MarketplaceListingResponseProjection = {
        logoUrl(null.asInstanceOf[String], input)
    }

    def logoUrl(alias: String, input: MarketplaceListingLogoUrlParametrizedInput ): MarketplaceListingResponseProjection = {
        fields.add(new GraphQLResponseField("logoUrl").alias(alias).parameters(input))
        this
    }

    def name(): MarketplaceListingResponseProjection = {
        name(null.asInstanceOf[String])
    }

    def name(alias: String): MarketplaceListingResponseProjection = {
        fields.add(new GraphQLResponseField("name").alias(alias))
        this
    }

    def normalizedShortDescription(): MarketplaceListingResponseProjection = {
        normalizedShortDescription(null.asInstanceOf[String])
    }

    def normalizedShortDescription(alias: String): MarketplaceListingResponseProjection = {
        fields.add(new GraphQLResponseField("normalizedShortDescription").alias(alias))
        this
    }

    def pricingUrl(): MarketplaceListingResponseProjection = {
        pricingUrl(null.asInstanceOf[String])
    }

    def pricingUrl(alias: String): MarketplaceListingResponseProjection = {
        fields.add(new GraphQLResponseField("pricingUrl").alias(alias))
        this
    }

    def primaryCategory(subProjection: MarketplaceCategoryResponseProjection): MarketplaceListingResponseProjection = {
        primaryCategory(null.asInstanceOf[String], subProjection)
    }

    def primaryCategory(alias: String, subProjection: MarketplaceCategoryResponseProjection): MarketplaceListingResponseProjection = {
        fields.add(new GraphQLResponseField("primaryCategory").alias(alias).projection(subProjection))
        this
    }

    def privacyPolicyUrl(): MarketplaceListingResponseProjection = {
        privacyPolicyUrl(null.asInstanceOf[String])
    }

    def privacyPolicyUrl(alias: String): MarketplaceListingResponseProjection = {
        fields.add(new GraphQLResponseField("privacyPolicyUrl").alias(alias))
        this
    }

    def resourcePath(): MarketplaceListingResponseProjection = {
        resourcePath(null.asInstanceOf[String])
    }

    def resourcePath(alias: String): MarketplaceListingResponseProjection = {
        fields.add(new GraphQLResponseField("resourcePath").alias(alias))
        this
    }

    def screenshotUrls(): MarketplaceListingResponseProjection = {
        screenshotUrls(null.asInstanceOf[String])
    }

    def screenshotUrls(alias: String): MarketplaceListingResponseProjection = {
        fields.add(new GraphQLResponseField("screenshotUrls").alias(alias))
        this
    }

    def secondaryCategory(subProjection: MarketplaceCategoryResponseProjection): MarketplaceListingResponseProjection = {
        secondaryCategory(null.asInstanceOf[String], subProjection)
    }

    def secondaryCategory(alias: String, subProjection: MarketplaceCategoryResponseProjection): MarketplaceListingResponseProjection = {
        fields.add(new GraphQLResponseField("secondaryCategory").alias(alias).projection(subProjection))
        this
    }

    def shortDescription(): MarketplaceListingResponseProjection = {
        shortDescription(null.asInstanceOf[String])
    }

    def shortDescription(alias: String): MarketplaceListingResponseProjection = {
        fields.add(new GraphQLResponseField("shortDescription").alias(alias))
        this
    }

    def slug(): MarketplaceListingResponseProjection = {
        slug(null.asInstanceOf[String])
    }

    def slug(alias: String): MarketplaceListingResponseProjection = {
        fields.add(new GraphQLResponseField("slug").alias(alias))
        this
    }

    def statusUrl(): MarketplaceListingResponseProjection = {
        statusUrl(null.asInstanceOf[String])
    }

    def statusUrl(alias: String): MarketplaceListingResponseProjection = {
        fields.add(new GraphQLResponseField("statusUrl").alias(alias))
        this
    }

    def supportEmail(): MarketplaceListingResponseProjection = {
        supportEmail(null.asInstanceOf[String])
    }

    def supportEmail(alias: String): MarketplaceListingResponseProjection = {
        fields.add(new GraphQLResponseField("supportEmail").alias(alias))
        this
    }

    def supportUrl(): MarketplaceListingResponseProjection = {
        supportUrl(null.asInstanceOf[String])
    }

    def supportUrl(alias: String): MarketplaceListingResponseProjection = {
        fields.add(new GraphQLResponseField("supportUrl").alias(alias))
        this
    }

    def termsOfServiceUrl(): MarketplaceListingResponseProjection = {
        termsOfServiceUrl(null.asInstanceOf[String])
    }

    def termsOfServiceUrl(alias: String): MarketplaceListingResponseProjection = {
        fields.add(new GraphQLResponseField("termsOfServiceUrl").alias(alias))
        this
    }

    def url(): MarketplaceListingResponseProjection = {
        url(null.asInstanceOf[String])
    }

    def url(alias: String): MarketplaceListingResponseProjection = {
        fields.add(new GraphQLResponseField("url").alias(alias))
        this
    }

    def viewerCanAddPlans(): MarketplaceListingResponseProjection = {
        viewerCanAddPlans(null.asInstanceOf[String])
    }

    def viewerCanAddPlans(alias: String): MarketplaceListingResponseProjection = {
        fields.add(new GraphQLResponseField("viewerCanAddPlans").alias(alias))
        this
    }

    def viewerCanApprove(): MarketplaceListingResponseProjection = {
        viewerCanApprove(null.asInstanceOf[String])
    }

    def viewerCanApprove(alias: String): MarketplaceListingResponseProjection = {
        fields.add(new GraphQLResponseField("viewerCanApprove").alias(alias))
        this
    }

    def viewerCanDelist(): MarketplaceListingResponseProjection = {
        viewerCanDelist(null.asInstanceOf[String])
    }

    def viewerCanDelist(alias: String): MarketplaceListingResponseProjection = {
        fields.add(new GraphQLResponseField("viewerCanDelist").alias(alias))
        this
    }

    def viewerCanEdit(): MarketplaceListingResponseProjection = {
        viewerCanEdit(null.asInstanceOf[String])
    }

    def viewerCanEdit(alias: String): MarketplaceListingResponseProjection = {
        fields.add(new GraphQLResponseField("viewerCanEdit").alias(alias))
        this
    }

    def viewerCanEditCategories(): MarketplaceListingResponseProjection = {
        viewerCanEditCategories(null.asInstanceOf[String])
    }

    def viewerCanEditCategories(alias: String): MarketplaceListingResponseProjection = {
        fields.add(new GraphQLResponseField("viewerCanEditCategories").alias(alias))
        this
    }

    def viewerCanEditPlans(): MarketplaceListingResponseProjection = {
        viewerCanEditPlans(null.asInstanceOf[String])
    }

    def viewerCanEditPlans(alias: String): MarketplaceListingResponseProjection = {
        fields.add(new GraphQLResponseField("viewerCanEditPlans").alias(alias))
        this
    }

    def viewerCanRedraft(): MarketplaceListingResponseProjection = {
        viewerCanRedraft(null.asInstanceOf[String])
    }

    def viewerCanRedraft(alias: String): MarketplaceListingResponseProjection = {
        fields.add(new GraphQLResponseField("viewerCanRedraft").alias(alias))
        this
    }

    def viewerCanReject(): MarketplaceListingResponseProjection = {
        viewerCanReject(null.asInstanceOf[String])
    }

    def viewerCanReject(alias: String): MarketplaceListingResponseProjection = {
        fields.add(new GraphQLResponseField("viewerCanReject").alias(alias))
        this
    }

    def viewerCanRequestApproval(): MarketplaceListingResponseProjection = {
        viewerCanRequestApproval(null.asInstanceOf[String])
    }

    def viewerCanRequestApproval(alias: String): MarketplaceListingResponseProjection = {
        fields.add(new GraphQLResponseField("viewerCanRequestApproval").alias(alias))
        this
    }

    def viewerHasPurchased(): MarketplaceListingResponseProjection = {
        viewerHasPurchased(null.asInstanceOf[String])
    }

    def viewerHasPurchased(alias: String): MarketplaceListingResponseProjection = {
        fields.add(new GraphQLResponseField("viewerHasPurchased").alias(alias))
        this
    }

    def viewerHasPurchasedForAllOrganizations(): MarketplaceListingResponseProjection = {
        viewerHasPurchasedForAllOrganizations(null.asInstanceOf[String])
    }

    def viewerHasPurchasedForAllOrganizations(alias: String): MarketplaceListingResponseProjection = {
        fields.add(new GraphQLResponseField("viewerHasPurchasedForAllOrganizations").alias(alias))
        this
    }

    def viewerIsListingAdmin(): MarketplaceListingResponseProjection = {
        viewerIsListingAdmin(null.asInstanceOf[String])
    }

    def viewerIsListingAdmin(alias: String): MarketplaceListingResponseProjection = {
        fields.add(new GraphQLResponseField("viewerIsListingAdmin").alias(alias))
        this
    }

    def typename(): MarketplaceListingResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): MarketplaceListingResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[MarketplaceListingResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
