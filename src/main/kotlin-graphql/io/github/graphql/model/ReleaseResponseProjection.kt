package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for Release
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class ReleaseResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): ReleaseResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): ReleaseResponseProjection {
        if (projectionDepthOnFields.getOrDefault("ReleaseResponseProjection.UserResponseProjection.author", 0) <= maxDepth) {
            projectionDepthOnFields["ReleaseResponseProjection.UserResponseProjection.author"] = projectionDepthOnFields.getOrDefault("ReleaseResponseProjection.UserResponseProjection.author", 0) + 1
            this.author(UserResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ReleaseResponseProjection.UserResponseProjection.author", 0)))
        }
        this.createdAt()
        this.description()
        this.id()
        this.isDraft()
        this.isPrerelease()
        this.name()
        this.publishedAt()
        if (projectionDepthOnFields.getOrDefault("ReleaseResponseProjection.ReleaseAssetConnectionResponseProjection.releaseAssets", 0) <= maxDepth) {
            projectionDepthOnFields["ReleaseResponseProjection.ReleaseAssetConnectionResponseProjection.releaseAssets"] = projectionDepthOnFields.getOrDefault("ReleaseResponseProjection.ReleaseAssetConnectionResponseProjection.releaseAssets", 0) + 1
            this.releaseAssets(ReleaseAssetConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ReleaseResponseProjection.ReleaseAssetConnectionResponseProjection.releaseAssets", 0)))
        }
        this.resourcePath()
        if (projectionDepthOnFields.getOrDefault("ReleaseResponseProjection.RefResponseProjection.tag", 0) <= maxDepth) {
            projectionDepthOnFields["ReleaseResponseProjection.RefResponseProjection.tag"] = projectionDepthOnFields.getOrDefault("ReleaseResponseProjection.RefResponseProjection.tag", 0) + 1
            this.tag(RefResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ReleaseResponseProjection.RefResponseProjection.tag", 0)))
        }
        this.tagName()
        this.updatedAt()
        this.url()
        this.typename()
        return this
    }

    fun author(subProjection: UserResponseProjection): ReleaseResponseProjection = author(null, subProjection)

    fun author(alias: String?, subProjection: UserResponseProjection): ReleaseResponseProjection {
        fields.add(GraphQLResponseField("author").alias(alias).projection(subProjection))
        return this
    }

    fun createdAt(): ReleaseResponseProjection = createdAt(null)

    fun createdAt(alias: String?): ReleaseResponseProjection {
        fields.add(GraphQLResponseField("createdAt").alias(alias))
        return this
    }

    fun description(): ReleaseResponseProjection = description(null)

    fun description(alias: String?): ReleaseResponseProjection {
        fields.add(GraphQLResponseField("description").alias(alias))
        return this
    }

    fun id(): ReleaseResponseProjection = id(null)

    fun id(alias: String?): ReleaseResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun isDraft(): ReleaseResponseProjection = isDraft(null)

    fun isDraft(alias: String?): ReleaseResponseProjection {
        fields.add(GraphQLResponseField("isDraft").alias(alias))
        return this
    }

    fun isPrerelease(): ReleaseResponseProjection = isPrerelease(null)

    fun isPrerelease(alias: String?): ReleaseResponseProjection {
        fields.add(GraphQLResponseField("isPrerelease").alias(alias))
        return this
    }

    fun name(): ReleaseResponseProjection = name(null)

    fun name(alias: String?): ReleaseResponseProjection {
        fields.add(GraphQLResponseField("name").alias(alias))
        return this
    }

    fun publishedAt(): ReleaseResponseProjection = publishedAt(null)

    fun publishedAt(alias: String?): ReleaseResponseProjection {
        fields.add(GraphQLResponseField("publishedAt").alias(alias))
        return this
    }

    fun releaseAssets(subProjection: ReleaseAssetConnectionResponseProjection): ReleaseResponseProjection = releaseAssets(null, subProjection)

    fun releaseAssets(alias: String?, subProjection: ReleaseAssetConnectionResponseProjection): ReleaseResponseProjection {
        fields.add(GraphQLResponseField("releaseAssets").alias(alias).projection(subProjection))
        return this
    }

    fun releaseAssets(input: ReleaseReleaseAssetsParametrizedInput, subProjection: ReleaseAssetConnectionResponseProjection): ReleaseResponseProjection = releaseAssets(null, input, subProjection)

    fun releaseAssets(alias: String?, input: ReleaseReleaseAssetsParametrizedInput, subProjection: ReleaseAssetConnectionResponseProjection): ReleaseResponseProjection {
        fields.add(GraphQLResponseField("releaseAssets").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun resourcePath(): ReleaseResponseProjection = resourcePath(null)

    fun resourcePath(alias: String?): ReleaseResponseProjection {
        fields.add(GraphQLResponseField("resourcePath").alias(alias))
        return this
    }

    fun tag(subProjection: RefResponseProjection): ReleaseResponseProjection = tag(null, subProjection)

    fun tag(alias: String?, subProjection: RefResponseProjection): ReleaseResponseProjection {
        fields.add(GraphQLResponseField("tag").alias(alias).projection(subProjection))
        return this
    }

    fun tagName(): ReleaseResponseProjection = tagName(null)

    fun tagName(alias: String?): ReleaseResponseProjection {
        fields.add(GraphQLResponseField("tagName").alias(alias))
        return this
    }

    fun updatedAt(): ReleaseResponseProjection = updatedAt(null)

    fun updatedAt(alias: String?): ReleaseResponseProjection {
        fields.add(GraphQLResponseField("updatedAt").alias(alias))
        return this
    }

    fun url(): ReleaseResponseProjection = url(null)

    fun url(alias: String?): ReleaseResponseProjection {
        fields.add(GraphQLResponseField("url").alias(alias))
        return this
    }

    fun typename(): ReleaseResponseProjection = typename(null)

    fun typename(alias: String?): ReleaseResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
