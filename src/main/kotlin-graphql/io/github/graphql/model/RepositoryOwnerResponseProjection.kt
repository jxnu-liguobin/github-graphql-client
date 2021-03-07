package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for RepositoryOwner
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class RepositoryOwnerResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): RepositoryOwnerResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): RepositoryOwnerResponseProjection {
        this.avatarUrl()
        this.id()
        this.login()
        if (projectionDepthOnFields.getOrDefault("RepositoryOwnerResponseProjection.RepositoryConnectionResponseProjection.pinnedRepositories", 0) <= maxDepth) {
            projectionDepthOnFields["RepositoryOwnerResponseProjection.RepositoryConnectionResponseProjection.pinnedRepositories"] = projectionDepthOnFields.getOrDefault("RepositoryOwnerResponseProjection.RepositoryConnectionResponseProjection.pinnedRepositories", 0) + 1
            this.pinnedRepositories(RepositoryConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryOwnerResponseProjection.RepositoryConnectionResponseProjection.pinnedRepositories", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryOwnerResponseProjection.RepositoryConnectionResponseProjection.repositories", 0) <= maxDepth) {
            projectionDepthOnFields["RepositoryOwnerResponseProjection.RepositoryConnectionResponseProjection.repositories"] = projectionDepthOnFields.getOrDefault("RepositoryOwnerResponseProjection.RepositoryConnectionResponseProjection.repositories", 0) + 1
            this.repositories(RepositoryConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryOwnerResponseProjection.RepositoryConnectionResponseProjection.repositories", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryOwnerResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields["RepositoryOwnerResponseProjection.RepositoryResponseProjection.repository"] = projectionDepthOnFields.getOrDefault("RepositoryOwnerResponseProjection.RepositoryResponseProjection.repository", 0) + 1
            this.repository(RepositoryResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryOwnerResponseProjection.RepositoryResponseProjection.repository", 0)))
        }
        this.resourcePath()
        this.url()
        this.typename()
        return this
    }

    fun avatarUrl(): RepositoryOwnerResponseProjection = avatarUrl(null)

    fun avatarUrl(alias: String?): RepositoryOwnerResponseProjection {
        fields.add(GraphQLResponseField("avatarUrl").alias(alias))
        return this
    }

    fun avatarUrl(input: RepositoryOwnerAvatarUrlParametrizedInput): RepositoryOwnerResponseProjection = avatarUrl(null, input)

    fun avatarUrl(alias: String?, input: RepositoryOwnerAvatarUrlParametrizedInput): RepositoryOwnerResponseProjection {
        fields.add(GraphQLResponseField("avatarUrl").alias(alias).parameters(input))
        return this
    }

    fun id(): RepositoryOwnerResponseProjection = id(null)

    fun id(alias: String?): RepositoryOwnerResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun login(): RepositoryOwnerResponseProjection = login(null)

    fun login(alias: String?): RepositoryOwnerResponseProjection {
        fields.add(GraphQLResponseField("login").alias(alias))
        return this
    }

    @Deprecated(message = "pinnedRepositories will be removed Use ProfileOwner.pinnedItems instead. Removal on 2019-10-01 UTC.")
    fun pinnedRepositories(subProjection: RepositoryConnectionResponseProjection): RepositoryOwnerResponseProjection = pinnedRepositories(null, subProjection)

    fun pinnedRepositories(alias: String?, subProjection: RepositoryConnectionResponseProjection): RepositoryOwnerResponseProjection {
        fields.add(GraphQLResponseField("pinnedRepositories").alias(alias).projection(subProjection))
        return this
    }

    fun pinnedRepositories(input: RepositoryOwnerPinnedRepositoriesParametrizedInput, subProjection: RepositoryConnectionResponseProjection): RepositoryOwnerResponseProjection = pinnedRepositories(null, input, subProjection)

    fun pinnedRepositories(alias: String?, input: RepositoryOwnerPinnedRepositoriesParametrizedInput, subProjection: RepositoryConnectionResponseProjection): RepositoryOwnerResponseProjection {
        fields.add(GraphQLResponseField("pinnedRepositories").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun repositories(subProjection: RepositoryConnectionResponseProjection): RepositoryOwnerResponseProjection = repositories(null, subProjection)

    fun repositories(alias: String?, subProjection: RepositoryConnectionResponseProjection): RepositoryOwnerResponseProjection {
        fields.add(GraphQLResponseField("repositories").alias(alias).projection(subProjection))
        return this
    }

    fun repositories(input: RepositoryOwnerRepositoriesParametrizedInput, subProjection: RepositoryConnectionResponseProjection): RepositoryOwnerResponseProjection = repositories(null, input, subProjection)

    fun repositories(alias: String?, input: RepositoryOwnerRepositoriesParametrizedInput, subProjection: RepositoryConnectionResponseProjection): RepositoryOwnerResponseProjection {
        fields.add(GraphQLResponseField("repositories").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun repository(subProjection: RepositoryResponseProjection): RepositoryOwnerResponseProjection = repository(null, subProjection)

    fun repository(alias: String?, subProjection: RepositoryResponseProjection): RepositoryOwnerResponseProjection {
        fields.add(GraphQLResponseField("repository").alias(alias).projection(subProjection))
        return this
    }

    fun repository(input: RepositoryOwnerRepositoryParametrizedInput, subProjection: RepositoryResponseProjection): RepositoryOwnerResponseProjection = repository(null, input, subProjection)

    fun repository(alias: String?, input: RepositoryOwnerRepositoryParametrizedInput, subProjection: RepositoryResponseProjection): RepositoryOwnerResponseProjection {
        fields.add(GraphQLResponseField("repository").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun resourcePath(): RepositoryOwnerResponseProjection = resourcePath(null)

    fun resourcePath(alias: String?): RepositoryOwnerResponseProjection {
        fields.add(GraphQLResponseField("resourcePath").alias(alias))
        return this
    }

    fun url(): RepositoryOwnerResponseProjection = url(null)

    fun url(alias: String?): RepositoryOwnerResponseProjection {
        fields.add(GraphQLResponseField("url").alias(alias))
        return this
    }

    fun onOrganization(subProjection: OrganizationResponseProjection): RepositoryOwnerResponseProjection = onOrganization(null, subProjection)

    fun onOrganization(alias: String?, subProjection: OrganizationResponseProjection): RepositoryOwnerResponseProjection {
        fields.add(GraphQLResponseField("...on Organization").alias(alias).projection(subProjection))
        return this
    }

    fun onUser(subProjection: UserResponseProjection): RepositoryOwnerResponseProjection = onUser(null, subProjection)

    fun onUser(alias: String?, subProjection: UserResponseProjection): RepositoryOwnerResponseProjection {
        fields.add(GraphQLResponseField("...on User").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): RepositoryOwnerResponseProjection = typename(null)

    fun typename(alias: String?): RepositoryOwnerResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
