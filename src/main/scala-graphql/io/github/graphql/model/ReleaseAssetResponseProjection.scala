package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for ReleaseAsset
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class ReleaseAssetResponseProjection extends GraphQLResponseProjection {

    override def all$(): ReleaseAssetResponseProjection = all$(3)

    override def all$(maxDepth: Int): ReleaseAssetResponseProjection = {
        this.contentType()
        this.createdAt()
        this.downloadCount()
        this.downloadUrl()
        this.id()
        this.name()
        if (projectionDepthOnFields.getOrDefault("ReleaseAssetResponseProjection.ReleaseResponseProjection.release", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReleaseAssetResponseProjection.ReleaseResponseProjection.release", projectionDepthOnFields.getOrDefault("ReleaseAssetResponseProjection.ReleaseResponseProjection.release", 0) + 1)
            this.release(new ReleaseResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReleaseAssetResponseProjection.ReleaseResponseProjection.release", 0)))
        }
        this.size()
        this.updatedAt()
        if (projectionDepthOnFields.getOrDefault("ReleaseAssetResponseProjection.UserResponseProjection.uploadedBy", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReleaseAssetResponseProjection.UserResponseProjection.uploadedBy", projectionDepthOnFields.getOrDefault("ReleaseAssetResponseProjection.UserResponseProjection.uploadedBy", 0) + 1)
            this.uploadedBy(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReleaseAssetResponseProjection.UserResponseProjection.uploadedBy", 0)))
        }
        this.url()
        this.typename()
        this
    }

    def contentType(): ReleaseAssetResponseProjection = {
        contentType(null.asInstanceOf[String])
    }

    def contentType(alias: String): ReleaseAssetResponseProjection = {
        fields.add(new GraphQLResponseField("contentType").alias(alias))
        this
    }

    def createdAt(): ReleaseAssetResponseProjection = {
        createdAt(null.asInstanceOf[String])
    }

    def createdAt(alias: String): ReleaseAssetResponseProjection = {
        fields.add(new GraphQLResponseField("createdAt").alias(alias))
        this
    }

    def downloadCount(): ReleaseAssetResponseProjection = {
        downloadCount(null.asInstanceOf[String])
    }

    def downloadCount(alias: String): ReleaseAssetResponseProjection = {
        fields.add(new GraphQLResponseField("downloadCount").alias(alias))
        this
    }

    def downloadUrl(): ReleaseAssetResponseProjection = {
        downloadUrl(null.asInstanceOf[String])
    }

    def downloadUrl(alias: String): ReleaseAssetResponseProjection = {
        fields.add(new GraphQLResponseField("downloadUrl").alias(alias))
        this
    }

    def id(): ReleaseAssetResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): ReleaseAssetResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def name(): ReleaseAssetResponseProjection = {
        name(null.asInstanceOf[String])
    }

    def name(alias: String): ReleaseAssetResponseProjection = {
        fields.add(new GraphQLResponseField("name").alias(alias))
        this
    }

    def release(subProjection: ReleaseResponseProjection): ReleaseAssetResponseProjection = {
        release(null.asInstanceOf[String], subProjection)
    }

    def release(alias: String, subProjection: ReleaseResponseProjection): ReleaseAssetResponseProjection = {
        fields.add(new GraphQLResponseField("release").alias(alias).projection(subProjection))
        this
    }

    def size(): ReleaseAssetResponseProjection = {
        size(null.asInstanceOf[String])
    }

    def size(alias: String): ReleaseAssetResponseProjection = {
        fields.add(new GraphQLResponseField("size").alias(alias))
        this
    }

    def updatedAt(): ReleaseAssetResponseProjection = {
        updatedAt(null.asInstanceOf[String])
    }

    def updatedAt(alias: String): ReleaseAssetResponseProjection = {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias))
        this
    }

    def uploadedBy(subProjection: UserResponseProjection): ReleaseAssetResponseProjection = {
        uploadedBy(null.asInstanceOf[String], subProjection)
    }

    def uploadedBy(alias: String, subProjection: UserResponseProjection): ReleaseAssetResponseProjection = {
        fields.add(new GraphQLResponseField("uploadedBy").alias(alias).projection(subProjection))
        this
    }

    def url(): ReleaseAssetResponseProjection = {
        url(null.asInstanceOf[String])
    }

    def url(alias: String): ReleaseAssetResponseProjection = {
        fields.add(new GraphQLResponseField("url").alias(alias))
        this
    }

    def typename(): ReleaseAssetResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): ReleaseAssetResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
