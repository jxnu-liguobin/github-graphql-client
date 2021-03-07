package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for RepositoryOwner
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class RepositoryOwnerResponseProjection extends GraphQLResponseProjection {

    override def all$(): RepositoryOwnerResponseProjection = all$(3)

    override def all$(maxDepth: Int): RepositoryOwnerResponseProjection = {
        this.avatarUrl()
        this.id()
        this.login()
        if (projectionDepthOnFields.getOrDefault("RepositoryOwnerResponseProjection.RepositoryConnectionResponseProjection.pinnedRepositories", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryOwnerResponseProjection.RepositoryConnectionResponseProjection.pinnedRepositories", projectionDepthOnFields.getOrDefault("RepositoryOwnerResponseProjection.RepositoryConnectionResponseProjection.pinnedRepositories", 0) + 1)
            this.pinnedRepositories(new RepositoryConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryOwnerResponseProjection.RepositoryConnectionResponseProjection.pinnedRepositories", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryOwnerResponseProjection.RepositoryConnectionResponseProjection.repositories", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryOwnerResponseProjection.RepositoryConnectionResponseProjection.repositories", projectionDepthOnFields.getOrDefault("RepositoryOwnerResponseProjection.RepositoryConnectionResponseProjection.repositories", 0) + 1)
            this.repositories(new RepositoryConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryOwnerResponseProjection.RepositoryConnectionResponseProjection.repositories", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryOwnerResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryOwnerResponseProjection.RepositoryResponseProjection.repository", projectionDepthOnFields.getOrDefault("RepositoryOwnerResponseProjection.RepositoryResponseProjection.repository", 0) + 1)
            this.repository(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryOwnerResponseProjection.RepositoryResponseProjection.repository", 0)))
        }
        this.resourcePath()
        this.url()
        this.typename()
        this
    }

    def avatarUrl(): RepositoryOwnerResponseProjection = {
        avatarUrl(null.asInstanceOf[String])
    }

    def avatarUrl(alias: String): RepositoryOwnerResponseProjection = {
        fields.add(new GraphQLResponseField("avatarUrl").alias(alias))
        this
    }

    def avatarUrl(input: RepositoryOwnerAvatarUrlParametrizedInput): RepositoryOwnerResponseProjection = {
        avatarUrl(null.asInstanceOf[String], input)
    }

    def avatarUrl(alias: String, input: RepositoryOwnerAvatarUrlParametrizedInput ): RepositoryOwnerResponseProjection = {
        fields.add(new GraphQLResponseField("avatarUrl").alias(alias).parameters(input))
        this
    }

    def id(): RepositoryOwnerResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): RepositoryOwnerResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def login(): RepositoryOwnerResponseProjection = {
        login(null.asInstanceOf[String])
    }

    def login(alias: String): RepositoryOwnerResponseProjection = {
        fields.add(new GraphQLResponseField("login").alias(alias))
        this
    }

    @deprecated(message = "pinnedRepositories will be removed Use ProfileOwner.pinnedItems instead. Removal on 2019-10-01 UTC.")
    def pinnedRepositories(subProjection: RepositoryConnectionResponseProjection): RepositoryOwnerResponseProjection = {
        pinnedRepositories(null.asInstanceOf[String], subProjection)
    }

    def pinnedRepositories(alias: String, subProjection: RepositoryConnectionResponseProjection): RepositoryOwnerResponseProjection = {
        fields.add(new GraphQLResponseField("pinnedRepositories").alias(alias).projection(subProjection))
        this
    }

    def pinnedRepositories(input: RepositoryOwnerPinnedRepositoriesParametrizedInput,subProjection: RepositoryConnectionResponseProjection): RepositoryOwnerResponseProjection = {
        pinnedRepositories(null.asInstanceOf[String], input, subProjection)
    }

    def pinnedRepositories(alias: String, input: RepositoryOwnerPinnedRepositoriesParametrizedInput , subProjection: RepositoryConnectionResponseProjection): RepositoryOwnerResponseProjection = {
        fields.add(new GraphQLResponseField("pinnedRepositories").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def repositories(subProjection: RepositoryConnectionResponseProjection): RepositoryOwnerResponseProjection = {
        repositories(null.asInstanceOf[String], subProjection)
    }

    def repositories(alias: String, subProjection: RepositoryConnectionResponseProjection): RepositoryOwnerResponseProjection = {
        fields.add(new GraphQLResponseField("repositories").alias(alias).projection(subProjection))
        this
    }

    def repositories(input: RepositoryOwnerRepositoriesParametrizedInput,subProjection: RepositoryConnectionResponseProjection): RepositoryOwnerResponseProjection = {
        repositories(null.asInstanceOf[String], input, subProjection)
    }

    def repositories(alias: String, input: RepositoryOwnerRepositoriesParametrizedInput , subProjection: RepositoryConnectionResponseProjection): RepositoryOwnerResponseProjection = {
        fields.add(new GraphQLResponseField("repositories").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def repository(subProjection: RepositoryResponseProjection): RepositoryOwnerResponseProjection = {
        repository(null.asInstanceOf[String], subProjection)
    }

    def repository(alias: String, subProjection: RepositoryResponseProjection): RepositoryOwnerResponseProjection = {
        fields.add(new GraphQLResponseField("repository").alias(alias).projection(subProjection))
        this
    }

    def repository(input: RepositoryOwnerRepositoryParametrizedInput,subProjection: RepositoryResponseProjection): RepositoryOwnerResponseProjection = {
        repository(null.asInstanceOf[String], input, subProjection)
    }

    def repository(alias: String, input: RepositoryOwnerRepositoryParametrizedInput , subProjection: RepositoryResponseProjection): RepositoryOwnerResponseProjection = {
        fields.add(new GraphQLResponseField("repository").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def resourcePath(): RepositoryOwnerResponseProjection = {
        resourcePath(null.asInstanceOf[String])
    }

    def resourcePath(alias: String): RepositoryOwnerResponseProjection = {
        fields.add(new GraphQLResponseField("resourcePath").alias(alias))
        this
    }

    def url(): RepositoryOwnerResponseProjection = {
        url(null.asInstanceOf[String])
    }

    def url(alias: String): RepositoryOwnerResponseProjection = {
        fields.add(new GraphQLResponseField("url").alias(alias))
        this
    }

    def onOrganization(subProjection: OrganizationResponseProjection): RepositoryOwnerResponseProjection = {
        onOrganization(null.asInstanceOf[String], subProjection)
    }

    def onOrganization(alias: String, subProjection: OrganizationResponseProjection): RepositoryOwnerResponseProjection = {
        fields.add(new GraphQLResponseField("...on Organization").alias(alias).projection(subProjection))
        this
    }

    def onUser(subProjection: UserResponseProjection): RepositoryOwnerResponseProjection = {
        onUser(null.asInstanceOf[String], subProjection)
    }

    def onUser(alias: String, subProjection: UserResponseProjection): RepositoryOwnerResponseProjection = {
        fields.add(new GraphQLResponseField("...on User").alias(alias).projection(subProjection))
        this
    }

    def typename(): RepositoryOwnerResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): RepositoryOwnerResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[RepositoryOwnerResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
