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
class MarketplaceCategoryQueryRequest(alias: String) extends GraphQLOperationRequest {

    private final lazy val input = new JLinkedHashMap[String, java.lang.Object]()
    private final lazy val useObjectMapperForInputSerialization: mutable.Set[String] = mutable.Set()

    def setSlug(slug: String): Unit = {
        this.input.put("slug", slug)
    }

    def setUseTopicAliases(useTopicAliases: Option[Boolean]): Unit = {
        this.input.put("useTopicAliases", useTopicAliases)
    }

    override def getOperationType(): GraphQLOperation = MarketplaceCategoryQueryRequest.OPERATION_TYPE

    override def getOperationName(): String = MarketplaceCategoryQueryRequest.OPERATION_NAME

    override def getAlias(): String = if (alias != null) alias else MarketplaceCategoryQueryRequest.OPERATION_NAME

    override def getInput(): JMap[String, java.lang.Object] = input

    override def getUseObjectMapperForInputSerialization(): java.util.Set[String] = useObjectMapperForInputSerialization.asJava

    override def toString(): String = Objects.toString(input)
}

object MarketplaceCategoryQueryRequest {

    final val OPERATION_NAME: String = "marketplaceCategory"
    final val OPERATION_TYPE: GraphQLOperation = GraphQLOperation.QUERY

    def apply(alias: String) = new MarketplaceCategoryQueryRequest(alias)

    def apply() = new MarketplaceCategoryQueryRequest(null)


    def builder(): Builder = new Builder()

    class Builder {

        private var $alias: String = _
        private var slug: String = _
        private var useTopicAliases: Option[Boolean] = _

        def alias(alias: String): Builder = {
            this.$alias = alias
            this
        }

        def setSlug(slug: String): Builder = {
            this.slug = slug
            this
        }
        def setUseTopicAliases(useTopicAliases: Option[Boolean]): Builder = {
            this.useTopicAliases = useTopicAliases
            this
        }

        def build(): MarketplaceCategoryQueryRequest = {
            val obj = new MarketplaceCategoryQueryRequest($alias)
            obj.setSlug(slug)
            obj.setUseTopicAliases(useTopicAliases)
            obj
        }

    }
}
