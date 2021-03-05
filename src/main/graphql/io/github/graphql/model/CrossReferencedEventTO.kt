package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
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
}
