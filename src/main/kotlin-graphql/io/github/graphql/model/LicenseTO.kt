package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class LicenseTO(
    val body: String,
    val conditions: List<LicenseRuleTO?>,
    val description: String?,
    val featured: Boolean,
    val hidden: Boolean,
    override
    val id: String,
    val implementation: String?,
    val key: String,
    val limitations: List<LicenseRuleTO?>,
    val name: String,
    val nickname: String?,
    val permissions: List<LicenseRuleTO?>,
    val pseudoLicense: Boolean,
    val spdxId: String?,
    val url: String?
) : NodeTO {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("body: " + GraphQLRequestSerializer.getEntry(body))
        joiner.add("conditions: " + GraphQLRequestSerializer.getEntry(conditions))
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description))
        }
        joiner.add("featured: " + GraphQLRequestSerializer.getEntry(featured))
        joiner.add("hidden: " + GraphQLRequestSerializer.getEntry(hidden))
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        if (implementation != null) {
            joiner.add("implementation: " + GraphQLRequestSerializer.getEntry(implementation))
        }
        joiner.add("key: " + GraphQLRequestSerializer.getEntry(key))
        joiner.add("limitations: " + GraphQLRequestSerializer.getEntry(limitations))
        joiner.add("name: " + GraphQLRequestSerializer.getEntry(name))
        if (nickname != null) {
            joiner.add("nickname: " + GraphQLRequestSerializer.getEntry(nickname))
        }
        joiner.add("permissions: " + GraphQLRequestSerializer.getEntry(permissions))
        joiner.add("pseudoLicense: " + GraphQLRequestSerializer.getEntry(pseudoLicense))
        if (spdxId != null) {
            joiner.add("spdxId: " + GraphQLRequestSerializer.getEntry(spdxId))
        }
        if (url != null) {
            joiner.add("url: " + GraphQLRequestSerializer.getEntry(url))
        }
        return joiner.toString()
    }

    class Builder {

        private lateinit var body: String
        private lateinit var conditions: List<LicenseRuleTO?>
        private var description: String? = null
        private var featured: Boolean = false
        private var hidden: Boolean = false
        private lateinit var id: String
        private var implementation: String? = null
        private lateinit var key: String
        private lateinit var limitations: List<LicenseRuleTO?>
        private lateinit var name: String
        private var nickname: String? = null
        private lateinit var permissions: List<LicenseRuleTO?>
        private var pseudoLicense: Boolean = false
        private var spdxId: String? = null
        private var url: String? = null

        fun setBody(body: String): Builder {
            this.body = body
            return this
        }

        fun setConditions(conditions: List<LicenseRuleTO?>): Builder {
            this.conditions = conditions
            return this
        }

        fun setDescription(description: String?): Builder {
            this.description = description
            return this
        }

        fun setFeatured(featured: Boolean): Builder {
            this.featured = featured
            return this
        }

        fun setHidden(hidden: Boolean): Builder {
            this.hidden = hidden
            return this
        }

        fun setId(id: String): Builder {
            this.id = id
            return this
        }

        fun setImplementation(implementation: String?): Builder {
            this.implementation = implementation
            return this
        }

        fun setKey(key: String): Builder {
            this.key = key
            return this
        }

        fun setLimitations(limitations: List<LicenseRuleTO?>): Builder {
            this.limitations = limitations
            return this
        }

        fun setName(name: String): Builder {
            this.name = name
            return this
        }

        fun setNickname(nickname: String?): Builder {
            this.nickname = nickname
            return this
        }

        fun setPermissions(permissions: List<LicenseRuleTO?>): Builder {
            this.permissions = permissions
            return this
        }

        fun setPseudoLicense(pseudoLicense: Boolean): Builder {
            this.pseudoLicense = pseudoLicense
            return this
        }

        fun setSpdxId(spdxId: String?): Builder {
            this.spdxId = spdxId
            return this
        }

        fun setUrl(url: String?): Builder {
            this.url = url
            return this
        }

        fun build(): LicenseTO {
            return LicenseTO(body, conditions, description, featured, hidden, id, implementation, key, limitations, name, nickname, permissions, pseudoLicense, spdxId, url)
        }
    }
}
