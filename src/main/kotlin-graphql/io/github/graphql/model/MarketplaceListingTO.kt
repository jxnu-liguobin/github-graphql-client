package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class MarketplaceListingTO(
    val app: AppTO?,
    val companyUrl: String?,
    val configurationResourcePath: String,
    val configurationUrl: String,
    val documentationUrl: String?,
    val extendedDescription: String?,
    val extendedDescriptionHTML: String,
    val fullDescription: String,
    val fullDescriptionHTML: String,
    @Deprecated(message = "`hasApprovalBeenRequested` will be removed. Use `isVerificationPendingFromDraft` instead. Removal on 2019-10-01 UTC.")
    val hasApprovalBeenRequested: Boolean,
    val hasPublishedFreeTrialPlans: Boolean,
    val hasTermsOfService: Boolean,
    val howItWorks: String?,
    val howItWorksHTML: String,
    override
    val id: String,
    val installationUrl: String?,
    val installedForViewer: Boolean,
    @Deprecated(message = "`isApproved` will be removed. Use `isPublic` instead. Removal on 2019-10-01 UTC.")
    val isApproved: Boolean,
    val isArchived: Boolean,
    @Deprecated(message = "`isDelisted` will be removed. Use `isArchived` instead. Removal on 2019-10-01 UTC.")
    val isDelisted: Boolean,
    val isDraft: Boolean,
    val isPaid: Boolean,
    val isPublic: Boolean,
    val isRejected: Boolean,
    val isUnverified: Boolean,
    val isUnverifiedPending: Boolean,
    val isVerificationPendingFromDraft: Boolean,
    val isVerificationPendingFromUnverified: Boolean,
    val isVerified: Boolean,
    val logoBackgroundColor: String,
    val name: String,
    val normalizedShortDescription: String,
    val pricingUrl: String?,
    val primaryCategory: MarketplaceCategoryTO,
    val privacyPolicyUrl: String,
    val resourcePath: String,
    val screenshotUrls: List<String?>,
    val secondaryCategory: MarketplaceCategoryTO?,
    val shortDescription: String,
    val slug: String,
    val statusUrl: String?,
    val supportEmail: String?,
    val supportUrl: String,
    val termsOfServiceUrl: String?,
    val url: String,
    val viewerCanAddPlans: Boolean,
    val viewerCanApprove: Boolean,
    val viewerCanDelist: Boolean,
    val viewerCanEdit: Boolean,
    val viewerCanEditCategories: Boolean,
    val viewerCanEditPlans: Boolean,
    val viewerCanRedraft: Boolean,
    val viewerCanReject: Boolean,
    val viewerCanRequestApproval: Boolean,
    val viewerHasPurchased: Boolean,
    val viewerHasPurchasedForAllOrganizations: Boolean,
    val viewerIsListingAdmin: Boolean
) : SearchResultItemTO, NodeTO {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (app != null) {
            joiner.add("app: " + GraphQLRequestSerializer.getEntry(app))
        }
        if (companyUrl != null) {
            joiner.add("companyUrl: " + GraphQLRequestSerializer.getEntry(companyUrl))
        }
        joiner.add("configurationResourcePath: " + GraphQLRequestSerializer.getEntry(configurationResourcePath))
        joiner.add("configurationUrl: " + GraphQLRequestSerializer.getEntry(configurationUrl))
        if (documentationUrl != null) {
            joiner.add("documentationUrl: " + GraphQLRequestSerializer.getEntry(documentationUrl))
        }
        if (extendedDescription != null) {
            joiner.add("extendedDescription: " + GraphQLRequestSerializer.getEntry(extendedDescription))
        }
        joiner.add("extendedDescriptionHTML: " + GraphQLRequestSerializer.getEntry(extendedDescriptionHTML))
        joiner.add("fullDescription: " + GraphQLRequestSerializer.getEntry(fullDescription))
        joiner.add("fullDescriptionHTML: " + GraphQLRequestSerializer.getEntry(fullDescriptionHTML))
        joiner.add("hasApprovalBeenRequested: " + GraphQLRequestSerializer.getEntry(hasApprovalBeenRequested))
        joiner.add("hasPublishedFreeTrialPlans: " + GraphQLRequestSerializer.getEntry(hasPublishedFreeTrialPlans))
        joiner.add("hasTermsOfService: " + GraphQLRequestSerializer.getEntry(hasTermsOfService))
        if (howItWorks != null) {
            joiner.add("howItWorks: " + GraphQLRequestSerializer.getEntry(howItWorks))
        }
        joiner.add("howItWorksHTML: " + GraphQLRequestSerializer.getEntry(howItWorksHTML))
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        if (installationUrl != null) {
            joiner.add("installationUrl: " + GraphQLRequestSerializer.getEntry(installationUrl))
        }
        joiner.add("installedForViewer: " + GraphQLRequestSerializer.getEntry(installedForViewer))
        joiner.add("isApproved: " + GraphQLRequestSerializer.getEntry(isApproved))
        joiner.add("isArchived: " + GraphQLRequestSerializer.getEntry(isArchived))
        joiner.add("isDelisted: " + GraphQLRequestSerializer.getEntry(isDelisted))
        joiner.add("isDraft: " + GraphQLRequestSerializer.getEntry(isDraft))
        joiner.add("isPaid: " + GraphQLRequestSerializer.getEntry(isPaid))
        joiner.add("isPublic: " + GraphQLRequestSerializer.getEntry(isPublic))
        joiner.add("isRejected: " + GraphQLRequestSerializer.getEntry(isRejected))
        joiner.add("isUnverified: " + GraphQLRequestSerializer.getEntry(isUnverified))
        joiner.add("isUnverifiedPending: " + GraphQLRequestSerializer.getEntry(isUnverifiedPending))
        joiner.add("isVerificationPendingFromDraft: " + GraphQLRequestSerializer.getEntry(isVerificationPendingFromDraft))
        joiner.add("isVerificationPendingFromUnverified: " + GraphQLRequestSerializer.getEntry(isVerificationPendingFromUnverified))
        joiner.add("isVerified: " + GraphQLRequestSerializer.getEntry(isVerified))
        joiner.add("logoBackgroundColor: " + GraphQLRequestSerializer.getEntry(logoBackgroundColor))
        joiner.add("name: " + GraphQLRequestSerializer.getEntry(name))
        joiner.add("normalizedShortDescription: " + GraphQLRequestSerializer.getEntry(normalizedShortDescription))
        if (pricingUrl != null) {
            joiner.add("pricingUrl: " + GraphQLRequestSerializer.getEntry(pricingUrl))
        }
        joiner.add("primaryCategory: " + GraphQLRequestSerializer.getEntry(primaryCategory))
        joiner.add("privacyPolicyUrl: " + GraphQLRequestSerializer.getEntry(privacyPolicyUrl))
        joiner.add("resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath))
        joiner.add("screenshotUrls: " + GraphQLRequestSerializer.getEntry(screenshotUrls))
        if (secondaryCategory != null) {
            joiner.add("secondaryCategory: " + GraphQLRequestSerializer.getEntry(secondaryCategory))
        }
        joiner.add("shortDescription: " + GraphQLRequestSerializer.getEntry(shortDescription))
        joiner.add("slug: " + GraphQLRequestSerializer.getEntry(slug))
        if (statusUrl != null) {
            joiner.add("statusUrl: " + GraphQLRequestSerializer.getEntry(statusUrl))
        }
        if (supportEmail != null) {
            joiner.add("supportEmail: " + GraphQLRequestSerializer.getEntry(supportEmail))
        }
        joiner.add("supportUrl: " + GraphQLRequestSerializer.getEntry(supportUrl))
        if (termsOfServiceUrl != null) {
            joiner.add("termsOfServiceUrl: " + GraphQLRequestSerializer.getEntry(termsOfServiceUrl))
        }
        joiner.add("url: " + GraphQLRequestSerializer.getEntry(url))
        joiner.add("viewerCanAddPlans: " + GraphQLRequestSerializer.getEntry(viewerCanAddPlans))
        joiner.add("viewerCanApprove: " + GraphQLRequestSerializer.getEntry(viewerCanApprove))
        joiner.add("viewerCanDelist: " + GraphQLRequestSerializer.getEntry(viewerCanDelist))
        joiner.add("viewerCanEdit: " + GraphQLRequestSerializer.getEntry(viewerCanEdit))
        joiner.add("viewerCanEditCategories: " + GraphQLRequestSerializer.getEntry(viewerCanEditCategories))
        joiner.add("viewerCanEditPlans: " + GraphQLRequestSerializer.getEntry(viewerCanEditPlans))
        joiner.add("viewerCanRedraft: " + GraphQLRequestSerializer.getEntry(viewerCanRedraft))
        joiner.add("viewerCanReject: " + GraphQLRequestSerializer.getEntry(viewerCanReject))
        joiner.add("viewerCanRequestApproval: " + GraphQLRequestSerializer.getEntry(viewerCanRequestApproval))
        joiner.add("viewerHasPurchased: " + GraphQLRequestSerializer.getEntry(viewerHasPurchased))
        joiner.add("viewerHasPurchasedForAllOrganizations: " + GraphQLRequestSerializer.getEntry(viewerHasPurchasedForAllOrganizations))
        joiner.add("viewerIsListingAdmin: " + GraphQLRequestSerializer.getEntry(viewerIsListingAdmin))
        return joiner.toString()
    }

    class Builder {

        private var app: AppTO? = null
        private var companyUrl: String? = null
        private lateinit var configurationResourcePath: String
        private lateinit var configurationUrl: String
        private var documentationUrl: String? = null
        private var extendedDescription: String? = null
        private lateinit var extendedDescriptionHTML: String
        private lateinit var fullDescription: String
        private lateinit var fullDescriptionHTML: String
        private var hasApprovalBeenRequested: Boolean = false
        private var hasPublishedFreeTrialPlans: Boolean = false
        private var hasTermsOfService: Boolean = false
        private var howItWorks: String? = null
        private lateinit var howItWorksHTML: String
        private lateinit var id: String
        private var installationUrl: String? = null
        private var installedForViewer: Boolean = false
        private var isApproved: Boolean = false
        private var isArchived: Boolean = false
        private var isDelisted: Boolean = false
        private var isDraft: Boolean = false
        private var isPaid: Boolean = false
        private var isPublic: Boolean = false
        private var isRejected: Boolean = false
        private var isUnverified: Boolean = false
        private var isUnverifiedPending: Boolean = false
        private var isVerificationPendingFromDraft: Boolean = false
        private var isVerificationPendingFromUnverified: Boolean = false
        private var isVerified: Boolean = false
        private lateinit var logoBackgroundColor: String
        private lateinit var name: String
        private lateinit var normalizedShortDescription: String
        private var pricingUrl: String? = null
        private lateinit var primaryCategory: MarketplaceCategoryTO
        private lateinit var privacyPolicyUrl: String
        private lateinit var resourcePath: String
        private lateinit var screenshotUrls: List<String?>
        private var secondaryCategory: MarketplaceCategoryTO? = null
        private lateinit var shortDescription: String
        private lateinit var slug: String
        private var statusUrl: String? = null
        private var supportEmail: String? = null
        private lateinit var supportUrl: String
        private var termsOfServiceUrl: String? = null
        private lateinit var url: String
        private var viewerCanAddPlans: Boolean = false
        private var viewerCanApprove: Boolean = false
        private var viewerCanDelist: Boolean = false
        private var viewerCanEdit: Boolean = false
        private var viewerCanEditCategories: Boolean = false
        private var viewerCanEditPlans: Boolean = false
        private var viewerCanRedraft: Boolean = false
        private var viewerCanReject: Boolean = false
        private var viewerCanRequestApproval: Boolean = false
        private var viewerHasPurchased: Boolean = false
        private var viewerHasPurchasedForAllOrganizations: Boolean = false
        private var viewerIsListingAdmin: Boolean = false

        fun setApp(app: AppTO?): Builder {
            this.app = app
            return this
        }

        fun setCompanyUrl(companyUrl: String?): Builder {
            this.companyUrl = companyUrl
            return this
        }

        fun setConfigurationResourcePath(configurationResourcePath: String): Builder {
            this.configurationResourcePath = configurationResourcePath
            return this
        }

        fun setConfigurationUrl(configurationUrl: String): Builder {
            this.configurationUrl = configurationUrl
            return this
        }

        fun setDocumentationUrl(documentationUrl: String?): Builder {
            this.documentationUrl = documentationUrl
            return this
        }

        fun setExtendedDescription(extendedDescription: String?): Builder {
            this.extendedDescription = extendedDescription
            return this
        }

        fun setExtendedDescriptionHTML(extendedDescriptionHTML: String): Builder {
            this.extendedDescriptionHTML = extendedDescriptionHTML
            return this
        }

        fun setFullDescription(fullDescription: String): Builder {
            this.fullDescription = fullDescription
            return this
        }

        fun setFullDescriptionHTML(fullDescriptionHTML: String): Builder {
            this.fullDescriptionHTML = fullDescriptionHTML
            return this
        }

        @Deprecated(message = "`hasApprovalBeenRequested` will be removed. Use `isVerificationPendingFromDraft` instead. Removal on 2019-10-01 UTC.")
        fun setHasApprovalBeenRequested(hasApprovalBeenRequested: Boolean): Builder {
            this.hasApprovalBeenRequested = hasApprovalBeenRequested
            return this
        }

        fun setHasPublishedFreeTrialPlans(hasPublishedFreeTrialPlans: Boolean): Builder {
            this.hasPublishedFreeTrialPlans = hasPublishedFreeTrialPlans
            return this
        }

        fun setHasTermsOfService(hasTermsOfService: Boolean): Builder {
            this.hasTermsOfService = hasTermsOfService
            return this
        }

        fun setHowItWorks(howItWorks: String?): Builder {
            this.howItWorks = howItWorks
            return this
        }

        fun setHowItWorksHTML(howItWorksHTML: String): Builder {
            this.howItWorksHTML = howItWorksHTML
            return this
        }

        fun setId(id: String): Builder {
            this.id = id
            return this
        }

        fun setInstallationUrl(installationUrl: String?): Builder {
            this.installationUrl = installationUrl
            return this
        }

        fun setInstalledForViewer(installedForViewer: Boolean): Builder {
            this.installedForViewer = installedForViewer
            return this
        }

        @Deprecated(message = "`isApproved` will be removed. Use `isPublic` instead. Removal on 2019-10-01 UTC.")
        fun setIsApproved(isApproved: Boolean): Builder {
            this.isApproved = isApproved
            return this
        }

        fun setIsArchived(isArchived: Boolean): Builder {
            this.isArchived = isArchived
            return this
        }

        @Deprecated(message = "`isDelisted` will be removed. Use `isArchived` instead. Removal on 2019-10-01 UTC.")
        fun setIsDelisted(isDelisted: Boolean): Builder {
            this.isDelisted = isDelisted
            return this
        }

        fun setIsDraft(isDraft: Boolean): Builder {
            this.isDraft = isDraft
            return this
        }

        fun setIsPaid(isPaid: Boolean): Builder {
            this.isPaid = isPaid
            return this
        }

        fun setIsPublic(isPublic: Boolean): Builder {
            this.isPublic = isPublic
            return this
        }

        fun setIsRejected(isRejected: Boolean): Builder {
            this.isRejected = isRejected
            return this
        }

        fun setIsUnverified(isUnverified: Boolean): Builder {
            this.isUnverified = isUnverified
            return this
        }

        fun setIsUnverifiedPending(isUnverifiedPending: Boolean): Builder {
            this.isUnverifiedPending = isUnverifiedPending
            return this
        }

        fun setIsVerificationPendingFromDraft(isVerificationPendingFromDraft: Boolean): Builder {
            this.isVerificationPendingFromDraft = isVerificationPendingFromDraft
            return this
        }

        fun setIsVerificationPendingFromUnverified(isVerificationPendingFromUnverified: Boolean): Builder {
            this.isVerificationPendingFromUnverified = isVerificationPendingFromUnverified
            return this
        }

        fun setIsVerified(isVerified: Boolean): Builder {
            this.isVerified = isVerified
            return this
        }

        fun setLogoBackgroundColor(logoBackgroundColor: String): Builder {
            this.logoBackgroundColor = logoBackgroundColor
            return this
        }

        fun setName(name: String): Builder {
            this.name = name
            return this
        }

        fun setNormalizedShortDescription(normalizedShortDescription: String): Builder {
            this.normalizedShortDescription = normalizedShortDescription
            return this
        }

        fun setPricingUrl(pricingUrl: String?): Builder {
            this.pricingUrl = pricingUrl
            return this
        }

        fun setPrimaryCategory(primaryCategory: MarketplaceCategoryTO): Builder {
            this.primaryCategory = primaryCategory
            return this
        }

        fun setPrivacyPolicyUrl(privacyPolicyUrl: String): Builder {
            this.privacyPolicyUrl = privacyPolicyUrl
            return this
        }

        fun setResourcePath(resourcePath: String): Builder {
            this.resourcePath = resourcePath
            return this
        }

        fun setScreenshotUrls(screenshotUrls: List<String?>): Builder {
            this.screenshotUrls = screenshotUrls
            return this
        }

        fun setSecondaryCategory(secondaryCategory: MarketplaceCategoryTO?): Builder {
            this.secondaryCategory = secondaryCategory
            return this
        }

        fun setShortDescription(shortDescription: String): Builder {
            this.shortDescription = shortDescription
            return this
        }

        fun setSlug(slug: String): Builder {
            this.slug = slug
            return this
        }

        fun setStatusUrl(statusUrl: String?): Builder {
            this.statusUrl = statusUrl
            return this
        }

        fun setSupportEmail(supportEmail: String?): Builder {
            this.supportEmail = supportEmail
            return this
        }

        fun setSupportUrl(supportUrl: String): Builder {
            this.supportUrl = supportUrl
            return this
        }

        fun setTermsOfServiceUrl(termsOfServiceUrl: String?): Builder {
            this.termsOfServiceUrl = termsOfServiceUrl
            return this
        }

        fun setUrl(url: String): Builder {
            this.url = url
            return this
        }

        fun setViewerCanAddPlans(viewerCanAddPlans: Boolean): Builder {
            this.viewerCanAddPlans = viewerCanAddPlans
            return this
        }

        fun setViewerCanApprove(viewerCanApprove: Boolean): Builder {
            this.viewerCanApprove = viewerCanApprove
            return this
        }

        fun setViewerCanDelist(viewerCanDelist: Boolean): Builder {
            this.viewerCanDelist = viewerCanDelist
            return this
        }

        fun setViewerCanEdit(viewerCanEdit: Boolean): Builder {
            this.viewerCanEdit = viewerCanEdit
            return this
        }

        fun setViewerCanEditCategories(viewerCanEditCategories: Boolean): Builder {
            this.viewerCanEditCategories = viewerCanEditCategories
            return this
        }

        fun setViewerCanEditPlans(viewerCanEditPlans: Boolean): Builder {
            this.viewerCanEditPlans = viewerCanEditPlans
            return this
        }

        fun setViewerCanRedraft(viewerCanRedraft: Boolean): Builder {
            this.viewerCanRedraft = viewerCanRedraft
            return this
        }

        fun setViewerCanReject(viewerCanReject: Boolean): Builder {
            this.viewerCanReject = viewerCanReject
            return this
        }

        fun setViewerCanRequestApproval(viewerCanRequestApproval: Boolean): Builder {
            this.viewerCanRequestApproval = viewerCanRequestApproval
            return this
        }

        fun setViewerHasPurchased(viewerHasPurchased: Boolean): Builder {
            this.viewerHasPurchased = viewerHasPurchased
            return this
        }

        fun setViewerHasPurchasedForAllOrganizations(viewerHasPurchasedForAllOrganizations: Boolean): Builder {
            this.viewerHasPurchasedForAllOrganizations = viewerHasPurchasedForAllOrganizations
            return this
        }

        fun setViewerIsListingAdmin(viewerIsListingAdmin: Boolean): Builder {
            this.viewerIsListingAdmin = viewerIsListingAdmin
            return this
        }

        fun build(): MarketplaceListingTO {
            return MarketplaceListingTO(app, companyUrl, configurationResourcePath, configurationUrl, documentationUrl, extendedDescription, extendedDescriptionHTML, fullDescription, fullDescriptionHTML, hasApprovalBeenRequested, hasPublishedFreeTrialPlans, hasTermsOfService, howItWorks, howItWorksHTML, id, installationUrl, installedForViewer, isApproved, isArchived, isDelisted, isDraft, isPaid, isPublic, isRejected, isUnverified, isUnverifiedPending, isVerificationPendingFromDraft, isVerificationPendingFromUnverified, isVerified, logoBackgroundColor, name, normalizedShortDescription, pricingUrl, primaryCategory, privacyPolicyUrl, resourcePath, screenshotUrls, secondaryCategory, shortDescription, slug, statusUrl, supportEmail, supportUrl, termsOfServiceUrl, url, viewerCanAddPlans, viewerCanApprove, viewerCanDelist, viewerCanEdit, viewerCanEditCategories, viewerCanEditPlans, viewerCanRedraft, viewerCanReject, viewerCanRequestApproval, viewerHasPurchased, viewerHasPurchasedForAllOrganizations, viewerIsListingAdmin)
        }
    }
}
