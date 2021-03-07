package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest
import java.util.Objects

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:14+0800"
)
open class SecurityVulnerabilitiesQueryRequest(private val alias: String?) : GraphQLOperationRequest {

    companion object {
        const val OPERATION_NAME: String = "securityVulnerabilities"
        val OPERATION_TYPE: GraphQLOperation = GraphQLOperation.QUERY

        fun builder(): Builder = Builder()
    }

    private val input: MutableMap<String, Any?> = LinkedHashMap()
    private val useObjectMapperForInputSerialization: MutableSet<String> = HashSet()

    constructor(): this(null)

    fun setAfter(after: String?) {
        this.input["after"] = after
    }

    fun setBefore(before: String?) {
        this.input["before"] = before
    }

    fun setEcosystem(ecosystem: SecurityAdvisoryEcosystemTO?) {
        this.input["ecosystem"] = ecosystem
    }

    fun setFirst(first: Int?) {
        this.input["first"] = first
    }

    fun setLast(last: Int?) {
        this.input["last"] = last
    }

    fun setOrderBy(orderBy: SecurityVulnerabilityOrderTO?) {
        this.input["orderBy"] = orderBy
    }

    fun setPackage(`package`: String?) {
        this.input["package"] = `package`
    }

    fun setSeverities(severities: List<SecurityAdvisorySeverityTO>?) {
        this.input["severities"] = severities
    }

    override fun getOperationType(): GraphQLOperation = OPERATION_TYPE

    override fun getOperationName(): String = OPERATION_NAME

    override fun getAlias(): String? = alias ?: OPERATION_NAME

    override fun getInput(): MutableMap<String, Any?> = input

    override fun getUseObjectMapperForInputSerialization(): MutableSet<String> = useObjectMapperForInputSerialization

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as SecurityVulnerabilitiesQueryRequest
        return Objects.equals(operationType, that.operationType) &&
                   Objects.equals(operationName, that.operationName) &&
                   Objects.equals(input, that.input)
    }

    override fun hashCode(): Int = Objects.hash(operationType, operationName, input)

    override fun toString(): String = Objects.toString(input)

    class Builder {

        private var `$alias`: String? = null
        private var after: String? = null
        private var before: String? = null
        private var ecosystem: SecurityAdvisoryEcosystemTO? = null
        private var first: Int? = null
        private var last: Int? = null
        private var orderBy: SecurityVulnerabilityOrderTO? = null
        private var `package`: String? = null
        private var severities: List<SecurityAdvisorySeverityTO>? = null

        fun alias(alias: String?): Builder {
            this.`$alias` = alias
            return this
        }

        fun setAfter(after: String?): Builder {
            this.after = after
            return this
        }
        fun setBefore(before: String?): Builder {
            this.before = before
            return this
        }
        fun setEcosystem(ecosystem: SecurityAdvisoryEcosystemTO?): Builder {
            this.ecosystem = ecosystem
            return this
        }
        fun setFirst(first: Int?): Builder {
            this.first = first
            return this
        }
        fun setLast(last: Int?): Builder {
            this.last = last
            return this
        }
        fun setOrderBy(orderBy: SecurityVulnerabilityOrderTO?): Builder {
            this.orderBy = orderBy
            return this
        }
        fun setPackage(`package`: String?): Builder {
            this.`package` = `package`
            return this
        }
        fun setSeverities(severities: List<SecurityAdvisorySeverityTO>?): Builder {
            this.severities = severities
            return this
        }

        fun build(): SecurityVulnerabilitiesQueryRequest {
            val obj = SecurityVulnerabilitiesQueryRequest(`$alias`)
            obj.setAfter(after)
            obj.setBefore(before)
            obj.setEcosystem(ecosystem)
            obj.setFirst(first)
            obj.setLast(last)
            obj.setOrderBy(orderBy)
            obj.setPackage(`package`)
            obj.setSeverities(severities)
            return obj
        }

    }
}
