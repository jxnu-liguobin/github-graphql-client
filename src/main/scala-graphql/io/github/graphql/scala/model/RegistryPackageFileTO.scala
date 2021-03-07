package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class RegistryPackageFileTO(
    guid: String,
    @javax.validation.constraints.NotNull
    override val id: String,
    md5: String,
    @javax.validation.constraints.NotNull
    metadataUrl: String,
    @javax.validation.constraints.NotNull
    name: String,
    @javax.validation.constraints.NotNull
    packageVersion: RegistryPackageVersionTO,
    sha1: String,
    sha256: String,
    size: Option[Int],
    @javax.validation.constraints.NotNull
    updatedAt: String,
    @javax.validation.constraints.NotNull
    url: String
) extends NodeTO {

    override def toString(): String = {
        Seq(
            if (guid != null) "guid: " + GraphQLRequestSerializer.getEntry(guid) else "",
            if (id != null) "id: " + GraphQLRequestSerializer.getEntry(id) else "",
            if (md5 != null) "md5: " + GraphQLRequestSerializer.getEntry(md5) else "",
            if (metadataUrl != null) "metadataUrl: " + GraphQLRequestSerializer.getEntry(metadataUrl) else "",
            if (name != null) "name: " + GraphQLRequestSerializer.getEntry(name) else "",
            if (packageVersion != null) "packageVersion: " + GraphQLRequestSerializer.getEntry(packageVersion) else "",
            if (sha1 != null) "sha1: " + GraphQLRequestSerializer.getEntry(sha1) else "",
            if (sha256 != null) "sha256: " + GraphQLRequestSerializer.getEntry(sha256) else "",
            if (size.isDefined) "size: " + GraphQLRequestSerializer.getEntry(size.get) else "",
            if (updatedAt != null) "updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt) else "",
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
        val that = obj.asInstanceOf[RegistryPackageFileTO]
        Objects.equals(guid, that.guid) &&
        Objects.equals(id, that.id) &&
        Objects.equals(md5, that.md5) &&
        Objects.equals(metadataUrl, that.metadataUrl) &&
        Objects.equals(name, that.name) &&
        Objects.equals(packageVersion, that.packageVersion) &&
        Objects.equals(sha1, that.sha1) &&
        Objects.equals(sha256, that.sha256) &&
        Objects.equals(size, that.size) &&
        Objects.equals(updatedAt, that.updatedAt) &&
        Objects.equals(url, that.url)
    }

    override def hashCode(): Int = {
        Objects.hash(guid, id, md5, metadataUrl, name, packageVersion, sha1, sha256, size, updatedAt, url)
    }
}

object RegistryPackageFileTO {

    def builder(): RegistryPackageFileTO.Builder = new Builder()

    class Builder {

        private var guid: String = _
        private var id: String = _
        private var md5: String = _
        private var metadataUrl: String = _
        private var name: String = _
        private var packageVersion: RegistryPackageVersionTO = _
        private var sha1: String = _
        private var sha256: String = _
        private var size: Option[Int] = _
        private var updatedAt: String = _
        private var url: String = _

        def setGuid(guid: String): Builder = {
            this.guid = guid
            this
        }

        def setId(id: String): Builder = {
            this.id = id
            this
        }

        def setMd5(md5: String): Builder = {
            this.md5 = md5
            this
        }

        def setMetadataUrl(metadataUrl: String): Builder = {
            this.metadataUrl = metadataUrl
            this
        }

        def setName(name: String): Builder = {
            this.name = name
            this
        }

        def setPackageVersion(packageVersion: RegistryPackageVersionTO): Builder = {
            this.packageVersion = packageVersion
            this
        }

        def setSha1(sha1: String): Builder = {
            this.sha1 = sha1
            this
        }

        def setSha256(sha256: String): Builder = {
            this.sha256 = sha256
            this
        }

        def setSize(size: Option[Int]): Builder = {
            this.size = size
            this
        }

        def setUpdatedAt(updatedAt: String): Builder = {
            this.updatedAt = updatedAt
            this
        }

        def setUrl(url: String): Builder = {
            this.url = url
            this
        }

        def build(): RegistryPackageFileTO = new RegistryPackageFileTO(guid, id, md5, metadataUrl, name, packageVersion, sha1, sha256, size, updatedAt, url)

    }
}
