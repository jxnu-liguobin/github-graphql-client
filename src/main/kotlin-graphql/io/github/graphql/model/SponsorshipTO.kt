package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
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
