package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for Tag
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class TagResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): TagResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): TagResponseProjection {
        this.abbreviatedOid()
        this.commitResourcePath()
        this.commitUrl()
        this.id()
        this.message()
        this.name()
        this.oid()
        if (projectionDepthOnFields.getOrDefault("TagResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields["TagResponseProjection.RepositoryResponseProjection.repository"] = projectionDepthOnFields.getOrDefault("TagResponseProjection.RepositoryResponseProjection.repository", 0) + 1
            this.repository(RepositoryResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("TagResponseProjection.RepositoryResponseProjection.repository", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("TagResponseProjection.GitActorResponseProjection.tagger", 0) <= maxDepth) {
            projectionDepthOnFields["TagResponseProjection.GitActorResponseProjection.tagger"] = projectionDepthOnFields.getOrDefault("TagResponseProjection.GitActorResponseProjection.tagger", 0) + 1
            this.tagger(GitActorResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("TagResponseProjection.GitActorResponseProjection.tagger", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("TagResponseProjection.GitObjectResponseProjection.target", 0) <= maxDepth) {
            projectionDepthOnFields["TagResponseProjection.GitObjectResponseProjection.target"] = projectionDepthOnFields.getOrDefault("TagResponseProjection.GitObjectResponseProjection.target", 0) + 1
            this.target(GitObjectResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("TagResponseProjection.GitObjectResponseProjection.target", 0)))
        }
        this.typename()
        return this
    }

    fun abbreviatedOid(): TagResponseProjection = abbreviatedOid(null)

    fun abbreviatedOid(alias: String?): TagResponseProjection {
        fields.add(GraphQLResponseField("abbreviatedOid").alias(alias))
        return this
    }

    fun commitResourcePath(): TagResponseProjection = commitResourcePath(null)

    fun commitResourcePath(alias: String?): TagResponseProjection {
        fields.add(GraphQLResponseField("commitResourcePath").alias(alias))
        return this
    }

    fun commitUrl(): TagResponseProjection = commitUrl(null)

    fun commitUrl(alias: String?): TagResponseProjection {
        fields.add(GraphQLResponseField("commitUrl").alias(alias))
        return this
    }

    fun id(): TagResponseProjection = id(null)

    fun id(alias: String?): TagResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun message(): TagResponseProjection = message(null)

    fun message(alias: String?): TagResponseProjection {
        fields.add(GraphQLResponseField("message").alias(alias))
        return this
    }

    fun name(): TagResponseProjection = name(null)

    fun name(alias: String?): TagResponseProjection {
        fields.add(GraphQLResponseField("name").alias(alias))
        return this
    }

    fun oid(): TagResponseProjection = oid(null)

    fun oid(alias: String?): TagResponseProjection {
        fields.add(GraphQLResponseField("oid").alias(alias))
        return this
    }

    fun repository(subProjection: RepositoryResponseProjection): TagResponseProjection = repository(null, subProjection)

    fun repository(alias: String?, subProjection: RepositoryResponseProjection): TagResponseProjection {
        fields.add(GraphQLResponseField("repository").alias(alias).projection(subProjection))
        return this
    }

    fun tagger(subProjection: GitActorResponseProjection): TagResponseProjection = tagger(null, subProjection)

    fun tagger(alias: String?, subProjection: GitActorResponseProjection): TagResponseProjection {
        fields.add(GraphQLResponseField("tagger").alias(alias).projection(subProjection))
        return this
    }

    fun target(subProjection: GitObjectResponseProjection): TagResponseProjection = target(null, subProjection)

    fun target(alias: String?, subProjection: GitObjectResponseProjection): TagResponseProjection {
        fields.add(GraphQLResponseField("target").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): TagResponseProjection = typename(null)

    fun typename(alias: String?): TagResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
