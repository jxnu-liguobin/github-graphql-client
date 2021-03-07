package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class MarketplaceListingTO(
    app: AppTO,
    companyUrl: String,
    @javax.validation.constraints.NotNull
    configurationResourcePath: String,
    @javax.validation.constraints.NotNull
    configurationUrl: String,
    documentationUrl: String,
    extendedDescription: String,
    @javax.validation.constraints.NotNull
    extendedDescriptionHTML: String,
    @javax.validation.constraints.NotNull
    fullDescription: String,
    @javax.validation.constraints.NotNull
    fullDescriptionHTML: String,
    @deprecated(message = "`hasApprovalBeenRequested` will be removed. Use `isVerificationPendingFromDraft` instead. Removal on 2019-10-01 UTC.")
    hasApprovalBeenRequested: Boolean,
    hasPublishedFreeTrialPlans: Boolean,
    hasTermsOfService: Boolean,
    howItWorks: String,
    @javax.validation.constraints.NotNull
    howItWorksHTML: String,
    @javax.validation.constraints.NotNull
    override val id: String,
    installationUrl: String,
    installedForViewer: Boolean,
    @deprecated(message = "`isApproved` will be removed. Use `isPublic` instead. Removal on 2019-10-01 UTC.")
    isApproved: Boolean,
    isArchived: Boolean,
    @deprecated(message = "`isDelisted` will be removed. Use `isArchived` instead. Removal on 2019-10-01 UTC.")
    isDelisted: Boolean,
    isDraft: Boolean,
    isPaid: Boolean,
    isPublic: Boolean,
    isRejected: Boolean,
    isUnverified: Boolean,
    isUnverifiedPending: Boolean,
    isVerificationPendingFromDraft: Boolean,
    isVerificationPendingFromUnverified: Boolean,
    isVerified: Boolean,
    @javax.validation.constraints.NotNull
    logoBackgroundColor: String,
    @javax.validation.constraints.NotNull
    name: String,
    @javax.validation.constraints.NotNull
    normalizedShortDescription: String,
    pricingUrl: String,
    @javax.validation.constraints.NotNull
    primaryCategory: MarketplaceCategoryTO,
    @javax.validation.constraints.NotNull
    privacyPolicyUrl: String,
    @javax.validation.constraints.NotNull
    resourcePath: String,
    @javax.validation.constraints.NotNull
    screenshotUrls: Seq[String],
    secondaryCategory: MarketplaceCategoryTO,
    @javax.validation.constraints.NotNull
    shortDescription: String,
    @javax.validation.constraints.NotNull
    slug: String,
    statusUrl: String,
    supportEmail: String,
    @javax.validation.constraints.NotNull
    supportUrl: String,
    termsOfServiceUrl: String,
    @javax.validation.constraints.NotNull
    url: String,
    viewerCanAddPlans: Boolean,
    viewerCanApprove: Boolean,
    viewerCanDelist: Boolean,
    viewerCanEdit: Boolean,
    viewerCanEditCategories: Boolean,
    viewerCanEditPlans: Boolean,
    viewerCanRedraft: Boolean,
    viewerCanReject: Boolean,
    viewerCanRequestApproval: Boolean,
    viewerHasPurchased: Boolean,
    viewerHasPurchasedForAllOrganizations: Boolean,
    viewerIsListingAdmin: Boolean
) extends SearchResultItemTO with NodeTO {

    override def toString(): String = {
        Seq(
            if (app != null) "app: " + GraphQLRequestSerializer.getEntry(app) else "",
            if (companyUrl != null) "companyUrl: " + GraphQLRequestSerializer.getEntry(companyUrl) else "",
            if (configurationResourcePath != null) "configurationResourcePath: " + GraphQLRequestSerializer.getEntry(configurationResourcePath) else "",
            if (configurationUrl != null) "configurationUrl: " + GraphQLRequestSerializer.getEntry(configurationUrl) else "",
            if (documentationUrl != null) "documentationUrl: " + GraphQLRequestSerializer.getEntry(documentationUrl) else "",
            if (extendedDescription != null) "extendedDescription: " + GraphQLRequestSerializer.getEntry(extendedDescription) else "",
            if (extendedDescriptionHTML != null) "extendedDescriptionHTML: " + GraphQLRequestSerializer.getEntry(extendedDescriptionHTML) else "",
            if (fullDescription != null) "fullDescription: " + GraphQLRequestSerializer.getEntry(fullDescription) else "",
            if (fullDescriptionHTML != null) "fullDescriptionHTML: " + GraphQLRequestSerializer.getEntry(fullDescriptionHTML) else "",
            "hasApprovalBeenRequested: " + GraphQLRequestSerializer.getEntry(hasApprovalBeenRequested),
            "hasPublishedFreeTrialPlans: " + GraphQLRequestSerializer.getEntry(hasPublishedFreeTrialPlans),
            "hasTermsOfService: " + GraphQLRequestSerializer.getEntry(hasTermsOfService),
            if (howItWorks != null) "howItWorks: " + GraphQLRequestSerializer.getEntry(howItWorks) else "",
            if (howItWorksHTML != null) "howItWorksHTML: " + GraphQLRequestSerializer.getEntry(howItWorksHTML) else "",
            if (id != null) "id: " + GraphQLRequestSerializer.getEntry(id) else "",
            if (installationUrl != null) "installationUrl: " + GraphQLRequestSerializer.getEntry(installationUrl) else "",
            "installedForViewer: " + GraphQLRequestSerializer.getEntry(installedForViewer),
            "isApproved: " + GraphQLRequestSerializer.getEntry(isApproved),
            "isArchived: " + GraphQLRequestSerializer.getEntry(isArchived),
            "isDelisted: " + GraphQLRequestSerializer.getEntry(isDelisted),
            "isDraft: " + GraphQLRequestSerializer.getEntry(isDraft),
            "isPaid: " + GraphQLRequestSerializer.getEntry(isPaid),
            "isPublic: " + GraphQLRequestSerializer.getEntry(isPublic),
            "isRejected: " + GraphQLRequestSerializer.getEntry(isRejected),
            "isUnverified: " + GraphQLRequestSerializer.getEntry(isUnverified),
            "isUnverifiedPending: " + GraphQLRequestSerializer.getEntry(isUnverifiedPending),
            "isVerificationPendingFromDraft: " + GraphQLRequestSerializer.getEntry(isVerificationPendingFromDraft),
            "isVerificationPendingFromUnverified: " + GraphQLRequestSerializer.getEntry(isVerificationPendingFromUnverified),
            "isVerified: " + GraphQLRequestSerializer.getEntry(isVerified),
            if (logoBackgroundColor != null) "logoBackgroundColor: " + GraphQLRequestSerializer.getEntry(logoBackgroundColor) else "",
            if (name != null) "name: " + GraphQLRequestSerializer.getEntry(name) else "",
            if (normalizedShortDescription != null) "normalizedShortDescription: " + GraphQLRequestSerializer.getEntry(normalizedShortDescription) else "",
            if (pricingUrl != null) "pricingUrl: " + GraphQLRequestSerializer.getEntry(pricingUrl) else "",
            if (primaryCategory != null) "primaryCategory: " + GraphQLRequestSerializer.getEntry(primaryCategory) else "",
            if (privacyPolicyUrl != null) "privacyPolicyUrl: " + GraphQLRequestSerializer.getEntry(privacyPolicyUrl) else "",
            if (resourcePath != null) "resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath) else "",
            if (screenshotUrls != null) "screenshotUrls: " + GraphQLRequestSerializer.getEntry(screenshotUrls.asJava) else "",
            if (secondaryCategory != null) "secondaryCategory: " + GraphQLRequestSerializer.getEntry(secondaryCategory) else "",
            if (shortDescription != null) "shortDescription: " + GraphQLRequestSerializer.getEntry(shortDescription) else "",
            if (slug != null) "slug: " + GraphQLRequestSerializer.getEntry(slug) else "",
            if (statusUrl != null) "statusUrl: " + GraphQLRequestSerializer.getEntry(statusUrl) else "",
            if (supportEmail != null) "supportEmail: " + GraphQLRequestSerializer.getEntry(supportEmail) else "",
            if (supportUrl != null) "supportUrl: " + GraphQLRequestSerializer.getEntry(supportUrl) else "",
            if (termsOfServiceUrl != null) "termsOfServiceUrl: " + GraphQLRequestSerializer.getEntry(termsOfServiceUrl) else "",
            if (url != null) "url: " + GraphQLRequestSerializer.getEntry(url) else "",
            "viewerCanAddPlans: " + GraphQLRequestSerializer.getEntry(viewerCanAddPlans),
            "viewerCanApprove: " + GraphQLRequestSerializer.getEntry(viewerCanApprove),
            "viewerCanDelist: " + GraphQLRequestSerializer.getEntry(viewerCanDelist),
            "viewerCanEdit: " + GraphQLRequestSerializer.getEntry(viewerCanEdit),
            "viewerCanEditCategories: " + GraphQLRequestSerializer.getEntry(viewerCanEditCategories),
            "viewerCanEditPlans: " + GraphQLRequestSerializer.getEntry(viewerCanEditPlans),
            "viewerCanRedraft: " + GraphQLRequestSerializer.getEntry(viewerCanRedraft),
            "viewerCanReject: " + GraphQLRequestSerializer.getEntry(viewerCanReject),
            "viewerCanRequestApproval: " + GraphQLRequestSerializer.getEntry(viewerCanRequestApproval),
            "viewerHasPurchased: " + GraphQLRequestSerializer.getEntry(viewerHasPurchased),
            "viewerHasPurchasedForAllOrganizations: " + GraphQLRequestSerializer.getEntry(viewerHasPurchasedForAllOrganizations),
            "viewerIsListingAdmin: " + GraphQLRequestSerializer.getEntry(viewerIsListingAdmin)
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object MarketplaceListingTO {

    def builder(): MarketplaceListingTO.Builder = new Builder()

    class Builder {

        private var app: AppTO = _
        private var companyUrl: String = _
        private var configurationResourcePath: String = _
        private var configurationUrl: String = _
        private var documentationUrl: String = _
        private var extendedDescription: String = _
        private var extendedDescriptionHTML: String = _
        private var fullDescription: String = _
        private var fullDescriptionHTML: String = _
        private var hasApprovalBeenRequested: Boolean = _
        private var hasPublishedFreeTrialPlans: Boolean = _
        private var hasTermsOfService: Boolean = _
        private var howItWorks: String = _
        private var howItWorksHTML: String = _
        private var id: String = _
        private var installationUrl: String = _
        private var installedForViewer: Boolean = _
        private var isApproved: Boolean = _
        private var isArchived: Boolean = _
        private var isDelisted: Boolean = _
        private var isDraft: Boolean = _
        private var isPaid: Boolean = _
        private var isPublic: Boolean = _
        private var isRejected: Boolean = _
        private var isUnverified: Boolean = _
        private var isUnverifiedPending: Boolean = _
        private var isVerificationPendingFromDraft: Boolean = _
        private var isVerificationPendingFromUnverified: Boolean = _
        private var isVerified: Boolean = _
        private var logoBackgroundColor: String = _
        private var name: String = _
        private var normalizedShortDescription: String = _
        private var pricingUrl: String = _
        private var primaryCategory: MarketplaceCategoryTO = _
        private var privacyPolicyUrl: String = _
        private var resourcePath: String = _
        private var screenshotUrls: Seq[String] = _
        private var secondaryCategory: MarketplaceCategoryTO = _
        private var shortDescription: String = _
        private var slug: String = _
        private var statusUrl: String = _
        private var supportEmail: String = _
        private var supportUrl: String = _
        private var termsOfServiceUrl: String = _
        private var url: String = _
        private var viewerCanAddPlans: Boolean = _
        private var viewerCanApprove: Boolean = _
        private var viewerCanDelist: Boolean = _
        private var viewerCanEdit: Boolean = _
        private var viewerCanEditCategories: Boolean = _
        private var viewerCanEditPlans: Boolean = _
        private var viewerCanRedraft: Boolean = _
        private var viewerCanReject: Boolean = _
        private var viewerCanRequestApproval: Boolean = _
        private var viewerHasPurchased: Boolean = _
        private var viewerHasPurchasedForAllOrganizations: Boolean = _
        private var viewerIsListingAdmin: Boolean = _

        def setApp(app: AppTO): Builder = {
            this.app = app
            this
        }

        def setCompanyUrl(companyUrl: String): Builder = {
            this.companyUrl = companyUrl
            this
        }

        def setConfigurationResourcePath(configurationResourcePath: String): Builder = {
            this.configurationResourcePath = configurationResourcePath
            this
        }

        def setConfigurationUrl(configurationUrl: String): Builder = {
            this.configurationUrl = configurationUrl
            this
        }

        def setDocumentationUrl(documentationUrl: String): Builder = {
            this.documentationUrl = documentationUrl
            this
        }

        def setExtendedDescription(extendedDescription: String): Builder = {
            this.extendedDescription = extendedDescription
            this
        }

        def setExtendedDescriptionHTML(extendedDescriptionHTML: String): Builder = {
            this.extendedDescriptionHTML = extendedDescriptionHTML
            this
        }

        def setFullDescription(fullDescription: String): Builder = {
            this.fullDescription = fullDescription
            this
        }

        def setFullDescriptionHTML(fullDescriptionHTML: String): Builder = {
            this.fullDescriptionHTML = fullDescriptionHTML
            this
        }

        @deprecated(message = "`hasApprovalBeenRequested` will be removed. Use `isVerificationPendingFromDraft` instead. Removal on 2019-10-01 UTC.")
        def setHasApprovalBeenRequested(hasApprovalBeenRequested: Boolean): Builder = {
            this.hasApprovalBeenRequested = hasApprovalBeenRequested
            this
        }

        def setHasPublishedFreeTrialPlans(hasPublishedFreeTrialPlans: Boolean): Builder = {
            this.hasPublishedFreeTrialPlans = hasPublishedFreeTrialPlans
            this
        }

        def setHasTermsOfService(hasTermsOfService: Boolean): Builder = {
            this.hasTermsOfService = hasTermsOfService
            this
        }

        def setHowItWorks(howItWorks: String): Builder = {
            this.howItWorks = howItWorks
            this
        }

        def setHowItWorksHTML(howItWorksHTML: String): Builder = {
            this.howItWorksHTML = howItWorksHTML
            this
        }

        def setId(id: String): Builder = {
            this.id = id
            this
        }

        def setInstallationUrl(installationUrl: String): Builder = {
            this.installationUrl = installationUrl
            this
        }

        def setInstalledForViewer(installedForViewer: Boolean): Builder = {
            this.installedForViewer = installedForViewer
            this
        }

        @deprecated(message = "`isApproved` will be removed. Use `isPublic` instead. Removal on 2019-10-01 UTC.")
        def setIsApproved(isApproved: Boolean): Builder = {
            this.isApproved = isApproved
            this
        }

        def setIsArchived(isArchived: Boolean): Builder = {
            this.isArchived = isArchived
            this
        }

        @deprecated(message = "`isDelisted` will be removed. Use `isArchived` instead. Removal on 2019-10-01 UTC.")
        def setIsDelisted(isDelisted: Boolean): Builder = {
            this.isDelisted = isDelisted
            this
        }

        def setIsDraft(isDraft: Boolean): Builder = {
            this.isDraft = isDraft
            this
        }

        def setIsPaid(isPaid: Boolean): Builder = {
            this.isPaid = isPaid
            this
        }

        def setIsPublic(isPublic: Boolean): Builder = {
            this.isPublic = isPublic
            this
        }

        def setIsRejected(isRejected: Boolean): Builder = {
            this.isRejected = isRejected
            this
        }

        def setIsUnverified(isUnverified: Boolean): Builder = {
            this.isUnverified = isUnverified
            this
        }

        def setIsUnverifiedPending(isUnverifiedPending: Boolean): Builder = {
            this.isUnverifiedPending = isUnverifiedPending
            this
        }

        def setIsVerificationPendingFromDraft(isVerificationPendingFromDraft: Boolean): Builder = {
            this.isVerificationPendingFromDraft = isVerificationPendingFromDraft
            this
        }

        def setIsVerificationPendingFromUnverified(isVerificationPendingFromUnverified: Boolean): Builder = {
            this.isVerificationPendingFromUnverified = isVerificationPendingFromUnverified
            this
        }

        def setIsVerified(isVerified: Boolean): Builder = {
            this.isVerified = isVerified
            this
        }

        def setLogoBackgroundColor(logoBackgroundColor: String): Builder = {
            this.logoBackgroundColor = logoBackgroundColor
            this
        }

        def setName(name: String): Builder = {
            this.name = name
            this
        }

        def setNormalizedShortDescription(normalizedShortDescription: String): Builder = {
            this.normalizedShortDescription = normalizedShortDescription
            this
        }

        def setPricingUrl(pricingUrl: String): Builder = {
            this.pricingUrl = pricingUrl
            this
        }

        def setPrimaryCategory(primaryCategory: MarketplaceCategoryTO): Builder = {
            this.primaryCategory = primaryCategory
            this
        }

        def setPrivacyPolicyUrl(privacyPolicyUrl: String): Builder = {
            this.privacyPolicyUrl = privacyPolicyUrl
            this
        }

        def setResourcePath(resourcePath: String): Builder = {
            this.resourcePath = resourcePath
            this
        }

        def setScreenshotUrls(screenshotUrls: Seq[String]): Builder = {
            this.screenshotUrls = screenshotUrls
            this
        }

        def setSecondaryCategory(secondaryCategory: MarketplaceCategoryTO): Builder = {
            this.secondaryCategory = secondaryCategory
            this
        }

        def setShortDescription(shortDescription: String): Builder = {
            this.shortDescription = shortDescription
            this
        }

        def setSlug(slug: String): Builder = {
            this.slug = slug
            this
        }

        def setStatusUrl(statusUrl: String): Builder = {
            this.statusUrl = statusUrl
            this
        }

        def setSupportEmail(supportEmail: String): Builder = {
            this.supportEmail = supportEmail
            this
        }

        def setSupportUrl(supportUrl: String): Builder = {
            this.supportUrl = supportUrl
            this
        }

        def setTermsOfServiceUrl(termsOfServiceUrl: String): Builder = {
            this.termsOfServiceUrl = termsOfServiceUrl
            this
        }

        def setUrl(url: String): Builder = {
            this.url = url
            this
        }

        def setViewerCanAddPlans(viewerCanAddPlans: Boolean): Builder = {
            this.viewerCanAddPlans = viewerCanAddPlans
            this
        }

        def setViewerCanApprove(viewerCanApprove: Boolean): Builder = {
            this.viewerCanApprove = viewerCanApprove
            this
        }

        def setViewerCanDelist(viewerCanDelist: Boolean): Builder = {
            this.viewerCanDelist = viewerCanDelist
            this
        }

        def setViewerCanEdit(viewerCanEdit: Boolean): Builder = {
            this.viewerCanEdit = viewerCanEdit
            this
        }

        def setViewerCanEditCategories(viewerCanEditCategories: Boolean): Builder = {
            this.viewerCanEditCategories = viewerCanEditCategories
            this
        }

        def setViewerCanEditPlans(viewerCanEditPlans: Boolean): Builder = {
            this.viewerCanEditPlans = viewerCanEditPlans
            this
        }

        def setViewerCanRedraft(viewerCanRedraft: Boolean): Builder = {
            this.viewerCanRedraft = viewerCanRedraft
            this
        }

        def setViewerCanReject(viewerCanReject: Boolean): Builder = {
            this.viewerCanReject = viewerCanReject
            this
        }

        def setViewerCanRequestApproval(viewerCanRequestApproval: Boolean): Builder = {
            this.viewerCanRequestApproval = viewerCanRequestApproval
            this
        }

        def setViewerHasPurchased(viewerHasPurchased: Boolean): Builder = {
            this.viewerHasPurchased = viewerHasPurchased
            this
        }

        def setViewerHasPurchasedForAllOrganizations(viewerHasPurchasedForAllOrganizations: Boolean): Builder = {
            this.viewerHasPurchasedForAllOrganizations = viewerHasPurchasedForAllOrganizations
            this
        }

        def setViewerIsListingAdmin(viewerIsListingAdmin: Boolean): Builder = {
            this.viewerIsListingAdmin = viewerIsListingAdmin
            this
        }

        def build(): MarketplaceListingTO = new MarketplaceListingTO(app, companyUrl, configurationResourcePath, configurationUrl, documentationUrl, extendedDescription, extendedDescriptionHTML, fullDescription, fullDescriptionHTML, hasApprovalBeenRequested, hasPublishedFreeTrialPlans, hasTermsOfService, howItWorks, howItWorksHTML, id, installationUrl, installedForViewer, isApproved, isArchived, isDelisted, isDraft, isPaid, isPublic, isRejected, isUnverified, isUnverifiedPending, isVerificationPendingFromDraft, isVerificationPendingFromUnverified, isVerified, logoBackgroundColor, name, normalizedShortDescription, pricingUrl, primaryCategory, privacyPolicyUrl, resourcePath, screenshotUrls, secondaryCategory, shortDescription, slug, statusUrl, supportEmail, supportUrl, termsOfServiceUrl, url, viewerCanAddPlans, viewerCanApprove, viewerCanDelist, viewerCanEdit, viewerCanEditCategories, viewerCanEditPlans, viewerCanRedraft, viewerCanReject, viewerCanRequestApproval, viewerHasPurchased, viewerHasPurchasedForAllOrganizations, viewerIsListingAdmin)

    }
}
