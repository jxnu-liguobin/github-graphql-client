package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class PushAllowanceTO(
    val actor: PushAllowanceActorTO?,
    val branchProtectionRule: BranchProtectionRuleTO?,
    override
    val id: String
) : NodeTO {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (actor != null) {
            joiner.add("actor: " + GraphQLRequestSerializer.getEntry(actor))
        }
        if (branchProtectionRule != null) {
            joiner.add("branchProtectionRule: " + GraphQLRequestSerializer.getEntry(branchProtectionRule))
        }
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        return joiner.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as PushAllowanceTO
        return Objects.equals(actor, that.actor)
                && Objects.equals(branchProtectionRule, that.branchProtectionRule)
                && Objects.equals(id, that.id)

    }

    override fun hashCode(): Int = {
        return Objects.hash(actor, branchProtectionRule, id)
    }

    class Builder {

        private var actor: PushAllowanceActorTO? = null
        private var branchProtectionRule: BranchProtectionRuleTO? = null
        private lateinit var id: String

        fun setActor(actor: PushAllowanceActorTO?): Builder {
            this.actor = actor
            return this
        }

        fun setBranchProtectionRule(branchProtectionRule: BranchProtectionRuleTO?): Builder {
            this.branchProtectionRule = branchProtectionRule
            return this
        }

        fun setId(id: String): Builder {
            this.id = id
            return this
        }

        fun build(): PushAllowanceTO {
            return PushAllowanceTO(actor, branchProtectionRule, id)
        }
    }
}
