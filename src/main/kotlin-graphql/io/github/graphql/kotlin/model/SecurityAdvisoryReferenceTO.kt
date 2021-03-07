package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class SecurityAdvisoryReferenceTO(
    val url: String
) {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
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
        val that = other as SecurityAdvisoryReferenceTO
        return Objects.equals(url, that.url)

    }

    override fun hashCode(): Int = {
        return Objects.hash(url)
    }

    class Builder {

        private lateinit var url: String

        fun setUrl(url: String): Builder {
            this.url = url
            return this
        }

        fun build(): SecurityAdvisoryReferenceTO {
            return SecurityAdvisoryReferenceTO(url)
        }
    }
}
