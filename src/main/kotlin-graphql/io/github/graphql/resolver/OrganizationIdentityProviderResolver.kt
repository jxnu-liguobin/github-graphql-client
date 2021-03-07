package io.github.graphql.resolver

import io.github.graphql.model.*

/**
 * Resolver for OrganizationIdentityProvider
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
interface OrganizationIdentityProviderResolver {

    @Throws(Exception::class)
    fun externalIdentities(organizationIdentityProviderTO: OrganizationIdentityProviderTO, after: String?, before: String?, first: Int?, last: Int?): ExternalIdentityConnectionTO

}
