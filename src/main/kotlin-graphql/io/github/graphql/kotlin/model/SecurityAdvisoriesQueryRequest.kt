package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest
import java.util.Objects

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:14+0800"
)
open class SecurityAdvisoriesQueryRequest(private val alias: String?) : GraphQLOperationRequest {

    companion object {
        const val OPERATION_NAME: String = "securityAdvisories"
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

    fun setFirst(first: Int?) {
        this.input["first"] = first
    }

    fun setIdentifier(identifier: SecurityAdvisoryIdentifierFilterTO?) {
        this.input["identifier"] = identifier
    }

    fun setLast(last: Int?) {
        this.input["last"] = last
    }

    fun setOrderBy(orderBy: SecurityAdvisoryOrderTO?) {
        this.input["orderBy"] = orderBy
    }

    fun setPublishedSince(publishedSince: String?) {
        this.input["publishedSince"] = publishedSince
    }

    fun setUpdatedSince(updatedSince: String?) {
        this.input["updatedSince"] = updatedSince
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
        val that = other as SecurityAdvisoriesQueryRequest
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
        private var first: Int? = null
        private var identifier: SecurityAdvisoryIdentifierFilterTO? = null
        private var last: Int? = null
        private var orderBy: SecurityAdvisoryOrderTO? = null
        private var publishedSince: String? = null
        private var updatedSince: String? = null

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
        fun setFirst(first: Int?): Builder {
            this.first = first
            return this
        }
        fun setIdentifier(identifier: SecurityAdvisoryIdentifierFilterTO?): Builder {
            this.identifier = identifier
            return this
        }
        fun setLast(last: Int?): Builder {
            this.last = last
            return this
        }
        fun setOrderBy(orderBy: SecurityAdvisoryOrderTO?): Builder {
            this.orderBy = orderBy
            return this
        }
        fun setPublishedSince(publishedSince: String?): Builder {
            this.publishedSince = publishedSince
            return this
        }
        fun setUpdatedSince(updatedSince: String?): Builder {
            this.updatedSince = updatedSince
            return this
        }

        fun build(): SecurityAdvisoriesQueryRequest {
            val obj = SecurityAdvisoriesQueryRequest(`$alias`)
            obj.setAfter(after)
            obj.setBefore(before)
            obj.setFirst(first)
            obj.setIdentifier(identifier)
            obj.setLast(last)
            obj.setOrderBy(orderBy)
            obj.setPublishedSince(publishedSince)
            obj.setUpdatedSince(updatedSince)
            return obj
        }

    }
}
