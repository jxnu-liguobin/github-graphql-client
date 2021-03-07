package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:14+0800"
)
open class RegistryPackageMetadatumTO(
    val name: String,
    val update: Boolean?,
    val value: String
) {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("name: " + GraphQLRequestSerializer.getEntry(name))
        if (update != null) {
            joiner.add("update: " + GraphQLRequestSerializer.getEntry(update))
        }
        joiner.add("value: " + GraphQLRequestSerializer.getEntry(value))
        return joiner.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as RegistryPackageMetadatumTO
        return Objects.equals(name, that.name)
                && Objects.equals(update, that.update)
                && Objects.equals(value, that.value)

    }

    override fun hashCode(): Int = {
        return Objects.hash(name, update, value)
    }

    class Builder {

        private lateinit var name: String
        private var update: Boolean? = null
        private lateinit var value: String

        fun setName(name: String): Builder {
            this.name = name
            return this
        }

        fun setUpdate(update: Boolean?): Builder {
            this.update = update
            return this
        }

        fun setValue(value: String): Builder {
            this.value = value
            return this
        }

        fun build(): RegistryPackageMetadatumTO {
            return RegistryPackageMetadatumTO(name, update, value)
        }
    }
}
