package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class ClosedEventTO(
    actor: ActorTO,
    @javax.validation.constraints.NotNull
    closable: ClosableTO,
    closer: CloserTO,
    @javax.validation.constraints.NotNull
    createdAt: String,
    @javax.validation.constraints.NotNull
    override val id: String,
    @javax.validation.constraints.NotNull
    override val resourcePath: String,
    @javax.validation.constraints.NotNull
    override val url: String
) extends IssueTimelineItemsTO with PullRequestTimelineItemsTO with IssueTimelineItemTO with PullRequestTimelineItemTO with UniformResourceLocatableTO with NodeTO {

    override def toString(): String = {
        Seq(
            if (actor != null) "actor: " + GraphQLRequestSerializer.getEntry(actor) else "",
            if (closable != null) "closable: " + GraphQLRequestSerializer.getEntry(closable) else "",
            if (closer != null) "closer: " + GraphQLRequestSerializer.getEntry(closer) else "",
            if (createdAt != null) "createdAt: " + GraphQLRequestSerializer.getEntry(createdAt) else "",
            if (id != null) "id: " + GraphQLRequestSerializer.getEntry(id) else "",
            if (resourcePath != null) "resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath) else "",
            if (url != null) "url: " + GraphQLRequestSerializer.getEntry(url) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object ClosedEventTO {

    def builder(): ClosedEventTO.Builder = new Builder()

    class Builder {

        private var actor: ActorTO = _
        private var closable: ClosableTO = _
        private var closer: CloserTO = _
        private var createdAt: String = _
        private var id: String = _
        private var resourcePath: String = _
        private var url: String = _

        def setActor(actor: ActorTO): Builder = {
            this.actor = actor
            this
        }

        def setClosable(closable: ClosableTO): Builder = {
            this.closable = closable
            this
        }

        def setCloser(closer: CloserTO): Builder = {
            this.closer = closer
            this
        }

        def setCreatedAt(createdAt: String): Builder = {
            this.createdAt = createdAt
            this
        }

        def setId(id: String): Builder = {
            this.id = id
            this
        }

        def setResourcePath(resourcePath: String): Builder = {
            this.resourcePath = resourcePath
            this
        }

        def setUrl(url: String): Builder = {
            this.url = url
            this
        }

        def build(): ClosedEventTO = new ClosedEventTO(actor, closable, closer, createdAt, id, resourcePath, url)

    }
}
