package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class LicenseRuleTO(
    val description: String,
    val key: String,
    val label: String
) {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("description: " + GraphQLRequestSerializer.getEntry(description))
        joiner.add("key: " + GraphQLRequestSerializer.getEntry(key))
        joiner.add("label: " + GraphQLRequestSerializer.getEntry(label))
        return joiner.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as LicenseRuleTO
        return Objects.equals(description, that.description)
                && Objects.equals(key, that.key)
                && Objects.equals(label, that.label)

    }

    override fun hashCode(): Int = {
        return Objects.hash(description, key, label)
    }

    class Builder {

        private lateinit var description: String
        private lateinit var key: String
        private lateinit var label: String

        fun setDescription(description: String): Builder {
            this.description = description
            return this
        }

        fun setKey(key: String): Builder {
            this.key = key
            return this
        }

        fun setLabel(label: String): Builder {
            this.label = label
            return this
        }

        fun build(): LicenseRuleTO {
            return LicenseRuleTO(description, key, label)
        }
    }
}
