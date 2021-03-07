package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for Tag
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class TagResponseProjection extends GraphQLResponseProjection {

    override def all$(): TagResponseProjection = all$(3)

    override def all$(maxDepth: Int): TagResponseProjection = {
        this.abbreviatedOid()
        this.commitResourcePath()
        this.commitUrl()
        this.id()
        this.message()
        this.name()
        this.oid()
        if (projectionDepthOnFields.getOrDefault("TagResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields.put("TagResponseProjection.RepositoryResponseProjection.repository", projectionDepthOnFields.getOrDefault("TagResponseProjection.RepositoryResponseProjection.repository", 0) + 1)
            this.repository(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TagResponseProjection.RepositoryResponseProjection.repository", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("TagResponseProjection.GitActorResponseProjection.tagger", 0) <= maxDepth) {
            projectionDepthOnFields.put("TagResponseProjection.GitActorResponseProjection.tagger", projectionDepthOnFields.getOrDefault("TagResponseProjection.GitActorResponseProjection.tagger", 0) + 1)
            this.tagger(new GitActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TagResponseProjection.GitActorResponseProjection.tagger", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("TagResponseProjection.GitObjectResponseProjection.target", 0) <= maxDepth) {
            projectionDepthOnFields.put("TagResponseProjection.GitObjectResponseProjection.target", projectionDepthOnFields.getOrDefault("TagResponseProjection.GitObjectResponseProjection.target", 0) + 1)
            this.target(new GitObjectResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TagResponseProjection.GitObjectResponseProjection.target", 0)))
        }
        this.typename()
        this
    }

    def abbreviatedOid(): TagResponseProjection = {
        abbreviatedOid(null.asInstanceOf[String])
    }

    def abbreviatedOid(alias: String): TagResponseProjection = {
        fields.add(new GraphQLResponseField("abbreviatedOid").alias(alias))
        this
    }

    def commitResourcePath(): TagResponseProjection = {
        commitResourcePath(null.asInstanceOf[String])
    }

    def commitResourcePath(alias: String): TagResponseProjection = {
        fields.add(new GraphQLResponseField("commitResourcePath").alias(alias))
        this
    }

    def commitUrl(): TagResponseProjection = {
        commitUrl(null.asInstanceOf[String])
    }

    def commitUrl(alias: String): TagResponseProjection = {
        fields.add(new GraphQLResponseField("commitUrl").alias(alias))
        this
    }

    def id(): TagResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): TagResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def message(): TagResponseProjection = {
        message(null.asInstanceOf[String])
    }

    def message(alias: String): TagResponseProjection = {
        fields.add(new GraphQLResponseField("message").alias(alias))
        this
    }

    def name(): TagResponseProjection = {
        name(null.asInstanceOf[String])
    }

    def name(alias: String): TagResponseProjection = {
        fields.add(new GraphQLResponseField("name").alias(alias))
        this
    }

    def oid(): TagResponseProjection = {
        oid(null.asInstanceOf[String])
    }

    def oid(alias: String): TagResponseProjection = {
        fields.add(new GraphQLResponseField("oid").alias(alias))
        this
    }

    def repository(subProjection: RepositoryResponseProjection): TagResponseProjection = {
        repository(null.asInstanceOf[String], subProjection)
    }

    def repository(alias: String, subProjection: RepositoryResponseProjection): TagResponseProjection = {
        fields.add(new GraphQLResponseField("repository").alias(alias).projection(subProjection))
        this
    }

    def tagger(subProjection: GitActorResponseProjection): TagResponseProjection = {
        tagger(null.asInstanceOf[String], subProjection)
    }

    def tagger(alias: String, subProjection: GitActorResponseProjection): TagResponseProjection = {
        fields.add(new GraphQLResponseField("tagger").alias(alias).projection(subProjection))
        this
    }

    def target(subProjection: GitObjectResponseProjection): TagResponseProjection = {
        target(null.asInstanceOf[String], subProjection)
    }

    def target(alias: String, subProjection: GitObjectResponseProjection): TagResponseProjection = {
        fields.add(new GraphQLResponseField("target").alias(alias).projection(subProjection))
        this
    }

    def typename(): TagResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): TagResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
