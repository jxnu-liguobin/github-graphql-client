package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for Release
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class ReleaseResponseProjection extends GraphQLResponseProjection {

    override def all$(): ReleaseResponseProjection = all$(3)

    override def all$(maxDepth: Int): ReleaseResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("ReleaseResponseProjection.UserResponseProjection.author", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReleaseResponseProjection.UserResponseProjection.author", projectionDepthOnFields.getOrDefault("ReleaseResponseProjection.UserResponseProjection.author", 0) + 1)
            this.author(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReleaseResponseProjection.UserResponseProjection.author", 0)))
        }
        this.createdAt()
        this.description()
        this.id()
        this.isDraft()
        this.isPrerelease()
        this.name()
        this.publishedAt()
        if (projectionDepthOnFields.getOrDefault("ReleaseResponseProjection.ReleaseAssetConnectionResponseProjection.releaseAssets", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReleaseResponseProjection.ReleaseAssetConnectionResponseProjection.releaseAssets", projectionDepthOnFields.getOrDefault("ReleaseResponseProjection.ReleaseAssetConnectionResponseProjection.releaseAssets", 0) + 1)
            this.releaseAssets(new ReleaseAssetConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReleaseResponseProjection.ReleaseAssetConnectionResponseProjection.releaseAssets", 0)))
        }
        this.resourcePath()
        if (projectionDepthOnFields.getOrDefault("ReleaseResponseProjection.RefResponseProjection.tag", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReleaseResponseProjection.RefResponseProjection.tag", projectionDepthOnFields.getOrDefault("ReleaseResponseProjection.RefResponseProjection.tag", 0) + 1)
            this.tag(new RefResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReleaseResponseProjection.RefResponseProjection.tag", 0)))
        }
        this.tagName()
        this.updatedAt()
        this.url()
        this.typename()
        this
    }

    def author(subProjection: UserResponseProjection): ReleaseResponseProjection = {
        author(null.asInstanceOf[String], subProjection)
    }

    def author(alias: String, subProjection: UserResponseProjection): ReleaseResponseProjection = {
        fields.add(new GraphQLResponseField("author").alias(alias).projection(subProjection))
        this
    }

    def createdAt(): ReleaseResponseProjection = {
        createdAt(null.asInstanceOf[String])
    }

    def createdAt(alias: String): ReleaseResponseProjection = {
        fields.add(new GraphQLResponseField("createdAt").alias(alias))
        this
    }

    def description(): ReleaseResponseProjection = {
        description(null.asInstanceOf[String])
    }

    def description(alias: String): ReleaseResponseProjection = {
        fields.add(new GraphQLResponseField("description").alias(alias))
        this
    }

    def id(): ReleaseResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): ReleaseResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def isDraft(): ReleaseResponseProjection = {
        isDraft(null.asInstanceOf[String])
    }

    def isDraft(alias: String): ReleaseResponseProjection = {
        fields.add(new GraphQLResponseField("isDraft").alias(alias))
        this
    }

    def isPrerelease(): ReleaseResponseProjection = {
        isPrerelease(null.asInstanceOf[String])
    }

    def isPrerelease(alias: String): ReleaseResponseProjection = {
        fields.add(new GraphQLResponseField("isPrerelease").alias(alias))
        this
    }

    def name(): ReleaseResponseProjection = {
        name(null.asInstanceOf[String])
    }

    def name(alias: String): ReleaseResponseProjection = {
        fields.add(new GraphQLResponseField("name").alias(alias))
        this
    }

    def publishedAt(): ReleaseResponseProjection = {
        publishedAt(null.asInstanceOf[String])
    }

    def publishedAt(alias: String): ReleaseResponseProjection = {
        fields.add(new GraphQLResponseField("publishedAt").alias(alias))
        this
    }

    def releaseAssets(subProjection: ReleaseAssetConnectionResponseProjection): ReleaseResponseProjection = {
        releaseAssets(null.asInstanceOf[String], subProjection)
    }

    def releaseAssets(alias: String, subProjection: ReleaseAssetConnectionResponseProjection): ReleaseResponseProjection = {
        fields.add(new GraphQLResponseField("releaseAssets").alias(alias).projection(subProjection))
        this
    }

    def releaseAssets(input: ReleaseReleaseAssetsParametrizedInput,subProjection: ReleaseAssetConnectionResponseProjection): ReleaseResponseProjection = {
        releaseAssets(null.asInstanceOf[String], input, subProjection)
    }

    def releaseAssets(alias: String, input: ReleaseReleaseAssetsParametrizedInput , subProjection: ReleaseAssetConnectionResponseProjection): ReleaseResponseProjection = {
        fields.add(new GraphQLResponseField("releaseAssets").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def resourcePath(): ReleaseResponseProjection = {
        resourcePath(null.asInstanceOf[String])
    }

    def resourcePath(alias: String): ReleaseResponseProjection = {
        fields.add(new GraphQLResponseField("resourcePath").alias(alias))
        this
    }

    def tag(subProjection: RefResponseProjection): ReleaseResponseProjection = {
        tag(null.asInstanceOf[String], subProjection)
    }

    def tag(alias: String, subProjection: RefResponseProjection): ReleaseResponseProjection = {
        fields.add(new GraphQLResponseField("tag").alias(alias).projection(subProjection))
        this
    }

    def tagName(): ReleaseResponseProjection = {
        tagName(null.asInstanceOf[String])
    }

    def tagName(alias: String): ReleaseResponseProjection = {
        fields.add(new GraphQLResponseField("tagName").alias(alias))
        this
    }

    def updatedAt(): ReleaseResponseProjection = {
        updatedAt(null.asInstanceOf[String])
    }

    def updatedAt(alias: String): ReleaseResponseProjection = {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias))
        this
    }

    def url(): ReleaseResponseProjection = {
        url(null.asInstanceOf[String])
    }

    def url(alias: String): ReleaseResponseProjection = {
        fields.add(new GraphQLResponseField("url").alias(alias))
        this
    }

    def typename(): ReleaseResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): ReleaseResponseProjection = {
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
        val that = obj.asInstanceOf[ReleaseResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
