package io.github.graphql.model

import RepositoryLockReasonTO._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
trait RepositoryInfoTO {

    @javax.validation.constraints.NotNull
    val createdAt: String

    val description: String

    @javax.validation.constraints.NotNull
    val descriptionHTML: String

    val forkCount: Int

    val hasIssuesEnabled: Boolean

    val hasWikiEnabled: Boolean

    val homepageUrl: String

    val isArchived: Boolean

    val isFork: Boolean

    val isLocked: Boolean

    val isMirror: Boolean

    val isPrivate: Boolean

    val isTemplate: Boolean

    val licenseInfo: LicenseTO

    val lockReason: RepositoryLockReasonTO

    val mirrorUrl: String

    @javax.validation.constraints.NotNull
    val name: String

    @javax.validation.constraints.NotNull
    val nameWithOwner: String

    @javax.validation.constraints.NotNull
    val openGraphImageUrl: String

    @javax.validation.constraints.NotNull
    val owner: RepositoryOwnerTO

    val pushedAt: String

    @javax.validation.constraints.NotNull
    val resourcePath: String

    @javax.validation.constraints.NotNull
    val updatedAt: String

    @javax.validation.constraints.NotNull
    val url: String

    val usesCustomOpenGraphImage: Boolean

}
