package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class UserTO implements java.io.Serializable, AssigneeTO, SearchResultItemTO, ReviewDismissalAllowanceActorTO, CollectionItemContentTO, RequestedReviewerTO, PushAllowanceActorTO, RegistryPackageOwnerTO, SponsorableTO, ProjectOwnerTO, UniformResourceLocatableTO, RegistryPackageSearchTO, RepositoryOwnerTO, NodeTO, ProfileOwnerTO, ActorTO {

    private String bio;
    @javax.validation.constraints.NotNull
    private String bioHTML;
    private String company;
    @javax.validation.constraints.NotNull
    private String companyHTML;
    @javax.validation.constraints.NotNull
    private String createdAt;
    private Integer databaseId;
    @javax.validation.constraints.NotNull
    private String email;
    @javax.validation.constraints.NotNull
    private String id;
    private boolean isBountyHunter;
    private boolean isCampusExpert;
    private boolean isDeveloperProgramMember;
    private boolean isEmployee;
    private boolean isHireable;
    private boolean isSiteAdmin;
    private boolean isViewer;
    @javax.validation.constraints.NotNull
    private ProfileItemShowcaseTO itemShowcase;
    private String location;
    @javax.validation.constraints.NotNull
    private String login;
    private String name;
    private int pinnedItemsRemaining;
    @javax.validation.constraints.NotNull
    private String projectsResourcePath;
    @javax.validation.constraints.NotNull
    private String projectsUrl;
    @javax.validation.constraints.NotNull
    private String resourcePath;
    private UserStatusTO status;
    @javax.validation.constraints.NotNull
    private String updatedAt;
    @javax.validation.constraints.NotNull
    private String url;
    private boolean viewerCanChangePinnedItems;
    private boolean viewerCanCreateProjects;
    private boolean viewerCanFollow;
    private boolean viewerIsFollowing;
    private String websiteUrl;

    public UserTO() {
    }

    public UserTO(String bio, String bioHTML, String company, String companyHTML, String createdAt, Integer databaseId, String email, String id, boolean isBountyHunter, boolean isCampusExpert, boolean isDeveloperProgramMember, boolean isEmployee, boolean isHireable, boolean isSiteAdmin, boolean isViewer, ProfileItemShowcaseTO itemShowcase, String location, String login, String name, int pinnedItemsRemaining, String projectsResourcePath, String projectsUrl, String resourcePath, UserStatusTO status, String updatedAt, String url, boolean viewerCanChangePinnedItems, boolean viewerCanCreateProjects, boolean viewerCanFollow, boolean viewerIsFollowing, String websiteUrl) {
        this.bio = bio;
        this.bioHTML = bioHTML;
        this.company = company;
        this.companyHTML = companyHTML;
        this.createdAt = createdAt;
        this.databaseId = databaseId;
        this.email = email;
        this.id = id;
        this.isBountyHunter = isBountyHunter;
        this.isCampusExpert = isCampusExpert;
        this.isDeveloperProgramMember = isDeveloperProgramMember;
        this.isEmployee = isEmployee;
        this.isHireable = isHireable;
        this.isSiteAdmin = isSiteAdmin;
        this.isViewer = isViewer;
        this.itemShowcase = itemShowcase;
        this.location = location;
        this.login = login;
        this.name = name;
        this.pinnedItemsRemaining = pinnedItemsRemaining;
        this.projectsResourcePath = projectsResourcePath;
        this.projectsUrl = projectsUrl;
        this.resourcePath = resourcePath;
        this.status = status;
        this.updatedAt = updatedAt;
        this.url = url;
        this.viewerCanChangePinnedItems = viewerCanChangePinnedItems;
        this.viewerCanCreateProjects = viewerCanCreateProjects;
        this.viewerCanFollow = viewerCanFollow;
        this.viewerIsFollowing = viewerIsFollowing;
        this.websiteUrl = websiteUrl;
    }

    public String getBio() {
        return bio;
    }

    public String getBioHTML() {
        return bioHTML;
    }

    public String getCompany() {
        return company;
    }

    public String getCompanyHTML() {
        return companyHTML;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public Integer getDatabaseId() {
        return databaseId;
    }

    public String getEmail() {
        return email;
    }

    public String getId() {
        return id;
    }

    public boolean getIsBountyHunter() {
        return isBountyHunter;
    }

    public boolean getIsCampusExpert() {
        return isCampusExpert;
    }

    public boolean getIsDeveloperProgramMember() {
        return isDeveloperProgramMember;
    }

    public boolean getIsEmployee() {
        return isEmployee;
    }

    public boolean getIsHireable() {
        return isHireable;
    }

    public boolean getIsSiteAdmin() {
        return isSiteAdmin;
    }

    public boolean getIsViewer() {
        return isViewer;
    }

    public ProfileItemShowcaseTO getItemShowcase() {
        return itemShowcase;
    }

    public String getLocation() {
        return location;
    }

    public String getLogin() {
        return login;
    }

    public String getName() {
        return name;
    }

    public int getPinnedItemsRemaining() {
        return pinnedItemsRemaining;
    }

    public String getProjectsResourcePath() {
        return projectsResourcePath;
    }

    public String getProjectsUrl() {
        return projectsUrl;
    }

    public String getResourcePath() {
        return resourcePath;
    }

    public UserStatusTO getStatus() {
        return status;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public String getUrl() {
        return url;
    }

    public boolean getViewerCanChangePinnedItems() {
        return viewerCanChangePinnedItems;
    }

    public boolean getViewerCanCreateProjects() {
        return viewerCanCreateProjects;
    }

    public boolean getViewerCanFollow() {
        return viewerCanFollow;
    }

    public boolean getViewerIsFollowing() {
        return viewerIsFollowing;
    }

    public String getWebsiteUrl() {
        return websiteUrl;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final UserTO that = (UserTO) obj;
        return Objects.equals(bio, that.bio)
            && Objects.equals(bioHTML, that.bioHTML)
            && Objects.equals(company, that.company)
            && Objects.equals(companyHTML, that.companyHTML)
            && Objects.equals(createdAt, that.createdAt)
            && Objects.equals(databaseId, that.databaseId)
            && Objects.equals(email, that.email)
            && Objects.equals(id, that.id)
            && Objects.equals(isBountyHunter, that.isBountyHunter)
            && Objects.equals(isCampusExpert, that.isCampusExpert)
            && Objects.equals(isDeveloperProgramMember, that.isDeveloperProgramMember)
            && Objects.equals(isEmployee, that.isEmployee)
            && Objects.equals(isHireable, that.isHireable)
            && Objects.equals(isSiteAdmin, that.isSiteAdmin)
            && Objects.equals(isViewer, that.isViewer)
            && Objects.equals(itemShowcase, that.itemShowcase)
            && Objects.equals(location, that.location)
            && Objects.equals(login, that.login)
            && Objects.equals(name, that.name)
            && Objects.equals(pinnedItemsRemaining, that.pinnedItemsRemaining)
            && Objects.equals(projectsResourcePath, that.projectsResourcePath)
            && Objects.equals(projectsUrl, that.projectsUrl)
            && Objects.equals(resourcePath, that.resourcePath)
            && Objects.equals(status, that.status)
            && Objects.equals(updatedAt, that.updatedAt)
            && Objects.equals(url, that.url)
            && Objects.equals(viewerCanChangePinnedItems, that.viewerCanChangePinnedItems)
            && Objects.equals(viewerCanCreateProjects, that.viewerCanCreateProjects)
            && Objects.equals(viewerCanFollow, that.viewerCanFollow)
            && Objects.equals(viewerIsFollowing, that.viewerIsFollowing)
            && Objects.equals(websiteUrl, that.websiteUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bio, bioHTML, company, companyHTML, createdAt, databaseId, email, id, isBountyHunter, isCampusExpert, isDeveloperProgramMember, isEmployee, isHireable, isSiteAdmin, isViewer, itemShowcase, location, login, name, pinnedItemsRemaining, projectsResourcePath, projectsUrl, resourcePath, status, updatedAt, url, viewerCanChangePinnedItems, viewerCanCreateProjects, viewerCanFollow, viewerIsFollowing, websiteUrl);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (bio != null) {
            joiner.add("bio: " + GraphQLRequestSerializer.getEntry(bio));
        }
        if (bioHTML != null) {
            joiner.add("bioHTML: " + GraphQLRequestSerializer.getEntry(bioHTML));
        }
        if (company != null) {
            joiner.add("company: " + GraphQLRequestSerializer.getEntry(company));
        }
        if (companyHTML != null) {
            joiner.add("companyHTML: " + GraphQLRequestSerializer.getEntry(companyHTML));
        }
        if (createdAt != null) {
            joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt));
        }
        if (databaseId != null) {
            joiner.add("databaseId: " + GraphQLRequestSerializer.getEntry(databaseId));
        }
        if (email != null) {
            joiner.add("email: " + GraphQLRequestSerializer.getEntry(email));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        joiner.add("isBountyHunter: " + GraphQLRequestSerializer.getEntry(isBountyHunter));
        joiner.add("isCampusExpert: " + GraphQLRequestSerializer.getEntry(isCampusExpert));
        joiner.add("isDeveloperProgramMember: " + GraphQLRequestSerializer.getEntry(isDeveloperProgramMember));
        joiner.add("isEmployee: " + GraphQLRequestSerializer.getEntry(isEmployee));
        joiner.add("isHireable: " + GraphQLRequestSerializer.getEntry(isHireable));
        joiner.add("isSiteAdmin: " + GraphQLRequestSerializer.getEntry(isSiteAdmin));
        joiner.add("isViewer: " + GraphQLRequestSerializer.getEntry(isViewer));
        if (itemShowcase != null) {
            joiner.add("itemShowcase: " + GraphQLRequestSerializer.getEntry(itemShowcase));
        }
        if (location != null) {
            joiner.add("location: " + GraphQLRequestSerializer.getEntry(location));
        }
        if (login != null) {
            joiner.add("login: " + GraphQLRequestSerializer.getEntry(login));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        joiner.add("pinnedItemsRemaining: " + GraphQLRequestSerializer.getEntry(pinnedItemsRemaining));
        if (projectsResourcePath != null) {
            joiner.add("projectsResourcePath: " + GraphQLRequestSerializer.getEntry(projectsResourcePath));
        }
        if (projectsUrl != null) {
            joiner.add("projectsUrl: " + GraphQLRequestSerializer.getEntry(projectsUrl));
        }
        if (resourcePath != null) {
            joiner.add("resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath));
        }
        if (status != null) {
            joiner.add("status: " + GraphQLRequestSerializer.getEntry(status));
        }
        if (updatedAt != null) {
            joiner.add("updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt));
        }
        if (url != null) {
            joiner.add("url: " + GraphQLRequestSerializer.getEntry(url));
        }
        joiner.add("viewerCanChangePinnedItems: " + GraphQLRequestSerializer.getEntry(viewerCanChangePinnedItems));
        joiner.add("viewerCanCreateProjects: " + GraphQLRequestSerializer.getEntry(viewerCanCreateProjects));
        joiner.add("viewerCanFollow: " + GraphQLRequestSerializer.getEntry(viewerCanFollow));
        joiner.add("viewerIsFollowing: " + GraphQLRequestSerializer.getEntry(viewerIsFollowing));
        if (websiteUrl != null) {
            joiner.add("websiteUrl: " + GraphQLRequestSerializer.getEntry(websiteUrl));
        }
        return joiner.toString();
    }

    public static UserTO.Builder builder() {
        return new UserTO.Builder();
    }

    public static class Builder {

        private String bio;
        private String bioHTML;
        private String company;
        private String companyHTML;
        private String createdAt;
        private Integer databaseId;
        private String email;
        private String id;
        private boolean isBountyHunter;
        private boolean isCampusExpert;
        private boolean isDeveloperProgramMember;
        private boolean isEmployee;
        private boolean isHireable;
        private boolean isSiteAdmin;
        private boolean isViewer;
        private ProfileItemShowcaseTO itemShowcase;
        private String location;
        private String login;
        private String name;
        private int pinnedItemsRemaining;
        private String projectsResourcePath;
        private String projectsUrl;
        private String resourcePath;
        private UserStatusTO status;
        private String updatedAt;
        private String url;
        private boolean viewerCanChangePinnedItems;
        private boolean viewerCanCreateProjects;
        private boolean viewerCanFollow;
        private boolean viewerIsFollowing;
        private String websiteUrl;

        public Builder() {
        }

        public Builder setBio(String bio) {
            this.bio = bio;
            return this;
        }

        public Builder setBioHTML(String bioHTML) {
            this.bioHTML = bioHTML;
            return this;
        }

        public Builder setCompany(String company) {
            this.company = company;
            return this;
        }

        public Builder setCompanyHTML(String companyHTML) {
            this.companyHTML = companyHTML;
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

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setIsBountyHunter(boolean isBountyHunter) {
            this.isBountyHunter = isBountyHunter;
            return this;
        }

        public Builder setIsCampusExpert(boolean isCampusExpert) {
            this.isCampusExpert = isCampusExpert;
            return this;
        }

        public Builder setIsDeveloperProgramMember(boolean isDeveloperProgramMember) {
            this.isDeveloperProgramMember = isDeveloperProgramMember;
            return this;
        }

        public Builder setIsEmployee(boolean isEmployee) {
            this.isEmployee = isEmployee;
            return this;
        }

        public Builder setIsHireable(boolean isHireable) {
            this.isHireable = isHireable;
            return this;
        }

        public Builder setIsSiteAdmin(boolean isSiteAdmin) {
            this.isSiteAdmin = isSiteAdmin;
            return this;
        }

        public Builder setIsViewer(boolean isViewer) {
            this.isViewer = isViewer;
            return this;
        }

        public Builder setItemShowcase(ProfileItemShowcaseTO itemShowcase) {
            this.itemShowcase = itemShowcase;
            return this;
        }

        public Builder setLocation(String location) {
            this.location = location;
            return this;
        }

        public Builder setLogin(String login) {
            this.login = login;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setPinnedItemsRemaining(int pinnedItemsRemaining) {
            this.pinnedItemsRemaining = pinnedItemsRemaining;
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

        public Builder setResourcePath(String resourcePath) {
            this.resourcePath = resourcePath;
            return this;
        }

        public Builder setStatus(UserStatusTO status) {
            this.status = status;
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

        public Builder setViewerCanChangePinnedItems(boolean viewerCanChangePinnedItems) {
            this.viewerCanChangePinnedItems = viewerCanChangePinnedItems;
            return this;
        }

        public Builder setViewerCanCreateProjects(boolean viewerCanCreateProjects) {
            this.viewerCanCreateProjects = viewerCanCreateProjects;
            return this;
        }

        public Builder setViewerCanFollow(boolean viewerCanFollow) {
            this.viewerCanFollow = viewerCanFollow;
            return this;
        }

        public Builder setViewerIsFollowing(boolean viewerIsFollowing) {
            this.viewerIsFollowing = viewerIsFollowing;
            return this;
        }

        public Builder setWebsiteUrl(String websiteUrl) {
            this.websiteUrl = websiteUrl;
            return this;
        }


        public UserTO build() {
            return new UserTO(bio, bioHTML, company, companyHTML, createdAt, databaseId, email, id, isBountyHunter, isCampusExpert, isDeveloperProgramMember, isEmployee, isHireable, isSiteAdmin, isViewer, itemShowcase, location, login, name, pinnedItemsRemaining, projectsResourcePath, projectsUrl, resourcePath, status, updatedAt, url, viewerCanChangePinnedItems, viewerCanCreateProjects, viewerCanFollow, viewerIsFollowing, websiteUrl);
        }

    }
}
