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
class UnlinkRepositoryFromProjectMutationRequest(alias: String) extends GraphQLOperationRequest {

    private final lazy val input = new JLinkedHashMap[String, java.lang.Object]()
    private final lazy val useObjectMapperForInputSerialization: mutable.Set[String] = mutable.Set()

    def setInput(input: UnlinkRepositoryFromProjectInputTO): Unit = {
        this.input.put("input", input)
    }

    override def getOperationType(): GraphQLOperation = UnlinkRepositoryFromProjectMutationRequest.OPERATION_TYPE

    override def getOperationName(): String = UnlinkRepositoryFromProjectMutationRequest.OPERATION_NAME

    override def getAlias(): String = if (alias != null) alias else UnlinkRepositoryFromProjectMutationRequest.OPERATION_NAME

    override def getInput(): JMap[String, java.lang.Object] = input

    override def getUseObjectMapperForInputSerialization(): java.util.Set[String] = useObjectMapperForInputSerialization.asJava

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[UnlinkRepositoryFromProjectMutationRequest]
        Objects.equals(getOperationType(), that.getOperationType()) &&
                   Objects.equals(getOperationName(), that.getOperationName()) &&
                   Objects.equals(input, that.input)
    }

    override def hashCode(): Int = Objects.hash(getOperationType(), getOperationName(), input)

    override def toString(): String = Objects.toString(input)
}

object UnlinkRepositoryFromProjectMutationRequest {

    final val OPERATION_NAME: String = "unlinkRepositoryFromProject"
    final val OPERATION_TYPE: GraphQLOperation = GraphQLOperation.MUTATION

    def apply(alias: String) = new UnlinkRepositoryFromProjectMutationRequest(alias)

    def apply() = new UnlinkRepositoryFromProjectMutationRequest(null)


    def builder(): Builder = new Builder()

    class Builder {

        private var $alias: String = _
        private var input: UnlinkRepositoryFromProjectInputTO = _

        def alias(alias: String): Builder = {
            this.$alias = alias
            this
        }

        def setInput(input: UnlinkRepositoryFromProjectInputTO): Builder = {
            this.input = input
            this
        }

        def build(): UnlinkRepositoryFromProjectMutationRequest = {
            val obj = new UnlinkRepositoryFromProjectMutationRequest($alias)
            obj.setInput(input)
            obj
        }

    }
}
