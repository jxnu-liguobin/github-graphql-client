package io.github.graphql.kotlin.model


@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
interface RepositoryInfoTO {

    val createdAt: String

    val description: String?

    val descriptionHTML: String

    val forkCount: Int

    val hasIssuesEnabled: Boolean

    val hasWikiEnabled: Boolean

    val homepageUrl: String?

    val isArchived: Boolean

    val isFork: Boolean

    val isLocked: Boolean

    val isMirror: Boolean

    val isPrivate: Boolean

    val isTemplate: Boolean

    val licenseInfo: LicenseTO?

    val lockReason: RepositoryLockReasonTO?

    val mirrorUrl: String?

    val name: String

    val nameWithOwner: String

    val openGraphImageUrl: String

    val owner: RepositoryOwnerTO

    val pushedAt: String?

    val resourcePath: String

    val updatedAt: String

    val url: String

    val usesCustomOpenGraphImage: Boolean

}
