package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:14+0800"
)
open class ProjectCardImportTO(
    val number: Int,
    val repository: String
) {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("number: " + GraphQLRequestSerializer.getEntry(number))
        joiner.add("repository: " + GraphQLRequestSerializer.getEntry(repository))
        return joiner.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as ProjectCardImportTO
        return Objects.equals(number, that.number)
                && Objects.equals(repository, that.repository)

    }

    override fun hashCode(): Int = {
        return Objects.hash(number, repository)
    }

    class Builder {

        private var number: Int = 0
        private lateinit var repository: String

        fun setNumber(number: Int): Builder {
            this.number = number
            return this
        }

        fun setRepository(repository: String): Builder {
            this.repository = repository
            return this
        }

        fun build(): ProjectCardImportTO {
            return ProjectCardImportTO(number, repository)
        }
    }
}
