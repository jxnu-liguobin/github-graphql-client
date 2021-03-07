package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class ReviewDismissalAllowanceTO(
    actor: ReviewDismissalAllowanceActorTO,
    branchProtectionRule: BranchProtectionRuleTO,
    @javax.validation.constraints.NotNull
    override val id: String
) extends NodeTO {

    override def toString(): String = {
        Seq(
            if (actor != null) "actor: " + GraphQLRequestSerializer.getEntry(actor) else "",
            if (branchProtectionRule != null) "branchProtectionRule: " + GraphQLRequestSerializer.getEntry(branchProtectionRule) else "",
            if (id != null) "id: " + GraphQLRequestSerializer.getEntry(id) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[ReviewDismissalAllowanceTO]
        Objects.equals(actor, that.actor) &&
        Objects.equals(branchProtectionRule, that.branchProtectionRule) &&
        Objects.equals(id, that.id)
    }

    override def hashCode(): Int = {
        Objects.hash(actor, branchProtectionRule, id)
    }
}

object ReviewDismissalAllowanceTO {

    def builder(): ReviewDismissalAllowanceTO.Builder = new Builder()

    class Builder {

        private var actor: ReviewDismissalAllowanceActorTO = _
        private var branchProtectionRule: BranchProtectionRuleTO = _
        private var id: String = _

        def setActor(actor: ReviewDismissalAllowanceActorTO): Builder = {
            this.actor = actor
            this
        }

        def setBranchProtectionRule(branchProtectionRule: BranchProtectionRuleTO): Builder = {
            this.branchProtectionRule = branchProtectionRule
            this
        }

        def setId(id: String): Builder = {
            this.id = id
            this
        }

        def build(): ReviewDismissalAllowanceTO = new ReviewDismissalAllowanceTO(actor, branchProtectionRule, id)

    }
}
