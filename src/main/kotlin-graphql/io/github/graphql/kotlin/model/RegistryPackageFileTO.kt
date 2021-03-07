package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class RegistryPackageFileTO(
    val guid: String?,
    override
    val id: String,
    val md5: String?,
    val metadataUrl: String,
    val name: String,
    val packageVersion: RegistryPackageVersionTO,
    val sha1: String?,
    val sha256: String?,
    val size: Int?,
    val updatedAt: String,
    val url: String
) : NodeTO {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (guid != null) {
            joiner.add("guid: " + GraphQLRequestSerializer.getEntry(guid))
        }
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        if (md5 != null) {
            joiner.add("md5: " + GraphQLRequestSerializer.getEntry(md5))
        }
        joiner.add("metadataUrl: " + GraphQLRequestSerializer.getEntry(metadataUrl))
        joiner.add("name: " + GraphQLRequestSerializer.getEntry(name))
        joiner.add("packageVersion: " + GraphQLRequestSerializer.getEntry(packageVersion))
        if (sha1 != null) {
            joiner.add("sha1: " + GraphQLRequestSerializer.getEntry(sha1))
        }
        if (sha256 != null) {
            joiner.add("sha256: " + GraphQLRequestSerializer.getEntry(sha256))
        }
        if (size != null) {
            joiner.add("size: " + GraphQLRequestSerializer.getEntry(size))
        }
        joiner.add("updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt))
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
        val that = other as RegistryPackageFileTO
        return Objects.equals(guid, that.guid)
                && Objects.equals(id, that.id)
                && Objects.equals(md5, that.md5)
                && Objects.equals(metadataUrl, that.metadataUrl)
                && Objects.equals(name, that.name)
                && Objects.equals(packageVersion, that.packageVersion)
                && Objects.equals(sha1, that.sha1)
                && Objects.equals(sha256, that.sha256)
                && Objects.equals(size, that.size)
                && Objects.equals(updatedAt, that.updatedAt)
                && Objects.equals(url, that.url)

    }

    override fun hashCode(): Int = {
        return Objects.hash(guid, id, md5, metadataUrl, name, packageVersion, sha1, sha256, size, updatedAt, url)
    }

    class Builder {

        private var guid: String? = null
        private lateinit var id: String
        private var md5: String? = null
        private lateinit var metadataUrl: String
        private lateinit var name: String
        private lateinit var packageVersion: RegistryPackageVersionTO
        private var sha1: String? = null
        private var sha256: String? = null
        private var size: Int? = null
        private lateinit var updatedAt: String
        private lateinit var url: String

        fun setGuid(guid: String?): Builder {
            this.guid = guid
            return this
        }

        fun setId(id: String): Builder {
            this.id = id
            return this
        }

        fun setMd5(md5: String?): Builder {
            this.md5 = md5
            return this
        }

        fun setMetadataUrl(metadataUrl: String): Builder {
            this.metadataUrl = metadataUrl
            return this
        }

        fun setName(name: String): Builder {
            this.name = name
            return this
        }

        fun setPackageVersion(packageVersion: RegistryPackageVersionTO): Builder {
            this.packageVersion = packageVersion
            return this
        }

        fun setSha1(sha1: String?): Builder {
            this.sha1 = sha1
            return this
        }

        fun setSha256(sha256: String?): Builder {
            this.sha256 = sha256
            return this
        }

        fun setSize(size: Int?): Builder {
            this.size = size
            return this
        }

        fun setUpdatedAt(updatedAt: String): Builder {
            this.updatedAt = updatedAt
            return this
        }

        fun setUrl(url: String): Builder {
            this.url = url
            return this
        }

        fun build(): RegistryPackageFileTO {
            return RegistryPackageFileTO(guid, id, md5, metadataUrl, name, packageVersion, sha1, sha256, size, updatedAt, url)
        }
    }
}
