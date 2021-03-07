package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest
import java.util.{ LinkedHashMap => JLinkedHashMap }
import java.util.{ Map => JMap }
import java.util.Objects
import scala.collection.mutable
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class SecurityAdvisoriesQueryRequest(alias: String) extends GraphQLOperationRequest {

    private final lazy val input = new JLinkedHashMap[String, java.lang.Object]()
    private final lazy val useObjectMapperForInputSerialization: mutable.Set[String] = mutable.Set()

    def setAfter(after: String): Unit = {
        this.input.put("after", after)
    }

    def setBefore(before: String): Unit = {
        this.input.put("before", before)
    }

    def setFirst(first: Option[Int]): Unit = {
        this.input.put("first", first)
    }

    def setIdentifier(identifier: SecurityAdvisoryIdentifierFilterTO): Unit = {
        this.input.put("identifier", identifier)
    }

    def setLast(last: Option[Int]): Unit = {
        this.input.put("last", last)
    }

    def setOrderBy(orderBy: SecurityAdvisoryOrderTO): Unit = {
        this.input.put("orderBy", orderBy)
    }

    def setPublishedSince(publishedSince: String): Unit = {
        this.input.put("publishedSince", publishedSince)
    }

    def setUpdatedSince(updatedSince: String): Unit = {
        this.input.put("updatedSince", updatedSince)
    }

    override def getOperationType(): GraphQLOperation = SecurityAdvisoriesQueryRequest.OPERATION_TYPE

    override def getOperationName(): String = SecurityAdvisoriesQueryRequest.OPERATION_NAME

    override def getAlias(): String = if (alias != null) alias else SecurityAdvisoriesQueryRequest.OPERATION_NAME

    override def getInput(): JMap[String, java.lang.Object] = input

    override def getUseObjectMapperForInputSerialization(): java.util.Set[String] = useObjectMapperForInputSerialization.asJava

    override def toString(): String = Objects.toString(input)
}

object SecurityAdvisoriesQueryRequest {

    final val OPERATION_NAME: String = "securityAdvisories"
    final val OPERATION_TYPE: GraphQLOperation = GraphQLOperation.QUERY

    def apply(alias: String) = new SecurityAdvisoriesQueryRequest(alias)

    def apply() = new SecurityAdvisoriesQueryRequest(null)


    def builder(): Builder = new Builder()

    class Builder {

        private var $alias: String = _
        private var after: String = _
        private var before: String = _
        private var first: Option[Int] = _
        private var identifier: SecurityAdvisoryIdentifierFilterTO = _
        private var last: Option[Int] = _
        private var orderBy: SecurityAdvisoryOrderTO = _
        private var publishedSince: String = _
        private var updatedSince: String = _

        def alias(alias: String): Builder = {
            this.$alias = alias
            this
        }

        def setAfter(after: String): Builder = {
            this.after = after
            this
        }
        def setBefore(before: String): Builder = {
            this.before = before
            this
        }
        def setFirst(first: Option[Int]): Builder = {
            this.first = first
            this
        }
        def setIdentifier(identifier: SecurityAdvisoryIdentifierFilterTO): Builder = {
            this.identifier = identifier
            this
        }
        def setLast(last: Option[Int]): Builder = {
            this.last = last
            this
        }
        def setOrderBy(orderBy: SecurityAdvisoryOrderTO): Builder = {
            this.orderBy = orderBy
            this
        }
        def setPublishedSince(publishedSince: String): Builder = {
            this.publishedSince = publishedSince
            this
        }
        def setUpdatedSince(updatedSince: String): Builder = {
            this.updatedSince = updatedSince
            this
        }

        def build(): SecurityAdvisoriesQueryRequest = {
            val obj = new SecurityAdvisoriesQueryRequest($alias)
            obj.setAfter(after)
            obj.setBefore(before)
            obj.setFirst(first)
            obj.setIdentifier(identifier)
            obj.setLast(last)
            obj.setOrderBy(orderBy)
            obj.setPublishedSince(publishedSince)
            obj.setUpdatedSince(updatedSince)
            obj
        }

    }
}
