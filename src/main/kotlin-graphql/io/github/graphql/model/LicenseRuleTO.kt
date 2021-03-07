package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
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
