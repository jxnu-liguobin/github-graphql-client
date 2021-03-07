package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for GitHubMetadata
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class GitHubMetadataResponseProjection extends GraphQLResponseProjection {

    override def all$(): GitHubMetadataResponseProjection = all$(3)

    override def all$(maxDepth: Int): GitHubMetadataResponseProjection = {
        this.gitHubServicesSha()
        this.gitIpAddresses()
        this.hookIpAddresses()
        this.importerIpAddresses()
        this.isPasswordAuthenticationVerifiable()
        this.pagesIpAddresses()
        this.typename()
        this
    }

    def gitHubServicesSha(): GitHubMetadataResponseProjection = {
        gitHubServicesSha(null.asInstanceOf[String])
    }

    def gitHubServicesSha(alias: String): GitHubMetadataResponseProjection = {
        fields.add(new GraphQLResponseField("gitHubServicesSha").alias(alias))
        this
    }

    def gitIpAddresses(): GitHubMetadataResponseProjection = {
        gitIpAddresses(null.asInstanceOf[String])
    }

    def gitIpAddresses(alias: String): GitHubMetadataResponseProjection = {
        fields.add(new GraphQLResponseField("gitIpAddresses").alias(alias))
        this
    }

    def hookIpAddresses(): GitHubMetadataResponseProjection = {
        hookIpAddresses(null.asInstanceOf[String])
    }

    def hookIpAddresses(alias: String): GitHubMetadataResponseProjection = {
        fields.add(new GraphQLResponseField("hookIpAddresses").alias(alias))
        this
    }

    def importerIpAddresses(): GitHubMetadataResponseProjection = {
        importerIpAddresses(null.asInstanceOf[String])
    }

    def importerIpAddresses(alias: String): GitHubMetadataResponseProjection = {
        fields.add(new GraphQLResponseField("importerIpAddresses").alias(alias))
        this
    }

    def isPasswordAuthenticationVerifiable(): GitHubMetadataResponseProjection = {
        isPasswordAuthenticationVerifiable(null.asInstanceOf[String])
    }

    def isPasswordAuthenticationVerifiable(alias: String): GitHubMetadataResponseProjection = {
        fields.add(new GraphQLResponseField("isPasswordAuthenticationVerifiable").alias(alias))
        this
    }

    def pagesIpAddresses(): GitHubMetadataResponseProjection = {
        pagesIpAddresses(null.asInstanceOf[String])
    }

    def pagesIpAddresses(alias: String): GitHubMetadataResponseProjection = {
        fields.add(new GraphQLResponseField("pagesIpAddresses").alias(alias))
        this
    }

    def typename(): GitHubMetadataResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): GitHubMetadataResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
