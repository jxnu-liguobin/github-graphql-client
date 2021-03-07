package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class MarketplaceListingTO implements java.io.Serializable, SearchResultItemTO, NodeTO {

    private AppTO app;
    private String companyUrl;
    @javax.validation.constraints.NotNull
    private String configurationResourcePath;
    @javax.validation.constraints.NotNull
    private String configurationUrl;
    private String documentationUrl;
    private String extendedDescription;
    @javax.validation.constraints.NotNull
    private String extendedDescriptionHTML;
    @javax.validation.constraints.NotNull
    private String fullDescription;
    @javax.validation.constraints.NotNull
    private String fullDescriptionHTML;
    @Deprecated
    private boolean hasApprovalBeenRequested;
    private boolean hasPublishedFreeTrialPlans;
    private boolean hasTermsOfService;
    private String howItWorks;
    @javax.validation.constraints.NotNull
    private String howItWorksHTML;
    @javax.validation.constraints.NotNull
    private String id;
    private String installationUrl;
    private boolean installedForViewer;
    @Deprecated
    private boolean isApproved;
    private boolean isArchived;
    @Deprecated
    private boolean isDelisted;
    private boolean isDraft;
    private boolean isPaid;
    private boolean isPublic;
    private boolean isRejected;
    private boolean isUnverified;
    private boolean isUnverifiedPending;
    private boolean isVerificationPendingFromDraft;
    private boolean isVerificationPendingFromUnverified;
    private boolean isVerified;
    @javax.validation.constraints.NotNull
    private String logoBackgroundColor;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private String normalizedShortDescription;
    private String pricingUrl;
    @javax.validation.constraints.NotNull
    private MarketplaceCategoryTO primaryCategory;
    @javax.validation.constraints.NotNull
    private String privacyPolicyUrl;
    @javax.validation.constraints.NotNull
    private String resourcePath;
    @javax.validation.constraints.NotNull
    private java.util.List<String> screenshotUrls;
    private MarketplaceCategoryTO secondaryCategory;
    @javax.validation.constraints.NotNull
    private String shortDescription;
    @javax.validation.constraints.NotNull
    private String slug;
    private String statusUrl;
    private String supportEmail;
    @javax.validation.constraints.NotNull
    private String supportUrl;
    private String termsOfServiceUrl;
    @javax.validation.constraints.NotNull
    private String url;
    private boolean viewerCanAddPlans;
    private boolean viewerCanApprove;
    private boolean viewerCanDelist;
    private boolean viewerCanEdit;
    private boolean viewerCanEditCategories;
    private boolean viewerCanEditPlans;
    private boolean viewerCanRedraft;
    private boolean viewerCanReject;
    private boolean viewerCanRequestApproval;
    private boolean viewerHasPurchased;
    private boolean viewerHasPurchasedForAllOrganizations;
    private boolean viewerIsListingAdmin;

    public MarketplaceListingTO() {
    }

    public MarketplaceListingTO(AppTO app, String companyUrl, String configurationResourcePath, String configurationUrl, String documentationUrl, String extendedDescription, String extendedDescriptionHTML, String fullDescription, String fullDescriptionHTML, boolean hasApprovalBeenRequested, boolean hasPublishedFreeTrialPlans, boolean hasTermsOfService, String howItWorks, String howItWorksHTML, String id, String installationUrl, boolean installedForViewer, boolean isApproved, boolean isArchived, boolean isDelisted, boolean isDraft, boolean isPaid, boolean isPublic, boolean isRejected, boolean isUnverified, boolean isUnverifiedPending, boolean isVerificationPendingFromDraft, boolean isVerificationPendingFromUnverified, boolean isVerified, String logoBackgroundColor, String name, String normalizedShortDescription, String pricingUrl, MarketplaceCategoryTO primaryCategory, String privacyPolicyUrl, String resourcePath, java.util.List<String> screenshotUrls, MarketplaceCategoryTO secondaryCategory, String shortDescription, String slug, String statusUrl, String supportEmail, String supportUrl, String termsOfServiceUrl, String url, boolean viewerCanAddPlans, boolean viewerCanApprove, boolean viewerCanDelist, boolean viewerCanEdit, boolean viewerCanEditCategories, boolean viewerCanEditPlans, boolean viewerCanRedraft, boolean viewerCanReject, boolean viewerCanRequestApproval, boolean viewerHasPurchased, boolean viewerHasPurchasedForAllOrganizations, boolean viewerIsListingAdmin) {
        this.app = app;
        this.companyUrl = companyUrl;
        this.configurationResourcePath = configurationResourcePath;
        this.configurationUrl = configurationUrl;
        this.documentationUrl = documentationUrl;
        this.extendedDescription = extendedDescription;
        this.extendedDescriptionHTML = extendedDescriptionHTML;
        this.fullDescription = fullDescription;
        this.fullDescriptionHTML = fullDescriptionHTML;
        this.hasApprovalBeenRequested = hasApprovalBeenRequested;
        this.hasPublishedFreeTrialPlans = hasPublishedFreeTrialPlans;
        this.hasTermsOfService = hasTermsOfService;
        this.howItWorks = howItWorks;
        this.howItWorksHTML = howItWorksHTML;
        this.id = id;
        this.installationUrl = installationUrl;
        this.installedForViewer = installedForViewer;
        this.isApproved = isApproved;
        this.isArchived = isArchived;
        this.isDelisted = isDelisted;
        this.isDraft = isDraft;
        this.isPaid = isPaid;
        this.isPublic = isPublic;
        this.isRejected = isRejected;
        this.isUnverified = isUnverified;
        this.isUnverifiedPending = isUnverifiedPending;
        this.isVerificationPendingFromDraft = isVerificationPendingFromDraft;
        this.isVerificationPendingFromUnverified = isVerificationPendingFromUnverified;
        this.isVerified = isVerified;
        this.logoBackgroundColor = logoBackgroundColor;
        this.name = name;
        this.normalizedShortDescription = normalizedShortDescription;
        this.pricingUrl = pricingUrl;
        this.primaryCategory = primaryCategory;
        this.privacyPolicyUrl = privacyPolicyUrl;
        this.resourcePath = resourcePath;
        this.screenshotUrls = screenshotUrls;
        this.secondaryCategory = secondaryCategory;
        this.shortDescription = shortDescription;
        this.slug = slug;
        this.statusUrl = statusUrl;
        this.supportEmail = supportEmail;
        this.supportUrl = supportUrl;
        this.termsOfServiceUrl = termsOfServiceUrl;
        this.url = url;
        this.viewerCanAddPlans = viewerCanAddPlans;
        this.viewerCanApprove = viewerCanApprove;
        this.viewerCanDelist = viewerCanDelist;
        this.viewerCanEdit = viewerCanEdit;
        this.viewerCanEditCategories = viewerCanEditCategories;
        this.viewerCanEditPlans = viewerCanEditPlans;
        this.viewerCanRedraft = viewerCanRedraft;
        this.viewerCanReject = viewerCanReject;
        this.viewerCanRequestApproval = viewerCanRequestApproval;
        this.viewerHasPurchased = viewerHasPurchased;
        this.viewerHasPurchasedForAllOrganizations = viewerHasPurchasedForAllOrganizations;
        this.viewerIsListingAdmin = viewerIsListingAdmin;
    }

    public AppTO getApp() {
        return app;
    }

    public String getCompanyUrl() {
        return companyUrl;
    }

    public String getConfigurationResourcePath() {
        return configurationResourcePath;
    }

    public String getConfigurationUrl() {
        return configurationUrl;
    }

    public String getDocumentationUrl() {
        return documentationUrl;
    }

    public String getExtendedDescription() {
        return extendedDescription;
    }

    public String getExtendedDescriptionHTML() {
        return extendedDescriptionHTML;
    }

    public String getFullDescription() {
        return fullDescription;
    }

    public String getFullDescriptionHTML() {
        return fullDescriptionHTML;
    }

    @Deprecated
    public boolean getHasApprovalBeenRequested() {
        return hasApprovalBeenRequested;
    }

    public boolean getHasPublishedFreeTrialPlans() {
        return hasPublishedFreeTrialPlans;
    }

    public boolean getHasTermsOfService() {
        return hasTermsOfService;
    }

    public String getHowItWorks() {
        return howItWorks;
    }

    public String getHowItWorksHTML() {
        return howItWorksHTML;
    }

    public String getId() {
        return id;
    }

    public String getInstallationUrl() {
        return installationUrl;
    }

    public boolean getInstalledForViewer() {
        return installedForViewer;
    }

    @Deprecated
    public boolean getIsApproved() {
        return isApproved;
    }

    public boolean getIsArchived() {
        return isArchived;
    }

    @Deprecated
    public boolean getIsDelisted() {
        return isDelisted;
    }

    public boolean getIsDraft() {
        return isDraft;
    }

    public boolean getIsPaid() {
        return isPaid;
    }

    public boolean getIsPublic() {
        return isPublic;
    }

    public boolean getIsRejected() {
        return isRejected;
    }

    public boolean getIsUnverified() {
        return isUnverified;
    }

    public boolean getIsUnverifiedPending() {
        return isUnverifiedPending;
    }

    public boolean getIsVerificationPendingFromDraft() {
        return isVerificationPendingFromDraft;
    }

    public boolean getIsVerificationPendingFromUnverified() {
        return isVerificationPendingFromUnverified;
    }

    public boolean getIsVerified() {
        return isVerified;
    }

    public String getLogoBackgroundColor() {
        return logoBackgroundColor;
    }

    public String getName() {
        return name;
    }

    public String getNormalizedShortDescription() {
        return normalizedShortDescription;
    }

    public String getPricingUrl() {
        return pricingUrl;
    }

    public MarketplaceCategoryTO getPrimaryCategory() {
        return primaryCategory;
    }

    public String getPrivacyPolicyUrl() {
        return privacyPolicyUrl;
    }

    public String getResourcePath() {
        return resourcePath;
    }

    public java.util.List<String> getScreenshotUrls() {
        return screenshotUrls;
    }

    public MarketplaceCategoryTO getSecondaryCategory() {
        return secondaryCategory;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getSlug() {
        return slug;
    }

    public String getStatusUrl() {
        return statusUrl;
    }

    public String getSupportEmail() {
        return supportEmail;
    }

    public String getSupportUrl() {
        return supportUrl;
    }

    public String getTermsOfServiceUrl() {
        return termsOfServiceUrl;
    }

    public String getUrl() {
        return url;
    }

    public boolean getViewerCanAddPlans() {
        return viewerCanAddPlans;
    }

    public boolean getViewerCanApprove() {
        return viewerCanApprove;
    }

    public boolean getViewerCanDelist() {
        return viewerCanDelist;
    }

    public boolean getViewerCanEdit() {
        return viewerCanEdit;
    }

    public boolean getViewerCanEditCategories() {
        return viewerCanEditCategories;
    }

    public boolean getViewerCanEditPlans() {
        return viewerCanEditPlans;
    }

    public boolean getViewerCanRedraft() {
        return viewerCanRedraft;
    }

    public boolean getViewerCanReject() {
        return viewerCanReject;
    }

    public boolean getViewerCanRequestApproval() {
        return viewerCanRequestApproval;
    }

    public boolean getViewerHasPurchased() {
        return viewerHasPurchased;
    }

    public boolean getViewerHasPurchasedForAllOrganizations() {
        return viewerHasPurchasedForAllOrganizations;
    }

    public boolean getViewerIsListingAdmin() {
        return viewerIsListingAdmin;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final MarketplaceListingTO that = (MarketplaceListingTO) obj;
        return Objects.equals(app, that.app)
            && Objects.equals(companyUrl, that.companyUrl)
            && Objects.equals(configurationResourcePath, that.configurationResourcePath)
            && Objects.equals(configurationUrl, that.configurationUrl)
            && Objects.equals(documentationUrl, that.documentationUrl)
            && Objects.equals(extendedDescription, that.extendedDescription)
            && Objects.equals(extendedDescriptionHTML, that.extendedDescriptionHTML)
            && Objects.equals(fullDescription, that.fullDescription)
            && Objects.equals(fullDescriptionHTML, that.fullDescriptionHTML)
            && Objects.equals(hasApprovalBeenRequested, that.hasApprovalBeenRequested)
            && Objects.equals(hasPublishedFreeTrialPlans, that.hasPublishedFreeTrialPlans)
            && Objects.equals(hasTermsOfService, that.hasTermsOfService)
            && Objects.equals(howItWorks, that.howItWorks)
            && Objects.equals(howItWorksHTML, that.howItWorksHTML)
            && Objects.equals(id, that.id)
            && Objects.equals(installationUrl, that.installationUrl)
            && Objects.equals(installedForViewer, that.installedForViewer)
            && Objects.equals(isApproved, that.isApproved)
            && Objects.equals(isArchived, that.isArchived)
            && Objects.equals(isDelisted, that.isDelisted)
            && Objects.equals(isDraft, that.isDraft)
            && Objects.equals(isPaid, that.isPaid)
            && Objects.equals(isPublic, that.isPublic)
            && Objects.equals(isRejected, that.isRejected)
            && Objects.equals(isUnverified, that.isUnverified)
            && Objects.equals(isUnverifiedPending, that.isUnverifiedPending)
            && Objects.equals(isVerificationPendingFromDraft, that.isVerificationPendingFromDraft)
            && Objects.equals(isVerificationPendingFromUnverified, that.isVerificationPendingFromUnverified)
            && Objects.equals(isVerified, that.isVerified)
            && Objects.equals(logoBackgroundColor, that.logoBackgroundColor)
            && Objects.equals(name, that.name)
            && Objects.equals(normalizedShortDescription, that.normalizedShortDescription)
            && Objects.equals(pricingUrl, that.pricingUrl)
            && Objects.equals(primaryCategory, that.primaryCategory)
            && Objects.equals(privacyPolicyUrl, that.privacyPolicyUrl)
            && Objects.equals(resourcePath, that.resourcePath)
            && Objects.equals(screenshotUrls, that.screenshotUrls)
            && Objects.equals(secondaryCategory, that.secondaryCategory)
            && Objects.equals(shortDescription, that.shortDescription)
            && Objects.equals(slug, that.slug)
            && Objects.equals(statusUrl, that.statusUrl)
            && Objects.equals(supportEmail, that.supportEmail)
            && Objects.equals(supportUrl, that.supportUrl)
            && Objects.equals(termsOfServiceUrl, that.termsOfServiceUrl)
            && Objects.equals(url, that.url)
            && Objects.equals(viewerCanAddPlans, that.viewerCanAddPlans)
            && Objects.equals(viewerCanApprove, that.viewerCanApprove)
            && Objects.equals(viewerCanDelist, that.viewerCanDelist)
            && Objects.equals(viewerCanEdit, that.viewerCanEdit)
            && Objects.equals(viewerCanEditCategories, that.viewerCanEditCategories)
            && Objects.equals(viewerCanEditPlans, that.viewerCanEditPlans)
            && Objects.equals(viewerCanRedraft, that.viewerCanRedraft)
            && Objects.equals(viewerCanReject, that.viewerCanReject)
            && Objects.equals(viewerCanRequestApproval, that.viewerCanRequestApproval)
            && Objects.equals(viewerHasPurchased, that.viewerHasPurchased)
            && Objects.equals(viewerHasPurchasedForAllOrganizations, that.viewerHasPurchasedForAllOrganizations)
            && Objects.equals(viewerIsListingAdmin, that.viewerIsListingAdmin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(app, companyUrl, configurationResourcePath, configurationUrl, documentationUrl, extendedDescription, extendedDescriptionHTML, fullDescription, fullDescriptionHTML, hasApprovalBeenRequested, hasPublishedFreeTrialPlans, hasTermsOfService, howItWorks, howItWorksHTML, id, installationUrl, installedForViewer, isApproved, isArchived, isDelisted, isDraft, isPaid, isPublic, isRejected, isUnverified, isUnverifiedPending, isVerificationPendingFromDraft, isVerificationPendingFromUnverified, isVerified, logoBackgroundColor, name, normalizedShortDescription, pricingUrl, primaryCategory, privacyPolicyUrl, resourcePath, screenshotUrls, secondaryCategory, shortDescription, slug, statusUrl, supportEmail, supportUrl, termsOfServiceUrl, url, viewerCanAddPlans, viewerCanApprove, viewerCanDelist, viewerCanEdit, viewerCanEditCategories, viewerCanEditPlans, viewerCanRedraft, viewerCanReject, viewerCanRequestApproval, viewerHasPurchased, viewerHasPurchasedForAllOrganizations, viewerIsListingAdmin);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (app != null) {
            joiner.add("app: " + GraphQLRequestSerializer.getEntry(app));
        }
        if (companyUrl != null) {
            joiner.add("companyUrl: " + GraphQLRequestSerializer.getEntry(companyUrl));
        }
        if (configurationResourcePath != null) {
            joiner.add("configurationResourcePath: " + GraphQLRequestSerializer.getEntry(configurationResourcePath));
        }
        if (configurationUrl != null) {
            joiner.add("configurationUrl: " + GraphQLRequestSerializer.getEntry(configurationUrl));
        }
        if (documentationUrl != null) {
            joiner.add("documentationUrl: " + GraphQLRequestSerializer.getEntry(documentationUrl));
        }
        if (extendedDescription != null) {
            joiner.add("extendedDescription: " + GraphQLRequestSerializer.getEntry(extendedDescription));
        }
        if (extendedDescriptionHTML != null) {
            joiner.add("extendedDescriptionHTML: " + GraphQLRequestSerializer.getEntry(extendedDescriptionHTML));
        }
        if (fullDescription != null) {
            joiner.add("fullDescription: " + GraphQLRequestSerializer.getEntry(fullDescription));
        }
        if (fullDescriptionHTML != null) {
            joiner.add("fullDescriptionHTML: " + GraphQLRequestSerializer.getEntry(fullDescriptionHTML));
        }
        joiner.add("hasApprovalBeenRequested: " + GraphQLRequestSerializer.getEntry(hasApprovalBeenRequested));
        joiner.add("hasPublishedFreeTrialPlans: " + GraphQLRequestSerializer.getEntry(hasPublishedFreeTrialPlans));
        joiner.add("hasTermsOfService: " + GraphQLRequestSerializer.getEntry(hasTermsOfService));
        if (howItWorks != null) {
            joiner.add("howItWorks: " + GraphQLRequestSerializer.getEntry(howItWorks));
        }
        if (howItWorksHTML != null) {
            joiner.add("howItWorksHTML: " + GraphQLRequestSerializer.getEntry(howItWorksHTML));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (installationUrl != null) {
            joiner.add("installationUrl: " + GraphQLRequestSerializer.getEntry(installationUrl));
        }
        joiner.add("installedForViewer: " + GraphQLRequestSerializer.getEntry(installedForViewer));
        joiner.add("isApproved: " + GraphQLRequestSerializer.getEntry(isApproved));
        joiner.add("isArchived: " + GraphQLRequestSerializer.getEntry(isArchived));
        joiner.add("isDelisted: " + GraphQLRequestSerializer.getEntry(isDelisted));
        joiner.add("isDraft: " + GraphQLRequestSerializer.getEntry(isDraft));
        joiner.add("isPaid: " + GraphQLRequestSerializer.getEntry(isPaid));
        joiner.add("isPublic: " + GraphQLRequestSerializer.getEntry(isPublic));
        joiner.add("isRejected: " + GraphQLRequestSerializer.getEntry(isRejected));
        joiner.add("isUnverified: " + GraphQLRequestSerializer.getEntry(isUnverified));
        joiner.add("isUnverifiedPending: " + GraphQLRequestSerializer.getEntry(isUnverifiedPending));
        joiner.add("isVerificationPendingFromDraft: " + GraphQLRequestSerializer.getEntry(isVerificationPendingFromDraft));
        joiner.add("isVerificationPendingFromUnverified: " + GraphQLRequestSerializer.getEntry(isVerificationPendingFromUnverified));
        joiner.add("isVerified: " + GraphQLRequestSerializer.getEntry(isVerified));
        if (logoBackgroundColor != null) {
            joiner.add("logoBackgroundColor: " + GraphQLRequestSerializer.getEntry(logoBackgroundColor));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (normalizedShortDescription != null) {
            joiner.add("normalizedShortDescription: " + GraphQLRequestSerializer.getEntry(normalizedShortDescription));
        }
        if (pricingUrl != null) {
            joiner.add("pricingUrl: " + GraphQLRequestSerializer.getEntry(pricingUrl));
        }
        if (primaryCategory != null) {
            joiner.add("primaryCategory: " + GraphQLRequestSerializer.getEntry(primaryCategory));
        }
        if (privacyPolicyUrl != null) {
            joiner.add("privacyPolicyUrl: " + GraphQLRequestSerializer.getEntry(privacyPolicyUrl));
        }
        if (resourcePath != null) {
            joiner.add("resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath));
        }
        if (screenshotUrls != null) {
            joiner.add("screenshotUrls: " + GraphQLRequestSerializer.getEntry(screenshotUrls));
        }
        if (secondaryCategory != null) {
            joiner.add("secondaryCategory: " + GraphQLRequestSerializer.getEntry(secondaryCategory));
        }
        if (shortDescription != null) {
            joiner.add("shortDescription: " + GraphQLRequestSerializer.getEntry(shortDescription));
        }
        if (slug != null) {
            joiner.add("slug: " + GraphQLRequestSerializer.getEntry(slug));
        }
        if (statusUrl != null) {
            joiner.add("statusUrl: " + GraphQLRequestSerializer.getEntry(statusUrl));
        }
        if (supportEmail != null) {
            joiner.add("supportEmail: " + GraphQLRequestSerializer.getEntry(supportEmail));
        }
        if (supportUrl != null) {
            joiner.add("supportUrl: " + GraphQLRequestSerializer.getEntry(supportUrl));
        }
        if (termsOfServiceUrl != null) {
            joiner.add("termsOfServiceUrl: " + GraphQLRequestSerializer.getEntry(termsOfServiceUrl));
        }
        if (url != null) {
            joiner.add("url: " + GraphQLRequestSerializer.getEntry(url));
        }
        joiner.add("viewerCanAddPlans: " + GraphQLRequestSerializer.getEntry(viewerCanAddPlans));
        joiner.add("viewerCanApprove: " + GraphQLRequestSerializer.getEntry(viewerCanApprove));
        joiner.add("viewerCanDelist: " + GraphQLRequestSerializer.getEntry(viewerCanDelist));
        joiner.add("viewerCanEdit: " + GraphQLRequestSerializer.getEntry(viewerCanEdit));
        joiner.add("viewerCanEditCategories: " + GraphQLRequestSerializer.getEntry(viewerCanEditCategories));
        joiner.add("viewerCanEditPlans: " + GraphQLRequestSerializer.getEntry(viewerCanEditPlans));
        joiner.add("viewerCanRedraft: " + GraphQLRequestSerializer.getEntry(viewerCanRedraft));
        joiner.add("viewerCanReject: " + GraphQLRequestSerializer.getEntry(viewerCanReject));
        joiner.add("viewerCanRequestApproval: " + GraphQLRequestSerializer.getEntry(viewerCanRequestApproval));
        joiner.add("viewerHasPurchased: " + GraphQLRequestSerializer.getEntry(viewerHasPurchased));
        joiner.add("viewerHasPurchasedForAllOrganizations: " + GraphQLRequestSerializer.getEntry(viewerHasPurchasedForAllOrganizations));
        joiner.add("viewerIsListingAdmin: " + GraphQLRequestSerializer.getEntry(viewerIsListingAdmin));
        return joiner.toString();
    }

    public static MarketplaceListingTO.Builder builder() {
        return new MarketplaceListingTO.Builder();
    }

    public static class Builder {

        private AppTO app;
        private String companyUrl;
        private String configurationResourcePath;
        private String configurationUrl;
        private String documentationUrl;
        private String extendedDescription;
        private String extendedDescriptionHTML;
        private String fullDescription;
        private String fullDescriptionHTML;
        private boolean hasApprovalBeenRequested;
        private boolean hasPublishedFreeTrialPlans;
        private boolean hasTermsOfService;
        private String howItWorks;
        private String howItWorksHTML;
        private String id;
        private String installationUrl;
        private boolean installedForViewer;
        private boolean isApproved;
        private boolean isArchived;
        private boolean isDelisted;
        private boolean isDraft;
        private boolean isPaid;
        private boolean isPublic;
        private boolean isRejected;
        private boolean isUnverified;
        private boolean isUnverifiedPending;
        private boolean isVerificationPendingFromDraft;
        private boolean isVerificationPendingFromUnverified;
        private boolean isVerified;
        private String logoBackgroundColor;
        private String name;
        private String normalizedShortDescription;
        private String pricingUrl;
        private MarketplaceCategoryTO primaryCategory;
        private String privacyPolicyUrl;
        private String resourcePath;
        private java.util.List<String> screenshotUrls;
        private MarketplaceCategoryTO secondaryCategory;
        private String shortDescription;
        private String slug;
        private String statusUrl;
        private String supportEmail;
        private String supportUrl;
        private String termsOfServiceUrl;
        private String url;
        private boolean viewerCanAddPlans;
        private boolean viewerCanApprove;
        private boolean viewerCanDelist;
        private boolean viewerCanEdit;
        private boolean viewerCanEditCategories;
        private boolean viewerCanEditPlans;
        private boolean viewerCanRedraft;
        private boolean viewerCanReject;
        private boolean viewerCanRequestApproval;
        private boolean viewerHasPurchased;
        private boolean viewerHasPurchasedForAllOrganizations;
        private boolean viewerIsListingAdmin;

        public Builder() {
        }

        public Builder setApp(AppTO app) {
            this.app = app;
            return this;
        }

        public Builder setCompanyUrl(String companyUrl) {
            this.companyUrl = companyUrl;
            return this;
        }

        public Builder setConfigurationResourcePath(String configurationResourcePath) {
            this.configurationResourcePath = configurationResourcePath;
            return this;
        }

        public Builder setConfigurationUrl(String configurationUrl) {
            this.configurationUrl = configurationUrl;
            return this;
        }

        public Builder setDocumentationUrl(String documentationUrl) {
            this.documentationUrl = documentationUrl;
            return this;
        }

        public Builder setExtendedDescription(String extendedDescription) {
            this.extendedDescription = extendedDescription;
            return this;
        }

        public Builder setExtendedDescriptionHTML(String extendedDescriptionHTML) {
            this.extendedDescriptionHTML = extendedDescriptionHTML;
            return this;
        }

        public Builder setFullDescription(String fullDescription) {
            this.fullDescription = fullDescription;
            return this;
        }

        public Builder setFullDescriptionHTML(String fullDescriptionHTML) {
            this.fullDescriptionHTML = fullDescriptionHTML;
            return this;
        }

        @Deprecated
        public Builder setHasApprovalBeenRequested(boolean hasApprovalBeenRequested) {
            this.hasApprovalBeenRequested = hasApprovalBeenRequested;
            return this;
        }

        public Builder setHasPublishedFreeTrialPlans(boolean hasPublishedFreeTrialPlans) {
            this.hasPublishedFreeTrialPlans = hasPublishedFreeTrialPlans;
            return this;
        }

        public Builder setHasTermsOfService(boolean hasTermsOfService) {
            this.hasTermsOfService = hasTermsOfService;
            return this;
        }

        public Builder setHowItWorks(String howItWorks) {
            this.howItWorks = howItWorks;
            return this;
        }

        public Builder setHowItWorksHTML(String howItWorksHTML) {
            this.howItWorksHTML = howItWorksHTML;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setInstallationUrl(String installationUrl) {
            this.installationUrl = installationUrl;
            return this;
        }

        public Builder setInstalledForViewer(boolean installedForViewer) {
            this.installedForViewer = installedForViewer;
            return this;
        }

        @Deprecated
        public Builder setIsApproved(boolean isApproved) {
            this.isApproved = isApproved;
            return this;
        }

        public Builder setIsArchived(boolean isArchived) {
            this.isArchived = isArchived;
            return this;
        }

        @Deprecated
        public Builder setIsDelisted(boolean isDelisted) {
            this.isDelisted = isDelisted;
            return this;
        }

        public Builder setIsDraft(boolean isDraft) {
            this.isDraft = isDraft;
            return this;
        }

        public Builder setIsPaid(boolean isPaid) {
            this.isPaid = isPaid;
            return this;
        }

        public Builder setIsPublic(boolean isPublic) {
            this.isPublic = isPublic;
            return this;
        }

        public Builder setIsRejected(boolean isRejected) {
            this.isRejected = isRejected;
            return this;
        }

        public Builder setIsUnverified(boolean isUnverified) {
            this.isUnverified = isUnverified;
            return this;
        }

        public Builder setIsUnverifiedPending(boolean isUnverifiedPending) {
            this.isUnverifiedPending = isUnverifiedPending;
            return this;
        }

        public Builder setIsVerificationPendingFromDraft(boolean isVerificationPendingFromDraft) {
            this.isVerificationPendingFromDraft = isVerificationPendingFromDraft;
            return this;
        }

        public Builder setIsVerificationPendingFromUnverified(boolean isVerificationPendingFromUnverified) {
            this.isVerificationPendingFromUnverified = isVerificationPendingFromUnverified;
            return this;
        }

        public Builder setIsVerified(boolean isVerified) {
            this.isVerified = isVerified;
            return this;
        }

        public Builder setLogoBackgroundColor(String logoBackgroundColor) {
            this.logoBackgroundColor = logoBackgroundColor;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setNormalizedShortDescription(String normalizedShortDescription) {
            this.normalizedShortDescription = normalizedShortDescription;
            return this;
        }

        public Builder setPricingUrl(String pricingUrl) {
            this.pricingUrl = pricingUrl;
            return this;
        }

        public Builder setPrimaryCategory(MarketplaceCategoryTO primaryCategory) {
            this.primaryCategory = primaryCategory;
            return this;
        }

        public Builder setPrivacyPolicyUrl(String privacyPolicyUrl) {
            this.privacyPolicyUrl = privacyPolicyUrl;
            return this;
        }

        public Builder setResourcePath(String resourcePath) {
            this.resourcePath = resourcePath;
            return this;
        }

        public Builder setScreenshotUrls(java.util.List<String> screenshotUrls) {
            this.screenshotUrls = screenshotUrls;
            return this;
        }

        public Builder setSecondaryCategory(MarketplaceCategoryTO secondaryCategory) {
            this.secondaryCategory = secondaryCategory;
            return this;
        }

        public Builder setShortDescription(String shortDescription) {
            this.shortDescription = shortDescription;
            return this;
        }

        public Builder setSlug(String slug) {
            this.slug = slug;
            return this;
        }

        public Builder setStatusUrl(String statusUrl) {
            this.statusUrl = statusUrl;
            return this;
        }

        public Builder setSupportEmail(String supportEmail) {
            this.supportEmail = supportEmail;
            return this;
        }

        public Builder setSupportUrl(String supportUrl) {
            this.supportUrl = supportUrl;
            return this;
        }

        public Builder setTermsOfServiceUrl(String termsOfServiceUrl) {
            this.termsOfServiceUrl = termsOfServiceUrl;
            return this;
        }

        public Builder setUrl(String url) {
            this.url = url;
            return this;
        }

        public Builder setViewerCanAddPlans(boolean viewerCanAddPlans) {
            this.viewerCanAddPlans = viewerCanAddPlans;
            return this;
        }

        public Builder setViewerCanApprove(boolean viewerCanApprove) {
            this.viewerCanApprove = viewerCanApprove;
            return this;
        }

        public Builder setViewerCanDelist(boolean viewerCanDelist) {
            this.viewerCanDelist = viewerCanDelist;
            return this;
        }

        public Builder setViewerCanEdit(boolean viewerCanEdit) {
            this.viewerCanEdit = viewerCanEdit;
            return this;
        }

        public Builder setViewerCanEditCategories(boolean viewerCanEditCategories) {
            this.viewerCanEditCategories = viewerCanEditCategories;
            return this;
        }

        public Builder setViewerCanEditPlans(boolean viewerCanEditPlans) {
            this.viewerCanEditPlans = viewerCanEditPlans;
            return this;
        }

        public Builder setViewerCanRedraft(boolean viewerCanRedraft) {
            this.viewerCanRedraft = viewerCanRedraft;
            return this;
        }

        public Builder setViewerCanReject(boolean viewerCanReject) {
            this.viewerCanReject = viewerCanReject;
            return this;
        }

        public Builder setViewerCanRequestApproval(boolean viewerCanRequestApproval) {
            this.viewerCanRequestApproval = viewerCanRequestApproval;
            return this;
        }

        public Builder setViewerHasPurchased(boolean viewerHasPurchased) {
            this.viewerHasPurchased = viewerHasPurchased;
            return this;
        }

        public Builder setViewerHasPurchasedForAllOrganizations(boolean viewerHasPurchasedForAllOrganizations) {
            this.viewerHasPurchasedForAllOrganizations = viewerHasPurchasedForAllOrganizations;
            return this;
        }

        public Builder setViewerIsListingAdmin(boolean viewerIsListingAdmin) {
            this.viewerIsListingAdmin = viewerIsListingAdmin;
            return this;
        }


        public MarketplaceListingTO build() {
            return new MarketplaceListingTO(app, companyUrl, configurationResourcePath, configurationUrl, documentationUrl, extendedDescription, extendedDescriptionHTML, fullDescription, fullDescriptionHTML, hasApprovalBeenRequested, hasPublishedFreeTrialPlans, hasTermsOfService, howItWorks, howItWorksHTML, id, installationUrl, installedForViewer, isApproved, isArchived, isDelisted, isDraft, isPaid, isPublic, isRejected, isUnverified, isUnverifiedPending, isVerificationPendingFromDraft, isVerificationPendingFromUnverified, isVerified, logoBackgroundColor, name, normalizedShortDescription, pricingUrl, primaryCategory, privacyPolicyUrl, resourcePath, screenshotUrls, secondaryCategory, shortDescription, slug, statusUrl, supportEmail, supportUrl, termsOfServiceUrl, url, viewerCanAddPlans, viewerCanApprove, viewerCanDelist, viewerCanEdit, viewerCanEditCategories, viewerCanEditPlans, viewerCanRedraft, viewerCanReject, viewerCanRequestApproval, viewerHasPurchased, viewerHasPurchasedForAllOrganizations, viewerIsListingAdmin);
        }

    }
}
