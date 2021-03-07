package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class ReleaseAssetTO(
    @javax.validation.constraints.NotNull
    contentType: String,
    @javax.validation.constraints.NotNull
    createdAt: String,
    downloadCount: Int,
    @javax.validation.constraints.NotNull
    downloadUrl: String,
    @javax.validation.constraints.NotNull
    override val id: String,
    @javax.validation.constraints.NotNull
    name: String,
    release: ReleaseTO,
    size: Int,
    @javax.validation.constraints.NotNull
    updatedAt: String,
    @javax.validation.constraints.NotNull
    uploadedBy: UserTO,
    @javax.validation.constraints.NotNull
    url: String
) extends NodeTO {

    override def toString(): String = {
        Seq(
            if (contentType != null) "contentType: " + GraphQLRequestSerializer.getEntry(contentType) else "",
            if (createdAt != null) "createdAt: " + GraphQLRequestSerializer.getEntry(createdAt) else "",
            "downloadCount: " + GraphQLRequestSerializer.getEntry(downloadCount),
            if (downloadUrl != null) "downloadUrl: " + GraphQLRequestSerializer.getEntry(downloadUrl) else "",
            if (id != null) "id: " + GraphQLRequestSerializer.getEntry(id) else "",
            if (name != null) "name: " + GraphQLRequestSerializer.getEntry(name) else "",
            if (release != null) "release: " + GraphQLRequestSerializer.getEntry(release) else "",
            "size: " + GraphQLRequestSerializer.getEntry(size),
            if (updatedAt != null) "updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt) else "",
            if (uploadedBy != null) "uploadedBy: " + GraphQLRequestSerializer.getEntry(uploadedBy) else "",
            if (url != null) "url: " + GraphQLRequestSerializer.getEntry(url) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[ReleaseAssetTO]
        Objects.equals(contentType, that.contentType) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(downloadCount, that.downloadCount) &&
        Objects.equals(downloadUrl, that.downloadUrl) &&
        Objects.equals(id, that.id) &&
        Objects.equals(name, that.name) &&
        Objects.equals(release, that.release) &&
        Objects.equals(size, that.size) &&
        Objects.equals(updatedAt, that.updatedAt) &&
        Objects.equals(uploadedBy, that.uploadedBy) &&
        Objects.equals(url, that.url)
    }

    override def hashCode(): Int = {
        Objects.hash(contentType, createdAt, downloadCount, downloadUrl, id, name, release, size, updatedAt, uploadedBy, url)
    }
}

object ReleaseAssetTO {

    def builder(): ReleaseAssetTO.Builder = new Builder()

    class Builder {

        private var contentType: String = _
        private var createdAt: String = _
        private var downloadCount: Int = _
        private var downloadUrl: String = _
        private var id: String = _
        private var name: String = _
        private var release: ReleaseTO = _
        private var size: Int = _
        private var updatedAt: String = _
        private var uploadedBy: UserTO = _
        private var url: String = _

        def setContentType(contentType: String): Builder = {
            this.contentType = contentType
            this
        }

        def setCreatedAt(createdAt: String): Builder = {
            this.createdAt = createdAt
            this
        }

        def setDownloadCount(downloadCount: Int): Builder = {
            this.downloadCount = downloadCount
            this
        }

        def setDownloadUrl(downloadUrl: String): Builder = {
            this.downloadUrl = downloadUrl
            this
        }

        def setId(id: String): Builder = {
            this.id = id
            this
        }

        def setName(name: String): Builder = {
            this.name = name
            this
        }

        def setRelease(release: ReleaseTO): Builder = {
            this.release = release
            this
        }

        def setSize(size: Int): Builder = {
            this.size = size
            this
        }

        def setUpdatedAt(updatedAt: String): Builder = {
            this.updatedAt = updatedAt
            this
        }

        def setUploadedBy(uploadedBy: UserTO): Builder = {
            this.uploadedBy = uploadedBy
            this
        }

        def setUrl(url: String): Builder = {
            this.url = url
            this
        }

        def build(): ReleaseAssetTO = new ReleaseAssetTO(contentType, createdAt, downloadCount, downloadUrl, id, name, release, size, updatedAt, uploadedBy, url)

    }
}
