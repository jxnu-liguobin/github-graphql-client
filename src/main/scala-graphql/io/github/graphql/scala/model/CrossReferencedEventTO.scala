package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class CrossReferencedEventTO(
    actor: ActorTO,
    @javax.validation.constraints.NotNull
    createdAt: String,
    @javax.validation.constraints.NotNull
    override val id: String,
    isCrossRepository: Boolean,
    @javax.validation.constraints.NotNull
    referencedAt: String,
    @javax.validation.constraints.NotNull
    override val resourcePath: String,
    @javax.validation.constraints.NotNull
    source: ReferencedSubjectTO,
    @javax.validation.constraints.NotNull
    target: ReferencedSubjectTO,
    @javax.validation.constraints.NotNull
    override val url: String,
    willCloseTarget: Boolean
) extends IssueTimelineItemsTO with PullRequestTimelineItemsTO with IssueTimelineItemTO with PullRequestTimelineItemTO with UniformResourceLocatableTO with NodeTO {

    override def toString(): String = {
        Seq(
            if (actor != null) "actor: " + GraphQLRequestSerializer.getEntry(actor) else "",
            if (createdAt != null) "createdAt: " + GraphQLRequestSerializer.getEntry(createdAt) else "",
            if (id != null) "id: " + GraphQLRequestSerializer.getEntry(id) else "",
            "isCrossRepository: " + GraphQLRequestSerializer.getEntry(isCrossRepository),
            if (referencedAt != null) "referencedAt: " + GraphQLRequestSerializer.getEntry(referencedAt) else "",
            if (resourcePath != null) "resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath) else "",
            if (source != null) "source: " + GraphQLRequestSerializer.getEntry(source) else "",
            if (target != null) "target: " + GraphQLRequestSerializer.getEntry(target) else "",
            if (url != null) "url: " + GraphQLRequestSerializer.getEntry(url) else "",
            "willCloseTarget: " + GraphQLRequestSerializer.getEntry(willCloseTarget)
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[CrossReferencedEventTO]
        Objects.equals(actor, that.actor) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(id, that.id) &&
        Objects.equals(isCrossRepository, that.isCrossRepository) &&
        Objects.equals(referencedAt, that.referencedAt) &&
        Objects.equals(resourcePath, that.resourcePath) &&
        Objects.equals(source, that.source) &&
        Objects.equals(target, that.target) &&
        Objects.equals(url, that.url) &&
        Objects.equals(willCloseTarget, that.willCloseTarget)
    }

    override def hashCode(): Int = {
        Objects.hash(actor, createdAt, id, isCrossRepository, referencedAt, resourcePath, source, target, url, willCloseTarget)
    }
}

object CrossReferencedEventTO {

    def builder(): CrossReferencedEventTO.Builder = new Builder()

    class Builder {

        private var actor: ActorTO = _
        private var createdAt: String = _
        private var id: String = _
        private var isCrossRepository: Boolean = _
        private var referencedAt: String = _
        private var resourcePath: String = _
        private var source: ReferencedSubjectTO = _
        private var target: ReferencedSubjectTO = _
        private var url: String = _
        private var willCloseTarget: Boolean = _

        def setActor(actor: ActorTO): Builder = {
            this.actor = actor
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

        def setIsCrossRepository(isCrossRepository: Boolean): Builder = {
            this.isCrossRepository = isCrossRepository
            this
        }

        def setReferencedAt(referencedAt: String): Builder = {
            this.referencedAt = referencedAt
            this
        }

        def setResourcePath(resourcePath: String): Builder = {
            this.resourcePath = resourcePath
            this
        }

        def setSource(source: ReferencedSubjectTO): Builder = {
            this.source = source
            this
        }

        def setTarget(target: ReferencedSubjectTO): Builder = {
            this.target = target
            this
        }

        def setUrl(url: String): Builder = {
            this.url = url
            this
        }

        def setWillCloseTarget(willCloseTarget: Boolean): Builder = {
            this.willCloseTarget = willCloseTarget
            this
        }

        def build(): CrossReferencedEventTO = new CrossReferencedEventTO(actor, createdAt, id, isCrossRepository, referencedAt, resourcePath, source, target, url, willCloseTarget)

    }
}
