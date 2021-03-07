package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class SponsorshipTO(
    val createdAt: String,
    override
    val id: String,
    val maintainer: UserTO,
    val privacyLevel: SponsorshipPrivacyTO,
    val sponsor: UserTO?
) : NodeTO {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt))
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        joiner.add("maintainer: " + GraphQLRequestSerializer.getEntry(maintainer))
        joiner.add("privacyLevel: " + GraphQLRequestSerializer.getEntry(privacyLevel))
        if (sponsor != null) {
            joiner.add("sponsor: " + GraphQLRequestSerializer.getEntry(sponsor))
        }
        return joiner.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as SponsorshipTO
        return Objects.equals(createdAt, that.createdAt)
                && Objects.equals(id, that.id)
                && Objects.equals(maintainer, that.maintainer)
                && Objects.equals(privacyLevel, that.privacyLevel)
                && Objects.equals(sponsor, that.sponsor)

    }

    override fun hashCode(): Int = {
        return Objects.hash(createdAt, id, maintainer, privacyLevel, sponsor)
    }

    class Builder {

        private lateinit var createdAt: String
        private lateinit var id: String
        private lateinit var maintainer: UserTO
        private lateinit var privacyLevel: SponsorshipPrivacyTO
        private var sponsor: UserTO? = null

        fun setCreatedAt(createdAt: String): Builder {
            this.createdAt = createdAt
            return this
        }

        fun setId(id: String): Builder {
            this.id = id
            return this
        }

        fun setMaintainer(maintainer: UserTO): Builder {
            this.maintainer = maintainer
            return this
        }

        fun setPrivacyLevel(privacyLevel: SponsorshipPrivacyTO): Builder {
            this.privacyLevel = privacyLevel
            return this
        }

        fun setSponsor(sponsor: UserTO?): Builder {
            this.sponsor = sponsor
            return this
        }

        fun build(): SponsorshipTO {
            return SponsorshipTO(createdAt, id, maintainer, privacyLevel, sponsor)
        }
    }
}
