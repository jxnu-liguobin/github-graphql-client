package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
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
