package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class BranchProtectionRuleEdgeTO(
    @javax.validation.constraints.NotNull
    cursor: String,
    node: BranchProtectionRuleTO
) {

    override def toString(): String = {
        Seq(
            if (cursor != null) "cursor: " + GraphQLRequestSerializer.getEntry(cursor) else "",
            if (node != null) "node: " + GraphQLRequestSerializer.getEntry(node) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[BranchProtectionRuleEdgeTO]
        Objects.equals(cursor, that.cursor) &&
        Objects.equals(node, that.node)
    }

    override def hashCode(): Int = {
        Objects.hash(cursor, node)
    }
}

object BranchProtectionRuleEdgeTO {

    def builder(): BranchProtectionRuleEdgeTO.Builder = new Builder()

    class Builder {

        private var cursor: String = _
        private var node: BranchProtectionRuleTO = _

        def setCursor(cursor: String): Builder = {
            this.cursor = cursor
            this
        }

        def setNode(node: BranchProtectionRuleTO): Builder = {
            this.node = node
            this
        }

        def build(): BranchProtectionRuleEdgeTO = new BranchProtectionRuleEdgeTO(cursor, node)

    }
}
