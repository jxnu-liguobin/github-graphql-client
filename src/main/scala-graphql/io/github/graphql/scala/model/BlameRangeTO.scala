package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class BlameRangeTO(
    age: Int,
    @javax.validation.constraints.NotNull
    commit: CommitTO,
    endingLine: Int,
    startingLine: Int
) {

    override def toString(): String = {
        Seq(
            "age: " + GraphQLRequestSerializer.getEntry(age),
            if (commit != null) "commit: " + GraphQLRequestSerializer.getEntry(commit) else "",
            "endingLine: " + GraphQLRequestSerializer.getEntry(endingLine),
            "startingLine: " + GraphQLRequestSerializer.getEntry(startingLine)
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[BlameRangeTO]
        Objects.equals(age, that.age) &&
        Objects.equals(commit, that.commit) &&
        Objects.equals(endingLine, that.endingLine) &&
        Objects.equals(startingLine, that.startingLine)
    }

    override def hashCode(): Int = {
        Objects.hash(age, commit, endingLine, startingLine)
    }
}

object BlameRangeTO {

    def builder(): BlameRangeTO.Builder = new Builder()

    class Builder {

        private var age: Int = _
        private var commit: CommitTO = _
        private var endingLine: Int = _
        private var startingLine: Int = _

        def setAge(age: Int): Builder = {
            this.age = age
            this
        }

        def setCommit(commit: CommitTO): Builder = {
            this.commit = commit
            this
        }

        def setEndingLine(endingLine: Int): Builder = {
            this.endingLine = endingLine
            this
        }

        def setStartingLine(startingLine: Int): Builder = {
            this.startingLine = startingLine
            this
        }

        def build(): BlameRangeTO = new BlameRangeTO(age, commit, endingLine, startingLine)

    }
}
