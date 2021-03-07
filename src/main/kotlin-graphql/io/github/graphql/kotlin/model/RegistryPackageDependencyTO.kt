package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class RegistryPackageDependencyTO(
    val dependencyType: RegistryPackageDependencyTypeTO,
    override
    val id: String,
    val name: String,
    val version: String
) : NodeTO {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("dependencyType: " + GraphQLRequestSerializer.getEntry(dependencyType))
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        joiner.add("name: " + GraphQLRequestSerializer.getEntry(name))
        joiner.add("version: " + GraphQLRequestSerializer.getEntry(version))
        return joiner.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as RegistryPackageDependencyTO
        return Objects.equals(dependencyType, that.dependencyType)
                && Objects.equals(id, that.id)
                && Objects.equals(name, that.name)
                && Objects.equals(version, that.version)

    }

    override fun hashCode(): Int = {
        return Objects.hash(dependencyType, id, name, version)
    }

    class Builder {

        private lateinit var dependencyType: RegistryPackageDependencyTypeTO
        private lateinit var id: String
        private lateinit var name: String
        private lateinit var version: String

        fun setDependencyType(dependencyType: RegistryPackageDependencyTypeTO): Builder {
            this.dependencyType = dependencyType
            return this
        }

        fun setId(id: String): Builder {
            this.id = id
            return this
        }

        fun setName(name: String): Builder {
            this.name = name
            return this
        }

        fun setVersion(version: String): Builder {
            this.version = version
            return this
        }

        fun build(): RegistryPackageDependencyTO {
            return RegistryPackageDependencyTO(dependencyType, id, name, version)
        }
    }
}
