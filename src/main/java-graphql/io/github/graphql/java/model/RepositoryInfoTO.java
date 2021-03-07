package io.github.graphql.java.model;


@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public interface RepositoryInfoTO {

    @javax.validation.constraints.NotNull
    String getCreatedAt();

    String getDescription();

    @javax.validation.constraints.NotNull
    String getDescriptionHTML();

    int getForkCount();

    boolean getHasIssuesEnabled();

    boolean getHasWikiEnabled();

    String getHomepageUrl();

    boolean getIsArchived();

    boolean getIsFork();

    boolean getIsLocked();

    boolean getIsMirror();

    boolean getIsPrivate();

    boolean getIsTemplate();

    LicenseTO getLicenseInfo();

    RepositoryLockReasonTO getLockReason();

    String getMirrorUrl();

    @javax.validation.constraints.NotNull
    String getName();

    @javax.validation.constraints.NotNull
    String getNameWithOwner();

    @javax.validation.constraints.NotNull
    String getOpenGraphImageUrl();

    @javax.validation.constraints.NotNull
    RepositoryOwnerTO getOwner();

    String getPushedAt();

    @javax.validation.constraints.NotNull
    String getResourcePath();

    @javax.validation.constraints.NotNull
    String getUpdatedAt();

    @javax.validation.constraints.NotNull
    String getUrl();

    boolean getUsesCustomOpenGraphImage();

}
