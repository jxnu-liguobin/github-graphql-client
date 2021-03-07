package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for MarketplaceListing
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class MarketplaceListingResponseProjection extends GraphQLResponseProjection {

    public MarketplaceListingResponseProjection() {
    }

    @Override
    public MarketplaceListingResponseProjection all$() {
        return all$(3);
    }

    @Override
    public MarketplaceListingResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("MarketplaceListingResponseProjection.AppResponseProjection.app", 0) <= maxDepth) {
            projectionDepthOnFields.put("MarketplaceListingResponseProjection.AppResponseProjection.app", projectionDepthOnFields.getOrDefault("MarketplaceListingResponseProjection.AppResponseProjection.app", 0) + 1);
            this.app(new AppResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MarketplaceListingResponseProjection.AppResponseProjection.app", 0)));
        }
        this.companyUrl();
        this.configurationResourcePath();
        this.configurationUrl();
        this.documentationUrl();
        this.extendedDescription();
        this.extendedDescriptionHTML();
        this.fullDescription();
        this.fullDescriptionHTML();
        this.hasApprovalBeenRequested();
        this.hasPublishedFreeTrialPlans();
        this.hasTermsOfService();
        this.howItWorks();
        this.howItWorksHTML();
        this.id();
        this.installationUrl();
        this.installedForViewer();
        this.isApproved();
        this.isArchived();
        this.isDelisted();
        this.isDraft();
        this.isPaid();
        this.isPublic();
        this.isRejected();
        this.isUnverified();
        this.isUnverifiedPending();
        this.isVerificationPendingFromDraft();
        this.isVerificationPendingFromUnverified();
        this.isVerified();
        this.logoBackgroundColor();
        this.logoUrl();
        this.name();
        this.normalizedShortDescription();
        this.pricingUrl();
        if (projectionDepthOnFields.getOrDefault("MarketplaceListingResponseProjection.MarketplaceCategoryResponseProjection.primaryCategory", 0) <= maxDepth) {
            projectionDepthOnFields.put("MarketplaceListingResponseProjection.MarketplaceCategoryResponseProjection.primaryCategory", projectionDepthOnFields.getOrDefault("MarketplaceListingResponseProjection.MarketplaceCategoryResponseProjection.primaryCategory", 0) + 1);
            this.primaryCategory(new MarketplaceCategoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MarketplaceListingResponseProjection.MarketplaceCategoryResponseProjection.primaryCategory", 0)));
        }
        this.privacyPolicyUrl();
        this.resourcePath();
        this.screenshotUrls();
        if (projectionDepthOnFields.getOrDefault("MarketplaceListingResponseProjection.MarketplaceCategoryResponseProjection.secondaryCategory", 0) <= maxDepth) {
            projectionDepthOnFields.put("MarketplaceListingResponseProjection.MarketplaceCategoryResponseProjection.secondaryCategory", projectionDepthOnFields.getOrDefault("MarketplaceListingResponseProjection.MarketplaceCategoryResponseProjection.secondaryCategory", 0) + 1);
            this.secondaryCategory(new MarketplaceCategoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MarketplaceListingResponseProjection.MarketplaceCategoryResponseProjection.secondaryCategory", 0)));
        }
        this.shortDescription();
        this.slug();
        this.statusUrl();
        this.supportEmail();
        this.supportUrl();
        this.termsOfServiceUrl();
        this.url();
        this.viewerCanAddPlans();
        this.viewerCanApprove();
        this.viewerCanDelist();
        this.viewerCanEdit();
        this.viewerCanEditCategories();
        this.viewerCanEditPlans();
        this.viewerCanRedraft();
        this.viewerCanReject();
        this.viewerCanRequestApproval();
        this.viewerHasPurchased();
        this.viewerHasPurchasedForAllOrganizations();
        this.viewerIsListingAdmin();
        this.typename();
        return this;
    }

    public MarketplaceListingResponseProjection app(AppResponseProjection subProjection) {
        return app(null, subProjection);
    }

    public MarketplaceListingResponseProjection app(String alias, AppResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("app").alias(alias).projection(subProjection));
        return this;
    }

    public MarketplaceListingResponseProjection companyUrl() {
        return companyUrl(null);
    }

    public MarketplaceListingResponseProjection companyUrl(String alias) {
        fields.add(new GraphQLResponseField("companyUrl").alias(alias));
        return this;
    }

    public MarketplaceListingResponseProjection configurationResourcePath() {
        return configurationResourcePath(null);
    }

    public MarketplaceListingResponseProjection configurationResourcePath(String alias) {
        fields.add(new GraphQLResponseField("configurationResourcePath").alias(alias));
        return this;
    }

    public MarketplaceListingResponseProjection configurationUrl() {
        return configurationUrl(null);
    }

    public MarketplaceListingResponseProjection configurationUrl(String alias) {
        fields.add(new GraphQLResponseField("configurationUrl").alias(alias));
        return this;
    }

    public MarketplaceListingResponseProjection documentationUrl() {
        return documentationUrl(null);
    }

    public MarketplaceListingResponseProjection documentationUrl(String alias) {
        fields.add(new GraphQLResponseField("documentationUrl").alias(alias));
        return this;
    }

    public MarketplaceListingResponseProjection extendedDescription() {
        return extendedDescription(null);
    }

    public MarketplaceListingResponseProjection extendedDescription(String alias) {
        fields.add(new GraphQLResponseField("extendedDescription").alias(alias));
        return this;
    }

    public MarketplaceListingResponseProjection extendedDescriptionHTML() {
        return extendedDescriptionHTML(null);
    }

    public MarketplaceListingResponseProjection extendedDescriptionHTML(String alias) {
        fields.add(new GraphQLResponseField("extendedDescriptionHTML").alias(alias));
        return this;
    }

    public MarketplaceListingResponseProjection fullDescription() {
        return fullDescription(null);
    }

    public MarketplaceListingResponseProjection fullDescription(String alias) {
        fields.add(new GraphQLResponseField("fullDescription").alias(alias));
        return this;
    }

    public MarketplaceListingResponseProjection fullDescriptionHTML() {
        return fullDescriptionHTML(null);
    }

    public MarketplaceListingResponseProjection fullDescriptionHTML(String alias) {
        fields.add(new GraphQLResponseField("fullDescriptionHTML").alias(alias));
        return this;
    }

    @Deprecated
    public MarketplaceListingResponseProjection hasApprovalBeenRequested() {
        return hasApprovalBeenRequested(null);
    }

    public MarketplaceListingResponseProjection hasApprovalBeenRequested(String alias) {
        fields.add(new GraphQLResponseField("hasApprovalBeenRequested").alias(alias));
        return this;
    }

    public MarketplaceListingResponseProjection hasPublishedFreeTrialPlans() {
        return hasPublishedFreeTrialPlans(null);
    }

    public MarketplaceListingResponseProjection hasPublishedFreeTrialPlans(String alias) {
        fields.add(new GraphQLResponseField("hasPublishedFreeTrialPlans").alias(alias));
        return this;
    }

    public MarketplaceListingResponseProjection hasTermsOfService() {
        return hasTermsOfService(null);
    }

    public MarketplaceListingResponseProjection hasTermsOfService(String alias) {
        fields.add(new GraphQLResponseField("hasTermsOfService").alias(alias));
        return this;
    }

    public MarketplaceListingResponseProjection howItWorks() {
        return howItWorks(null);
    }

    public MarketplaceListingResponseProjection howItWorks(String alias) {
        fields.add(new GraphQLResponseField("howItWorks").alias(alias));
        return this;
    }

    public MarketplaceListingResponseProjection howItWorksHTML() {
        return howItWorksHTML(null);
    }

    public MarketplaceListingResponseProjection howItWorksHTML(String alias) {
        fields.add(new GraphQLResponseField("howItWorksHTML").alias(alias));
        return this;
    }

    public MarketplaceListingResponseProjection id() {
        return id(null);
    }

    public MarketplaceListingResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public MarketplaceListingResponseProjection installationUrl() {
        return installationUrl(null);
    }

    public MarketplaceListingResponseProjection installationUrl(String alias) {
        fields.add(new GraphQLResponseField("installationUrl").alias(alias));
        return this;
    }

    public MarketplaceListingResponseProjection installedForViewer() {
        return installedForViewer(null);
    }

    public MarketplaceListingResponseProjection installedForViewer(String alias) {
        fields.add(new GraphQLResponseField("installedForViewer").alias(alias));
        return this;
    }

    @Deprecated
    public MarketplaceListingResponseProjection isApproved() {
        return isApproved(null);
    }

    public MarketplaceListingResponseProjection isApproved(String alias) {
        fields.add(new GraphQLResponseField("isApproved").alias(alias));
        return this;
    }

    public MarketplaceListingResponseProjection isArchived() {
        return isArchived(null);
    }

    public MarketplaceListingResponseProjection isArchived(String alias) {
        fields.add(new GraphQLResponseField("isArchived").alias(alias));
        return this;
    }

    @Deprecated
    public MarketplaceListingResponseProjection isDelisted() {
        return isDelisted(null);
    }

    public MarketplaceListingResponseProjection isDelisted(String alias) {
        fields.add(new GraphQLResponseField("isDelisted").alias(alias));
        return this;
    }

    public MarketplaceListingResponseProjection isDraft() {
        return isDraft(null);
    }

    public MarketplaceListingResponseProjection isDraft(String alias) {
        fields.add(new GraphQLResponseField("isDraft").alias(alias));
        return this;
    }

    public MarketplaceListingResponseProjection isPaid() {
        return isPaid(null);
    }

    public MarketplaceListingResponseProjection isPaid(String alias) {
        fields.add(new GraphQLResponseField("isPaid").alias(alias));
        return this;
    }

    public MarketplaceListingResponseProjection isPublic() {
        return isPublic(null);
    }

    public MarketplaceListingResponseProjection isPublic(String alias) {
        fields.add(new GraphQLResponseField("isPublic").alias(alias));
        return this;
    }

    public MarketplaceListingResponseProjection isRejected() {
        return isRejected(null);
    }

    public MarketplaceListingResponseProjection isRejected(String alias) {
        fields.add(new GraphQLResponseField("isRejected").alias(alias));
        return this;
    }

    public MarketplaceListingResponseProjection isUnverified() {
        return isUnverified(null);
    }

    public MarketplaceListingResponseProjection isUnverified(String alias) {
        fields.add(new GraphQLResponseField("isUnverified").alias(alias));
        return this;
    }

    public MarketplaceListingResponseProjection isUnverifiedPending() {
        return isUnverifiedPending(null);
    }

    public MarketplaceListingResponseProjection isUnverifiedPending(String alias) {
        fields.add(new GraphQLResponseField("isUnverifiedPending").alias(alias));
        return this;
    }

    public MarketplaceListingResponseProjection isVerificationPendingFromDraft() {
        return isVerificationPendingFromDraft(null);
    }

    public MarketplaceListingResponseProjection isVerificationPendingFromDraft(String alias) {
        fields.add(new GraphQLResponseField("isVerificationPendingFromDraft").alias(alias));
        return this;
    }

    public MarketplaceListingResponseProjection isVerificationPendingFromUnverified() {
        return isVerificationPendingFromUnverified(null);
    }

    public MarketplaceListingResponseProjection isVerificationPendingFromUnverified(String alias) {
        fields.add(new GraphQLResponseField("isVerificationPendingFromUnverified").alias(alias));
        return this;
    }

    public MarketplaceListingResponseProjection isVerified() {
        return isVerified(null);
    }

    public MarketplaceListingResponseProjection isVerified(String alias) {
        fields.add(new GraphQLResponseField("isVerified").alias(alias));
        return this;
    }

    public MarketplaceListingResponseProjection logoBackgroundColor() {
        return logoBackgroundColor(null);
    }

    public MarketplaceListingResponseProjection logoBackgroundColor(String alias) {
        fields.add(new GraphQLResponseField("logoBackgroundColor").alias(alias));
        return this;
    }

    public MarketplaceListingResponseProjection logoUrl() {
        return logoUrl((String)null);
    }

    public MarketplaceListingResponseProjection logoUrl(String alias) {
        fields.add(new GraphQLResponseField("logoUrl").alias(alias));
        return this;
    }

    public MarketplaceListingResponseProjection logoUrl(MarketplaceListingLogoUrlParametrizedInput input) {
        return logoUrl(null, input);
    }

    public MarketplaceListingResponseProjection logoUrl(String alias, MarketplaceListingLogoUrlParametrizedInput input) {
        fields.add(new GraphQLResponseField("logoUrl").alias(alias).parameters(input));
        return this;
    }

    public MarketplaceListingResponseProjection name() {
        return name(null);
    }

    public MarketplaceListingResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public MarketplaceListingResponseProjection normalizedShortDescription() {
        return normalizedShortDescription(null);
    }

    public MarketplaceListingResponseProjection normalizedShortDescription(String alias) {
        fields.add(new GraphQLResponseField("normalizedShortDescription").alias(alias));
        return this;
    }

    public MarketplaceListingResponseProjection pricingUrl() {
        return pricingUrl(null);
    }

    public MarketplaceListingResponseProjection pricingUrl(String alias) {
        fields.add(new GraphQLResponseField("pricingUrl").alias(alias));
        return this;
    }

    public MarketplaceListingResponseProjection primaryCategory(MarketplaceCategoryResponseProjection subProjection) {
        return primaryCategory(null, subProjection);
    }

    public MarketplaceListingResponseProjection primaryCategory(String alias, MarketplaceCategoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("primaryCategory").alias(alias).projection(subProjection));
        return this;
    }

    public MarketplaceListingResponseProjection privacyPolicyUrl() {
        return privacyPolicyUrl(null);
    }

    public MarketplaceListingResponseProjection privacyPolicyUrl(String alias) {
        fields.add(new GraphQLResponseField("privacyPolicyUrl").alias(alias));
        return this;
    }

    public MarketplaceListingResponseProjection resourcePath() {
        return resourcePath(null);
    }

    public MarketplaceListingResponseProjection resourcePath(String alias) {
        fields.add(new GraphQLResponseField("resourcePath").alias(alias));
        return this;
    }

    public MarketplaceListingResponseProjection screenshotUrls() {
        return screenshotUrls(null);
    }

    public MarketplaceListingResponseProjection screenshotUrls(String alias) {
        fields.add(new GraphQLResponseField("screenshotUrls").alias(alias));
        return this;
    }

    public MarketplaceListingResponseProjection secondaryCategory(MarketplaceCategoryResponseProjection subProjection) {
        return secondaryCategory(null, subProjection);
    }

    public MarketplaceListingResponseProjection secondaryCategory(String alias, MarketplaceCategoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("secondaryCategory").alias(alias).projection(subProjection));
        return this;
    }

    public MarketplaceListingResponseProjection shortDescription() {
        return shortDescription(null);
    }

    public MarketplaceListingResponseProjection shortDescription(String alias) {
        fields.add(new GraphQLResponseField("shortDescription").alias(alias));
        return this;
    }

    public MarketplaceListingResponseProjection slug() {
        return slug(null);
    }

    public MarketplaceListingResponseProjection slug(String alias) {
        fields.add(new GraphQLResponseField("slug").alias(alias));
        return this;
    }

    public MarketplaceListingResponseProjection statusUrl() {
        return statusUrl(null);
    }

    public MarketplaceListingResponseProjection statusUrl(String alias) {
        fields.add(new GraphQLResponseField("statusUrl").alias(alias));
        return this;
    }

    public MarketplaceListingResponseProjection supportEmail() {
        return supportEmail(null);
    }

    public MarketplaceListingResponseProjection supportEmail(String alias) {
        fields.add(new GraphQLResponseField("supportEmail").alias(alias));
        return this;
    }

    public MarketplaceListingResponseProjection supportUrl() {
        return supportUrl(null);
    }

    public MarketplaceListingResponseProjection supportUrl(String alias) {
        fields.add(new GraphQLResponseField("supportUrl").alias(alias));
        return this;
    }

    public MarketplaceListingResponseProjection termsOfServiceUrl() {
        return termsOfServiceUrl(null);
    }

    public MarketplaceListingResponseProjection termsOfServiceUrl(String alias) {
        fields.add(new GraphQLResponseField("termsOfServiceUrl").alias(alias));
        return this;
    }

    public MarketplaceListingResponseProjection url() {
        return url(null);
    }

    public MarketplaceListingResponseProjection url(String alias) {
        fields.add(new GraphQLResponseField("url").alias(alias));
        return this;
    }

    public MarketplaceListingResponseProjection viewerCanAddPlans() {
        return viewerCanAddPlans(null);
    }

    public MarketplaceListingResponseProjection viewerCanAddPlans(String alias) {
        fields.add(new GraphQLResponseField("viewerCanAddPlans").alias(alias));
        return this;
    }

    public MarketplaceListingResponseProjection viewerCanApprove() {
        return viewerCanApprove(null);
    }

    public MarketplaceListingResponseProjection viewerCanApprove(String alias) {
        fields.add(new GraphQLResponseField("viewerCanApprove").alias(alias));
        return this;
    }

    public MarketplaceListingResponseProjection viewerCanDelist() {
        return viewerCanDelist(null);
    }

    public MarketplaceListingResponseProjection viewerCanDelist(String alias) {
        fields.add(new GraphQLResponseField("viewerCanDelist").alias(alias));
        return this;
    }

    public MarketplaceListingResponseProjection viewerCanEdit() {
        return viewerCanEdit(null);
    }

    public MarketplaceListingResponseProjection viewerCanEdit(String alias) {
        fields.add(new GraphQLResponseField("viewerCanEdit").alias(alias));
        return this;
    }

    public MarketplaceListingResponseProjection viewerCanEditCategories() {
        return viewerCanEditCategories(null);
    }

    public MarketplaceListingResponseProjection viewerCanEditCategories(String alias) {
        fields.add(new GraphQLResponseField("viewerCanEditCategories").alias(alias));
        return this;
    }

    public MarketplaceListingResponseProjection viewerCanEditPlans() {
        return viewerCanEditPlans(null);
    }

    public MarketplaceListingResponseProjection viewerCanEditPlans(String alias) {
        fields.add(new GraphQLResponseField("viewerCanEditPlans").alias(alias));
        return this;
    }

    public MarketplaceListingResponseProjection viewerCanRedraft() {
        return viewerCanRedraft(null);
    }

    public MarketplaceListingResponseProjection viewerCanRedraft(String alias) {
        fields.add(new GraphQLResponseField("viewerCanRedraft").alias(alias));
        return this;
    }

    public MarketplaceListingResponseProjection viewerCanReject() {
        return viewerCanReject(null);
    }

    public MarketplaceListingResponseProjection viewerCanReject(String alias) {
        fields.add(new GraphQLResponseField("viewerCanReject").alias(alias));
        return this;
    }

    public MarketplaceListingResponseProjection viewerCanRequestApproval() {
        return viewerCanRequestApproval(null);
    }

    public MarketplaceListingResponseProjection viewerCanRequestApproval(String alias) {
        fields.add(new GraphQLResponseField("viewerCanRequestApproval").alias(alias));
        return this;
    }

    public MarketplaceListingResponseProjection viewerHasPurchased() {
        return viewerHasPurchased(null);
    }

    public MarketplaceListingResponseProjection viewerHasPurchased(String alias) {
        fields.add(new GraphQLResponseField("viewerHasPurchased").alias(alias));
        return this;
    }

    public MarketplaceListingResponseProjection viewerHasPurchasedForAllOrganizations() {
        return viewerHasPurchasedForAllOrganizations(null);
    }

    public MarketplaceListingResponseProjection viewerHasPurchasedForAllOrganizations(String alias) {
        fields.add(new GraphQLResponseField("viewerHasPurchasedForAllOrganizations").alias(alias));
        return this;
    }

    public MarketplaceListingResponseProjection viewerIsListingAdmin() {
        return viewerIsListingAdmin(null);
    }

    public MarketplaceListingResponseProjection viewerIsListingAdmin(String alias) {
        fields.add(new GraphQLResponseField("viewerIsListingAdmin").alias(alias));
        return this;
    }

    public MarketplaceListingResponseProjection typename() {
        return typename(null);
    }

    public MarketplaceListingResponseProjection typename(String alias) {
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
        final MarketplaceListingResponseProjection that = (MarketplaceListingResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
