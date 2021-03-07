package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class BranchProtectionRuleConflictEdgeTO(
    @javax.validation.constraints.NotNull
    cursor: String,
    node: BranchProtectionRuleConflictTO
) {

    override def toString(): String = {
        Seq(
            if (cursor != null) "cursor: " + GraphQLRequestSerializer.getEntry(cursor) else "",
            if (node != null) "node: " + GraphQLRequestSerializer.getEntry(node) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object BranchProtectionRuleConflictEdgeTO {

    def builder(): BranchProtectionRuleConflictEdgeTO.Builder = new Builder()

    class Builder {

        private var cursor: String = _
        private var node: BranchProtectionRuleConflictTO = _

        def setCursor(cursor: String): Builder = {
            this.cursor = cursor
            this
        }

        def setNode(node: BranchProtectionRuleConflictTO): Builder = {
            this.node = node
            this
        }

        def build(): BranchProtectionRuleConflictEdgeTO = new BranchProtectionRuleConflictEdgeTO(cursor, node)

    }
}
