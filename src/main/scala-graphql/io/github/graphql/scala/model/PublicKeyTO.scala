package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class PublicKeyTO(
    accessedAt: String,
    createdAt: String,
    @javax.validation.constraints.NotNull
    fingerprint: String,
    @javax.validation.constraints.NotNull
    override val id: String,
    isReadOnly: Option[Boolean],
    @javax.validation.constraints.NotNull
    key: String,
    updatedAt: String
) extends NodeTO {

    override def toString(): String = {
        Seq(
            if (accessedAt != null) "accessedAt: " + GraphQLRequestSerializer.getEntry(accessedAt) else "",
            if (createdAt != null) "createdAt: " + GraphQLRequestSerializer.getEntry(createdAt) else "",
            if (fingerprint != null) "fingerprint: " + GraphQLRequestSerializer.getEntry(fingerprint) else "",
            if (id != null) "id: " + GraphQLRequestSerializer.getEntry(id) else "",
            if (isReadOnly.isDefined) "isReadOnly: " + GraphQLRequestSerializer.getEntry(isReadOnly.get) else "",
            if (key != null) "key: " + GraphQLRequestSerializer.getEntry(key) else "",
            if (updatedAt != null) "updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[PublicKeyTO]
        Objects.equals(accessedAt, that.accessedAt) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(fingerprint, that.fingerprint) &&
        Objects.equals(id, that.id) &&
        Objects.equals(isReadOnly, that.isReadOnly) &&
        Objects.equals(key, that.key) &&
        Objects.equals(updatedAt, that.updatedAt)
    }

    override def hashCode(): Int = {
        Objects.hash(accessedAt, createdAt, fingerprint, id, isReadOnly, key, updatedAt)
    }
}

object PublicKeyTO {

    def builder(): PublicKeyTO.Builder = new Builder()

    class Builder {

        private var accessedAt: String = _
        private var createdAt: String = _
        private var fingerprint: String = _
        private var id: String = _
        private var isReadOnly: Option[Boolean] = _
        private var key: String = _
        private var updatedAt: String = _

        def setAccessedAt(accessedAt: String): Builder = {
            this.accessedAt = accessedAt
            this
        }

        def setCreatedAt(createdAt: String): Builder = {
            this.createdAt = createdAt
            this
        }

        def setFingerprint(fingerprint: String): Builder = {
            this.fingerprint = fingerprint
            this
        }

        def setId(id: String): Builder = {
            this.id = id
            this
        }

        def setIsReadOnly(isReadOnly: Option[Boolean]): Builder = {
            this.isReadOnly = isReadOnly
            this
        }

        def setKey(key: String): Builder = {
            this.key = key
            this
        }

        def setUpdatedAt(updatedAt: String): Builder = {
            this.updatedAt = updatedAt
            this
        }

        def build(): PublicKeyTO = new PublicKeyTO(accessedAt, createdAt, fingerprint, id, isReadOnly, key, updatedAt)

    }
}
