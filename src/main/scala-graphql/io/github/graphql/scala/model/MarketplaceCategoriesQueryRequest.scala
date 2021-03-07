package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest
import java.util.{ LinkedHashMap => JLinkedHashMap }
import java.util.{ Map => JMap }
import java.util.Objects
import scala.collection.mutable
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
class MarketplaceCategoriesQueryRequest(alias: String) extends GraphQLOperationRequest {

    private final lazy val input = new JLinkedHashMap[String, java.lang.Object]()
    private final lazy val useObjectMapperForInputSerialization: mutable.Set[String] = mutable.Set()

    def setExcludeEmpty(excludeEmpty: Option[Boolean]): Unit = {
        this.input.put("excludeEmpty", excludeEmpty)
    }

    def setExcludeSubcategories(excludeSubcategories: Option[Boolean]): Unit = {
        this.input.put("excludeSubcategories", excludeSubcategories)
    }

    def setIncludeCategories(includeCategories: Seq[String]): Unit = {
        this.input.put("includeCategories", includeCategories)
    }

    override def getOperationType(): GraphQLOperation = MarketplaceCategoriesQueryRequest.OPERATION_TYPE

    override def getOperationName(): String = MarketplaceCategoriesQueryRequest.OPERATION_NAME

    override def getAlias(): String = if (alias != null) alias else MarketplaceCategoriesQueryRequest.OPERATION_NAME

    override def getInput(): JMap[String, java.lang.Object] = input

    override def getUseObjectMapperForInputSerialization(): java.util.Set[String] = useObjectMapperForInputSerialization.asJava

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[MarketplaceCategoriesQueryRequest]
        Objects.equals(getOperationType(), that.getOperationType()) &&
                   Objects.equals(getOperationName(), that.getOperationName()) &&
                   Objects.equals(input, that.input)
    }

    override def hashCode(): Int = Objects.hash(getOperationType(), getOperationName(), input)

    override def toString(): String = Objects.toString(input)
}

object MarketplaceCategoriesQueryRequest {

    final val OPERATION_NAME: String = "marketplaceCategories"
    final val OPERATION_TYPE: GraphQLOperation = GraphQLOperation.QUERY

    def apply(alias: String) = new MarketplaceCategoriesQueryRequest(alias)

    def apply() = new MarketplaceCategoriesQueryRequest(null)


    def builder(): Builder = new Builder()

    class Builder {

        private var $alias: String = _
        private var excludeEmpty: Option[Boolean] = _
        private var excludeSubcategories: Option[Boolean] = _
        private var includeCategories: Seq[String] = _

        def alias(alias: String): Builder = {
            this.$alias = alias
            this
        }

        def setExcludeEmpty(excludeEmpty: Option[Boolean]): Builder = {
            this.excludeEmpty = excludeEmpty
            this
        }
        def setExcludeSubcategories(excludeSubcategories: Option[Boolean]): Builder = {
            this.excludeSubcategories = excludeSubcategories
            this
        }
        def setIncludeCategories(includeCategories: Seq[String]): Builder = {
            this.includeCategories = includeCategories
            this
        }

        def build(): MarketplaceCategoriesQueryRequest = {
            val obj = new MarketplaceCategoriesQueryRequest($alias)
            obj.setExcludeEmpty(excludeEmpty)
            obj.setExcludeSubcategories(excludeSubcategories)
            obj.setIncludeCategories(includeCategories)
            obj
        }

    }
}
