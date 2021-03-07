package io.github.graphql.kotlin.resolver

import io.github.graphql.kotlin.model.*

/**
 * Resolver for RepositoryOwner
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:14+0800"
)
interface RepositoryOwnerResolver {

    @Throws(Exception::class)
    fun avatarUrl(repositoryOwnerTO: RepositoryOwnerTO, size: Int?): String

    @Deprecated(message = "pinnedRepositories will be removed Use ProfileOwner.pinnedItems instead. Removal on 2019-10-01 UTC.")
    @Throws(Exception::class)
    fun pinnedRepositories(repositoryOwnerTO: RepositoryOwnerTO, affiliations: List<RepositoryAffiliationTO?>?, after: String?, before: String?, first: Int?, isLocked: Boolean?, last: Int?, orderBy: RepositoryOrderTO?, ownerAffiliations: List<RepositoryAffiliationTO?>?, privacy: RepositoryPrivacyTO?): RepositoryConnectionTO

    @Throws(Exception::class)
    fun repositories(repositoryOwnerTO: RepositoryOwnerTO, affiliations: List<RepositoryAffiliationTO?>?, after: String?, before: String?, first: Int?, isFork: Boolean?, isLocked: Boolean?, last: Int?, orderBy: RepositoryOrderTO?, ownerAffiliations: List<RepositoryAffiliationTO?>?, privacy: RepositoryPrivacyTO?): RepositoryConnectionTO

    @Throws(Exception::class)
    fun repository(repositoryOwnerTO: RepositoryOwnerTO, name: String): RepositoryTO?

}
