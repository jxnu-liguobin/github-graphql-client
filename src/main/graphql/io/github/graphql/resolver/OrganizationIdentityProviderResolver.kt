package io.github.graphql.resolver

import io.github.graphql.model.*

/**
 * Resolver for OrganizationIdentityProvider
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
interface OrganizationIdentityProviderResolver {

    @Throws(Exception::class)
    fun externalIdentities(organizationIdentityProviderTO: OrganizationIdentityProviderTO, after: String?, before: String?, first: Int?, last: Int?): ExternalIdentityConnectionTO

}
