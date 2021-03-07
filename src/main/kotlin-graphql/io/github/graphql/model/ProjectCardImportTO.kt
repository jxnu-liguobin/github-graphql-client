package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
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
