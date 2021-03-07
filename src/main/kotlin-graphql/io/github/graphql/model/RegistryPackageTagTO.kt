package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class RegistryPackageTagTO(
    override
    val id: String,
    val name: String,
    val version: RegistryPackageVersionTO?
) : NodeTO {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        joiner.add("name: " + GraphQLRequestSerializer.getEntry(name))
        if (version != null) {
            joiner.add("version: " + GraphQLRequestSerializer.getEntry(version))
        }
        return joiner.toString()
    }

    class Builder {

        private lateinit var id: String
        private lateinit var name: String
        private var version: RegistryPackageVersionTO? = null

        fun setId(id: String): Builder {
            this.id = id
            return this
        }

        fun setName(name: String): Builder {
            this.name = name
            return this
        }

        fun setVersion(version: RegistryPackageVersionTO?): Builder {
            this.version = version
            return this
        }

        fun build(): RegistryPackageTagTO {
            return RegistryPackageTagTO(id, name, version)
        }
    }
}
