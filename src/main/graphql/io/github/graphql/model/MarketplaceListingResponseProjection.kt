package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for MarketplaceListing
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class MarketplaceListingResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): MarketplaceListingResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): MarketplaceListingResponseProjection {
        if (projectionDepthOnFields.getOrDefault("MarketplaceListingResponseProjection.AppResponseProjection.app", 0) <= maxDepth) {
            projectionDepthOnFields["MarketplaceListingResponseProjection.AppResponseProjection.app"] = projectionDepthOnFields.getOrDefault("MarketplaceListingResponseProjection.AppResponseProjection.app", 0) + 1
            this.app(AppResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MarketplaceListingResponseProjection.AppResponseProjection.app", 0)))
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
            projectionDepthOnFields["MarketplaceListingResponseProjection.MarketplaceCategoryResponseProjection.primaryCategory"] = projectionDepthOnFields.getOrDefault("MarketplaceListingResponseProjection.MarketplaceCategoryResponseProjection.primaryCategory", 0) + 1
            this.primaryCategory(MarketplaceCategoryResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MarketplaceListingResponseProjection.MarketplaceCategoryResponseProjection.primaryCategory", 0)))
        }
        this.privacyPolicyUrl()
        this.resourcePath()
        this.screenshotUrls()
        if (projectionDepthOnFields.getOrDefault("MarketplaceListingResponseProjection.MarketplaceCategoryResponseProjection.secondaryCategory", 0) <= maxDepth) {
            projectionDepthOnFields["MarketplaceListingResponseProjection.MarketplaceCategoryResponseProjection.secondaryCategory"] = projectionDepthOnFields.getOrDefault("MarketplaceListingResponseProjection.MarketplaceCategoryResponseProjection.secondaryCategory", 0) + 1
            this.secondaryCategory(MarketplaceCategoryResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("MarketplaceListingResponseProjection.MarketplaceCategoryResponseProjection.secondaryCategory", 0)))
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
        return this
    }

    fun app(subProjection: AppResponseProjection): MarketplaceListingResponseProjection = app(null, subProjection)

    fun app(alias: String?, subProjection: AppResponseProjection): MarketplaceListingResponseProjection {
        fields.add(GraphQLResponseField("app").alias(alias).projection(subProjection))
        return this
    }

    fun companyUrl(): MarketplaceListingResponseProjection = companyUrl(null)

    fun companyUrl(alias: String?): MarketplaceListingResponseProjection {
        fields.add(GraphQLResponseField("companyUrl").alias(alias))
        return this
    }

    fun configurationResourcePath(): MarketplaceListingResponseProjection = configurationResourcePath(null)

    fun configurationResourcePath(alias: String?): MarketplaceListingResponseProjection {
        fields.add(GraphQLResponseField("configurationResourcePath").alias(alias))
        return this
    }

    fun configurationUrl(): MarketplaceListingResponseProjection = configurationUrl(null)

    fun configurationUrl(alias: String?): MarketplaceListingResponseProjection {
        fields.add(GraphQLResponseField("configurationUrl").alias(alias))
        return this
    }

    fun documentationUrl(): MarketplaceListingResponseProjection = documentationUrl(null)

    fun documentationUrl(alias: String?): MarketplaceListingResponseProjection {
        fields.add(GraphQLResponseField("documentationUrl").alias(alias))
        return this
    }

    fun extendedDescription(): MarketplaceListingResponseProjection = extendedDescription(null)

    fun extendedDescription(alias: String?): MarketplaceListingResponseProjection {
        fields.add(GraphQLResponseField("extendedDescription").alias(alias))
        return this
    }

    fun extendedDescriptionHTML(): MarketplaceListingResponseProjection = extendedDescriptionHTML(null)

    fun extendedDescriptionHTML(alias: String?): MarketplaceListingResponseProjection {
        fields.add(GraphQLResponseField("extendedDescriptionHTML").alias(alias))
        return this
    }

    fun fullDescription(): MarketplaceListingResponseProjection = fullDescription(null)

    fun fullDescription(alias: String?): MarketplaceListingResponseProjection {
        fields.add(GraphQLResponseField("fullDescription").alias(alias))
        return this
    }

    fun fullDescriptionHTML(): MarketplaceListingResponseProjection = fullDescriptionHTML(null)

    fun fullDescriptionHTML(alias: String?): MarketplaceListingResponseProjection {
        fields.add(GraphQLResponseField("fullDescriptionHTML").alias(alias))
        return this
    }

    @Deprecated(message = "`hasApprovalBeenRequested` will be removed. Use `isVerificationPendingFromDraft` instead. Removal on 2019-10-01 UTC.")
    fun hasApprovalBeenRequested(): MarketplaceListingResponseProjection = hasApprovalBeenRequested(null)

    fun hasApprovalBeenRequested(alias: String?): MarketplaceListingResponseProjection {
        fields.add(GraphQLResponseField("hasApprovalBeenRequested").alias(alias))
        return this
    }

    fun hasPublishedFreeTrialPlans(): MarketplaceListingResponseProjection = hasPublishedFreeTrialPlans(null)

    fun hasPublishedFreeTrialPlans(alias: String?): MarketplaceListingResponseProjection {
        fields.add(GraphQLResponseField("hasPublishedFreeTrialPlans").alias(alias))
        return this
    }

    fun hasTermsOfService(): MarketplaceListingResponseProjection = hasTermsOfService(null)

    fun hasTermsOfService(alias: String?): MarketplaceListingResponseProjection {
        fields.add(GraphQLResponseField("hasTermsOfService").alias(alias))
        return this
    }

    fun howItWorks(): MarketplaceListingResponseProjection = howItWorks(null)

    fun howItWorks(alias: String?): MarketplaceListingResponseProjection {
        fields.add(GraphQLResponseField("howItWorks").alias(alias))
        return this
    }

    fun howItWorksHTML(): MarketplaceListingResponseProjection = howItWorksHTML(null)

    fun howItWorksHTML(alias: String?): MarketplaceListingResponseProjection {
        fields.add(GraphQLResponseField("howItWorksHTML").alias(alias))
        return this
    }

    fun id(): MarketplaceListingResponseProjection = id(null)

    fun id(alias: String?): MarketplaceListingResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun installationUrl(): MarketplaceListingResponseProjection = installationUrl(null)

    fun installationUrl(alias: String?): MarketplaceListingResponseProjection {
        fields.add(GraphQLResponseField("installationUrl").alias(alias))
        return this
    }

    fun installedForViewer(): MarketplaceListingResponseProjection = installedForViewer(null)

    fun installedForViewer(alias: String?): MarketplaceListingResponseProjection {
        fields.add(GraphQLResponseField("installedForViewer").alias(alias))
        return this
    }

    @Deprecated(message = "`isApproved` will be removed. Use `isPublic` instead. Removal on 2019-10-01 UTC.")
    fun isApproved(): MarketplaceListingResponseProjection = isApproved(null)

    fun isApproved(alias: String?): MarketplaceListingResponseProjection {
        fields.add(GraphQLResponseField("isApproved").alias(alias))
        return this
    }

    fun isArchived(): MarketplaceListingResponseProjection = isArchived(null)

    fun isArchived(alias: String?): MarketplaceListingResponseProjection {
        fields.add(GraphQLResponseField("isArchived").alias(alias))
        return this
    }

    @Deprecated(message = "`isDelisted` will be removed. Use `isArchived` instead. Removal on 2019-10-01 UTC.")
    fun isDelisted(): MarketplaceListingResponseProjection = isDelisted(null)

    fun isDelisted(alias: String?): MarketplaceListingResponseProjection {
        fields.add(GraphQLResponseField("isDelisted").alias(alias))
        return this
    }

    fun isDraft(): MarketplaceListingResponseProjection = isDraft(null)

    fun isDraft(alias: String?): MarketplaceListingResponseProjection {
        fields.add(GraphQLResponseField("isDraft").alias(alias))
        return this
    }

    fun isPaid(): MarketplaceListingResponseProjection = isPaid(null)

    fun isPaid(alias: String?): MarketplaceListingResponseProjection {
        fields.add(GraphQLResponseField("isPaid").alias(alias))
        return this
    }

    fun isPublic(): MarketplaceListingResponseProjection = isPublic(null)

    fun isPublic(alias: String?): MarketplaceListingResponseProjection {
        fields.add(GraphQLResponseField("isPublic").alias(alias))
        return this
    }

    fun isRejected(): MarketplaceListingResponseProjection = isRejected(null)

    fun isRejected(alias: String?): MarketplaceListingResponseProjection {
        fields.add(GraphQLResponseField("isRejected").alias(alias))
        return this
    }

    fun isUnverified(): MarketplaceListingResponseProjection = isUnverified(null)

    fun isUnverified(alias: String?): MarketplaceListingResponseProjection {
        fields.add(GraphQLResponseField("isUnverified").alias(alias))
        return this
    }

    fun isUnverifiedPending(): MarketplaceListingResponseProjection = isUnverifiedPending(null)

    fun isUnverifiedPending(alias: String?): MarketplaceListingResponseProjection {
        fields.add(GraphQLResponseField("isUnverifiedPending").alias(alias))
        return this
    }

    fun isVerificationPendingFromDraft(): MarketplaceListingResponseProjection = isVerificationPendingFromDraft(null)

    fun isVerificationPendingFromDraft(alias: String?): MarketplaceListingResponseProjection {
        fields.add(GraphQLResponseField("isVerificationPendingFromDraft").alias(alias))
        return this
    }

    fun isVerificationPendingFromUnverified(): MarketplaceListingResponseProjection = isVerificationPendingFromUnverified(null)

    fun isVerificationPendingFromUnverified(alias: String?): MarketplaceListingResponseProjection {
        fields.add(GraphQLResponseField("isVerificationPendingFromUnverified").alias(alias))
        return this
    }

    fun isVerified(): MarketplaceListingResponseProjection = isVerified(null)

    fun isVerified(alias: String?): MarketplaceListingResponseProjection {
        fields.add(GraphQLResponseField("isVerified").alias(alias))
        return this
    }

    fun logoBackgroundColor(): MarketplaceListingResponseProjection = logoBackgroundColor(null)

    fun logoBackgroundColor(alias: String?): MarketplaceListingResponseProjection {
        fields.add(GraphQLResponseField("logoBackgroundColor").alias(alias))
        return this
    }

    fun logoUrl(): MarketplaceListingResponseProjection = logoUrl(null)

    fun logoUrl(alias: String?): MarketplaceListingResponseProjection {
        fields.add(GraphQLResponseField("logoUrl").alias(alias))
        return this
    }

    fun logoUrl(input: MarketplaceListingLogoUrlParametrizedInput): MarketplaceListingResponseProjection = logoUrl(null, input)

    fun logoUrl(alias: String?, input: MarketplaceListingLogoUrlParametrizedInput): MarketplaceListingResponseProjection {
        fields.add(GraphQLResponseField("logoUrl").alias(alias).parameters(input))
        return this
    }

    fun name(): MarketplaceListingResponseProjection = name(null)

    fun name(alias: String?): MarketplaceListingResponseProjection {
        fields.add(GraphQLResponseField("name").alias(alias))
        return this
    }

    fun normalizedShortDescription(): MarketplaceListingResponseProjection = normalizedShortDescription(null)

    fun normalizedShortDescription(alias: String?): MarketplaceListingResponseProjection {
        fields.add(GraphQLResponseField("normalizedShortDescription").alias(alias))
        return this
    }

    fun pricingUrl(): MarketplaceListingResponseProjection = pricingUrl(null)

    fun pricingUrl(alias: String?): MarketplaceListingResponseProjection {
        fields.add(GraphQLResponseField("pricingUrl").alias(alias))
        return this
    }

    fun primaryCategory(subProjection: MarketplaceCategoryResponseProjection): MarketplaceListingResponseProjection = primaryCategory(null, subProjection)

    fun primaryCategory(alias: String?, subProjection: MarketplaceCategoryResponseProjection): MarketplaceListingResponseProjection {
        fields.add(GraphQLResponseField("primaryCategory").alias(alias).projection(subProjection))
        return this
    }

    fun privacyPolicyUrl(): MarketplaceListingResponseProjection = privacyPolicyUrl(null)

    fun privacyPolicyUrl(alias: String?): MarketplaceListingResponseProjection {
        fields.add(GraphQLResponseField("privacyPolicyUrl").alias(alias))
        return this
    }

    fun resourcePath(): MarketplaceListingResponseProjection = resourcePath(null)

    fun resourcePath(alias: String?): MarketplaceListingResponseProjection {
        fields.add(GraphQLResponseField("resourcePath").alias(alias))
        return this
    }

    fun screenshotUrls(): MarketplaceListingResponseProjection = screenshotUrls(null)

    fun screenshotUrls(alias: String?): MarketplaceListingResponseProjection {
        fields.add(GraphQLResponseField("screenshotUrls").alias(alias))
        return this
    }

    fun secondaryCategory(subProjection: MarketplaceCategoryResponseProjection): MarketplaceListingResponseProjection = secondaryCategory(null, subProjection)

    fun secondaryCategory(alias: String?, subProjection: MarketplaceCategoryResponseProjection): MarketplaceListingResponseProjection {
        fields.add(GraphQLResponseField("secondaryCategory").alias(alias).projection(subProjection))
        return this
    }

    fun shortDescription(): MarketplaceListingResponseProjection = shortDescription(null)

    fun shortDescription(alias: String?): MarketplaceListingResponseProjection {
        fields.add(GraphQLResponseField("shortDescription").alias(alias))
        return this
    }

    fun slug(): MarketplaceListingResponseProjection = slug(null)

    fun slug(alias: String?): MarketplaceListingResponseProjection {
        fields.add(GraphQLResponseField("slug").alias(alias))
        return this
    }

    fun statusUrl(): MarketplaceListingResponseProjection = statusUrl(null)

    fun statusUrl(alias: String?): MarketplaceListingResponseProjection {
        fields.add(GraphQLResponseField("statusUrl").alias(alias))
        return this
    }

    fun supportEmail(): MarketplaceListingResponseProjection = supportEmail(null)

    fun supportEmail(alias: String?): MarketplaceListingResponseProjection {
        fields.add(GraphQLResponseField("supportEmail").alias(alias))
        return this
    }

    fun supportUrl(): MarketplaceListingResponseProjection = supportUrl(null)

    fun supportUrl(alias: String?): MarketplaceListingResponseProjection {
        fields.add(GraphQLResponseField("supportUrl").alias(alias))
        return this
    }

    fun termsOfServiceUrl(): MarketplaceListingResponseProjection = termsOfServiceUrl(null)

    fun termsOfServiceUrl(alias: String?): MarketplaceListingResponseProjection {
        fields.add(GraphQLResponseField("termsOfServiceUrl").alias(alias))
        return this
    }

    fun url(): MarketplaceListingResponseProjection = url(null)

    fun url(alias: String?): MarketplaceListingResponseProjection {
        fields.add(GraphQLResponseField("url").alias(alias))
        return this
    }

    fun viewerCanAddPlans(): MarketplaceListingResponseProjection = viewerCanAddPlans(null)

    fun viewerCanAddPlans(alias: String?): MarketplaceListingResponseProjection {
        fields.add(GraphQLResponseField("viewerCanAddPlans").alias(alias))
        return this
    }

    fun viewerCanApprove(): MarketplaceListingResponseProjection = viewerCanApprove(null)

    fun viewerCanApprove(alias: String?): MarketplaceListingResponseProjection {
        fields.add(GraphQLResponseField("viewerCanApprove").alias(alias))
        return this
    }

    fun viewerCanDelist(): MarketplaceListingResponseProjection = viewerCanDelist(null)

    fun viewerCanDelist(alias: String?): MarketplaceListingResponseProjection {
        fields.add(GraphQLResponseField("viewerCanDelist").alias(alias))
        return this
    }

    fun viewerCanEdit(): MarketplaceListingResponseProjection = viewerCanEdit(null)

    fun viewerCanEdit(alias: String?): MarketplaceListingResponseProjection {
        fields.add(GraphQLResponseField("viewerCanEdit").alias(alias))
        return this
    }

    fun viewerCanEditCategories(): MarketplaceListingResponseProjection = viewerCanEditCategories(null)

    fun viewerCanEditCategories(alias: String?): MarketplaceListingResponseProjection {
        fields.add(GraphQLResponseField("viewerCanEditCategories").alias(alias))
        return this
    }

    fun viewerCanEditPlans(): MarketplaceListingResponseProjection = viewerCanEditPlans(null)

    fun viewerCanEditPlans(alias: String?): MarketplaceListingResponseProjection {
        fields.add(GraphQLResponseField("viewerCanEditPlans").alias(alias))
        return this
    }

    fun viewerCanRedraft(): MarketplaceListingResponseProjection = viewerCanRedraft(null)

    fun viewerCanRedraft(alias: String?): MarketplaceListingResponseProjection {
        fields.add(GraphQLResponseField("viewerCanRedraft").alias(alias))
        return this
    }

    fun viewerCanReject(): MarketplaceListingResponseProjection = viewerCanReject(null)

    fun viewerCanReject(alias: String?): MarketplaceListingResponseProjection {
        fields.add(GraphQLResponseField("viewerCanReject").alias(alias))
        return this
    }

    fun viewerCanRequestApproval(): MarketplaceListingResponseProjection = viewerCanRequestApproval(null)

    fun viewerCanRequestApproval(alias: String?): MarketplaceListingResponseProjection {
        fields.add(GraphQLResponseField("viewerCanRequestApproval").alias(alias))
        return this
    }

    fun viewerHasPurchased(): MarketplaceListingResponseProjection = viewerHasPurchased(null)

    fun viewerHasPurchased(alias: String?): MarketplaceListingResponseProjection {
        fields.add(GraphQLResponseField("viewerHasPurchased").alias(alias))
        return this
    }

    fun viewerHasPurchasedForAllOrganizations(): MarketplaceListingResponseProjection = viewerHasPurchasedForAllOrganizations(null)

    fun viewerHasPurchasedForAllOrganizations(alias: String?): MarketplaceListingResponseProjection {
        fields.add(GraphQLResponseField("viewerHasPurchasedForAllOrganizations").alias(alias))
        return this
    }

    fun viewerIsListingAdmin(): MarketplaceListingResponseProjection = viewerIsListingAdmin(null)

    fun viewerIsListingAdmin(alias: String?): MarketplaceListingResponseProjection {
        fields.add(GraphQLResponseField("viewerIsListingAdmin").alias(alias))
        return this
    }

    fun typename(): MarketplaceListingResponseProjection = typename(null)

    fun typename(alias: String?): MarketplaceListingResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
