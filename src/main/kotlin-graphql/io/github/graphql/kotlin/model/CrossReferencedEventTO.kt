package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class CrossReferencedEventTO(
    val actor: ActorTO?,
    val createdAt: String,
    override
    val id: String,
    val isCrossRepository: Boolean,
    val referencedAt: String,
    override
    val resourcePath: String,
    val source: ReferencedSubjectTO,
    val target: ReferencedSubjectTO,
    override
    val url: String,
    val willCloseTarget: Boolean
) : IssueTimelineItemsTO, PullRequestTimelineItemsTO, IssueTimelineItemTO, PullRequestTimelineItemTO, UniformResourceLocatableTO, NodeTO {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (actor != null) {
            joiner.add("actor: " + GraphQLRequestSerializer.getEntry(actor))
        }
        joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt))
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        joiner.add("isCrossRepository: " + GraphQLRequestSerializer.getEntry(isCrossRepository))
        joiner.add("referencedAt: " + GraphQLRequestSerializer.getEntry(referencedAt))
        joiner.add("resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath))
        joiner.add("source: " + GraphQLRequestSerializer.getEntry(source))
        joiner.add("target: " + GraphQLRequestSerializer.getEntry(target))
        joiner.add("url: " + GraphQLRequestSerializer.getEntry(url))
        joiner.add("willCloseTarget: " + GraphQLRequestSerializer.getEntry(willCloseTarget))
        return joiner.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as CrossReferencedEventTO
        return Objects.equals(actor, that.actor)
                && Objects.equals(createdAt, that.createdAt)
                && Objects.equals(id, that.id)
                && Objects.equals(isCrossRepository, that.isCrossRepository)
                && Objects.equals(referencedAt, that.referencedAt)
                && Objects.equals(resourcePath, that.resourcePath)
                && Objects.equals(source, that.source)
                && Objects.equals(target, that.target)
                && Objects.equals(url, that.url)
                && Objects.equals(willCloseTarget, that.willCloseTarget)

    }

    override fun hashCode(): Int = {
        return Objects.hash(actor, createdAt, id, isCrossRepository, referencedAt, resourcePath, source, target, url, willCloseTarget)
    }

    class Builder {

        private var actor: ActorTO? = null
        private lateinit var createdAt: String
        private lateinit var id: String
        private var isCrossRepository: Boolean = false
        private lateinit var referencedAt: String
        private lateinit var resourcePath: String
        private lateinit var source: ReferencedSubjectTO
        private lateinit var target: ReferencedSubjectTO
        private lateinit var url: String
        private var willCloseTarget: Boolean = false

        fun setActor(actor: ActorTO?): Builder {
            this.actor = actor
            return this
        }

        fun setCreatedAt(createdAt: String): Builder {
            this.createdAt = createdAt
            return this
        }

        fun setId(id: String): Builder {
            this.id = id
            return this
        }

        fun setIsCrossRepository(isCrossRepository: Boolean): Builder {
            this.isCrossRepository = isCrossRepository
            return this
        }

        fun setReferencedAt(referencedAt: String): Builder {
            this.referencedAt = referencedAt
            return this
        }

        fun setResourcePath(resourcePath: String): Builder {
            this.resourcePath = resourcePath
            return this
        }

        fun setSource(source: ReferencedSubjectTO): Builder {
            this.source = source
            return this
        }

        fun setTarget(target: ReferencedSubjectTO): Builder {
            this.target = target
            return this
        }

        fun setUrl(url: String): Builder {
            this.url = url
            return this
        }

        fun setWillCloseTarget(willCloseTarget: Boolean): Builder {
            this.willCloseTarget = willCloseTarget
            return this
        }

        fun build(): CrossReferencedEventTO {
            return CrossReferencedEventTO(actor, createdAt, id, isCrossRepository, referencedAt, resourcePath, source, target, url, willCloseTarget)
        }
    }
}
