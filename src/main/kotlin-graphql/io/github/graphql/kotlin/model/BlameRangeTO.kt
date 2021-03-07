package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class BlameRangeTO(
    val age: Int,
    val commit: CommitTO,
    val endingLine: Int,
    val startingLine: Int
) {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("age: " + GraphQLRequestSerializer.getEntry(age))
        joiner.add("commit: " + GraphQLRequestSerializer.getEntry(commit))
        joiner.add("endingLine: " + GraphQLRequestSerializer.getEntry(endingLine))
        joiner.add("startingLine: " + GraphQLRequestSerializer.getEntry(startingLine))
        return joiner.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as BlameRangeTO
        return Objects.equals(age, that.age)
                && Objects.equals(commit, that.commit)
                && Objects.equals(endingLine, that.endingLine)
                && Objects.equals(startingLine, that.startingLine)

    }

    override fun hashCode(): Int = {
        return Objects.hash(age, commit, endingLine, startingLine)
    }

    class Builder {

        private var age: Int = 0
        private lateinit var commit: CommitTO
        private var endingLine: Int = 0
        private var startingLine: Int = 0

        fun setAge(age: Int): Builder {
            this.age = age
            return this
        }

        fun setCommit(commit: CommitTO): Builder {
            this.commit = commit
            return this
        }

        fun setEndingLine(endingLine: Int): Builder {
            this.endingLine = endingLine
            return this
        }

        fun setStartingLine(startingLine: Int): Builder {
            this.startingLine = startingLine
            return this
        }

        fun build(): BlameRangeTO {
            return BlameRangeTO(age, commit, endingLine, startingLine)
        }
    }
}
