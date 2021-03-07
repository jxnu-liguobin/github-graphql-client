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
class RateLimitQueryRequest(alias: String) extends GraphQLOperationRequest {

    private final lazy val input = new JLinkedHashMap[String, java.lang.Object]()
    private final lazy val useObjectMapperForInputSerialization: mutable.Set[String] = mutable.Set()

    def setDryRun(dryRun: Option[Boolean]): Unit = {
        this.input.put("dryRun", dryRun)
    }

    override def getOperationType(): GraphQLOperation = RateLimitQueryRequest.OPERATION_TYPE

    override def getOperationName(): String = RateLimitQueryRequest.OPERATION_NAME

    override def getAlias(): String = if (alias != null) alias else RateLimitQueryRequest.OPERATION_NAME

    override def getInput(): JMap[String, java.lang.Object] = input

    override def getUseObjectMapperForInputSerialization(): java.util.Set[String] = useObjectMapperForInputSerialization.asJava

    override def toString(): String = Objects.toString(input)
}

object RateLimitQueryRequest {

    final val OPERATION_NAME: String = "rateLimit"
    final val OPERATION_TYPE: GraphQLOperation = GraphQLOperation.QUERY

    def apply(alias: String) = new RateLimitQueryRequest(alias)

    def apply() = new RateLimitQueryRequest(null)


    def builder(): Builder = new Builder()

    class Builder {

        private var $alias: String = _
        private var dryRun: Option[Boolean] = Some(false)

        def alias(alias: String): Builder = {
            this.$alias = alias
            this
        }

        def setDryRun(dryRun: Option[Boolean]): Builder = {
            this.dryRun = dryRun
            this
        }

        def build(): RateLimitQueryRequest = {
            val obj = new RateLimitQueryRequest($alias)
            obj.setDryRun(dryRun)
            obj
        }

    }
}
