package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class PushAllowanceTO(
    actor: PushAllowanceActorTO,
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
        val that = obj.asInstanceOf[PushAllowanceTO]
        Objects.equals(actor, that.actor) &&
        Objects.equals(branchProtectionRule, that.branchProtectionRule) &&
        Objects.equals(id, that.id)
    }

    override def hashCode(): Int = {
        Objects.hash(actor, branchProtectionRule, id)
    }
}

object PushAllowanceTO {

    def builder(): PushAllowanceTO.Builder = new Builder()

    class Builder {

        private var actor: PushAllowanceActorTO = _
        private var branchProtectionRule: BranchProtectionRuleTO = _
        private var id: String = _

        def setActor(actor: PushAllowanceActorTO): Builder = {
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

        def build(): PushAllowanceTO = new PushAllowanceTO(actor, branchProtectionRule, id)

    }
}
