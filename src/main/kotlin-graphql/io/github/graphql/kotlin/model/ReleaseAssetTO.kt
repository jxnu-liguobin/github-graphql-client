package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class ReleaseAssetTO(
    val contentType: String,
    val createdAt: String,
    val downloadCount: Int,
    val downloadUrl: String,
    override
    val id: String,
    val name: String,
    val release: ReleaseTO?,
    val size: Int,
    val updatedAt: String,
    val uploadedBy: UserTO,
    val url: String
) : NodeTO {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("contentType: " + GraphQLRequestSerializer.getEntry(contentType))
        joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt))
        joiner.add("downloadCount: " + GraphQLRequestSerializer.getEntry(downloadCount))
        joiner.add("downloadUrl: " + GraphQLRequestSerializer.getEntry(downloadUrl))
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        joiner.add("name: " + GraphQLRequestSerializer.getEntry(name))
        if (release != null) {
            joiner.add("release: " + GraphQLRequestSerializer.getEntry(release))
        }
        joiner.add("size: " + GraphQLRequestSerializer.getEntry(size))
        joiner.add("updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt))
        joiner.add("uploadedBy: " + GraphQLRequestSerializer.getEntry(uploadedBy))
        joiner.add("url: " + GraphQLRequestSerializer.getEntry(url))
        return joiner.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as ReleaseAssetTO
        return Objects.equals(contentType, that.contentType)
                && Objects.equals(createdAt, that.createdAt)
                && Objects.equals(downloadCount, that.downloadCount)
                && Objects.equals(downloadUrl, that.downloadUrl)
                && Objects.equals(id, that.id)
                && Objects.equals(name, that.name)
                && Objects.equals(release, that.release)
                && Objects.equals(size, that.size)
                && Objects.equals(updatedAt, that.updatedAt)
                && Objects.equals(uploadedBy, that.uploadedBy)
                && Objects.equals(url, that.url)

    }

    override fun hashCode(): Int = {
        return Objects.hash(contentType, createdAt, downloadCount, downloadUrl, id, name, release, size, updatedAt, uploadedBy, url)
    }

    class Builder {

        private lateinit var contentType: String
        private lateinit var createdAt: String
        private var downloadCount: Int = 0
        private lateinit var downloadUrl: String
        private lateinit var id: String
        private lateinit var name: String
        private var release: ReleaseTO? = null
        private var size: Int = 0
        private lateinit var updatedAt: String
        private lateinit var uploadedBy: UserTO
        private lateinit var url: String

        fun setContentType(contentType: String): Builder {
            this.contentType = contentType
            return this
        }

        fun setCreatedAt(createdAt: String): Builder {
            this.createdAt = createdAt
            return this
        }

        fun setDownloadCount(downloadCount: Int): Builder {
            this.downloadCount = downloadCount
            return this
        }

        fun setDownloadUrl(downloadUrl: String): Builder {
            this.downloadUrl = downloadUrl
            return this
        }

        fun setId(id: String): Builder {
            this.id = id
            return this
        }

        fun setName(name: String): Builder {
            this.name = name
            return this
        }

        fun setRelease(release: ReleaseTO?): Builder {
            this.release = release
            return this
        }

        fun setSize(size: Int): Builder {
            this.size = size
            return this
        }

        fun setUpdatedAt(updatedAt: String): Builder {
            this.updatedAt = updatedAt
            return this
        }

        fun setUploadedBy(uploadedBy: UserTO): Builder {
            this.uploadedBy = uploadedBy
            return this
        }

        fun setUrl(url: String): Builder {
            this.url = url
            return this
        }

        fun build(): ReleaseAssetTO {
            return ReleaseAssetTO(contentType, createdAt, downloadCount, downloadUrl, id, name, release, size, updatedAt, uploadedBy, url)
        }
    }
}
