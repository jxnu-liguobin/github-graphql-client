package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class QueryTO(
    val codesOfConduct: List<CodeOfConductTO?>?,
    val licenses: List<LicenseTO?>,
    val meta: GitHubMetadataTO,
    val relay: QueryTO,
    val viewer: UserTO
) {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (codesOfConduct != null) {
            joiner.add("codesOfConduct: " + GraphQLRequestSerializer.getEntry(codesOfConduct))
        }
        joiner.add("licenses: " + GraphQLRequestSerializer.getEntry(licenses))
        joiner.add("meta: " + GraphQLRequestSerializer.getEntry(meta))
        joiner.add("relay: " + GraphQLRequestSerializer.getEntry(relay))
        joiner.add("viewer: " + GraphQLRequestSerializer.getEntry(viewer))
        return joiner.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as QueryTO
        return Objects.equals(codesOfConduct, that.codesOfConduct)
                && Objects.equals(licenses, that.licenses)
                && Objects.equals(meta, that.meta)
                && Objects.equals(relay, that.relay)
                && Objects.equals(viewer, that.viewer)

    }

    override fun hashCode(): Int = {
        return Objects.hash(codesOfConduct, licenses, meta, relay, viewer)
    }

    class Builder {

        private var codesOfConduct: List<CodeOfConductTO?>? = null
        private lateinit var licenses: List<LicenseTO?>
        private lateinit var meta: GitHubMetadataTO
        private lateinit var relay: QueryTO
        private lateinit var viewer: UserTO

        fun setCodesOfConduct(codesOfConduct: List<CodeOfConductTO?>?): Builder {
            this.codesOfConduct = codesOfConduct
            return this
        }

        fun setLicenses(licenses: List<LicenseTO?>): Builder {
            this.licenses = licenses
            return this
        }

        fun setMeta(meta: GitHubMetadataTO): Builder {
            this.meta = meta
            return this
        }

        fun setRelay(relay: QueryTO): Builder {
            this.relay = relay
            return this
        }

        fun setViewer(viewer: UserTO): Builder {
            this.viewer = viewer
            return this
        }

        fun build(): QueryTO {
            return QueryTO(codesOfConduct, licenses, meta, relay, viewer)
        }
    }
}
