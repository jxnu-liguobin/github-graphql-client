package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._
import ReactionContentTO._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class ReactionGroupTO(
    @javax.validation.constraints.NotNull
    content: ReactionContentTO,
    createdAt: String,
    @javax.validation.constraints.NotNull
    subject: ReactableTO,
    viewerHasReacted: Boolean
) {

    override def toString(): String = {
        Seq(
            if (content != null) "content: " + GraphQLRequestSerializer.getEntry(content) else "",
            if (createdAt != null) "createdAt: " + GraphQLRequestSerializer.getEntry(createdAt) else "",
            if (subject != null) "subject: " + GraphQLRequestSerializer.getEntry(subject) else "",
            "viewerHasReacted: " + GraphQLRequestSerializer.getEntry(viewerHasReacted)
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[ReactionGroupTO]
        Objects.equals(content, that.content) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(subject, that.subject) &&
        Objects.equals(viewerHasReacted, that.viewerHasReacted)
    }

    override def hashCode(): Int = {
        Objects.hash(content, createdAt, subject, viewerHasReacted)
    }
}

object ReactionGroupTO {

    def builder(): ReactionGroupTO.Builder = new Builder()

    class Builder {

        private var content: ReactionContentTO = _
        private var createdAt: String = _
        private var subject: ReactableTO = _
        private var viewerHasReacted: Boolean = _

        def setContent(content: ReactionContentTO): Builder = {
            this.content = content
            this
        }

        def setCreatedAt(createdAt: String): Builder = {
            this.createdAt = createdAt
            this
        }

        def setSubject(subject: ReactableTO): Builder = {
            this.subject = subject
            this
        }

        def setViewerHasReacted(viewerHasReacted: Boolean): Builder = {
            this.viewerHasReacted = viewerHasReacted
            this
        }

        def build(): ReactionGroupTO = new ReactionGroupTO(content, createdAt, subject, viewerHasReacted)

    }
}
