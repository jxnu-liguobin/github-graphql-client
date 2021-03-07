package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class LicenseTO(
    @javax.validation.constraints.NotNull
    body: String,
    @javax.validation.constraints.NotNull
    conditions: Seq[LicenseRuleTO],
    description: String,
    featured: Boolean,
    hidden: Boolean,
    @javax.validation.constraints.NotNull
    override val id: String,
    implementation: String,
    @javax.validation.constraints.NotNull
    key: String,
    @javax.validation.constraints.NotNull
    limitations: Seq[LicenseRuleTO],
    @javax.validation.constraints.NotNull
    name: String,
    nickname: String,
    @javax.validation.constraints.NotNull
    permissions: Seq[LicenseRuleTO],
    pseudoLicense: Boolean,
    spdxId: String,
    url: String
) extends NodeTO {

    override def toString(): String = {
        Seq(
            if (body != null) "body: " + GraphQLRequestSerializer.getEntry(body) else "",
            if (conditions != null) "conditions: " + GraphQLRequestSerializer.getEntry(conditions.asJava) else "",
            if (description != null) "description: " + GraphQLRequestSerializer.getEntry(description) else "",
            "featured: " + GraphQLRequestSerializer.getEntry(featured),
            "hidden: " + GraphQLRequestSerializer.getEntry(hidden),
            if (id != null) "id: " + GraphQLRequestSerializer.getEntry(id) else "",
            if (implementation != null) "implementation: " + GraphQLRequestSerializer.getEntry(implementation) else "",
            if (key != null) "key: " + GraphQLRequestSerializer.getEntry(key) else "",
            if (limitations != null) "limitations: " + GraphQLRequestSerializer.getEntry(limitations.asJava) else "",
            if (name != null) "name: " + GraphQLRequestSerializer.getEntry(name) else "",
            if (nickname != null) "nickname: " + GraphQLRequestSerializer.getEntry(nickname) else "",
            if (permissions != null) "permissions: " + GraphQLRequestSerializer.getEntry(permissions.asJava) else "",
            "pseudoLicense: " + GraphQLRequestSerializer.getEntry(pseudoLicense),
            if (spdxId != null) "spdxId: " + GraphQLRequestSerializer.getEntry(spdxId) else "",
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
        val that = obj.asInstanceOf[LicenseTO]
        Objects.equals(body, that.body) &&
        Objects.equals(conditions, that.conditions) &&
        Objects.equals(description, that.description) &&
        Objects.equals(featured, that.featured) &&
        Objects.equals(hidden, that.hidden) &&
        Objects.equals(id, that.id) &&
        Objects.equals(implementation, that.implementation) &&
        Objects.equals(key, that.key) &&
        Objects.equals(limitations, that.limitations) &&
        Objects.equals(name, that.name) &&
        Objects.equals(nickname, that.nickname) &&
        Objects.equals(permissions, that.permissions) &&
        Objects.equals(pseudoLicense, that.pseudoLicense) &&
        Objects.equals(spdxId, that.spdxId) &&
        Objects.equals(url, that.url)
    }

    override def hashCode(): Int = {
        Objects.hash(body, conditions, description, featured, hidden, id, implementation, key, limitations, name, nickname, permissions, pseudoLicense, spdxId, url)
    }
}

object LicenseTO {

    def builder(): LicenseTO.Builder = new Builder()

    class Builder {

        private var body: String = _
        private var conditions: Seq[LicenseRuleTO] = _
        private var description: String = _
        private var featured: Boolean = _
        private var hidden: Boolean = _
        private var id: String = _
        private var implementation: String = _
        private var key: String = _
        private var limitations: Seq[LicenseRuleTO] = _
        private var name: String = _
        private var nickname: String = _
        private var permissions: Seq[LicenseRuleTO] = _
        private var pseudoLicense: Boolean = _
        private var spdxId: String = _
        private var url: String = _

        def setBody(body: String): Builder = {
            this.body = body
            this
        }

        def setConditions(conditions: Seq[LicenseRuleTO]): Builder = {
            this.conditions = conditions
            this
        }

        def setDescription(description: String): Builder = {
            this.description = description
            this
        }

        def setFeatured(featured: Boolean): Builder = {
            this.featured = featured
            this
        }

        def setHidden(hidden: Boolean): Builder = {
            this.hidden = hidden
            this
        }

        def setId(id: String): Builder = {
            this.id = id
            this
        }

        def setImplementation(implementation: String): Builder = {
            this.implementation = implementation
            this
        }

        def setKey(key: String): Builder = {
            this.key = key
            this
        }

        def setLimitations(limitations: Seq[LicenseRuleTO]): Builder = {
            this.limitations = limitations
            this
        }

        def setName(name: String): Builder = {
            this.name = name
            this
        }

        def setNickname(nickname: String): Builder = {
            this.nickname = nickname
            this
        }

        def setPermissions(permissions: Seq[LicenseRuleTO]): Builder = {
            this.permissions = permissions
            this
        }

        def setPseudoLicense(pseudoLicense: Boolean): Builder = {
            this.pseudoLicense = pseudoLicense
            this
        }

        def setSpdxId(spdxId: String): Builder = {
            this.spdxId = spdxId
            this
        }

        def setUrl(url: String): Builder = {
            this.url = url
            this
        }

        def build(): LicenseTO = new LicenseTO(body, conditions, description, featured, hidden, id, implementation, key, limitations, name, nickname, permissions, pseudoLicense, spdxId, url)

    }
}
