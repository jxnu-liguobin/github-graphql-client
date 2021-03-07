package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class RepositoryTO implements java.io.Serializable, SearchResultItemTO, CollectionItemContentTO, PermissionGranterTO, PinnableItemTO, RegistryPackageOwnerTO, StarrableTO, ProjectOwnerTO, SubscribableTO, UniformResourceLocatableTO, RepositoryInfoTO, NodeTO {

    private CodeOfConductTO codeOfConduct;
    @javax.validation.constraints.NotNull
    private String createdAt;
    private Integer databaseId;
    private RefTO defaultBranchRef;
    private String description;
    @javax.validation.constraints.NotNull
    private String descriptionHTML;
    private Integer diskUsage;
    private int forkCount;
    private boolean hasIssuesEnabled;
    private boolean hasWikiEnabled;
    private String homepageUrl;
    @javax.validation.constraints.NotNull
    private String id;
    private boolean isArchived;
    private boolean isDisabled;
    private boolean isFork;
    private boolean isLocked;
    private boolean isMirror;
    private boolean isPrivate;
    private boolean isTemplate;
    private LicenseTO licenseInfo;
    private RepositoryLockReasonTO lockReason;
    private boolean mergeCommitAllowed;
    private String mirrorUrl;
    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private String nameWithOwner;
    @javax.validation.constraints.NotNull
    private String openGraphImageUrl;
    @javax.validation.constraints.NotNull
    private RepositoryOwnerTO owner;
    private RepositoryTO parent;
    private LanguageTO primaryLanguage;
    @javax.validation.constraints.NotNull
    private String projectsResourcePath;
    @javax.validation.constraints.NotNull
    private String projectsUrl;
    private String pushedAt;
    private boolean rebaseMergeAllowed;
    @javax.validation.constraints.NotNull
    private String resourcePath;
    private boolean squashMergeAllowed;
    @javax.validation.constraints.NotNull
    private String sshUrl;
    private RepositoryTO templateRepository;
    @javax.validation.constraints.NotNull
    private String updatedAt;
    @javax.validation.constraints.NotNull
    private String url;
    private boolean usesCustomOpenGraphImage;
    private boolean viewerCanAdminister;
    private boolean viewerCanCreateProjects;
    private boolean viewerCanSubscribe;
    private boolean viewerCanUpdateTopics;
    private boolean viewerHasStarred;
    private RepositoryPermissionTO viewerPermission;
    private SubscriptionStateTO viewerSubscription;

    public RepositoryTO() {
    }

    public RepositoryTO(CodeOfConductTO codeOfConduct, String createdAt, Integer databaseId, RefTO defaultBranchRef, String description, String descriptionHTML, Integer diskUsage, int forkCount, boolean hasIssuesEnabled, boolean hasWikiEnabled, String homepageUrl, String id, boolean isArchived, boolean isDisabled, boolean isFork, boolean isLocked, boolean isMirror, boolean isPrivate, boolean isTemplate, LicenseTO licenseInfo, RepositoryLockReasonTO lockReason, boolean mergeCommitAllowed, String mirrorUrl, String name, String nameWithOwner, String openGraphImageUrl, RepositoryOwnerTO owner, RepositoryTO parent, LanguageTO primaryLanguage, String projectsResourcePath, String projectsUrl, String pushedAt, boolean rebaseMergeAllowed, String resourcePath, boolean squashMergeAllowed, String sshUrl, RepositoryTO templateRepository, String updatedAt, String url, boolean usesCustomOpenGraphImage, boolean viewerCanAdminister, boolean viewerCanCreateProjects, boolean viewerCanSubscribe, boolean viewerCanUpdateTopics, boolean viewerHasStarred, RepositoryPermissionTO viewerPermission, SubscriptionStateTO viewerSubscription) {
        this.codeOfConduct = codeOfConduct;
        this.createdAt = createdAt;
        this.databaseId = databaseId;
        this.defaultBranchRef = defaultBranchRef;
        this.description = description;
        this.descriptionHTML = descriptionHTML;
        this.diskUsage = diskUsage;
        this.forkCount = forkCount;
        this.hasIssuesEnabled = hasIssuesEnabled;
        this.hasWikiEnabled = hasWikiEnabled;
        this.homepageUrl = homepageUrl;
        this.id = id;
        this.isArchived = isArchived;
        this.isDisabled = isDisabled;
        this.isFork = isFork;
        this.isLocked = isLocked;
        this.isMirror = isMirror;
        this.isPrivate = isPrivate;
        this.isTemplate = isTemplate;
        this.licenseInfo = licenseInfo;
        this.lockReason = lockReason;
        this.mergeCommitAllowed = mergeCommitAllowed;
        this.mirrorUrl = mirrorUrl;
        this.name = name;
        this.nameWithOwner = nameWithOwner;
        this.openGraphImageUrl = openGraphImageUrl;
        this.owner = owner;
        this.parent = parent;
        this.primaryLanguage = primaryLanguage;
        this.projectsResourcePath = projectsResourcePath;
        this.projectsUrl = projectsUrl;
        this.pushedAt = pushedAt;
        this.rebaseMergeAllowed = rebaseMergeAllowed;
        this.resourcePath = resourcePath;
        this.squashMergeAllowed = squashMergeAllowed;
        this.sshUrl = sshUrl;
        this.templateRepository = templateRepository;
        this.updatedAt = updatedAt;
        this.url = url;
        this.usesCustomOpenGraphImage = usesCustomOpenGraphImage;
        this.viewerCanAdminister = viewerCanAdminister;
        this.viewerCanCreateProjects = viewerCanCreateProjects;
        this.viewerCanSubscribe = viewerCanSubscribe;
        this.viewerCanUpdateTopics = viewerCanUpdateTopics;
        this.viewerHasStarred = viewerHasStarred;
        this.viewerPermission = viewerPermission;
        this.viewerSubscription = viewerSubscription;
    }

    public CodeOfConductTO getCodeOfConduct() {
        return codeOfConduct;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public Integer getDatabaseId() {
        return databaseId;
    }

    public RefTO getDefaultBranchRef() {
        return defaultBranchRef;
    }

    public String getDescription() {
        return description;
    }

    public String getDescriptionHTML() {
        return descriptionHTML;
    }

    public Integer getDiskUsage() {
        return diskUsage;
    }

    public int getForkCount() {
        return forkCount;
    }

    public boolean getHasIssuesEnabled() {
        return hasIssuesEnabled;
    }

    public boolean getHasWikiEnabled() {
        return hasWikiEnabled;
    }

    public String getHomepageUrl() {
        return homepageUrl;
    }

    public String getId() {
        return id;
    }

    public boolean getIsArchived() {
        return isArchived;
    }

    public boolean getIsDisabled() {
        return isDisabled;
    }

    public boolean getIsFork() {
        return isFork;
    }

    public boolean getIsLocked() {
        return isLocked;
    }

    public boolean getIsMirror() {
        return isMirror;
    }

    public boolean getIsPrivate() {
        return isPrivate;
    }

    public boolean getIsTemplate() {
        return isTemplate;
    }

    public LicenseTO getLicenseInfo() {
        return licenseInfo;
    }

    public RepositoryLockReasonTO getLockReason() {
        return lockReason;
    }

    public boolean getMergeCommitAllowed() {
        return mergeCommitAllowed;
    }

    public String getMirrorUrl() {
        return mirrorUrl;
    }

    public String getName() {
        return name;
    }

    public String getNameWithOwner() {
        return nameWithOwner;
    }

    public String getOpenGraphImageUrl() {
        return openGraphImageUrl;
    }

    public RepositoryOwnerTO getOwner() {
        return owner;
    }

    public RepositoryTO getParent() {
        return parent;
    }

    public LanguageTO getPrimaryLanguage() {
        return primaryLanguage;
    }

    public String getProjectsResourcePath() {
        return projectsResourcePath;
    }

    public String getProjectsUrl() {
        return projectsUrl;
    }

    public String getPushedAt() {
        return pushedAt;
    }

    public boolean getRebaseMergeAllowed() {
        return rebaseMergeAllowed;
    }

    public String getResourcePath() {
        return resourcePath;
    }

    public boolean getSquashMergeAllowed() {
        return squashMergeAllowed;
    }

    public String getSshUrl() {
        return sshUrl;
    }

    public RepositoryTO getTemplateRepository() {
        return templateRepository;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public String getUrl() {
        return url;
    }

    public boolean getUsesCustomOpenGraphImage() {
        return usesCustomOpenGraphImage;
    }

    public boolean getViewerCanAdminister() {
        return viewerCanAdminister;
    }

    public boolean getViewerCanCreateProjects() {
        return viewerCanCreateProjects;
    }

    public boolean getViewerCanSubscribe() {
        return viewerCanSubscribe;
    }

    public boolean getViewerCanUpdateTopics() {
        return viewerCanUpdateTopics;
    }

    public boolean getViewerHasStarred() {
        return viewerHasStarred;
    }

    public RepositoryPermissionTO getViewerPermission() {
        return viewerPermission;
    }

    public SubscriptionStateTO getViewerSubscription() {
        return viewerSubscription;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (codeOfConduct != null) {
            joiner.add("codeOfConduct: " + GraphQLRequestSerializer.getEntry(codeOfConduct));
        }
        if (createdAt != null) {
            joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt));
        }
        if (databaseId != null) {
            joiner.add("databaseId: " + GraphQLRequestSerializer.getEntry(databaseId));
        }
        if (defaultBranchRef != null) {
            joiner.add("defaultBranchRef: " + GraphQLRequestSerializer.getEntry(defaultBranchRef));
        }
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description));
        }
        if (descriptionHTML != null) {
            joiner.add("descriptionHTML: " + GraphQLRequestSerializer.getEntry(descriptionHTML));
        }
        if (diskUsage != null) {
            joiner.add("diskUsage: " + GraphQLRequestSerializer.getEntry(diskUsage));
        }
        joiner.add("forkCount: " + GraphQLRequestSerializer.getEntry(forkCount));
        joiner.add("hasIssuesEnabled: " + GraphQLRequestSerializer.getEntry(hasIssuesEnabled));
        joiner.add("hasWikiEnabled: " + GraphQLRequestSerializer.getEntry(hasWikiEnabled));
        if (homepageUrl != null) {
            joiner.add("homepageUrl: " + GraphQLRequestSerializer.getEntry(homepageUrl));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        joiner.add("isArchived: " + GraphQLRequestSerializer.getEntry(isArchived));
        joiner.add("isDisabled: " + GraphQLRequestSerializer.getEntry(isDisabled));
        joiner.add("isFork: " + GraphQLRequestSerializer.getEntry(isFork));
        joiner.add("isLocked: " + GraphQLRequestSerializer.getEntry(isLocked));
        joiner.add("isMirror: " + GraphQLRequestSerializer.getEntry(isMirror));
        joiner.add("isPrivate: " + GraphQLRequestSerializer.getEntry(isPrivate));
        joiner.add("isTemplate: " + GraphQLRequestSerializer.getEntry(isTemplate));
        if (licenseInfo != null) {
            joiner.add("licenseInfo: " + GraphQLRequestSerializer.getEntry(licenseInfo));
        }
        if (lockReason != null) {
            joiner.add("lockReason: " + GraphQLRequestSerializer.getEntry(lockReason));
        }
        joiner.add("mergeCommitAllowed: " + GraphQLRequestSerializer.getEntry(mergeCommitAllowed));
        if (mirrorUrl != null) {
            joiner.add("mirrorUrl: " + GraphQLRequestSerializer.getEntry(mirrorUrl));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (nameWithOwner != null) {
            joiner.add("nameWithOwner: " + GraphQLRequestSerializer.getEntry(nameWithOwner));
        }
        if (openGraphImageUrl != null) {
            joiner.add("openGraphImageUrl: " + GraphQLRequestSerializer.getEntry(openGraphImageUrl));
        }
        if (owner != null) {
            joiner.add("owner: " + GraphQLRequestSerializer.getEntry(owner));
        }
        if (parent != null) {
            joiner.add("parent: " + GraphQLRequestSerializer.getEntry(parent));
        }
        if (primaryLanguage != null) {
            joiner.add("primaryLanguage: " + GraphQLRequestSerializer.getEntry(primaryLanguage));
        }
        if (projectsResourcePath != null) {
            joiner.add("projectsResourcePath: " + GraphQLRequestSerializer.getEntry(projectsResourcePath));
        }
        if (projectsUrl != null) {
            joiner.add("projectsUrl: " + GraphQLRequestSerializer.getEntry(projectsUrl));
        }
        if (pushedAt != null) {
            joiner.add("pushedAt: " + GraphQLRequestSerializer.getEntry(pushedAt));
        }
        joiner.add("rebaseMergeAllowed: " + GraphQLRequestSerializer.getEntry(rebaseMergeAllowed));
        if (resourcePath != null) {
            joiner.add("resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath));
        }
        joiner.add("squashMergeAllowed: " + GraphQLRequestSerializer.getEntry(squashMergeAllowed));
        if (sshUrl != null) {
            joiner.add("sshUrl: " + GraphQLRequestSerializer.getEntry(sshUrl));
        }
        if (templateRepository != null) {
            joiner.add("templateRepository: " + GraphQLRequestSerializer.getEntry(templateRepository));
        }
        if (updatedAt != null) {
            joiner.add("updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt));
        }
        if (url != null) {
            joiner.add("url: " + GraphQLRequestSerializer.getEntry(url));
        }
        joiner.add("usesCustomOpenGraphImage: " + GraphQLRequestSerializer.getEntry(usesCustomOpenGraphImage));
        joiner.add("viewerCanAdminister: " + GraphQLRequestSerializer.getEntry(viewerCanAdminister));
        joiner.add("viewerCanCreateProjects: " + GraphQLRequestSerializer.getEntry(viewerCanCreateProjects));
        joiner.add("viewerCanSubscribe: " + GraphQLRequestSerializer.getEntry(viewerCanSubscribe));
        joiner.add("viewerCanUpdateTopics: " + GraphQLRequestSerializer.getEntry(viewerCanUpdateTopics));
        joiner.add("viewerHasStarred: " + GraphQLRequestSerializer.getEntry(viewerHasStarred));
        if (viewerPermission != null) {
            joiner.add("viewerPermission: " + GraphQLRequestSerializer.getEntry(viewerPermission));
        }
        if (viewerSubscription != null) {
            joiner.add("viewerSubscription: " + GraphQLRequestSerializer.getEntry(viewerSubscription));
        }
        return joiner.toString();
    }

    public static RepositoryTO.Builder builder() {
        return new RepositoryTO.Builder();
    }

    public static class Builder {

        private CodeOfConductTO codeOfConduct;
        private String createdAt;
        private Integer databaseId;
        private RefTO defaultBranchRef;
        private String description;
        private String descriptionHTML;
        private Integer diskUsage;
        private int forkCount;
        private boolean hasIssuesEnabled;
        private boolean hasWikiEnabled;
        private String homepageUrl;
        private String id;
        private boolean isArchived;
        private boolean isDisabled;
        private boolean isFork;
        private boolean isLocked;
        private boolean isMirror;
        private boolean isPrivate;
        private boolean isTemplate;
        private LicenseTO licenseInfo;
        private RepositoryLockReasonTO lockReason;
        private boolean mergeCommitAllowed;
        private String mirrorUrl;
        private String name;
        private String nameWithOwner;
        private String openGraphImageUrl;
        private RepositoryOwnerTO owner;
        private RepositoryTO parent;
        private LanguageTO primaryLanguage;
        private String projectsResourcePath;
        private String projectsUrl;
        private String pushedAt;
        private boolean rebaseMergeAllowed;
        private String resourcePath;
        private boolean squashMergeAllowed;
        private String sshUrl;
        private RepositoryTO templateRepository;
        private String updatedAt;
        private String url;
        private boolean usesCustomOpenGraphImage;
        private boolean viewerCanAdminister;
        private boolean viewerCanCreateProjects;
        private boolean viewerCanSubscribe;
        private boolean viewerCanUpdateTopics;
        private boolean viewerHasStarred;
        private RepositoryPermissionTO viewerPermission;
        private SubscriptionStateTO viewerSubscription;

        public Builder() {
        }

        public Builder setCodeOfConduct(CodeOfConductTO codeOfConduct) {
            this.codeOfConduct = codeOfConduct;
            return this;
        }

        public Builder setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder setDatabaseId(Integer databaseId) {
            this.databaseId = databaseId;
            return this;
        }

        public Builder setDefaultBranchRef(RefTO defaultBranchRef) {
            this.defaultBranchRef = defaultBranchRef;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setDescriptionHTML(String descriptionHTML) {
            this.descriptionHTML = descriptionHTML;
            return this;
        }

        public Builder setDiskUsage(Integer diskUsage) {
            this.diskUsage = diskUsage;
            return this;
        }

        public Builder setForkCount(int forkCount) {
            this.forkCount = forkCount;
            return this;
        }

        public Builder setHasIssuesEnabled(boolean hasIssuesEnabled) {
            this.hasIssuesEnabled = hasIssuesEnabled;
            return this;
        }

        public Builder setHasWikiEnabled(boolean hasWikiEnabled) {
            this.hasWikiEnabled = hasWikiEnabled;
            return this;
        }

        public Builder setHomepageUrl(String homepageUrl) {
            this.homepageUrl = homepageUrl;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setIsArchived(boolean isArchived) {
            this.isArchived = isArchived;
            return this;
        }

        public Builder setIsDisabled(boolean isDisabled) {
            this.isDisabled = isDisabled;
            return this;
        }

        public Builder setIsFork(boolean isFork) {
            this.isFork = isFork;
            return this;
        }

        public Builder setIsLocked(boolean isLocked) {
            this.isLocked = isLocked;
            return this;
        }

        public Builder setIsMirror(boolean isMirror) {
            this.isMirror = isMirror;
            return this;
        }

        public Builder setIsPrivate(boolean isPrivate) {
            this.isPrivate = isPrivate;
            return this;
        }

        public Builder setIsTemplate(boolean isTemplate) {
            this.isTemplate = isTemplate;
            return this;
        }

        public Builder setLicenseInfo(LicenseTO licenseInfo) {
            this.licenseInfo = licenseInfo;
            return this;
        }

        public Builder setLockReason(RepositoryLockReasonTO lockReason) {
            this.lockReason = lockReason;
            return this;
        }

        public Builder setMergeCommitAllowed(boolean mergeCommitAllowed) {
            this.mergeCommitAllowed = mergeCommitAllowed;
            return this;
        }

        public Builder setMirrorUrl(String mirrorUrl) {
            this.mirrorUrl = mirrorUrl;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setNameWithOwner(String nameWithOwner) {
            this.nameWithOwner = nameWithOwner;
            return this;
        }

        public Builder setOpenGraphImageUrl(String openGraphImageUrl) {
            this.openGraphImageUrl = openGraphImageUrl;
            return this;
        }

        public Builder setOwner(RepositoryOwnerTO owner) {
            this.owner = owner;
            return this;
        }

        public Builder setParent(RepositoryTO parent) {
            this.parent = parent;
            return this;
        }

        public Builder setPrimaryLanguage(LanguageTO primaryLanguage) {
            this.primaryLanguage = primaryLanguage;
            return this;
        }

        public Builder setProjectsResourcePath(String projectsResourcePath) {
            this.projectsResourcePath = projectsResourcePath;
            return this;
        }

        public Builder setProjectsUrl(String projectsUrl) {
            this.projectsUrl = projectsUrl;
            return this;
        }

        public Builder setPushedAt(String pushedAt) {
            this.pushedAt = pushedAt;
            return this;
        }

        public Builder setRebaseMergeAllowed(boolean rebaseMergeAllowed) {
            this.rebaseMergeAllowed = rebaseMergeAllowed;
            return this;
        }

        public Builder setResourcePath(String resourcePath) {
            this.resourcePath = resourcePath;
            return this;
        }

        public Builder setSquashMergeAllowed(boolean squashMergeAllowed) {
            this.squashMergeAllowed = squashMergeAllowed;
            return this;
        }

        public Builder setSshUrl(String sshUrl) {
            this.sshUrl = sshUrl;
            return this;
        }

        public Builder setTemplateRepository(RepositoryTO templateRepository) {
            this.templateRepository = templateRepository;
            return this;
        }

        public Builder setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public Builder setUrl(String url) {
            this.url = url;
            return this;
        }

        public Builder setUsesCustomOpenGraphImage(boolean usesCustomOpenGraphImage) {
            this.usesCustomOpenGraphImage = usesCustomOpenGraphImage;
            return this;
        }

        public Builder setViewerCanAdminister(boolean viewerCanAdminister) {
            this.viewerCanAdminister = viewerCanAdminister;
            return this;
        }

        public Builder setViewerCanCreateProjects(boolean viewerCanCreateProjects) {
            this.viewerCanCreateProjects = viewerCanCreateProjects;
            return this;
        }

        public Builder setViewerCanSubscribe(boolean viewerCanSubscribe) {
            this.viewerCanSubscribe = viewerCanSubscribe;
            return this;
        }

        public Builder setViewerCanUpdateTopics(boolean viewerCanUpdateTopics) {
            this.viewerCanUpdateTopics = viewerCanUpdateTopics;
            return this;
        }

        public Builder setViewerHasStarred(boolean viewerHasStarred) {
            this.viewerHasStarred = viewerHasStarred;
            return this;
        }

        public Builder setViewerPermission(RepositoryPermissionTO viewerPermission) {
            this.viewerPermission = viewerPermission;
            return this;
        }

        public Builder setViewerSubscription(SubscriptionStateTO viewerSubscription) {
            this.viewerSubscription = viewerSubscription;
            return this;
        }


        public RepositoryTO build() {
            return new RepositoryTO(codeOfConduct, createdAt, databaseId, defaultBranchRef, description, descriptionHTML, diskUsage, forkCount, hasIssuesEnabled, hasWikiEnabled, homepageUrl, id, isArchived, isDisabled, isFork, isLocked, isMirror, isPrivate, isTemplate, licenseInfo, lockReason, mergeCommitAllowed, mirrorUrl, name, nameWithOwner, openGraphImageUrl, owner, parent, primaryLanguage, projectsResourcePath, projectsUrl, pushedAt, rebaseMergeAllowed, resourcePath, squashMergeAllowed, sshUrl, templateRepository, updatedAt, url, usesCustomOpenGraphImage, viewerCanAdminister, viewerCanCreateProjects, viewerCanSubscribe, viewerCanUpdateTopics, viewerHasStarred, viewerPermission, viewerSubscription);
        }

    }
}
