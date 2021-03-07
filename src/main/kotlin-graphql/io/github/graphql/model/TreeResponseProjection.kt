package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for Tree
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class TreeResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): TreeResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): TreeResponseProjection {
        this.abbreviatedOid()
        this.commitResourcePath()
        this.commitUrl()
        if (projectionDepthOnFields.getOrDefault("TreeResponseProjection.TreeEntryResponseProjection.entries", 0) <= maxDepth) {
            projectionDepthOnFields["TreeResponseProjection.TreeEntryResponseProjection.entries"] = projectionDepthOnFields.getOrDefault("TreeResponseProjection.TreeEntryResponseProjection.entries", 0) + 1
            this.entries(TreeEntryResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("TreeResponseProjection.TreeEntryResponseProjection.entries", 0)))
        }
        this.id()
        this.oid()
        if (projectionDepthOnFields.getOrDefault("TreeResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields["TreeResponseProjection.RepositoryResponseProjection.repository"] = projectionDepthOnFields.getOrDefault("TreeResponseProjection.RepositoryResponseProjection.repository", 0) + 1
            this.repository(RepositoryResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("TreeResponseProjection.RepositoryResponseProjection.repository", 0)))
        }
        this.typename()
        return this
    }

    fun abbreviatedOid(): TreeResponseProjection = abbreviatedOid(null)

    fun abbreviatedOid(alias: String?): TreeResponseProjection {
        fields.add(GraphQLResponseField("abbreviatedOid").alias(alias))
        return this
    }

    fun commitResourcePath(): TreeResponseProjection = commitResourcePath(null)

    fun commitResourcePath(alias: String?): TreeResponseProjection {
        fields.add(GraphQLResponseField("commitResourcePath").alias(alias))
        return this
    }

    fun commitUrl(): TreeResponseProjection = commitUrl(null)

    fun commitUrl(alias: String?): TreeResponseProjection {
        fields.add(GraphQLResponseField("commitUrl").alias(alias))
        return this
    }

    fun entries(subProjection: TreeEntryResponseProjection): TreeResponseProjection = entries(null, subProjection)

    fun entries(alias: String?, subProjection: TreeEntryResponseProjection): TreeResponseProjection {
        fields.add(GraphQLResponseField("entries").alias(alias).projection(subProjection))
        return this
    }

    fun id(): TreeResponseProjection = id(null)

    fun id(alias: String?): TreeResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun oid(): TreeResponseProjection = oid(null)

    fun oid(alias: String?): TreeResponseProjection {
        fields.add(GraphQLResponseField("oid").alias(alias))
        return this
    }

    fun repository(subProjection: RepositoryResponseProjection): TreeResponseProjection = repository(null, subProjection)

    fun repository(alias: String?, subProjection: RepositoryResponseProjection): TreeResponseProjection {
        fields.add(GraphQLResponseField("repository").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): TreeResponseProjection = typename(null)

    fun typename(alias: String?): TreeResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
