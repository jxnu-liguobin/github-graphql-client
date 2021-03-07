package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for ReleaseAsset
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class ReleaseAssetResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): ReleaseAssetResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): ReleaseAssetResponseProjection {
        this.contentType()
        this.createdAt()
        this.downloadCount()
        this.downloadUrl()
        this.id()
        this.name()
        if (projectionDepthOnFields.getOrDefault("ReleaseAssetResponseProjection.ReleaseResponseProjection.release", 0) <= maxDepth) {
            projectionDepthOnFields["ReleaseAssetResponseProjection.ReleaseResponseProjection.release"] = projectionDepthOnFields.getOrDefault("ReleaseAssetResponseProjection.ReleaseResponseProjection.release", 0) + 1
            this.release(ReleaseResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ReleaseAssetResponseProjection.ReleaseResponseProjection.release", 0)))
        }
        this.size()
        this.updatedAt()
        if (projectionDepthOnFields.getOrDefault("ReleaseAssetResponseProjection.UserResponseProjection.uploadedBy", 0) <= maxDepth) {
            projectionDepthOnFields["ReleaseAssetResponseProjection.UserResponseProjection.uploadedBy"] = projectionDepthOnFields.getOrDefault("ReleaseAssetResponseProjection.UserResponseProjection.uploadedBy", 0) + 1
            this.uploadedBy(UserResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ReleaseAssetResponseProjection.UserResponseProjection.uploadedBy", 0)))
        }
        this.url()
        this.typename()
        return this
    }

    fun contentType(): ReleaseAssetResponseProjection = contentType(null)

    fun contentType(alias: String?): ReleaseAssetResponseProjection {
        fields.add(GraphQLResponseField("contentType").alias(alias))
        return this
    }

    fun createdAt(): ReleaseAssetResponseProjection = createdAt(null)

    fun createdAt(alias: String?): ReleaseAssetResponseProjection {
        fields.add(GraphQLResponseField("createdAt").alias(alias))
        return this
    }

    fun downloadCount(): ReleaseAssetResponseProjection = downloadCount(null)

    fun downloadCount(alias: String?): ReleaseAssetResponseProjection {
        fields.add(GraphQLResponseField("downloadCount").alias(alias))
        return this
    }

    fun downloadUrl(): ReleaseAssetResponseProjection = downloadUrl(null)

    fun downloadUrl(alias: String?): ReleaseAssetResponseProjection {
        fields.add(GraphQLResponseField("downloadUrl").alias(alias))
        return this
    }

    fun id(): ReleaseAssetResponseProjection = id(null)

    fun id(alias: String?): ReleaseAssetResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun name(): ReleaseAssetResponseProjection = name(null)

    fun name(alias: String?): ReleaseAssetResponseProjection {
        fields.add(GraphQLResponseField("name").alias(alias))
        return this
    }

    fun release(subProjection: ReleaseResponseProjection): ReleaseAssetResponseProjection = release(null, subProjection)

    fun release(alias: String?, subProjection: ReleaseResponseProjection): ReleaseAssetResponseProjection {
        fields.add(GraphQLResponseField("release").alias(alias).projection(subProjection))
        return this
    }

    fun size(): ReleaseAssetResponseProjection = size(null)

    fun size(alias: String?): ReleaseAssetResponseProjection {
        fields.add(GraphQLResponseField("size").alias(alias))
        return this
    }

    fun updatedAt(): ReleaseAssetResponseProjection = updatedAt(null)

    fun updatedAt(alias: String?): ReleaseAssetResponseProjection {
        fields.add(GraphQLResponseField("updatedAt").alias(alias))
        return this
    }

    fun uploadedBy(subProjection: UserResponseProjection): ReleaseAssetResponseProjection = uploadedBy(null, subProjection)

    fun uploadedBy(alias: String?, subProjection: UserResponseProjection): ReleaseAssetResponseProjection {
        fields.add(GraphQLResponseField("uploadedBy").alias(alias).projection(subProjection))
        return this
    }

    fun url(): ReleaseAssetResponseProjection = url(null)

    fun url(alias: String?): ReleaseAssetResponseProjection {
        fields.add(GraphQLResponseField("url").alias(alias))
        return this
    }

    fun typename(): ReleaseAssetResponseProjection = typename(null)

    fun typename(alias: String?): ReleaseAssetResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
