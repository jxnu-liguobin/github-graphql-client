package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest
import java.util.{ LinkedHashMap => JLinkedHashMap }
import java.util.{ Map => JMap }
import java.util.Objects
import scala.collection.mutable
import scala.collection.JavaConverters._
import SearchTypeTO._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class SearchQueryRequest(alias: String) extends GraphQLOperationRequest {

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

    def setLast(last: Option[Int]): Unit = {
        this.input.put("last", last)
    }

    def setQuery(query: String): Unit = {
        this.input.put("query", query)
    }

    def setType(`type`: SearchTypeTO): Unit = {
        this.input.put("type", `type`)
    }

    override def getOperationType(): GraphQLOperation = SearchQueryRequest.OPERATION_TYPE

    override def getOperationName(): String = SearchQueryRequest.OPERATION_NAME

    override def getAlias(): String = if (alias != null) alias else SearchQueryRequest.OPERATION_NAME

    override def getInput(): JMap[String, java.lang.Object] = input

    override def getUseObjectMapperForInputSerialization(): java.util.Set[String] = useObjectMapperForInputSerialization.asJava

    override def toString(): String = Objects.toString(input)
}

object SearchQueryRequest {

    final val OPERATION_NAME: String = "search"
    final val OPERATION_TYPE: GraphQLOperation = GraphQLOperation.QUERY

    def apply(alias: String) = new SearchQueryRequest(alias)

    def apply() = new SearchQueryRequest(null)


    def builder(): Builder = new Builder()

    class Builder {

        private var $alias: String = _
        private var after: String = _
        private var before: String = _
        private var first: Option[Int] = _
        private var last: Option[Int] = _
        private var query: String = _
        private var `type`: SearchTypeTO = _

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
        def setLast(last: Option[Int]): Builder = {
            this.last = last
            this
        }
        def setQuery(query: String): Builder = {
            this.query = query
            this
        }
        def setType(`type`: SearchTypeTO): Builder = {
            this.`type` = `type`
            this
        }

        def build(): SearchQueryRequest = {
            val obj = new SearchQueryRequest($alias)
            obj.setAfter(after)
            obj.setBefore(before)
            obj.setFirst(first)
            obj.setLast(last)
            obj.setQuery(query)
            obj.setType(`type`)
            obj
        }

    }
}
