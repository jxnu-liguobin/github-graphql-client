package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
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
}
