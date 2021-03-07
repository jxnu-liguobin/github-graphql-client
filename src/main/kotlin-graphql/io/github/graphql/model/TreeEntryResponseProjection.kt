package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for TreeEntry
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class TreeEntryResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): TreeEntryResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): TreeEntryResponseProjection {
        this.mode()
        this.name()
        if (projectionDepthOnFields.getOrDefault("TreeEntryResponseProjection.GitObjectResponseProjection.`object`", 0) <= maxDepth) {
            projectionDepthOnFields["TreeEntryResponseProjection.GitObjectResponseProjection.`object`"] = projectionDepthOnFields.getOrDefault("TreeEntryResponseProjection.GitObjectResponseProjection.`object`", 0) + 1
            this.`object`(GitObjectResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("TreeEntryResponseProjection.GitObjectResponseProjection.`object`", 0)))
        }
        this.oid()
        if (projectionDepthOnFields.getOrDefault("TreeEntryResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields["TreeEntryResponseProjection.RepositoryResponseProjection.repository"] = projectionDepthOnFields.getOrDefault("TreeEntryResponseProjection.RepositoryResponseProjection.repository", 0) + 1
            this.repository(RepositoryResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("TreeEntryResponseProjection.RepositoryResponseProjection.repository", 0)))
        }
        this.type()
        this.typename()
        return this
    }

    fun mode(): TreeEntryResponseProjection = mode(null)

    fun mode(alias: String?): TreeEntryResponseProjection {
        fields.add(GraphQLResponseField("mode").alias(alias))
        return this
    }

    fun name(): TreeEntryResponseProjection = name(null)

    fun name(alias: String?): TreeEntryResponseProjection {
        fields.add(GraphQLResponseField("name").alias(alias))
        return this
    }

    fun `object`(subProjection: GitObjectResponseProjection): TreeEntryResponseProjection = `object`(null, subProjection)

    fun `object`(alias: String?, subProjection: GitObjectResponseProjection): TreeEntryResponseProjection {
        fields.add(GraphQLResponseField("object").alias(alias).projection(subProjection))
        return this
    }

    fun oid(): TreeEntryResponseProjection = oid(null)

    fun oid(alias: String?): TreeEntryResponseProjection {
        fields.add(GraphQLResponseField("oid").alias(alias))
        return this
    }

    fun repository(subProjection: RepositoryResponseProjection): TreeEntryResponseProjection = repository(null, subProjection)

    fun repository(alias: String?, subProjection: RepositoryResponseProjection): TreeEntryResponseProjection {
        fields.add(GraphQLResponseField("repository").alias(alias).projection(subProjection))
        return this
    }

    fun type(): TreeEntryResponseProjection = type(null)

    fun type(alias: String?): TreeEntryResponseProjection {
        fields.add(GraphQLResponseField("type").alias(alias))
        return this
    }

    fun typename(): TreeEntryResponseProjection = typename(null)

    fun typename(alias: String?): TreeEntryResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
