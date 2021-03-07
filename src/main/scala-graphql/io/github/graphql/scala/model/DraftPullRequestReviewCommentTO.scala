package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
class DraftPullRequestReviewCommentTO(
    @javax.validation.constraints.NotNull
    body: String,
    @javax.validation.constraints.NotNull
    path: String,
    position: Int
) {

    override def toString(): String = {
        Seq(
            if (body != null) "body: " + GraphQLRequestSerializer.getEntry(body) else "",
            if (path != null) "path: " + GraphQLRequestSerializer.getEntry(path) else "",
            "position: " + GraphQLRequestSerializer.getEntry(position)
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[DraftPullRequestReviewCommentTO]
        Objects.equals(body, that.body) &&
        Objects.equals(path, that.path) &&
        Objects.equals(position, that.position)
    }

    override def hashCode(): Int = {
        Objects.hash(body, path, position)
    }
}

object DraftPullRequestReviewCommentTO {

    def builder(): DraftPullRequestReviewCommentTO.Builder = new Builder()

    class Builder {

        private var body: String = _
        private var path: String = _
        private var position: Int = _

        def setBody(body: String): Builder = {
            this.body = body
            this
        }

        def setPath(path: String): Builder = {
            this.path = path
            this
        }

        def setPosition(position: Int): Builder = {
            this.position = position
            this
        }

        def build(): DraftPullRequestReviewCommentTO = new DraftPullRequestReviewCommentTO(body, path, position)

    }
}
