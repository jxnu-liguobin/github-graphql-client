package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class SponsorshipTO(
    val createdAt: String,
    override
    val id: String,
    val maintainer: UserTO,
    val privacyLevel: SponsorshipPrivacyTO,
    val sponsor: UserTO?
) : NodeTO {

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
}
