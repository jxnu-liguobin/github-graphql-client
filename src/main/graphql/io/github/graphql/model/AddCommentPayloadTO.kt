package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class AddCommentPayloadTO(
    val clientMutationId: String?,
    val commentEdge: IssueCommentEdgeTO?,
    val subject: NodeTO?,
    val timelineEdge: IssueTimelineItemEdgeTO?
) {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId))
        }
        if (commentEdge != null) {
            joiner.add("commentEdge: " + GraphQLRequestSerializer.getEntry(commentEdge))
        }
        if (subject != null) {
            joiner.add("subject: " + GraphQLRequestSerializer.getEntry(subject))
        }
        if (timelineEdge != null) {
            joiner.add("timelineEdge: " + GraphQLRequestSerializer.getEntry(timelineEdge))
        }
        return joiner.toString()
    }
}
