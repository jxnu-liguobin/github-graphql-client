package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for GitHubMetadata
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class GitHubMetadataResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): GitHubMetadataResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): GitHubMetadataResponseProjection {
        this.gitHubServicesSha()
        this.gitIpAddresses()
        this.hookIpAddresses()
        this.importerIpAddresses()
        this.isPasswordAuthenticationVerifiable()
        this.pagesIpAddresses()
        this.typename()
        return this
    }

    fun gitHubServicesSha(): GitHubMetadataResponseProjection = gitHubServicesSha(null)

    fun gitHubServicesSha(alias: String?): GitHubMetadataResponseProjection {
        fields.add(GraphQLResponseField("gitHubServicesSha").alias(alias))
        return this
    }

    fun gitIpAddresses(): GitHubMetadataResponseProjection = gitIpAddresses(null)

    fun gitIpAddresses(alias: String?): GitHubMetadataResponseProjection {
        fields.add(GraphQLResponseField("gitIpAddresses").alias(alias))
        return this
    }

    fun hookIpAddresses(): GitHubMetadataResponseProjection = hookIpAddresses(null)

    fun hookIpAddresses(alias: String?): GitHubMetadataResponseProjection {
        fields.add(GraphQLResponseField("hookIpAddresses").alias(alias))
        return this
    }

    fun importerIpAddresses(): GitHubMetadataResponseProjection = importerIpAddresses(null)

    fun importerIpAddresses(alias: String?): GitHubMetadataResponseProjection {
        fields.add(GraphQLResponseField("importerIpAddresses").alias(alias))
        return this
    }

    fun isPasswordAuthenticationVerifiable(): GitHubMetadataResponseProjection = isPasswordAuthenticationVerifiable(null)

    fun isPasswordAuthenticationVerifiable(alias: String?): GitHubMetadataResponseProjection {
        fields.add(GraphQLResponseField("isPasswordAuthenticationVerifiable").alias(alias))
        return this
    }

    fun pagesIpAddresses(): GitHubMetadataResponseProjection = pagesIpAddresses(null)

    fun pagesIpAddresses(alias: String?): GitHubMetadataResponseProjection {
        fields.add(GraphQLResponseField("pagesIpAddresses").alias(alias))
        return this
    }

    fun typename(): GitHubMetadataResponseProjection = typename(null)

    fun typename(alias: String?): GitHubMetadataResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
